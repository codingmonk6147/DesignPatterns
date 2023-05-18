public class ElevatorCar {


    int id;
    Display display;
    int currentFloor;
    Direction dir;
    Status status;
    InternalButton internalButton;
    Door door;


    public ElevatorCar(int id, Display display, int currentFloor, Direction dir, Status status, InternalButton internalButton, Door door) {
        this.id = id;
        this.display = display;
        this.currentFloor = currentFloor;
        this.dir = dir;
        this.status = status;
        this.internalButton = internalButton;
        this.door = door;
    }

    public void move(int destinationFloor, Direction dir){

    }

}
