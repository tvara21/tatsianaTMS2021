import lombok.ToString;

@ToString(callSuper = true)
public class AirTransport extends Transport{
    private final int wingSpan;
    private final int pathLength;

    public AirTransport(double power, int maxSpeed, int weight, String brand, int wingSpan, int pathLength) {
        super(power, maxSpeed, weight, brand);
        this.wingSpan = wingSpan;
        this.pathLength = pathLength;
    }

}
