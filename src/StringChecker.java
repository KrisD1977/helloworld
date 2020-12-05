public class StringChecker {

    public static void main(String[] args) {

        String str= "Lenny zawsze spłaca długi";

        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu:" + str.length());;

        System.out.println("Znak na pozycji 6.:" + str.charAt(0));
        System.out.println("Fragment od znaku 10. do 16.:" + str.substring(10,16));
        System.out.println("Indeks pierwszej litery e:" + str.indexOf("L"));
        System.out.println("Indeks początku podtekstu \"długi\":" + str.indexOf("długi") );

        System.out.println("Tekst zapisany wielkimi literami:" + str.toUpperCase());



    }
}
