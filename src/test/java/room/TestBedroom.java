package room;

import guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {
    Bedroom bedroom1;
    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Falcon", 6);
        bedroom1 = new Bedroom(3, BedroomType.DOUBLE);
    }

    @Test
    public void hasRoomCapacity(){
        assertEquals(2, bedroom1.getRoomCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(3, bedroom1.getRoomNumber());
    }

    @Test
    public void canAddGuestToRoom() {
        bedroom1.addGuestToRoom(guest1);
        assertEquals(1, bedroom1.showGuestNumber());
    }
}
