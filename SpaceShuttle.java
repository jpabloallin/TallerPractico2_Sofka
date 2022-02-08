public class SpaceShuttle extends Spaceship{

    private String capacity;

    public SpaceShuttle(String name, String weight, String country, String capacity) {
        super(name, weight, country);
        this.capacity = capacity;
    }
 
    public String getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad: " + capacity;
    }

    @Override
    public String propose() {
        
        return "Cohete autopropulsado que sirve para lanzar una carga útil al espacio, normalmente un satélite artificial, una sonda o una nave tripulada.";
    }

    @Override
    public String funFact() {
    
        return "El más potente jamás construido pertenecía a los EE.UU. y su nombre era Saturno V. Permitió transportar la nave tripulada Apolo hasta la Luna.";
    }
    
    @Override
    public String takingOff() {
        
        return "\nNave sin tripulantes despegando en 3,2,1...";
    }

    @Override
    public String landing() {
        
        return "\n...Aterrizando en 3,2,1. Aterrizaje satisfactorio.";
    }
}
