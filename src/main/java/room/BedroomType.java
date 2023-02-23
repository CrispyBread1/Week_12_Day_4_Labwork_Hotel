package room;

public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4);

    private final int capacity;

    BedroomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
