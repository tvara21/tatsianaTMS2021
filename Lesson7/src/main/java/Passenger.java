import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
public class Passenger extends GroundTransport {
    private final String bodyType;
    private final int countPassenger;

    public Passenger(double power, int maxSpeed, int weight, String brand, int countWheels, int fuelConsumption, String bodyType, int countPassenger) {
        super(power, maxSpeed, weight, brand, countWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.countPassenger = countPassenger;
    }


    public void info(int time) {
        int distance = time * getMaxSpeed();
        System.out.println("За время " + time + " ч автомобиль " + getBrand() + ", двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет " + distance + " км и израсходует " + fuel(distance) + " литров топлива");
    }

    private int fuel(int distance) {
        return getFuelConsumption() * distance / 100;
    }
}
