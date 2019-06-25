/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class DriveJeff extends Subsystem {
  final public WPI_TalonSRX
  rightMaster = new WPI_TalonSRX(RobotMap.rightMaster),
  rightSlave1 = new WPI_TalonSRX(RobotMap.rightSlave1),
  rightSlave2 = new WPI_TalonSRX(RobotMap.rightSlave2),
  leftMaster = new WPI_TalonSRX(RobotMap.leftMaster),
  leftSlave1 = new WPI_TalonSRX(RobotMap.leftSlave1),
  leftSlave2 = new WPI_TalonSRX(RobotMap.leftSlave2);

  public DriveJeff(){
            //constructs and configures all six drive motors
        // restore everything to known factory default state
        rightMaster.configFactoryDefault();
        rightSlave1.configFactoryDefault();
        rightSlave2.configFactoryDefault();
        leftMaster.configFactoryDefault();
        leftSlave2.configFactoryDefault();
        leftSlave1.configFactoryDefault();
        
        // now configure them
        rightSlave1.follow(rightMaster);
        rightSlave2.follow(rightMaster);
        leftSlave1.follow(leftMaster);
        leftSlave2.follow(leftMaster);
        rightSlave1.setInverted(InvertType.FollowMaster);
        rightSlave2.setInverted(InvertType.FollowMaster);
        leftSlave1.setInverted(InvertType.FollowMaster);
        leftSlave2.setInverted(InvertType.FollowMaster);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
