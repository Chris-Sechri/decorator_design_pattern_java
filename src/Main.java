import entities.Bird;
import entities.FlightProcess;
import entities.decorators.GetDownBehaviorDecorator;
import entities.decorators.GetUpBehaviorDecorator;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(false);
        FlightProcess flightProcess = new FlightProcess();

        if(bird.isRisingUp) {
            flightProcess = new GetUpBehaviorDecorator(flightProcess);
        }else {
            flightProcess = new GetDownBehaviorDecorator(flightProcess);
        }

        bird.setFlightProcess(flightProcess);

        bird.execute();
    }

}