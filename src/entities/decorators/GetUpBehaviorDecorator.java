package entities.decorators;

import entities.Behavior;
import entities.FlightProcess;
import entities.base.BaseDecorator;

public class GetUpBehaviorDecorator extends BaseDecorator {
    private final FlightProcess wrappee;

    public GetUpBehaviorDecorator(FlightProcess flightProcess) {
        super();
        this.wrappee = flightProcess;
        this.wrappee.behavior = Behavior.up;
    }


    @Override
    public void flyAway() {
        this.wrappee.flyAway();
    }
}
