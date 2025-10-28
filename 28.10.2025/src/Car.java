public class Car extends AbstractVehicle {

    public Car() {
        this.vehicleType = "Car";
    }

    @Override
    void setFuelType() {
        this.fuelType = "Gas";
    }
}
