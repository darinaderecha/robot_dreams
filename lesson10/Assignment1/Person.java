package Assignment1;

public class Person {
    private String name;
    private int age;
    private boolean isMan;

    public Person() {
    }

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void speak() {
        System.out.println("Blah-Blah");

    }

    public void sleep() {
        System.out.println("Hrrr");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}


