package org.usfirst.frc.team4627.robot.subsystems;

import org.usfirst.frc.team4627.robot.commands.SixAxes;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BenchtopBoard extends Subsystem {

	CANTalon motor0 = new CANTalon(0);
	CANTalon motor1 = new CANTalon(1);
	CANTalon motor2 = new CANTalon(2);
	CANTalon motor3 = new CANTalon(3);
	CANTalon motor4 = new CANTalon(4);
	CANTalon motor5 = new CANTalon(5);


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new SixAxes());
    }
    
    public void setMotor(int motor, double speed){
    	switch (motor){
    	case 0:
    		motor0.set(speed);
    		break;
    	case 1:
    		motor1.set(speed);
    		break;
    	case 2:
    		motor2.set(speed);
    		break;
    	case 3:
    		motor3.set(speed);
    		break;
    	case 4:
    		motor4.set(speed);
    		break;
    	case 5:
    		motor5.set(speed);
    		break;
    	
    	}
    }
    
    
}

