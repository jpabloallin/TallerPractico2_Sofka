/**
 * Representa la clase Nave Espacial Tripulada que extiende de la clase padre Nave Espacial.
 * @author Juan Pablo Allin Cañas
 */
public class MannedSpaceship extends Spaceship {
    
    private int crewNumber;

    /**
     * Crea una instancia de la clase Nave Espacial Tripulada.
     * @param name Nombre de la clase Nave Espacial Tripulada.
     * @param weight Peso de la clase Nave Espacial Tripulada.
     * @param country País al que pertenece la Nave Espacial tripulada.
     * @param crewNumber Número de tripulantes de la Nave Espacial Tripulada.
     */
    public MannedSpaceship(String name, String weight, String country, int crewNumber) {
        super(name, weight, country);
        this.crewNumber = crewNumber;
    }
    
    /** 
     * @return Número de tripulantes de la nave espacial.
     */
    public int getCrewNumber() {
        return crewNumber;
    }

    /** 
     * @return Sobreescribe y muestra los datos pertenecientes a la nave espacial tripulada.
     */
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de tripulantes: " + crewNumber;
    }

    /** 
     * @return Sobreescribe el método y muestra el propósito de la nave espacial escogida.
     */
    @Override
    public String propose() {
        return "El propósito consiste en mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación.";
    }
    
    /** 
     * @return Sobreescribe el método y muestra un dato curioso de la nave espacial escogida.
     */
    @Override
    public String funFact() {
        return "El cosmonauta soviético Yuri Gagarin se convirtió en la primera persona en viajar al espacio cuando orbitó en torno a la Tierra en una nave espacial Vostok el 12 de abril de 1961.";
    }
    
    /** 
     * @return Sobreescribe el método de la interfaz y muestra el mensaje de despegue.
     */
    @Override
    public String takingOff() {
        return "\nNave con tripulantes despegando en 3,2,1... ";  
    }

    /** 
     * @return Sobreescribe el método de la interfaz y muestra eñ mensaje de aterrizaje.
     */
    @Override
    public String landing() {
        return "\nTripulantes acoplándose a la Estación Espacial Internacional (ISS)";
    }
}