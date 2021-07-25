public class Main {
    public static void main(String[] args) {
        Passenger passengerCar = new Passenger(120, 120, 2300, "Toyota", 4, 5, "лимузин", 4);
        Cargo cargoCar = new Cargo(300, 100, 3000, "MAN", 16, 15, 1000);
        Military militaryPlane = new Military(3000, 2500, 10000, "Northrop F-5", 150, 3000, true, 8);
        Civil civilPlane = new Civil(2500, 1800, 2000, "Boeing", 200, 2500, 300, true);

        System.out.println("\nЛегковой автомобиль: " + passengerCar);
        passengerCar.info(10);

        System.out.println("\nГрузовой автомобиль: " + cargoCar);
        System.out.println(cargoCar.info(2000));

        System.out.println("\nВоенный самолёт: " + militaryPlane);
        System.out.println(militaryPlane.shot());
        System.out.println(militaryPlane.checkEjection());

        System.out.println("\nГражданский самолёт: " + civilPlane);
        System.out.println(civilPlane.info(150));

    }
}
