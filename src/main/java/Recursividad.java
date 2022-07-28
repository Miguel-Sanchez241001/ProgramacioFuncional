public class Recursividad {


    public static void main(String[] args) {
       porCabeza(10);
    }

    public static int suma(int max) {
        int resu = 0;
        for (int i = 0; i <= max; i++) {
            resu += i;
        }
        return resu;
    }

    public static int recursiva(int maximo) {
    if (maximo!=0){
        return maximo + recursiva(maximo - 1);
    } else {
        return maximo;
    }


    }



    public static void porPila(int val){
        if (val==0) return;
        System.out.println(val);
        porPila(val-1);

    }
public static void porCabeza(int val){
        if (val==0) return;
        porCabeza(val-1);
    System.out.println(val);
}








}