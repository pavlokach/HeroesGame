public class Character {
    int hp = 10;
    int power = 10;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void kick(Character other) {
        other.hp -= this.power;
        System.out.println(this.toString() + " hit " + other.toString() + "wiht a power of " + this.power);
    }


}
