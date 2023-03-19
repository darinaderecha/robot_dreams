package lesson15;

public class Pilot extends Person implements Flying {
    private int experience;

    public Pilot(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public void prepareForFlying() {
        System.out.println("Check all systems");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off");
    }

    @Override
    public void flyOnPlane(int hours) {
        System.out.println("Fly for " + hours + " hours");
    }

    @Override
    public void land(String destination) {
        System.out.println("We are landed the plane in " + destination);
    }


}
