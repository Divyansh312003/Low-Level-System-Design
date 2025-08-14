package LLDModelDesigns.ElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class ExternalButtonDispatcher {
    static   List<ElevatorController> controllers=ElevatorCreator.list;
      
    
      void submitRequest(int floor,Direction dir){
         for(ElevatorController elevatorController:controllers){
            int id=elevatorController.elevator.getId();
            if(id%2==1 && floor%2==1){
                elevatorController.acceptRequest(floor,dir);
            }
            else if(id%2==0 && floor%2==0){
                elevatorController.acceptRequest(floor,dir);
            }
         }
      }
}
