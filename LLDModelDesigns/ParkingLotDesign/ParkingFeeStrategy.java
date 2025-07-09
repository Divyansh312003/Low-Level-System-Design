package LLDModelDesigns.ParkingLotDesign;

public interface ParkingFeeStrategy {
    double calcAmount(DurationType type,int time);
}
