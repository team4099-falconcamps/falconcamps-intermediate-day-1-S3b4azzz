package com.team4099.falconcamps.subsystems;

import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import io.github.oblarg.oblog.annotations.Config.PIDController;

public class ShooterPIDSubsystem extends SubsystemBase {
    private final CANSparkMax shooterLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax shooterFollower = new CANSparkMax(14, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANEncoder shooterEncoder = shooterLeader.getEncoder();

   public ShooterPIDSubsystem() {
            double shooterP = 1.7/ 300
            double shooterI = 0.0;
            double shooterD = 5.5 * 14000;
            super(new PIDController(shooterP, shooterI, shooterD));
        }
public double useMeasurement() {
    return GetCurrentVelocity
}
public void useOutput(double setPoint, double output);
  
@Override
    public void periodic() {}
}
