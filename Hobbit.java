import java.util.concurrent.ThreadLocalRandom;

public class Hobbit extends Character {


    public Hobbit() {
        setHp(3);
        setPower(0);
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }


    public void setPower(int power) {
        super.setPower(power);
    }

    public void kick(Character other) {
        System.out.println("I am useless");
    }

    public String toString() {
        return "Hobbit";
    }
}
