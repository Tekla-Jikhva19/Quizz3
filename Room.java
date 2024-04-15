package quizes.q3.tekla_jikhvashvili_2;


import java.util.HashMap;
import java.util.Map;

class Room {
    private int roomNumber;
    private boolean occupied;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
