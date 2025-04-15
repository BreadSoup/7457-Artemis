// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.jni.CANSparkJNI;
import com.revrobotics.jni.*;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.*;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import frc.robot.Constants.IndexerConstants; 

public class IndexerSubsystem extends SubsystemBase {
  /** Creates a new Indexer. */
  private final SparkMax indexerMotor;
  private final DigitalInput frontSensor;
  private final DigitalInput backSensor;

  public IndexerSubsystem() {
    //godbless sparkmax changing all their namespaces and making me spend 2 hours troubleshooting
    //Indexer Motor
    indexerMotor = new SparkMax(IndexerConstants.IndexerCanID, MotorType.kBrushless);
    SparkMaxConfig config = new SparkMaxConfig();
    config.idleMode(IdleMode.kBrake);
    indexerMotor.configure(config, null, null);
    
    //Sensors
    frontSensor = new DigitalInput(IndexerConstants.frontSensorChannel);
    backSensor = new DigitalInput(IndexerConstants.backSensorChannel);
  }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
