import java.util.concurrent.ThreadLocalRandom;

public class King extends Character {
    int hp = ThreadLocalRandom.current().nextInt(5, 15 + 1);
    int power;

    public King() {
        setHp(ThreadLocalRandom.current().nextInt(5,  15    + 1));
        setPower(ThreadLocalRandom.current().nextInt(5,  15    + 1));
    }


    public void setHp(int hp) {
        super.setHp(hp);
    }


    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return ThreadLocalRandom.current().nextInt(2, 21 + 1);
    }

    @Override
    public void kick(Character other) {
        other.hp -= getPower();
        System.out.println(this.toString() + " hit " + other.toString());
    }


    @Override
    public String toString() {
        return "King";
    }

}
