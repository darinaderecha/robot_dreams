public class Truck extends Vehicle {
    private final String type = "Truck";

    @Override
    public String vehicleType() {
        return "Тип автомобіля " + type;
    }
}
