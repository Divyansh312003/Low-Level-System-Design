
public class ElevatorRequest implements ELevatorCommand {
    private int elevatorId;
    private int floor;
    private Direction direction;
    private ElevatorController controller;
    private boolean isInternalRequest;
    public ElevatorRequest(int id,int f,Direction d,boolean requests){
        this.elevatorId=id;
        this.floor=f;
        this.isInternalRequest=requests;
        this.direction=d;
    }
    

    @Override
    public void execute() {
       if(isInternalRequest){
        controller.requestFloor(elevatorId,floor);
       }
       else controller.requestElevator(elevatorId,floor,direction);
    }


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
     * @return ElevatorController return the controller
     */
    public ElevatorController getController() {
        return controller;
    }

    /**
     * @param controller the controller to set
     */
    public void setController(ElevatorController controller) {
        this.controller = controller;
    }

    /**
     * @return boolean return the isInternalRequest
     */
    public boolean isIsInternalRequest() {
        return isInternalRequest;
    }

    /**
     * @param isInternalRequest the isInternalRequest to set
     */
    public void setIsInternalRequest(boolean isInternalRequest) {
        this.isInternalRequest = isInternalRequest;
    }

}
