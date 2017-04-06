/**
 * Created by Alfie on 4/5/2017.
 */
public class PepsiCola {

    // Check value to determine what to print
    public void PrintPepsiCola(Integer value) {
        boolean divisibleByTwo = (value % 2 == 0);
        boolean divisibleByThree = (value % 3 == 0);

        if (divisibleByTwo && divisibleByThree) {
            System.out.println("PepsiCola");
        }
        else if (divisibleByTwo) {
            System.out.println("Cola");
        }
        else if (divisibleByThree) {
            System.out.println("Pepsi");
        }
        else {
            System.out.println("Not divisible by 2 or 3");
        }
    }
}
