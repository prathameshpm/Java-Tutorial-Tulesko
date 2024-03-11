abstract class Car {
    public abstract void drive();
    public abstract void fly();
    
    public void playMusic() {
        System.out.println("Play Music");
    }
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("Driving..");
    }
}

class WagonRFXI extends WagonR {
    public void fly() {
        System.out.println("Flying..");
    }
}

public class abstractClass {
    public static void main (String[] args) {
        Car obj = new WagonRFXI();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}
