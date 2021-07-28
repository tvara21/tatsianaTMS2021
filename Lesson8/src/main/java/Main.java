import com.home.model.Car;
import com.home.model.Engine;
import com.home.model.FuelTank;
import com.home.service.CarService;
import com.home.service.CarServiceImpl;

public class Main {
    public static void main(String[] args) {
        FuelTank fuelTank = new FuelTank(50);
        Engine engine = new Engine("Бензин", 1700);
        Car car = new Car(engine);
        System.out.println("Машина: " + car);

        car.setFuelTank(fuelTank);
        CarService carService = new CarServiceImpl(car);


        carService.go();
        carService.startEngine();
        carService.refueling();
        carService.go();
        carService.startEngine();
        carService.go();
        carService.stopEngine();
        carService.stop();
        carService.go();
        carService.stop();
        carService.go();
        carService.stop();

        carService.refueling();
        System.out.println("Benzin: " + car.getFuelTank().getFuelLevel());


    }
}
