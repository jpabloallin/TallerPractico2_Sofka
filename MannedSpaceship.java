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
        return super.toString() + "\nNúmero de tripulantes: " + crewNumber;
    }

    @Override
    public String propose() {
        return "El propósito consiste en mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación.";
    }
    
    @Override
    public String funFact() {
        return "El cosmonauta soviético Yuri Gagarin se convirtió en la primera persona en viajar al espacio cuando orbitó en torno a la Tierra en una nave espacial Vostok el 12 de abril de 1961.";
    }

    @Override
    public String takingOff() {
        return "\nNave con tripulantes despegando en 3,2,1... ";
        
    }

    @Override
    public String landing() {
        return "";
    }
    

}
