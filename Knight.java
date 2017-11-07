import java.util.concurrent.ThreadLocalRandom;

public class Knight extends Character {

    Knight() {
        setHp(ThreadLocalRandom.current().nextInt(2, 21 + 1));
        setPower(ThreadLocalRandom.current().nextInt(2, 12 + 1));
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        super.setPower(power);
    }

    @Override
    public String toString() {
        return "Knight";
    }
}
