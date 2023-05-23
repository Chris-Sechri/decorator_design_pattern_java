package entities;

public class FlightProcess {
    public Behavior behavior;
    public FlightProcess() {
        this.behavior = Behavior.none;
    }
    public void flyAway(){
        switch (this.behavior) {
            case up -> {
                System.out.println("Les muscles longitudinaux se sont contractés.");
            }
            case down -> {
                System.out.println("Les muscles longitudinaux se sont relachés.");
            }
            case none -> {
                System.out.println("Aucune action n'est définie.");
            }
            default -> System.out.println("Aucune action n'est définie.");
        }
    };
}
