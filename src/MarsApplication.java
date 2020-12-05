public class MarsApplication {

    public static void main(String[] arguments) {

        System.out.println("Robot spirit");
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();
        spirit.checkStatus();

        System.out.println("-------------------------------");

        System.out.println("Robot opportunity");
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "eksploracja";
        opportunity.speed = 4;
        opportunity.temperature = -50;
        opportunity.checkStatus();

        opportunity.showAttributes();
    }
}
