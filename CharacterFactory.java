import java.util.concurrent.ThreadLocalRandom;

class CharacterFactory {

    Character createCharacter() {
        int rand = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        if (rand == 1)
            return new King();
        else if (rand == 2)
            return new Knight();
        else if (rand == 3)
            return new Elf();
        else
            return new Hobbit();
    }
}
