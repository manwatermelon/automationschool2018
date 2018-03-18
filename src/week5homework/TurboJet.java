package week5homework;

class TurboJet extends Aircraft implements Engines{
    TurboJet() {
        super();
        this.maxSpeed = 900;
    }

    @Override
    public void fly() {
        turnOnEngines();
        super.fly();
    }

    @Override
    public void turnOnEngines() {
        System.out.println("Engines on!");
    }
}
