import java.util.Scanner;

public class Ejercicio7_Condicionales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.*/
        int est_animo_op;
        String est_animo_nom;
        String actividad;

        //Inicializacion de variables
        est_animo_nom = "";
        actividad = "";

        //Scanner
        Scanner entrada = new Scanner(System.in);

        //Menu
        System.out.println("""
                Elije tu estado de animo:
                1.Feliz
                2.Triste
                3.Energico
                4.Relajado""");
        est_animo_op = entrada.nextInt();
        switch (est_animo_op){
            case 1:
                est_animo_nom = "Feliz";
                actividad = "Reunirse con amigos";
                break;
            case 2:
                est_animo_nom = "Triste";
                actividad = "Escuchar musica";
                break;
            case 3:
                est_animo_nom = "Energico";
                actividad = "Salir a correr";
                break;
            case 4:
                est_animo_nom = "Relajado";
                actividad = "Dar un paseo relajado en la naturaleza";
                break;
            default:
                System.out.println("Pon una opcion dentro de las que se muestran en pantalla");
                break;
        }
        String mensaje = String.format("Tu estado de animo es: %s , si te sientes asi deberias : %s",est_animo_nom,actividad);


    }
}
