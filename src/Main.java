public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas Vehicle
        Vehicle vehicle = new Vehicle(4, "Merah", 60.0);
        vehicle.showInfo();
        vehicle.moveForward();
        vehicle.turnLeft();

        System.out.println("----------------------");

        // Contoh penggunaan kelas Motorcycle
        Motorcycle motorcycle = new Motorcycle(2, "Hitam", 80.0, 10, false);
        motorcycle.showInfo();
        motorcycle.moveForward();
        motorcycle.turnRight();
        System.out.println("Tank Capacity: " + motorcycle.getTankCapacity());
        System.out.println("Engine Status: " + motorcycle.getEngineStatus());

        System.out.println("----------------------");

        // Contoh penggunaan kelas Car
        Car car = new Car(4, "Biru", 100.0, 50, 5, false);
        car.showInfo();
        car.moveBackward();
        car.turnRight();
        System.out.println("Tank Capacity: " + car.getTankCapacity());
        System.out.println("Transmission: " + car.getTransmission());
        System.out.println("Engine Status: " + car.isEngineStatus());

        // Contoh penggunaan method khusus Car
        car.startEngine();
        car.changeTransmission(4);
        car.stopEngine();
    }
}
