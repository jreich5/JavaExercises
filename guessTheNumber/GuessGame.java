public class GuessGame {
							PROPERTIES
    int computerGuess;
    int[] winners;
    int[] players;
							METHODS
    void setComputerGuess() {
        this.computerGuess = this.generateNumber();
    }

    int getComputerGuess() {
        return this.computerGuess;
    }
    
    // generate player method
    void generatePlayers() {
        Player justin = new Player();
        justin.name = "Justin";
        players[0] = justin.name;

        Player pam = new Player();
        pam.name = "Pam";
        players[0] = pam.name;

        Player amelie = new Player();
        amelie.name = "Amelie";
        players[0] = amelie.name;
    } 

    int generatePlayerGuesses() {
        justin.guess();
        pam.guess();
        amelie.guess();
    }

    // Determine winner
    void determineWinner() {

    	if (justin.guess == computerGuess) {
            winners[0] = "Justin";
    	}
    	if (pam.guess == computerGuess) {
            winners[1] = "Pam";
    	}
    	if (amelie.guess == computerGuess) {
            winners[2] = "Amelie";
    	}
    	if (winners == null) {
            runRound();
    	} else {
            endGame();
        }
    }

    // runRound method
    void runRound() {

        // output computer number
        System.out.println("[The secret number is... " + this.computerGuess + ".]");
        System.out.println("Please guess a number between 0 and 9.");
        
        generatePlayerGuesses();

        // output round outcome
        System.out.println("Justin guesses " + justin.currentGuess);
        System.out.println("Pam guesses " + pam.currentGuess);
        System.out.println("Amelie guesses " + amelie.currentGuess);
        
        // if no player won game, runRound again
    
    }


    // endGame method
    void endGame() {
        // declare the winner(s)!
        for (var i = 0; i < this.winners; ++i) {
            System.out.println(this.winners[i] + "is a winner!!");
        }
    }

    // startGame method
    void startGame {
        System.out.println("Welcome, players, to guess the game!");
        System.out.println("Let's begin!!");
	
        /*
        for (int i = 0; i < 3; ++i) {
            Player player = new Player();
        }
        */
        // generate three players
        this.generatePlayers();

        // generate the computer number
        this.generateNumber();
        
        // runRound

    }

}