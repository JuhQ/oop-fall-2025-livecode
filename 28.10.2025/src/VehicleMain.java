public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setFuelType();
        car.start();
        car.stop();
        System.out.println(car.getInfo());
    }
}
