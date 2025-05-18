package factory_design_pattern.practice;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleName){
        if(vehicleName == null){
            throw new IllegalArgumentException("Please enter a valid vehicle name.");
        }
        if("TOYOTA".equalsIgnoreCase(vehicleName)){
            return new Toyota();
        }
        if("TATA".equalsIgnoreCase(vehicleName)){
            return new Tata();
        }
        if("MAHINDRA".equalsIgnoreCase(vehicleName)){
            return new Mahindra();
        }
        if("MARUTI".equalsIgnoreCase(vehicleName)){
            return new Maruti();
        }
        else throw new IllegalArgumentException("Please enter a valid vehicle name.");
    }
}
