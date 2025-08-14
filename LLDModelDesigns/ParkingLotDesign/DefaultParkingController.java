package LLDModelDesigns.ParkingLotDesign;

import java.util.List;

public class DefaultParkingController extends ParkingController{

    DefaultParkingController(List<ParkingSpot> spots) {
        super(spots);
        
    }

     ParkingSpot findParkingSpot(Vehicle vehicle){
        //algo
        return new DefaultParkingSpot();
    }
    
}
