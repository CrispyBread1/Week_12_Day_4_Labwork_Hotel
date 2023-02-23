package hotel;

import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.BedroomType;
import room.ConferenceRoom;
import room.Room;

import static org.junit.Assert.assertEquals;

public class TestHotel {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    Guest guest1;

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(2, BedroomType.SINGLE);
        bedroom2 = new Bedroom(4, BedroomType.DOUBLE);
        bedroom3 = new Bedroom(6, BedroomType.TRIPLE);
        bedroom4 = new Bedroom(8, BedroomType.FAMILY);

        conferenceRoom = new ConferenceRoom("BusinessBoyzzz", 6);
        guest1 = new Guest("Alex", 4);
    }

    @Test
    public void canCountAmountOfBedrooms(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canCountAmountOfConferenceRooms(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroomToHotel(bedroom1);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckIntoRoom(){
        hotel.addBedroomToHotel(bedroom1);
        hotel.addBedroomToHotel(bedroom2);
        hotel.addBedroomToHotel(bedroom3);
        hotel.addBedroomToHotel(bedroom4);

        hotel.checkGuestIn(guest1);
        
        assertEquals(1, bedroom4.showGuestNumber());
    }

    @Test
    public void canCheckOutOfRoom(){
        hotel.addBedroomToHotel(bedroom1);
        hotel.addBedroomToHotel(bedroom2);
        hotel.addBedroomToHotel(bedroom3);
        hotel.addBedroomToHotel(bedroom4);

        hotel.checkGuestIn(guest1);

        hotel.checkGuestOut(guest1);

        assertEquals(0, bedroom4.showGuestNumber());
    }
}
