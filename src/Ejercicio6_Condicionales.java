import java.util.Scanner;

public class Ejercicio6_Condicionales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos.*/
        Scanner entrada = new Scanner(System.in);
        double horas_dormir;
        int comidas_saludables;
        double horas_ejercicio;
        String hab_dormir;
        String hab_com;
        String hab_ej;
        String sal = "Saludable";
        String nd = "Mal habito";
        //Habitos: dormir

        horas_dormir = entrada.nextDouble();
        if (horas_dormir >= 7 || horas_dormir <= 9){
            hab_dormir = sal;
        }else {
            hab_dormir = nd;
        }

        //Habitos: Ejercicio
        horas_ejercicio = entrada.nextDouble();
        if (horas_ejercicio>0.5) {
            hab_ej = sal;
        } else{
            hab_ej = nd;
        }

        //Habitos: Comida saludable

        comidas_saludables = entrada.nextInt();
        if (comidas_saludables>=3) {
            hab_com = sal;
        }else{
            hab_com = nd;
        }

        System.out.printf("""
                Segun los datos proporcionados
                Tus habitos son:
                Dormir: %s
                Comer Saludable: %s
                Hacer Ejercicio: %s""", hab_dormir,hab_com,hab_ej);
    }
}
