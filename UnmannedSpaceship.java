public class UnmannedSpaceship extends Spaceship{

    private String destinationPlanet;

    public UnmannedSpaceship(String name, String weight, String country, String destinationPlanet) {
        super(name, weight, country);
        this.destinationPlanet = destinationPlanet;
    }

    public String getDestinationPlanet() {
        return destinationPlanet;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlaneta de destino: " + destinationPlanet;
    }

    @Override
    public String propose(){
        return "Su principal objetivo es estudiar otros cuerpos celestes.";
    }

    @Override
    public String funFact() {
        return "El 4 de octubre de 1957, la Unión Soviética lanzó el Sputnik 1, el primer satélite artificial de la Tierra en la historia de la humanidad.";
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
