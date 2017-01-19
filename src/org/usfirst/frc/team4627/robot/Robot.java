
package org.usfirst.frc.team4627.robot;

import org.usfirst.frc.team4627.robot.subsystems.BenchtopBoard;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class Robot extends IterativeRobot {

	Command autonomousCommand;
	public static BenchtopBoard board = new BenchtopBoard();

	public static OI oi;



    public void robotInit() {
		oi = new OI();
    }
	
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	
    public void autonomousInit() {
        autonomousCommand = null;
        if (autonomousCommand != null) autonomousCommand.start();
    }

   
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

   
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
