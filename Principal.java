import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la dimensión de la matriz");
        int d = sc.nextInt();
        Metodos M = new  Metodos();
        ObjtPersonas[][] m = new ObjtPersonas[d][d];
        m = M.LlenarMatrizObjetual(d);
        M.MostrarMatriz(m);
    }
}