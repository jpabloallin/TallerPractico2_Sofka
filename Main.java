import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Spaceship> spaceship = new ArrayList<Spaceship>();
    static Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {
        //crear nave
        createSpaceship();
    }
    
    public static void createSpaceship(){
        char response;
        int option;

        do {
            do {
                System.out.println("Digite que tipo de nave desea");
                System.out.println("1. Nave sin tripulantes");
                System.out.println("2. Nave con tripulantes");
                System.out.println("Opción; ");
                option = entry.nextInt();
            }while(option<1 || option>2);

            switch(option){
                case 1: //sin tripulantes
                    break;
                case 2: //nave con tripulantes
                    break;
            }

            System.out.println("\nDesea crear otra nave(s/n: ");
            response = entry.next().charAt(0);
            System.out.println("");

        } while (response =='s' || response =='S');
        
    }

    public static void createUnmannedSpaceship(){
        
        String name;
        String weight;
        String country;
        String destinationPlanet;

        System.out.print("\nDigite el nombre de la nave sin tripulantes: ");
        name = entry.nextLine();

        System.out.print("Digite ekl peso de la nave sin tripulantes: ");
        weight = entry.nextLine();

        System.out.print("Digite a que pais pertenece la nave sin tripulantes: ");
        country = entry.nextLine();

        System.out.print("Digite el planeta de destino de la nave sin tripulantes: ");
        destinationPlanet = entry.nextLine();

        UnmannedSpaceship unmannedSpaceship = new UnmannedSpaceship(name, weight, country, destinationPlanet);
    }
}
