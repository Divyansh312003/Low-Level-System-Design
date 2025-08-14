package LLDModelDesigns.ElevatorDesign;

public class Elevator {
   int id;
   int floor;
   InternalButton button;
   Direction direction;
   Status status;
   void setDirection(Direction dir){
     this.direction=dir;
   }
   void setId(int id){
    this.id=id;
   }
   int getId(){
    return id;
   }

   void move(int destFloor,Direction dir){
       
   }
   void stop(){
      setDirection(Direction.IDLE);
   }

}
