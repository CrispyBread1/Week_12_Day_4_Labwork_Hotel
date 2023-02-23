package hotel;

import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();

    }

    public int getNumberOfBedrooms(){
        return bedrooms.size();
    }

    public int getNumberOfConferenceRooms(){
        return conferenceRooms.size();
    }

    public void addBedroomToHotel(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public void checkGuestIn(Guest guest){

        for(Bedroom bedroom : bedrooms) {
            if(bedroom.getRoomCapacity() == guest.guestChoosesRoom() ){
                bedroom.addGuestToRoom(guest);
            }
        }
    }

    public void checkGuestOut(Guest guest){

        for(Bedroom bedroom : bedrooms) {
            if(bedroom.getRoomCapacity() == guest.guestChoosesRoom() ){
                bedroom.removeGuest(guest);
            }
        }
    }

    public int isGuestInRoom(Bedroom bedroom){
        return bedroom.showGuestNumber();
    }
}
