public abstract class Spaceship {
   
    protected String name;
    protected String weight;
    protected String country;
    
    public Spaceship(String name, String weight, String country) {
        this.name = name;
        this.weight = weight;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "name: " + name + " weight: " + weight +" country: " + country;
    }

    public abstract String propose();
    
}
