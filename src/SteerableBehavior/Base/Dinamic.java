package SteerableBehavior.Base;

import SteerableBehavior.Interfaces.IDinamic;

public class Dinamic implements IDinamic{
    protected Velocity velocity = new Velocity();
    protected Acceleration acceleration = new Acceleration();

    public Velocity getVelocity()
    {
        return velocity;
    }

    public Acceleration getAcceleration()
    {
        return acceleration;
    }
}
