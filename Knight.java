import java.util.concurrent.ThreadLocalRandom;

public class Knight extends Character {
    int hp;
    int power;

    public Knight() {
        setHp(ThreadLocalRandom.current().nextInt(2, 21 + 1));
        setPower(ThreadLocalRandom.current().nextInt(2, 12 + 1));
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        super.setPower(power);
    }

    public int getPower() {
        return ThreadLocalRandom.current().nextInt(2, 12 + 1);
    }

    @Override
    public void kick(Character other) {
        other.hp -= getPower();
        System.out.println(this.toString() + " hit " + other.toString());
    }

    @Override
    public String toString() {
        return "Knight";
    }
}
