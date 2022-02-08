public class RoboticSpaceship extends Spaceship  {
    
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
        return "La nave espacial robótica es un nave espacial sin tripulación, generalmente bajo telerobótico control. Muchas misiones espaciales son más adecuadas para la telerobótica que para tripulado operación, debido al menor costo y menores factores de riesgo.";
    }
    
    @Override
    public String funFact() {
        return "En 2012, el SpaceX Dragon hizo historia al convertirse en la primera nave espacial robótica comercial en entregar carga a la Estación Espacial Internacional y devolver carga de manera segura a la Tierra en el mismo viaje.";
    }

    @Override
    public String takingOff() {
        
        return "\nNave sin tripulantes despegando en 3,2,1... ";
    }

    @Override
    public String landing() {
        
        return "\n...Aterrizando en 3,2,1. Aterrizaje satisfactorio.";
    }
}

