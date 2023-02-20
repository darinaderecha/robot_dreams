public class Car extends Vehicle {
    private final String type = "Car";

    @Override
    public String vehicleType() {
        return "Тип автомобіля " + type;
    }
}
