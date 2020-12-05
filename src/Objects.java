public class Objects {

    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();

        System.out.println("Nazwisko rodu to:" + FamilyMember.surname);



        int firstPrice = 173;
        int secondPrice = 234;

        int higherPrice = Math.max(firstPrice, secondPrice);
        System.out.println(higherPrice);



        Integer ffirstPrice = 173;
        Integer ssecondPrice = 234;

        int hhigherPrice = Math.max(ffirstPrice, ssecondPrice);
        System.out.println(hhigherPrice);


        int accountBalance = 15_005;
        System.out.printf("Saldo: %,d zł%n" , accountBalance);

        // d - decimal integer
        // s - strings
        // f - floating numbers
        // t - time/date
        // n - new line
        // bB - boolean

        double pi = Math.PI;

        System.out.println(pi);

        System.out.printf("%.4f%n", pi);



    }
}
