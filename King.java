import java.util.concurrent.ThreadLocalRandom;

public class King extends Character {
    King() {
        setHp(ThreadLocalRandom.current().nextInt(5, 15 + 1));
        setPower(ThreadLocalRandom.current().nextInt(5, 15 + 1));
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "King";
    }
}
