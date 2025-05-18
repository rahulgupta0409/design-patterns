package factory_design_pattern.practice;

public class TataCar implements TataVehicle {
    @Override
    public void getVehiclePrice() {
        System.out.println("The Tata car price is: " + "20,00,000");
    }
}
