package week5homework;

public class Main {
    public static void main(String[] args) {
        RegularGlider rg = new RegularGlider();
        PropellerDrivenAirplane pda = new PropellerDrivenAirplane();
        TurboJet tj = new TurboJet();
        TurboJetHyperSonic tjhs = new TurboJetHyperSonic();

        rg.printDescription();
        rg.Glide();
        pda.printDescription();
        pda.Glide();
        tj.printDescription();
        tj.fly();
        tjhs.printDescription();
        tjhs.fly();
    }
}
