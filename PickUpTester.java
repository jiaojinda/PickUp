package xxx;

public class PickUpTester {



    public static void main (String[] args){

        PickUp pickUp = new PickUp("xxx.wav", 8000, 16, 1000, 4500);
        pickUp.start();
        System.exit(-1);
    }
}
