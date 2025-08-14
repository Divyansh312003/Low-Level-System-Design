package LLDModelDesigns.ElevatorDesign;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ElevatorController {
     Elevator elevator;
     PriorityQueue<Integer> minpq;
     PriorityQueue<Integer> maxpq;
     ElevatorController(Elevator elevator){
        this.minpq=new PriorityQueue<>();
        this.maxpq=new PriorityQueue<>(Comparator.reverseOrder());
        this.elevator=elevator;
     }
    
     void acceptRequest(int floorId,Direction dir){
         int currFloor=elevator.floor;
         if(dir==Direction.UP){
             if(currFloor<=floorId){
                  minpq.add(floorId);
                  elevator.stop();
             }
             else{
                maxpq.add(floorId);
                
             }
         }
         else if(dir==Direction.DOWN){
             if(currFloor<=floorId){
                  maxpq.add(floorId);
             }
             else{
                minpq.add(floorId);
                elevator.stop();
             }
         }
     }


}
