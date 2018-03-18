package week5homework;

public class PropellerDrivenAirplane extends Glider {
    @Override
    public void fly() {
        enginesOn();
        super.fly();
    }
    private void enginesOn() {
        System.out.println("Engines on!");
    }

    PropellerDrivenAirplane() {
        super();
        this.maxSpeed = 350;
    }
}
