class SimpleDotCom {

    public static void main(String [] args) {

        int[] locations = {2, 3, 4};

        SimpleDotComGame theGame = new SimpleDotComGame();
        theGame.setLocationCells (locations);
        String result = theGame.checkYourself("2");
        
        String testResult = "failed";

        if (result == "hit") {
            testResult = "passed";
        }

        System.out.println(result);

    }

}