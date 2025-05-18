package factory_design_pattern.practice;

public class FactoryTest {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("TATA");
        vehicle.getDetails();
    }
}
