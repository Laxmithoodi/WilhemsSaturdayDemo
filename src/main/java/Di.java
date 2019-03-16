import java.util.Random;

public class Di {

    private Integer face;
    private Integer numberOfFaces;
    private Random random;

    public Di() {
        this.face = 1;
        this.numberOfFaces = 6;
        this.random = new Random();
    }

    public Di (Random random) {
        this.face = 1;
        this.numberOfFaces = 6;
        this.random = random;
    }

    public Integer roll() {
        this.face = random.nextInt(numberOfFaces) + 1;
        return getFace();
    }

    public Integer getFace() {
        return face;
    }
}
