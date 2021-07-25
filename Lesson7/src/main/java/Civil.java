import lombok.ToString;

@ToString(callSuper = true)
public class Civil extends AirTransport{
    private final int countPassenger;
    private final boolean businessClass;


    public Civil(double power, int maxSpeed, int weight, String brand, int wingSpan, int pathLength, int countPassenger, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingSpan, pathLength);
        this.countPassenger = countPassenger;
        this.businessClass = businessClass;
    }

    public String info(int count){
        if(count <= countPassenger){
            return "Самолёт загружен";
        } else {
            return "Вам нужен самолёт побольше";
        }
    }
}
