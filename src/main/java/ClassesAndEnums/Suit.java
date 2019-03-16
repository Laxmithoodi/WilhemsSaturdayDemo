package ClassesAndEnums;

public enum Suit {
    HEARTS ("♥"),
    DIAMONDS ("♦"),
    CLUBS("♣"),
    SPADES ("♠");
    // above symbols were just copy/pasted from a search 'utf-8 card symbols'; the utf-8 code OR the symbol can be used

    private String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
