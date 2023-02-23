package room;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {
    private Integer capacity;
    private ArrayList<Guest> collectionOfGuests;

    public Room(Integer capacity){
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<>();
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public void addGuestToRoom(Guest guest){
        collectionOfGuests.add(guest);
    }

    public void removeGuest(Guest guest){
        collectionOfGuests.remove(guest);
    }

    public int showGuestNumber(){
        return collectionOfGuests.size();
    }


}
