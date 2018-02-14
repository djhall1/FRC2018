

package org.usfirst.frc6979.FRC2018.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc6979.FRC2018.RobotMap;
import org.usfirst.frc6979.FRC2018.commands.*;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;


/**
 *
 */
public class Elevator extends Subsystem {

 
    private final DigitalInput topElevLimit = RobotMap.elevatorHighLimit;
    private final WPI_TalonSRX elevator = RobotMap.elevatorElevator;
    private final DigitalInput evaltorLowLimit = RobotMap.elevatorLowLimit;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

