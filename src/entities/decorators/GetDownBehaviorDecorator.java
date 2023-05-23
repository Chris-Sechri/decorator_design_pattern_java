package entities.decorators;

import entities.Behavior;
import entities.FlightProcess;
import entities.base.BaseDecorator;

public class GetDownBehaviorDecorator extends BaseDecorator {
    private final FlightProcess wrappee;
    public GetDownBehaviorDecorator(FlightProcess flightProcess) {
        this.wrappee = flightProcess;
        this.wrappee.behavior = Behavior.down;
    }


    @Override
    public void flyAway() {
        this.wrappee.flyAway();
    }
}
