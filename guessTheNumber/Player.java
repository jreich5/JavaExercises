public class Player {

    int currentGuess;

    // method guess number
    void guess() {
        currentGuess = 0 + (int)(Math.random() * ((9 - 0) + 1));
    }
}