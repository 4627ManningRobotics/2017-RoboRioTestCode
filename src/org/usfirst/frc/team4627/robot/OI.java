package org.usfirst.frc.team4627.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
Joystick driver = new Joystick(0);
	
	JoystickButton driverA = new JoystickButton(driver, RobotMap.BUTTON_A);
	
	

	
	public double getDriverRawAxis(int axis){
		return driver.getRawAxis(axis);
	}
}

