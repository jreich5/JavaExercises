public class Bottles {

    public static void main (String[] args) {

        int bottles = 99;
	String stanza1 = " bottles of beer on the wall, ";
	String stanza2 = " bottles of beer.";
	String stanza3 = "Take one down and pass it around, ";
	String stanza4 = " of beer on the wall.";
        String stanza5 = "No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall."; 

	while(bottles > 0) {
	    System.out.println(bottles + stanza1 + stanza2);
	    bottles -= 1;
	    System.out.println(stanza3 + bottles + stanza4);
	}

	System.out.println(stanza5);

    }

}