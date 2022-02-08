/**
 * Representa la clase Nave Espacial sin Tripulantes que extiende de la clase padre Nave Espacial.
 * @author Juan Pablo Allin Cañas
 */
public class UnmannedSpaceship extends Spaceship{

    private String destinationPlanet;
    /**
     * Crea una instancia de la clase Nave Espacial sin Tripulantes.
     * @param name Nombre de la Nave Espacial sin Tripulantes.
     * @param weight Peso de la Nave Espacial sin Tripulantes.
     * @param country País al que pertenece la Nave Espacial sin Tripulantes.
     * @param destinationPlanet Planeta de destino de la Nave Espacial sin Tripulantes.
     */
    public UnmannedSpaceship(String name, String weight, String country, String destinationPlanet) {
        super(name, weight, country);
        this.destinationPlanet = destinationPlanet;
    }

    /** 
     * @return Planeta de destino de la Nave Espacial sin Tripulantes.
     */
    public String getDestinationPlanet() {
        return destinationPlanet;
    }
    
    /** 
     * @return Sobreescribe el método y muestra los datos de la Nave Espacial sin Tripulantes.
     */
    @Override
    public String toString() {
        return super.toString() + "\nPlaneta de destino: " + destinationPlanet;
    }
    
    /** 
     * @return Sobreescribe el método y muestra el propósito de la nave espacial escogida.
     */
    @Override
    public String propose(){
        return "Su principal objetivo es estudiar otros cuerpos celestes.";
    }
    
    /** 
     * @return Sobreescribe el método y muestra un dato curioso de la nave espacial escogida.
     */
    @Override
    public String funFact() {
        return "El 4 de octubre de 1957, la Unión Soviética lanzó el Sputnik 1, el primer satélite artificial de la Tierra en la historia de la humanidad.";
    }
    
    /** 
     * @return Sobreescribe el método de la interfazy muestra el mensaje de despegue de la nave.
     */
    @Override
    public String takingOff() {
        return "\nNave sin tripulantes despegando en 3,2,1...";
    }

    /** 
     * @return Sobreescribe el métodode la interfaz y muestra el mensaje de aterrizaje de la nave.
     */
    @Override
    public String landing() {
        return "\n...Aterrizando en 3,2,1. Aterrizaje satisfactorio.";
    }
}