package ClassesAndEnums;

public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;


    // enums already have toString() over-ridden so that the values converted to string will result from calling
    //    method. you can, however, override this further (e.g. if you want the characters to be in lower case)
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
