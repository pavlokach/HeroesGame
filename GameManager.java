public class GameManager {
    public void fight(Character c1, Character c2){
        System.out.println(c1.toString() + " with " + c1.hp + " HP and the power of " + c1.power);
        System.out.println("VS");
        System.out.println(c2.toString() + " with " + c2.hp + " HP and the power of " + c2.power);
        while (true){
            c1.kick(c2);
            if (!(c2.isAlive())){
                System.out.println(c1.toString() + " is the winner!!!");
                break;
            }
            c2.kick(c1);
            if (!(c1.isAlive())){
                System.out.println(c2.toString() + " is the winner");
                break;
            }


        }
    }

}
