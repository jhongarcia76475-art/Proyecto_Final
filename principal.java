import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        int opcion = 0;
        System.out.println("_____________________");
        System.out.println("|GESTOR DE ZAPATERIA|");
        System.out.println("_____________________\n");

        System.out.println("___________________");
        System.out.println("|1. INICIAR SESION|");
        System.out.println("___________________");
        System.out.println("___________________");
        System.out.println("|2. REGISTRARSE   |");
        System.out.println("___________________\n");
        
        do { 
            opcion = Lector.nextInt();
            
            if(opcion == 1){
                System.out.println("___________________");
                System.out.println("|INGRESE USUARIO  |");
                System.out.println("___________________\n");        
                String usuario = Lector.nextLine();
                usuario = Lector.nextLine();
                System.out.println("____________________");
                System.out.println("|INGRESE CONTRASEÑA|");
                System.out.println("____________________\n");     
                String password = Lector.nextLine();

            }else if (opcion == 2) {
                System.out.println("___________________");
                System.out.println("|INGRESE USUARIO  |");
                System.out.println("___________________\n");     
                String usuario_nuevo = Lector.nextLine();
                usuario_nuevo = Lector.nextLine();
                registrarUsuario(usuario_nuevo, Lector);
            }else{
                
            }
        } while (opcion < 1 || opcion > 2);

        System.out.println("          MENU DE OPCIONES              ");
        System.out.println("_______________________________________ ");
        System.out.println("|1. INGRESO DE EFECTIVO                |");
        System.out.println("|______________________________________|");
        System.out.println("|2. INGRESO DE REFERENCIAS             |");
        System.out.println("|______________________________________|");
        System.out.println("|3. INGRESO DE VENTAS                  |");
        System.out.println("|______________________________________|");
        System.out.println("|4. MOSTRAR INVENTARIO                 |");
        System.out.println("|______________________________________|");
        System.out.println("|5. MOSTRAR REPORTE DE VENTAS          |");
        System.out.println("|______________________________________|");
        System.out.println("|6. ACTUALIZAR INVENTARIO              |");
        System.out.println("|______________________________________|");
        System.out.println("|7. REPORTE GENERAL                    |");
        System.out.println("|______________________________________|");
        
        opcion = Lector.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("         INGRESO DE EFECTIVO            ");
                System.out.println("________________________________________");
                System.out.println("|1. EFECTIVO                           |");
                System.out.println("|______________________________________|");
                System.out.println("|2. VENTAS                             |");
                System.out.println("|______________________________________|");
                int efectivo = Lector.nextInt();
            break;
            
            case 2:
        System.out.println("         INGRESO DE REFERENCIAS         ");
        System.out.println("________________________________________");
        System.out.println("|1. NIKE                               |");
        System.out.println("|______________________________________|");
        System.out.println("|2. ADIDAS                             |");
        System.out.println("|______________________________________|");
        System.out.println("|2. PUMA                               |");
        System.out.println("|______________________________________|");
        int cantidad = Lector.nextInt();
            break;
            case 3:
        System.out.println("         INGRESO DE VENTAS              ");
        System.out.println("_______________________________________ ");
        System.out.println("|1. VENTA                              |");
        System.out.println("|______________________________________|");
        int variable = Lector.nextInt();
            break;
            case 4:
        System.out.println("               INVENTARIO               ");
        System.out.println("_______________________________________ ");
        System.out.println("|1. CANTIDAD                           |");
        System.out.println("|______________________________________|");
        System.out.println("|2. REFERENCIAS                        |");
        System.out.println("|______________________________________|");
        int referencia = Lector.nextInt();
            break;
            case 5:
        System.out.println("            REPORTE DE VENTAS           ");
        System.out.println("________________________________________");
        System.out.println("|1. VENTAS NETAS                       |");
        System.out.println("|______________________________________|");
        int neto = Lector.nextInt();
            break;
            case 6:
        System.out.println("      ACTUALIZACION DE INVENTARIO       ");
        System.out.println("________________________________________");
        System.out.println("|1. CANTIDAD                           |");
        System.out.println("|______________________________________|");
        System.out.println("|2. REFERENCIAS                        |");
        System.out.println("|______________________________________|");
        int inventario = Lector.nextInt();
            break;
            case 7:
        System.out.println("            REPORTE GENERAL             ");
        System.out.println("________________________________________");
        System.out.println("|1. INVENTARIO                         |");
        System.out.println("|______________________________________|");
        System.out.println("|2. EFECTIVO                           |");
        System.out.println("|______________________________________|");
        System.out.println("|2. VENTAS                             |");
        System.out.println("|______________________________________|");
        int general = Lector.nextInt();
            break;
            default:

            break;
        } 
    }

    public static void registrarUsuario(String usuario_nuevo, Scanner Lector) {
        do{

            if (usuarioExiste(usuario_nuevo)) {
            System.out.println("____________________________");
            System.out.println("|ESTE USUARIO YA EXISTE    |");
            System.out.println("____________________________");
            System.out.println("____________________________");
            System.out.println("|INGRESE USUARIO DIFERENTE |");
            System.out.println("____________________________\n");     
            usuario_nuevo = Lector.nextLine();
            }

        }while(usuarioExiste(usuario_nuevo)!=false);

            System.out.println("____________________");
            System.out.println("|INGRESE CONTRASEÑA|");
            System.out.println("____________________\n");  
            String password_nueva = Lector.nextLine();

            try {
                FileWriter fw = new FileWriter("usuarios.txt", true);
                fw.write(usuario_nuevo + "," + password_nueva + "\n");
                fw.close();
            } catch (Exception e) {}
    }

    public static void guardar_datos(String usuario_nuevo, Scanner Lector){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true));

                writer.write(usuario_nuevo);
                writer.newLine();

            writer.close();
            Lector.close();

            System.out.println("SESION INICIADA CON EXITO");

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public static boolean usuarioExiste(String u) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            String l;
            while ((l = br.readLine()) != null) {
                if (l.split(",")[0].equals(u)) {
                    br.close();
                    return true;
                }
            }
            br.close();
        } catch (IOException e) {}
        return false;
    }
}