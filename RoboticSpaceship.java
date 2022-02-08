/**
 * Representa la clase Nave Espacial Robótica que extiende de la Clase padre Nave Espacial.
 * @author Juan Pablo Allin Cañas
 */
public class RoboticSpaceship extends Spaceship  {
    
    private String fuelType;

    /**
     * Crea una instancia de la clase Nave Espacial Robótica.
     * @param name Nombre de la nave espacial robótica.
     * @param weight Peso de la nave espacial robótica.
     * @param country País al que pertenece la nave espacial robótica.
     * @param fuelType Combustibe que usa la nave espacial robótica.
     */
    public RoboticSpaceship(String name, String weight, String country, String fuelType) {
        super(name, weight, country);
        this.fuelType = fuelType;
    }
   
    /** 
     * @return Obtiene el tipo de combustible usado por la nave espacial robótica.
     */
    public String getFuelType() {
        return fuelType;
    }

    /** 
     * @return Sobreescribe y muestra los datos de la nave espacial robótica.
     */
    @Override
    public String toString() {
        return super.toString() + "\nCombustible utilizado: " + fuelType;
    }
       
    /** 
     * @return Sobreescribe el método y muestra el mensaje del propósito de la nave espacial robótica. 
     */
    @Override
    public String propose() {
        return "La nave espacial robótica es un nave espacial sin tripulación, generalmente bajo telerobótico control. Muchas misiones espaciales son más adecuadas para la telerobótica que para tripulado operación, debido al menor costo y menores factores de riesgo.";
    }
        
    /** 
     * @return Sobreescribe el método y muestra el dato curioso sobre la nave espacial robótica.
     */
    @Override
    public String funFact() {
        return "En 2012, el SpaceX Dragon hizo historia al convertirse en la primera nave espacial robótica comercial en entregar carga a la Estación Espacial Internacional y devolver carga de manera segura a la Tierra en el mismo viaje.";
    }
 
    /** 
     * @return Sobreescribe el método de la interfaz y muestra el mensaje de despegue.
     */
    @Override
    public String takingOff() {
        return "\nNave sin tripulantes despegando en 3,2,1... ";
    }
    
    /** 
     * @return Sobreescribe el método de la interfaz y muestra el mensaje de aterrizaje.
     */
    @Override
    public String landing() {
        return "\n...Aterrizando en 3,2,1. Aterrizaje satisfactorio.";
    }
}