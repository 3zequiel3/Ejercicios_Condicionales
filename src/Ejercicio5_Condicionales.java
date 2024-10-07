import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int ia;
        int op_usuario;
        boolean validacion = true;

        do {
            System.out.println("""
                Piedra-Papel-Tijeras
                VS COM
                Elige:
                1.Piedra
                2.Papel
                3.Tijeras
                """);
            op_usuario = entrada.nextInt();
            ia = random.nextInt(4);
            if (op_usuario ==1){
                System.out.println("Has elegido Piedra");
                if (ia == 1){
                    System.out.println("La IA, eligio Piedra");
                    System.out.println("EMPATE");
                } else if (ia == 2) {
                    System.out.println("La IA, eligio Papel");
                    System.out.println("PERDISTE");
                } else if (ia == 3) {
                    System.out.println("La IA, eligio Tijeras");
                    System.out.println("Felicidades Ganaste");
                    validacion= false;
                }
            } else if (op_usuario == 2) {
                System.out.println("Has elegido Papel");
                if (ia == 1){
                    System.out.println("La IA, eligio Piedra");
                    System.out.println("Felicidades Ganaste");
                    validacion= false;
                } else if (ia == 2) {
                    System.out.println("La IA, eligio Papel");
                    System.out.println("EMPATE");
                } else if (ia == 3) {
                    System.out.println("La IA, eligio Tijeras");
                    System.out.println("PERDISTE");
                }
            } else if (op_usuario== 3) {
                System.out.println("Has elegido Tijeras");
                if (ia == 1){
                    System.out.println("La IA, eligio Piedra");
                    System.out.println("PERDISTE");
                } else if (ia == 2) {
                    System.out.println("La IA, eligio Papel");
                    System.out.println("Felicidades Ganaste");
                    validacion= false;
                } else if (ia == 3) {
                    System.out.println("La IA, eligio Tijeras");
                    System.out.println("PERDISTE");

                }
            }else{
                System.out.println("Elije una opcion valida");
            }
        }while (validacion);


        entrada.close();
    }
}
