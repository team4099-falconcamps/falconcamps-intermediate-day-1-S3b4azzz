package com.team4099.falconcamps.commands.shooter;

import com.revrobotics.CANSparkMax;
import com.team4099.falconcamps.subsystems.ShooterPIDSubsystem;
import com.team4099.falconcamps.subsystems.ShooterSparkPID;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterSparkPIDIdleCommand extends CommandBase {
    private static final double ShooterP = 0;
    private final ShooterSparkPID shooter;

    public ShooterSparkPIDIdleCommand(ShooterSparkPID shooter) {
        this.shooter = shooter;
        this.addRequirements(shooter);
        public ShooterPIDSubsystem() {
            double ShooterP = 1.7/ 300
            double ShooterI = 0.0;
            double ShooterD = 5.5 * 14000;
            super(new PIDController(ShooterP, ShooterI, ShooterD));
        }
    }

    @Override
    public void initialize() {}
}
