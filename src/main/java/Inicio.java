
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;

public class Inicio {




    public static void main(String[] args) {
        System.out.println("Funciones");
        System.out.println("Funcion pura");
        Scanner sc = new Scanner(System.in);
        System.out.println(ParOfImpar(sc.nextInt()));
        System.out.println("Funcion Impura");
        System.out.println(Tiempo("Miguel"));

    }

    //funcion pura
    public static boolean ParOfImpar(int numero){
        return numero % 2 == 0;
    }
    //Funcion impura
    public static String Tiempo(String nombre){

        return nombre + " es "+LocalDateTime.now().format(DateTimeFormatter.ISO_TIME);
    }
}
