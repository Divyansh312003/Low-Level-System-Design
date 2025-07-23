import java.util.List;
import java.util.Queue;

public class Elevator{
   private int elevatorId;
   private int floor;
   private Direction direction;
   private ElevatorState state;
   private List<ElevatorObserver> observers;
   private Queue<ElevatorRequest> requests;
   

    /**
     * @return int return the elevatorId
     */
    public int getElevatorId() {
        return elevatorId;
    }

    /**
     * @param elevatorId the elevatorId to set
     */
    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    /**
     * @return int return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * @return Direction return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * @return ElevatorState return the state
     */
    public ElevatorState getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(ElevatorState state) {
        this.state = state;
    }

    /**
     * @return List<ElevatorObserver> return the observers
     */
    public List<ElevatorObserver> getObservers() {
        return observers;
    }

    /**
     * @param observers the observers to set
     */
    public void setObservers(List<ElevatorObserver> observers) {
        this.observers = observers;
    }

    /**
     * @return Queue<ElevatorRequest> return the requests
     */
    public Queue<ElevatorRequest> getRequests() {
        return requests;
    }

    /**
     * @param requests the requests to set
     */
    public void setRequests(Queue<ElevatorRequest> requests) {
        this.requests = requests;
    }

}