package LLDModelDesigns.ParkingLotDesign;

import java.util.List;

public class FourWheelerParkingController extends ParkingController{
    FourWheelerParkingSpot spot;

    FourWheelerParkingController(List<ParkingSpot> spots) {
        super(spots);
       
    }

      ParkingSpot findParkingSpot(Vehicle vehicle){
        //algo
        return new FourWheelerParkingSpot();
    }
    
    int calculateAmount(int time){
       return spot.price()*time;
    }
}
