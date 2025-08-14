package LLDModelDesigns.ElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
   static  List<ElevatorController> list=new ArrayList<>();
    static {
        Elevator elevator=new Elevator();
        elevator.setId(1);
        ElevatorController controller=new ElevatorController(elevator);
        list.add(controller);
    }
    
       
    
}
