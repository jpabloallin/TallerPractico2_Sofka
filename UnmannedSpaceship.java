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
        return super.toString() +  "destinationPlanet: " + destinationPlanet;
    }

    @Override
    public String propose(){
        return "su principal objetivo es estudiar otros cuerpos celestes.";
    }

    @Override
    public String propulsionFuel() {
        return "";
    }

    

    

    
    
    

    
}
