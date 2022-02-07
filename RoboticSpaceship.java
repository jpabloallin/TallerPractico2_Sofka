public class RoboticSpaceship extends Spaceship {
    
    private String fuelType;

    public RoboticSpaceship(String name, String weight, String country, String fuelType) {
        super(name, weight, country);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCombustible utilizado: " + fuelType;
    }
    
    @Override
    public String propose() {
        return "";
    }
    
}

