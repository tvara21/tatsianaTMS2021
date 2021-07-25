import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class GroundTransport extends Transport{
    private int countWheels;
    private int fuelConsumption;

    public GroundTransport(double power, int maxSpeed, int weight, String brand, int countWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.countWheels = countWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
