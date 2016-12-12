public class RingTest {

    public static void main(String[] args) {

        Ring theOne = new Ring();
        theOne.size = 6.5;
        theOne.color = "Rose Gold";
        theOne.price = 2500;
        theOne.brand = "Gemvara";
        theOne.wear();

        System.out.println(theOne.size);

    } 

}