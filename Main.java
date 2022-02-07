import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Spaceship> spaceship = new ArrayList<Spaceship>();
    static Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {
        //crear nave
        createSpaceship();
        //mostrar datos de cada nave
        showSpaceshipsCreated();
    }
    
    public static void createSpaceship(){
        char response;
        int option;

        do {
            do {
                System.out.println("\nDigite que tipo de nave desea");
                System.out.println("1. Nave sin tripulantes");
                System.out.println("2. Nave con tripulantes");
                System.out.println("3. Transbordador espacial o lanzadera espacial");
                System.out.println("4. Nave espacial robótica");
                System.out.print("\nOpción: ");
                option = entry.nextInt();
                entry.nextLine();
            }while(option<1 || option>4);
            
            switch(option){
                case 1: createUnmannedSpaceship();//sin tripulantes
                    break;
                case 2: createMannedSpaceship();//nave con tripulantes
                    break;
                case 3: createSpaceShuttle(); //vehiculo lanzadera
                    break;
                case 4: createRoboticSpaceship();//nave robotica
                    break;
            }

            System.out.print("\nDesea crear otra nave(s/n): ");
            response = entry.next().charAt(0);
            entry.nextLine();

        } while (response =='s' || response =='S');
        
    }

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

        UnmannedSpaceship unmannedspaceship = new UnmannedSpaceship(name, weight, country, destinationPlanet);
        //guardamos naves sin tripulantes dentro de arreglos de naves
        spaceship.add(unmannedspaceship);
    }

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

        MannedSpaceship mannedspaceship = new MannedSpaceship(name, weight, country, crewNumber);
        //guardamos naves con tripulantes dentro de arreglos de naves
        spaceship.add(mannedspaceship);
    }

    public static void createSpaceShuttle(){
        String name;
        String weight;
        String country;
        int capacity;

        System.out.print("\nDigite el nombre del transbordador espacial o lanzadera espacial: ");
        name = entry.nextLine();

        System.out.print("Digite el peso del transbordador espacial o lanzadera espacial: ");
        weight = entry.nextLine();

        System.out.print("Digite a que pais pertenece el transbordador espacial o lanzadera espacial: ");
        country = entry.nextLine();

        System.out.print("Digite la capacidad del transbordador espacial o lanzadera espacial: ");
        capacity = entry.nextInt();

        SpaceShuttle spaceshuttle = new SpaceShuttle(name, weight, country, capacity);
        //guardamos naves con tripulantes dentro de arreglos de naves
        spaceship.add(spaceshuttle);
    }

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

        RoboticSpaceship roboticspaceship = new RoboticSpaceship(name, weight, country, fuelType);
        //guardamos naves con tripulantes dentro de arreglos de naves
        spaceship.add(roboticspaceship);
    }

    public static void showSpaceshipsCreated(){
        //recorriendo arreglo de naves creadas
        for (Spaceship ship: spaceship) {
            System.out.println(ship.toString());
            System.out.println("Propósito: "+ship.propose()+ "\nDato curioso: "+ ship.funFact() + ship.takingOff() + ship.landing());   
            System.out.println("");     
        }
    }
}
