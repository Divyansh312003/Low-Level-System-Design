package LLDModelDesigns.ParkingLotDesign;

public class FactoryParkingManager {
    ParkingController getParkingController(Vehicle vehicle){
        if(vehicle.vehicleType==VehicleType.TWO_WHEELER) return new TwoWheelerParkingController(null);
        if(vehicle.vehicleType==VehicleType.FOUR_WHEELER) return new FourWheelerParkingController(null);
        return new DefaultParkingController(null);
    }
}
