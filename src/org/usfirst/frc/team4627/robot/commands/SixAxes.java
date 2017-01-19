package org.usfirst.frc.team4627.robot.commands;

import org.usfirst.frc.team4627.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SixAxes extends Command {

    public SixAxes() {
        requires(Robot.board);
    }

    protected void initialize() {
    }

    protected void execute() {
    	for(int i=0; i<6; i++){
    		Robot.board.setMotor(i, Robot.oi.getDriverRawAxis(i));
    	}
    	
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
