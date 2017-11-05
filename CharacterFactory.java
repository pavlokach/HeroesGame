import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {

    King king = new King();
    Knight knight = new Knight();
    Elf elf = new Elf();
    Hobbit hobbit = new Hobbit();


    public Character createCharacter(){
        List<Character> lst = new ArrayList<Character>();
        lst.add(king);
        lst.add(knight);
        lst.add(elf);
        lst.add(hobbit);
        Random rand = new Random();
        return lst.get(rand.nextInt(lst.size()));
    }
}
