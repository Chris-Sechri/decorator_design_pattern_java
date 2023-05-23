package entities;

import java.util.Optional;

public class Bird {
    private FlightProcess flightProcess;
    public boolean isRisingUp;
    public Bird(boolean isRisingUp) {
        this.isRisingUp = isRisingUp;
    }

    public void setFlightProcess(FlightProcess flightProcess) {
        this.flightProcess = flightProcess;
    }

    public void execute() {
        this.flightProcess.flyAway();
    }
}
