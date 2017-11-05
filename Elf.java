public class Elf extends Character {
    protected int hp = 10;
    protected int power = 10;



    public void setHp(int hp) {
        super.setHp(hp);
    }


    public void setPower(int power) {
        super.setPower(power);
    }

    @Override
    public void kick(Character other) {
        if (this.hp > other.hp){
            System.out.println("You are too weak");
            other.hp -= other.hp;
        }
        else{
            System.out.println(this.toString() + " hit " + other.toString());
            other.hp -= 1;
        }

    }

    @Override
    public String toString() {
        return "Elf";
    }
}
