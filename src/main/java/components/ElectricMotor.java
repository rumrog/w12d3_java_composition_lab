package components;

public class ElectricMotor {

    private double range;
    private int chargeSpeed;
    private double torque;

    public ElectricMotor(double range, int chargeSpeed, double torque) {
        this.range = range;
        this.chargeSpeed = chargeSpeed;
        this.torque = torque;
    }

    public double getRange() {
        return this.range;
    }

    public int getChargeSpeed() {
        return this.chargeSpeed;
    }

    public double getTorque() {
        return this.torque;
    }

}
