import java.util.Scanner;

public class Ejercicio1_Condicionales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección.*/
        int op_pelicula;



        Scanner entrada = new Scanner(System.in);
        //Pide al usuario el genero de la pelicula a base del menu.
        do {
            System.out.println("""
                Generos Disponibles:
                1.Accion
                2.Comedia
                3.Drama
                4.Ciencia Ficcion""");
            op_pelicula = entrada.nextInt();
            if (op_pelicula != 0){
                if (op_pelicula == 1) {
                    System.out.println("Elejiste el genero Accion");
                    System.out.println("Te recomiendo la pelicula: El caballero de la noche ");
                } else if (op_pelicula == 2) {
                    System.out.println("Elejiste el genero Comedia");
                    System.out.println("Te recomiendo la pelicula: Supercool ");
                } else if (op_pelicula == 3) {
                    System.out.println("Elejiste el genero Drama");
                    System.out.println("Te recomiendo la pelicula: Sueño de Fuga ");
                } else if (op_pelicula == 4) {
                    System.out.println("Elejiste el genero Ciencia Ficcion");
                    System.out.println("Te recomiendo la pelicula: Interestelar ");
                }else{
                    System.out.println("Ingresa una opcion valida que este dentro del menu");
            }}
        }while (op_pelicula<1 || op_pelicula >5);

        entrada.close();
    }
}
