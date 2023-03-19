package lesson15;

public class Driver extends Person implements Driving{
    private String drivingLicense;
    private int drivingExperience;

    public Driver(String name, int age, String drivingLicense, int drivingExperience) {
        super(name, age);
        this.drivingLicense = drivingLicense;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void checkCar() {
        System.out.println("Check your car");
    }



    @Override
    public void drive(String destination) {
        System.out.println("We were driving and now we have arrived to the " + destination);

    }

    @Override
    public void fuel(int litres, double gasPrice) {
        System.out.println("You have to pay for " + litres + " litres " + (litres * gasPrice) + " dollars");

    }


}
