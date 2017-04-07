/**
 * Created by Alfie on 4/5/2017.
 * class Main
 */
class Main {

    public static void main(String Args[]) {

        /*
         * PROBLEM 01:
         *  Print "Cola" if divisible by 2
         *  Print "Pepsi" if divisible by 3
         *  Print "PepsiCola" if divisible by 2 and 3
         *  Print "Not divisible by 2 or 3" if not of the above
         */
        PepsiCola pepsiCola = new PepsiCola();

        pepsiCola.PrintPepsiCola(3);
        pepsiCola.PrintPepsiCola(2);
        pepsiCola.PrintPepsiCola(6);
        pepsiCola.PrintPepsiCola(7);
    }
}
