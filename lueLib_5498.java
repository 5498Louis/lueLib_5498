package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SolenoidBase;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalOutput;

private class lueLib_5498 {

    int deadband;
    deadband == .25;
 
 private void trigger_Shoot(int mot1, int mot2, boolean inTrigger, boolean outTrigger){

    
     
      DifferentialDrive fly_wheels = new DifferentialDrive()

 if (inTrigger > deadband && outTrigger < deadband){
        fly_wheels.arcadeDrive(1,0);  
    }else {
      //if left is pressed and right is not, then fw is -max
      if (inTrigger < deadband && outTrigger > deadband){
          fly_wheels.arcadeDrive(-1,0);
      //otherwise, no action on fw.
      }else{
        fly_wheels arcadeDrive(0,0);
      }

 }
}