public abstract class AbstractVehicle implements Vehicle {
    protected String vehicleType;
    protected String fuelType;

    @Override
    public void start() {
        System.out.println(this.vehicleType + " starting");
    }

    @Override
    public void stop() {
        System.out.println(this.vehicleType + " starting");
    }

    @Override
    public String getInfo() {
        return this.vehicleType + " Information:\n" +
                "Type: " + this.vehicleType + "\n" +
                "Fuel: " + this.fuelType + "\n" +
                "Color: Red";
    }

    abstract void setFuelType();
}
