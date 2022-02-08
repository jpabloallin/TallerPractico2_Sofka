/**
 * Representa la clase Lanzadera Espacial que extiende de la clase padre Nave Espacial.
 * @author Juan Pablo Allin Cañas
 */
public class SpaceShuttle extends Spaceship{

    private String capacity;
    /**
     * Crea una instancia de la clase Lanzadera Espacial.
     * @param name Nombre de la Lanzadera Espacial.
     * @param weight Peso de la Lanzadera Espacial.
     * @param country País al que pertenece la Lanzadera Espacial.
     * @param capacity Capacidad de la clase Lanzadera Espacial.
     */
    public SpaceShuttle(String name, String weight, String country, String capacity) {
        super(name, weight, country);
        this.capacity = capacity;
    }

    /** 
     * @return Capacidad de la Lanzadera Espacial.
     */
    public String getCapacity() {
        return capacity;
    }
    
    /** 
     * @return Sobreescribe el m y muestra los datos de la Lanzadera Espacial.
     */
    @Override
    public String toString() {
        return super.toString() + "\nCapacidad: " + capacity;
    }

    /** 
     * @return Sobreescribe el método y muestra el propósito de la Lanzadera Espacial escogida.
     */
    @Override
    public String propose() {
        
        return "Cohete autopropulsado que sirve para lanzar una carga útil al espacio, normalmente un satélite artificial, una sonda o una nave tripulada.";
    }
    
    /** 
     * @return Sobreescribe el método y muestra un dato curioso de la Lanzadera Espacial escogida.
     */
    @Override
    public String funFact() {
    
        return "El más potente jamás construido pertenecía a los EE.UU. y su nombre era Saturno V. Permitió transportar la nave tripulada Apolo hasta la Luna.";
    }
    
    /** 
     * @return Sobreescribe el método de la interfazy muestra el mensaje de despegue de la Lanzadera Espacial.
     */
    @Override
    public String takingOff() {
        
        return "\nNave sin tripulantes despegando en 3,2,1...";
    }
    
    /** 
     * @return Sobreescribe el método de la interfaz y muestra el mensaje de aterrizaje de la Lanzadera Espacial.
     */
    @Override
    public String landing() {  
        return "\n...Carga saliendo  de la atmósfera terrestre.";
    }
}
