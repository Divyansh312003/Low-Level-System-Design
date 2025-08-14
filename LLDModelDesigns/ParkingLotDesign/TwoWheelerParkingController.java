package LLDModelDesigns.ParkingLotDesign;

import java.util.List;

public class TwoWheelerParkingController extends ParkingController{
    List<ParkingSpot> spots;
    TwoWheelerParkingSpot spot;

    TwoWheelerParkingController(List<ParkingSpot> spots) {
        super(spots);
    }

    ParkingSpot findParkingSpot(Vehicle vehicle){
        //algo
        return new TwoWheelerParkingSpot();
    }

    int calculateAmount(int time){
       return spot.price()*time;
    }

   

      
}
