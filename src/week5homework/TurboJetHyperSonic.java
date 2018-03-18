package week5homework;

public class TurboJetHyperSonic extends TurboJet {
    @Override
    public void fly() {
        super.fly();
        this.hyperSonicFlight();
    }

    private void hyperSonicFlight() {
        System.out.println("Hypersonic engines on!");
    }

    TurboJetHyperSonic() {
        super();
        this.maxSpeed = 8000;
    }
}
