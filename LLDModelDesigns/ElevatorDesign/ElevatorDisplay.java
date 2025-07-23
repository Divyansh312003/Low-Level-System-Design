public class ElevatorDisplay implements ElevatorObserver{

    @Override
    public void onElevatorStateChange(Elevator elevator, ElevatorState state) {
       System.out.println("Elevator "+elevator.getElevatorId()+" state changed to "+state);
    }

    @Override
    public void onElevatorFloorChange(Elevator elevator, int floor) {
      System.out.println("Elevator "+elevator.getElevatorId()+" moved to "+ floor);
    }
    
}
