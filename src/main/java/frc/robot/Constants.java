// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

//if only vscode had color coded comments...
//!nevermind better comments is a extension I can use!

  public static class IntakeConstants {
//*Intake Subsystem Ports
    public static final int intakeCanID = 9;
    public static final int drawBridgeCanID = 1;

//*Rollers
    //Speeds
    public static final double intakeRunSpeed = 1;
    public static double intakePurgeSpeed = 1;

//*DrawBridge
    //PID vars
    //TODO tune pid vars
    public static final double DBkP = 2;
    public static final double DBkI = 0;
    public static final double DBkD = 1;
    //TODO find minimal vars
    public static final double DRAWBRIDGE_ALLOWABLE_ERROR = 5;
    public static final double DRAWBRIDGE_MAXINTEGRAL = 4000;
    public static final double DRAWBRIDGE_INTEGRAL_ZONE = 100;

    //speeds
    public static double loweredIntakeValue = 15500;
    public static double raisedIntakeValue = 250;
    //config
    public static boolean drawBridgeInverted = true;
  }

  public static class IndexerConstants{
//*Indexer Subsystem Ports
    public static final int indexerCanID = 10;
    public static final int frontSensorChannel = 0;
    public static final int backSensorChannel = 2;
//*Indexer
    //speeds
    public static double indexerRunSpeed = 0.75;
	  public static double indexerPurgeSpeed = -1;
    public static double indexerShootSpeed = 1;
  }

  public static class ShooterConstants{

    public static final int shooterCanID = 2;
	  public static final int shooterCurrentLimit = 40;
    public static final double shooterkP = 0.08;
    public static final double shooterkI = 0;
    public static final double shooterkD = 0;
    //TODO placeholder values
    public static final double shooterkS = 0; 
    public static final double ShooterStableRPMTime = 0;
    public static int shooterRPMTolerance = 10;

  }
}
