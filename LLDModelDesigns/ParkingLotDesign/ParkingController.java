package LLDModelDesigns.ParkingLotDesign;

import java.util.List;

public class ParkingController {
     List<ParkingSpot> spots;
     TwoWheelerParkingController twoWheelerParkingController;
     FourWheelerParkingController fourWheelerParkingController;
     DefaultParkingController defaultParkingController;
     ParkingController(List<ParkingSpot> spots){
        this.spots=spots;
     }

     void bookSpot(Vehicle vehicle){
         if(vehicle.vehicleType==VehicleType.TWO_WHEELER){
              twoWheelerParkingController.findParkingSpot(vehicle);
         }
         else if(vehicle.vehicleType==VehicleType.FOUR_WHEELER){
            fourWheelerParkingController.findParkingSpot(vehicle);
         }
         else{
            defaultParkingController.bookSpot(vehicle);
         }
         
     }
     

}
