package room;

import guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {
    ConferenceRoom conferenceRoom1;
    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Falcon", 6);
        conferenceRoom1 = new ConferenceRoom("BusinessBoyz", 50);
    }

    @Test
    public void hasRoomName(){
        assertEquals("BusinessBoyz", conferenceRoom1.getConferenceRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom1.getRoomCapacity());
    }

    @Test
    public void canAddGuestToRoom() {
        conferenceRoom1.addGuestToRoom(guest1);
        assertEquals(1, conferenceRoom1.showGuestNumber());
    }
}
