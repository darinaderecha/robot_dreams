package lesson15;

public class Main {
    public static void main(String[] args) {
        Driver driverTom = new Driver("Tom", 23, "djhskzmsk", 4);
        Pilot pilotJerry = new Pilot("Jerry", 40, 12);
        driverTom.checkCar();
        driverTom.drive("mall");
        driverTom.fuel(12, 5.5);
        pilotJerry.prepareForFlying();
        pilotJerry.takeOff();
        pilotJerry.flyOnPlane(12);
        pilotJerry.land("Tokyo");
    }
}
