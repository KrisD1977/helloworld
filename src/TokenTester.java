import java.util.StringTokenizer;

public class TokenTester {

    public static void main(String[] args) {

        StringTokenizer str1, str2;
        String quote1 = "Google 530,80  -9.98";
        str1 = new StringTokenizer(quote1);

        System.out.println("Token1:"  + str1.nextToken());
        System.out.println("Token1:"  + str1.nextToken());
        System.out.println("Token1:"  + str1.nextToken());

        String quote2 = "RHT@75,000@0,22";
        str2 = new StringTokenizer(quote2, "@");
        System.out.println("Token1:"  + str2.nextToken());
        System.out.println("Token1:"  + str2.nextToken());
        System.out.println("Token1:"  + str2.nextToken());


    }
}
