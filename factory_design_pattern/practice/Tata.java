package factory_design_pattern.practice;

public class Tata implements Vehicle {

    @Override
    public void getDetails() {
        System.out.println("This is a Tata vehicle...");

        TataVehicleFactory tataVehicleFactory = new TataVehicleFactory();
        TataVehicle tataVehicle = tataVehicleFactory.getTataVehicleType("TATA_TRUCK");
        tataVehicle.getVehiclePrice();
    }
}
