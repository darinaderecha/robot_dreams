import java.util.Objects;

public class Vehicle {

   protected int year;
   protected String name;
   protected String engineVolume;
   protected final String type = "Vehicle";


    public String vehicleType() {
        return "Тип автомобіля " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Objects.equals(name, vehicle.name) && Objects.equals(engineVolume, vehicle.engineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, engineVolume);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }
}
