import java.util.Scanner;

public class Ejercicio4_Condicionales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad).*/
        Scanner entrada = new Scanner(System.in);
        double peso;
        double altura;
        double imc;
        boolean validacion = true;

        //Pedir al usuario peso y altura y asegurarse que ingrese un valor mayor a 0
        do {
            System.out.println("Indica tu peso [kg]: ");
            peso = entrada.nextDouble();
            System.out.println("Indica tu altura [m]: ");
            altura = entrada.nextDouble();
            if (peso != 0 & altura != 0){
                validacion = false;
            }
        }while(validacion);

        imc = peso/(Math.pow(altura,2));

        if (imc<18.5){
            System.out.println("Estas en bajo peso");
        } else if (imc >18.5 & imc<24.9) {
            System.out.println("Estas en tu peso normal");
        } else if (imc >25 & imc<29.9) {
            System.out.println("Estas en sobrepeso");
        } else if (imc>30) {
            System.out.println("Estas obeso/a");
        }



        entrada.close();
    }
}
