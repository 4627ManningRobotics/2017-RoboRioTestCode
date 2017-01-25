package org.usfirst.frc.team4627.robot;

import org.usfirst.frc.team4627.robot.commands.ShootMotor;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
Joystick driver = new Joystick(0);
	
	JoystickButton driverA = new JoystickButton(driver, RobotMap.BUTTON_A);
	JoystickButton driverB = new JoystickButton(driver, RobotMap.BUTTON_B);
	JoystickButton driverX = new JoystickButton(driver, RobotMap.BUTTON_X);
	JoystickButton driverY = new JoystickButton(driver, RobotMap.BUTTON_Y);
	JoystickButton driverLeftBumper = new JoystickButton(driver, RobotMap.BUTTON_LEFT_BUMPER);
	
	public OI(){
	driverA.whenPressed(new ShootMotor(1));
	driverB.whenPressed(new ShootMotor(2));
	driverX.whenPressed(new ShootMotor(3));
	driverY.whenPressed(new ShootMotor(4));
	driverLeftBumper.whenPressed(new ShootMotor(0));
	}
	public double getDriverRawAxis(int axis){
		return driver.getRawAxis(axis);
	}
}

