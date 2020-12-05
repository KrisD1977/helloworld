public class LogicalProblem {

    public static void main(String[] args) {

        int x;

        x = 25;

       boolean result = ( x % 5) == 0 && (x % 7) == 0;


        System.out.println(" Czy liczba " + x + " dzieli się przez 5 i 7 jednocześnie? " + result );
    }
}
