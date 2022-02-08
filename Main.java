import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa una clase Main para la creación de Naves Espaciales con sus caracteristicas.
 * @author Juan Pablo Allin Cañas
 */
public class Main {

    /**
     * Creación de una lista de arreglos donde se van a guardar las naves creadas.
     */
    static ArrayList<Spaceship> spaceship = new ArrayList<Spaceship>();
    static Scanner entry = new Scanner(System.in);
    
    public static void main(String[] args) {

        /**
         * Se llama la función para crear la nave.
         */
        createSpaceship();

        /**
         * Se llama la función para mostrar los datos de las naves creadas.
         */
        //
        showSpaceshipsCreated();
    }
    
    /**
     * Creación de función para crear una nave espacial.
     */
    public static void createSpaceship(){
        char response;
        int option;
        do {
            do {
                System.out.println("\nDigite que tipo de nave desea");
                System.out.println("\n1. Nave sin tripulantes");
                System.out.println("2. Nave con tripulantes");
                System.out.println("3. Transbordador espacial o lanzadera espacial");
                System.out.println("4. Nave espacial robótica");
                System.out.print("\nOpción: ");
               
                /**
                 * Ingresar la opción correspondiente a la nave que se quiere crear.
                 */
                option = entry.nextInt();
                entry.nextLine();
            /**
             * Se devuelve a elegir la nave que se quiere crear si la opción digitada es menor a 1 o mayor a 4.
             */
            }while(option<1 || option>4);

            switch(option){

                /**
                 * Nave sin tripulantes
                 */
                case 1: createUnmannedSpaceship();
                    break;

                /**
                 * Nave con tripulantes.
                 */
                case 2: createMannedSpaceship();
                    break;

                /**
                 * Vehiculo lanzadera.
                 */
                case 3: createSpaceShuttle();
                    break;

                /**
                 * Nave espacial robótica.
                 */
                case 4: createRoboticSpaceship();
                    break;
            }

            System.out.print("\nDesea crear otra nave(s/n): ");
            response = entry.next().charAt(0);
            entry.nextLine();

        } while (response =='s' || response =='S');
        
    }
    /**
     * Función para crear una nave espacial sin tripulantes.
     */
    public static void createUnmannedSpaceship(){
        String name;
        String weight;
        String country;
        String destinationPlanet;

        System.out.print("\nDigite el nombre de la nave sin tripulantes: ");
        name = entry.nextLine();

        System.out.print("Digite el peso de la nave sin tripulantes: ");
        weight = entry.nextLine();

        System.out.print("Digite a que pais pertenece la nave sin tripulantes: ");
        country = entry.nextLine();

        System.out.print("Digite el planeta de destino de la nave sin tripulantes: ");
        destinationPlanet = entry.nextLine();

        /**
         * Objeto de la nave espacial sin tripulantes.
         */
        UnmannedSpaceship unmannedspaceship = new UnmannedSpaceship(name, weight, country, destinationPlanet);
        
        /**
         *Se guarda la nave sin tripulantes dentro de la lista de arreglos de naves espaciales.
         */
        spaceship.add(unmannedspaceship);
    }

    /**
     *Función para crear una nave espacial con tripulantes.
     */
    public static void createMannedSpaceship(){
        String name;
        String weight;
        String country;
        int crewNumber;

        System.out.print("\nDigite el nombre de la nave con tripulantes: ");
        name = entry.nextLine();

        System.out.print("Digite el peso de la nave con tripulantes: ");
        weight = entry.nextLine();

        System.out.print("Digite a que pais pertenece la nave con tripulantes: ");
        country = entry.nextLine();

        System.out.print("Digite el número de tripulantes en la nave: ");
        crewNumber = entry.nextInt();

        /**
         * Objeto de la nave espacial con tripulantes.
         */
        MannedSpaceship mannedspaceship = new MannedSpaceship(name, weight, country, crewNumber);

        /**
         *Se guarda la nave con tripulantes dentro de la lista de arreglos de naves espaciales.
         */
        spaceship.add(mannedspaceship);
    }

    /**
     *Función para crear el transbordador espacial o lanzadera espacial.
     */
    public static void createSpaceShuttle(){
        String name;
        String weight;
        String country;
        String capacity;

        System.out.print("\nDigite el nombre del transbordador espacial o lanzadera espacial: ");
        name = entry.nextLine();

        System.out.print("Digite el peso del transbordador espacial o lanzadera espacial: ");
        weight = entry.nextLine();

        System.out.print("Digite a que pais pertenece el transbordador espacial o lanzadera espacial: ");
        country = entry.nextLine();

        System.out.print("Digite la capacidad del transbordador espacial o lanzadera espacial: ");
        capacity = entry.nextLine();

        /**
         * Objeto del transbordador espacial o lanzadera espacial.
         */
        SpaceShuttle spaceshuttle = new SpaceShuttle(name, weight, country, capacity);

        /**
         *Se guarda el transbordador espacial o lanzadera espacial dentro de la lista de arreglos de naves espaciales.
         */
        spaceship.add(spaceshuttle);
    }

    /**
     *Función para crear la nave espacial robótica.
     */
    public static void createRoboticSpaceship(){
        String name;
        String weight;
        String country;
        String fuelType;

        System.out.print("\nDigite el nombre de la nave espacial robótica: ");
        name = entry.nextLine();

        System.out.print("Digite el peso de la nave espacial robótica: ");
        weight = entry.nextLine();

        System.out.print("Digite a que pais pertenece la nave espacial robótica: ");
        country = entry.nextLine();

        System.out.print("Digite el combustible utilizado por la nave espacial robótica: ");
        fuelType = entry.nextLine();

        /**
         * Objeto de la nave espacial robótica.
         */
        RoboticSpaceship roboticspaceship = new RoboticSpaceship(name, weight, country, fuelType);
        
        /**
         *Se guarda la nave espacial robótica dentro de la lista de arreglos de naves espaciales.
         */
        spaceship.add(roboticspaceship);
    }

    /**
     * Función para mostrar las naves espaciales creadas.
     */
    public static void showSpaceshipsCreated(){
        
        /**
         * Se recorre el arreglo de las naves espaciales creadas y muestra las características de cada una.
         */
        for (Spaceship ship: spaceship) {
            System.out.println(ship.toString());
            System.out.println("Propósito: "+ship.propose()+ "\nDato curioso: "+ ship.funFact() + ship.takingOff() + ship.landing());   
            System.out.println("");     
        }
    }
}
