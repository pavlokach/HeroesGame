public class Main {

    public static void main(String[] args) {
        CharacterFactory creator = new CharacterFactory();
        GameManager admin = new GameManager();
        admin.fight(creator.createCharacter(), creator.createCharacter());
    }
}

