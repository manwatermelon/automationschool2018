package week5homework;

public abstract class Aircraft {
    int maxSpeed = 0;
    public void fly() {
        System.out.println("I'm flying!");
    }
    public void printDescription() {
        System.out.println(this.getClass() + " flying at max speed: " + this.maxSpeed + "km/h");
    }
    Aircraft (){
        this.maxSpeed = 0;
    }
}
