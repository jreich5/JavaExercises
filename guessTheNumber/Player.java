public class Player {
    String playerName;

    int currentGuess;

    // Constructor
    Player(String name) {
        this.playerName = name;
    }

    // method guess number
    int guess() {
        Random rn = new Random();
        int randomGuess = rn.nextInt(10);
        this.currentGuess = randomGuess;
        return randomGuess;
    }
}