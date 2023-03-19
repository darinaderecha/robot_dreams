package lesson14;

public abstract class Human {
    protected String name;
    protected int age;

    public void breathe(){
        System.out.println("Breathing");
    }

    public abstract void move();

}
