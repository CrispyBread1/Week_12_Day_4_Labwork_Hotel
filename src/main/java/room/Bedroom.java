package room;

public class Bedroom extends Room {
    //Bedroom bedroom;
    private Integer roomNumber;

    BedroomType bedroomType;


    public Bedroom(Integer roomNumber, BedroomType bedroomType){
        super(bedroomType.getCapacity());
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }


    public int getRoomNumber() {
        return roomNumber;
    }
}
