import java.awt.*;

public class RefTester {

    public static void main(String[] args) {

        Point pt1, pt2;
        pt1 = new Point(100,100);
        pt2 = new Point(100,100);

        System.out.println("Punkt 1:" + pt1.x + "," + pt1.y);
        System.out.println("Punkt 2:" + pt2.x + "," + pt2.y);

        System.out.println(pt1 == pt2);
        System.out.println(pt1.equals(pt2));


        MarsRobot r1 = new MarsRobot();
        MarsRobot r2 = new MarsRobot();

        System.out.println(r1.equals(r2));


    }
}
