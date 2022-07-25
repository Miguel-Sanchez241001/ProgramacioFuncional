
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Funciones {
    // definicion de una funcion de alto nivel
    // <Prametro , Return>
    private static Function<String,String> toMin = (x) -> x.toLowerCase();

    public static void main(String[] args) {
        System.out.println("Funciones de alto orden");
        // Paso de parametros por apply
       String re =  toMin.apply("HOLA PROGRAMACION AVANZADA");
       String re2 = AltoOrden(toMin,"GRANDAZO");
        System.out.println(re + " " + re2);
        ArrayList<String> numeros = new ArrayList();
        while(numeros.size()<=9){
            numeros.add(String.valueOf( (int)(Math.random()*100)));
        }
     //  numeros.stream().forEach(z -> System.out.print(z+" ")); // tambien puede ser System.out::println
        // Stream se usan solo una vez
        // aplica una funcion a cada miembro del conjunto
        Stream<Integer> enteros = numeros.stream()      // santisima trinidad map filter
                .map(x -> Integer.parseInt(x))          // se aplica a todos los elementos
                .filter((x) -> x%2!=0);                // recibe el stream de map para aplicar el filtro

        int []aleatorio = {11,12,13,14,15,16,17,18,19,20};

        var sta =  Arrays.stream(aleatorio);
            Integer resultado = sta
                    .filter(x -> x%2!=0)
                    .reduce(0,(x,y)->{
                        System.out.println("x es "+ x + " y es "+y+ " el proximo x es " + (x+y));
                        return x + y;
                    });
        System.out.println("el resultado es "+ resultado);
       // forma larga de usar una funcion por stream
            enteros.forEach((x) ->  {
            System.out.println(x+ " " + (x instanceof Integer)  );

        });
    }

    public static String AltoOrden(Function<String,String> miFuntion, String word){
        return miFuntion.apply(word);
    }


}
