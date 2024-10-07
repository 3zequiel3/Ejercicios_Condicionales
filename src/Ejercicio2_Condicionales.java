import java.util.Scanner;

public class Ejercicio2_Condicionales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.
*/
        Scanner entrada = new Scanner(System.in);
        double prod_precio;
        double desc_est = 0.10;
        double desc_adul = 0.5;
        double desc_jub = 0.15;
        double prec_desc = 0;
        int categoria;
        String nom_categoria = "";
        String nom_prod = "";

        System.out.println("Dime el nombre del producto que deseas comprar");
        nom_prod = entrada.nextLine();
        do {
            System.out.println("Dime que categoria eres para aplicar el correspondiente descuento:");
            System.out.println("""
                1.Estudiante
                2.Adulto
                3.Jubilado""");
            categoria = entrada.nextInt();
        }while (categoria< 1 || categoria > 4);
        do {
            System.out.println("Ingrese el precio del producto \n");
            prod_precio = entrada.nextDouble();
            if (categoria == 1){
                //Categoria estudiante 10%
                prec_desc = prod_precio - (prod_precio * desc_est);
                nom_categoria = "Estudiante";
            } else if (categoria == 2) {
                // Categoria adulto 5%
                prec_desc = prod_precio - (prod_precio * desc_adul);
                nom_categoria = "Adulto";
            } else if (categoria == 3) {
                //Categoria Jubilado
                prec_desc = prod_precio - (prod_precio * desc_jub);
                nom_categoria = "Jubilado";
            }else{
                System.out.println("Ingresa un precio que sea mayor a 0");
            }
        }while (prod_precio <=0);
        if (prec_desc>0){
            System.out.printf("""
                    El precio del producto %s es de %.2f, pero se le aplica el descuento de la categoria %s, siendo el precio final de %.2f""",nom_prod,prod_precio,nom_categoria,prec_desc);
        }
        entrada.close();
    }
}
