package factory_design_pattern.practice;

public class TataTruck implements TataVehicle {
    @Override
    public void getVehiclePrice() {
        System.out.println("The Tata truck price is: " + "80,00,000");
    }
}
