public class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bus starting");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopping");
    }

    @Override
    public String getInfo() {
        return "Bus Information:\n" +
                "Type: Bus\n" +
                "Fuel: Diesel\n" +
                "Capacity: 40 passengers\n";
    }
}
