package interfaz;

import java.util.Scanner;

public class Registro {
    
    String nombre ;
    String apellido ;
    String genero ;
    int fechaNacimiento ;

    public void iniciar (){


        Scanner sc = new Scanner(System.in);
        ProcesadorPLN procesador = new ProcesadorPLN(); 
        System.out.println("Bienvenidos al CineBot");
        System.out.println("Por favor complete el registro inicial");

        System.out.println("Nombre: ");

        this.nombre = sc.nextLine();

        System.out.println("Apellido: ");
        this.apellido = sc.nextLine();

        System.out.println("Genero: ");
        this.genero = sc.nextLine();

        System.out.println("Ano de nacimiento: ");
        this.fechaNacimiento = sc.nextInt();

        sc.nextLine();

        System.out.println("\nRegistro exitoso. Hola, " + this.nombre + " " + this.apellido + ".");
        System.out.println("El chat ha comenzado. (Escribe 'salir' para terminar la conversacion)\n");

        String entradaUsuario = "";

        while(true) {
            System.out.println("Tu: ");
            entradaUsuario = sc.nextLine();

            if (entradaUsuario.trim().equalsIgnoreCase("salir")) {
                System.out.println("CineBot: Ha sido un placer hablar contigo. Hasta luego!");
                break;
            }

            System.out.println("CineBot: Entendido. En que mas te puedo ayudar?");
        }

        sc.close();
    }

}
