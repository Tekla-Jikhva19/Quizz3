package quizes.q3.tekla_jikhvashvili_2;

import java.util.Map;
import java.util.HashMap;
class HotelManager {
    private Map<String, Room> guestRooms;

    public HotelManager(int numberOfRooms) {
        guestRooms = new HashMap<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            Room room = new Room(i);
            guestRooms.put(String.valueOf(i), room);
        }
    }

    public boolean checkIn(Person person, String roomId) {
        Room room = guestRooms.get(roomId);
        if (room != null && !room.isOccupied()) {
            room.setOccupied(true);
            guestRooms.put(person.getId(), room);
            System.out.println(person.getName() + " checked into room " + room.getRoomNumber());
            return true;
        } else {
            System.out.println("Room " + roomId + " is occupied or does not exist.");
            return false;
        }
    }

    public void checkOut(String personId) {
        Room room = guestRooms.get(personId);
        if (room != null && room.isOccupied()) {
            room.setOccupied(false);
            System.out.println("Guest with ID " + personId + " checked out successfully from room " + room.getRoomNumber());
            guestRooms.remove(personId);
        } else {
            System.out.println("Guest with ID " + personId + " is not checked in or does not exist.");
        }
    }

    public void displayInfo() {
        System.out.println("Guest Information:");
        for (Map.Entry<String, Room> entry : guestRooms.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Room: " + entry.getValue().getRoomNumber());
        }
    }
}
