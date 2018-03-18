package week5homework;

public class PropellerDrivenAirplane extends Glider implements Engines {
    @Override
    public void fly() {
        turnOnEngines();
        super.fly();
    }

    PropellerDrivenAirplane() {
        super();
        this.maxSpeed = 350;
    }

    @Override
    public void turnOnEngines() {
        System.out.println("Engines on!");
    }
}
