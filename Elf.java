public class Elf extends Character {

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        super.setPower(power);
    }

    @Override
    public void kick(Character other) {
        if (super.hp > other.hp) {
            System.out.println("You are too weak");
            other.hp -= other.hp;
        } else {
            System.out.println(this.toString() + " hit " + other.toString() + " with the power of 1");
            other.hp -= 1;
        }
    }

    @Override
    public String toString() {
        return "Elf";
    }
}
