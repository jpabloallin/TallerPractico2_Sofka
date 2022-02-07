public class SpaceShuttle extends Spaceship{

    private int capacity;

    public SpaceShuttle(String name, String weight, String country, int capacity) {
        super(name, weight, country);
        this.capacity = capacity;
    }
 
    public int getCapacity() {
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
    
}
