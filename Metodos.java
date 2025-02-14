import java.util.Scanner;

public class Metodos {
    public ObjtPersonas[][] LlenarMatrizObjetual(int d) {
        ObjtPersonas[][] m = new ObjtPersonas[d][d];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjtPersonas Obj = new ObjtPersonas();
                System.out.println("Ingrese el nombre");
                Obj.setNombre(sc.next());
                System.out.println("Ingrese el apellido");
                Obj.setApellido(sc.next());
                System.out.println("Ingrese la direccion");
                Obj.setDireccion(sc.next());
                System.out.println("Ingrese el telefono");
                Obj.setTelefono(sc.nextInt());
                
                
                m[i][j] = Obj;

            }
        }
        return m;

    }

    public void MostrarMatriz(ObjtPersonas[][]m ) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("nombre" + m [i][j].getNombre());
                System.out.println("apellido" + m [i][j].getApellido());
                System.out.println("direccion" + m [i][j].getDireccion());
                System.out.println("telefono" + m [i][j].getTelefono());
                System.out.println(" ");
            }
        }
    }
}
