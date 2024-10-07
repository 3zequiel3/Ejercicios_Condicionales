import java.util.Scanner;

public class Ejercicio3_Condicionales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.*/
        Scanner entrada = new Scanner(System.in);
        int op_libro;
        //4 Generos
        do {
            //Menu
            System.out.println("""
                    ***Recomendacion de Libro***
                    Que genero prefieres entre todos estos?:
                    1.Fantasia
                    2.Misterio
                    3.Romance
                    4.Ciencia Ficcion""");
            op_libro = entrada.nextInt();
        }while (op_libro <1 || op_libro > 5);

        if (op_libro!= 0){
            if (op_libro==1){
                System.out.println("Elegiste Fantasia, el libro que te recomiendo es:");
                System.out.println("Harry Potter y la piedra filosofal escrito por J.K. Rowling");
            } else if (op_libro==2) {
                System.out.println("Elegiste Misterio, el libro que te recomiendo es:");
                System.out.println("El nombre de la rosa escrito por Umberto Eco");
            } else if (op_libro ==3) {
                System.out.println("Elegiste Romance, el libro que te recomiendo es:");
                System.out.println("Orgullo y prejuicio escrito por Jane Austen");
            } else if (op_libro == 4) {
                System.out.println("Elegiste Ciencia Ficcion, el libro que te recomiendo es:");
                System.out.println("Neuromante escrito por William Gibson");
            }
        }
        entrada.close();
    }
}
