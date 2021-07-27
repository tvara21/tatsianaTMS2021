import lombok.ToString;

@ToString(callSuper = true)
public class Cargo extends GroundTransport {
    private final int loadCapacity;



    public Cargo(double power, int maxSpeed, int weight, String brand, int countWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, countWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public String info(int load){
        if(load <= loadCapacity){
            return "Грузовик загружен";
        } else {
            return "Вам нужен грузовик побольше";
        }
    }
}
