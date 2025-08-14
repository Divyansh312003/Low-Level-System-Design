package LLDModelDesigns.ParkingLotDesign;

public class EntranceGate {
    FactoryParkingManager factoryParkingManager;
    ParkingController controller;
    Ticket ticket;
    ParkingSpot findSpot(Vehicle vehicle){
        return new ParkingSpot();
    }
    void generateTicket(Vehicle vehicle,ParkingSpot spot){
         System.out.println(ticket.entryTime);
         System.out.println(ticket.parkingSpot.price);
         System.out.println(ticket.vehicle.vehicleNumber);
    }
    void bookSpot(Vehicle vehicle){
        controller.bookSpot(vehicle);
    }


}
