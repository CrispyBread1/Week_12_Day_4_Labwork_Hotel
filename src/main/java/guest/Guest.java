package guest;

public class Guest {
    private String name;
    private int roomChoice;

    public Guest(String name, int roomChoice){
        this.name = name;
        this.roomChoice = roomChoice;
    }

    public int guestChoosesRoom(){
        return roomChoice;
    }

}
