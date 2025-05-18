package factory_design_pattern.practice;

public class TataVehicleFactory {
    public TataVehicle getTataVehicleType(String vehicleType){
        if(vehicleType == null){
            throw new IllegalArgumentException("Please enter a valid vehicle name.");
        }
        if("TATA_TRUCK".equalsIgnoreCase(vehicleType)){
            return new TataTruck();
        }
        if("TATA_CAR".equalsIgnoreCase(vehicleType)){
            return new TataCar();
        }
        else throw new IllegalArgumentException("Please enter a valid vehicle name.");
    }
}
