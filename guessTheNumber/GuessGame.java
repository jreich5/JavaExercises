public class GuessGame {
	
    public static void startGame() {
					
        int computerGuess;

        // set computerGuess
    	computerGuess = 0 + (int)(Math.random() * ((9 - 0) + 1));

    	// generate players
    	Player justin;
    	Player pam;
    	Player amelie;

    	// instantiate new players
    	justin = new Player();
    	pam = new Player();
    	amelie = new Player();

    	// player status
    	boolean justinWinner = false;
    	boolean pamWinner = false;
    	boolean amelieWinner = false;

	System.out.println("Welcome, players, to guess the game!");
        System.out.println("Let's begin!!");

        while((justinWinner || pamWinner || amelieWinner) != true) {
    
            System.out.println("[The secret number is... " + computerGuess + ".]");
            System.out.println("Please guess a number between 0 and 9.");

            // generate player guesses
            justin.guess();
            pam.guess();
            amelie.guess();

            // output round outcome
            System.out.println("Justin guesses " + justin.currentGuess);
            System.out.println("Pam guesses " + pam.currentGuess);
            System.out.println("Amelie guesses " + amelie.currentGuess);

            // check for winners
            if (justin.currentGuess == computerGuess) {
                justinWinner = true;
		break;
    	    }
    	    if (pam.currentGuess == computerGuess) {
                pamWinner = true;
		break;
    	    }
    	    if (amelie.currentGuess == computerGuess) {
                amelieWinner = true;
		break;
    	    }

            System.out.println("All players guessed incorrectly. Try again.");
            
        }
       
        System.out.println("The game has been won!!");
        
        // verify all player statuses
    	if (justin.currentGuess == computerGuess) {
            justinWinner = true;
    	}
    	if (pam.currentGuess == computerGuess) {
            pamWinner = true;
    	}
    	if (amelie.currentGuess == computerGuess) {
            amelieWinner = true;
    	}

        // display final game results
        System.out.println("Justin won the game: " + justinWinner);
        System.out.println("Pam won the game: " + pamWinner);
        System.out.println("Amelie won the game: " + amelieWinner);

    }

}