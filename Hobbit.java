public class Hobbit extends Character {
    int hp = 0;
    int power = 3;


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
