public class MannedSpaceship extends Spaceship {
    
    private int crewNumber;

    public MannedSpaceship(String name, String weight, String country, int crewNumber) {
        super(name, weight, country);
        this.crewNumber = crewNumber;
    }

    public int getCrewNumber() {
        return crewNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "crewNumber: " + crewNumber;
    }

    @Override
    public String propose() {
        return "u propósito consiste en mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación.";
    }
    
    @Override
    public String propulsionFuel() {
        return "";
    }
    

}
