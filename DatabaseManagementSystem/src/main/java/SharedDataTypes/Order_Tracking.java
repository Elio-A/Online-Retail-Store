package SharedDataTypes;

public enum Order_Tracking {
    NotPlaced(0),
    Processing(1),
    Shipping(2),
    OutForDelivery(3),
    Delivered(4),
    Cancelled(5);

    private final int value;

    Order_Tracking(int value){
        this.value = value;
    }

    public static Order_Tracking fromValue(int value){
        for(Order_Tracking status : Order_Tracking.values()){
            if(status.value == value){
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }
}
