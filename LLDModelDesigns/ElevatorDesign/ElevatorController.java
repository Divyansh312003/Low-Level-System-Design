import java.util.List;

public class ElevatorController {
    private List<Elevator> elevators;
    private int elevatorId;
    private List<Floor> floors;
    private SchedulingStrategy strategy;

    //current floor, direction of target
    public void requestElevator(int id,int floor,Direction dir){
        //creating a new elevator;
        Elevator elevator=null;
        for(Elevator e:elevators){
            if(e.getElevatorId()==id){
                elevator=e;
            }
        }
        if(elevator==null){
            System.out.println("Elevator does not exist");
        }
        else{
            // elevator.addRequest(new ElevatorRequest(id, floor,dir, false));
        }
    }

    public void requestFloor(int id,int floor){

    }
    

   
    public List<Elevator> getElevators() {
        return elevators;
    }

    
    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    
    public int getElevatorId() {
        return elevatorId;
    }

   
    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    
    public List<Floor> getFloors() {
        return floors;
    }

  
    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

   
    public SchedulingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SchedulingStrategy strategy) {
        this.strategy = strategy;
    }

}
