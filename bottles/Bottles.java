public class Bottles {

    public static void main (String[] args) {

        int number = 99;
	String bottle = " bottle ";
        String bottles = " bottles ";
	String fragment1 = "of beer on the wall, ";
	String fragment2 = "of beer.";
	String fragment3 = "Take one down and pass it around, ";
	String fragment4 = "of beer on the wall.";
        String fragment5 = "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."; 
	
	while(number > 1) {
	    System.out.println(number + bottles + fragment1 + number + bottles + fragment2);
	    number -= 1;
	    System.out.println(fragment3 + number + ((number > 2) ? bottles : bottle) + fragment4);
	}

	System.out.println(number + bottle + fragment1 + number + bottle + fragment2);
	number -= 1;
	System.out.println(fragment3 + "no more bottles of beer on the wall.");

	System.out.println(fragment5);

    }

}

// Assemble two stanzas with conditional logic using args passed in