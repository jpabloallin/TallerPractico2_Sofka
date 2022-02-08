/**
 * Representa una clase abstracta Nave Espacial y varios de sus atributos, tambíen implementa una interfaz.
 * @author Juan Pablo Allin Cañas
 */
public abstract class Spaceship implements ISpaceshipAction{
    
    protected String name;
    protected String weight;
    protected String country;

    /**
     * Crea una instancia de la clase abstracta Nave Espacial.
     * @param name Nombre de la nave espacial.
     * @param weight Peso de la nave espacial.
     * @param country País al que pertenece la nave espacial.
     */
    protected Spaceship(String name, String weight, String country) {
        this.name = name;
        this.weight = weight;
        this.country = country;
    }

    /** 
     * Getter nombre de la nave espacial.
     * @return Obtiene el nombre de la nave espacial.
     */
    public String getName() {
        return name;
    }

    /** 
     * Getter peso de la nave espacial.
     * @return Obtiene el peso de la nave espacial.
     */
    public String getWeight() {
        return weight;
    }
    
    /** 
     * Getter País de la nave espacial.
     * @return Obtiene el país al que pertenece la nave espacial.
     */
    public String getCountry() {
        return country;
    }
 
    /** 
     * @return Sobreescribe y muestra los datos de la nave espacial.
     */
    @Override
    public String toString() {
        return "\nNombre: " + name + "\nPeso: " + weight + "\nPaís de origen: " + country;
    }

    /**
     * Método abstracto para muestra el propósito de la nave espacial escogida.
     * @return Muestra el propósito.
     */
    public abstract String propose();

    /**
     * Método abstracto que muestra un dato curioso sobre el tipo de nave espacial escogida.
     * @return Muestra el dato curioso.
     */
    public abstract String funFact();
}