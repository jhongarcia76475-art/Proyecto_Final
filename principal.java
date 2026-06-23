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
                System.out.println("____________________");
                System.out.println("|INGRESE CONTRASEÑA|");
                System.out.println("____________________\n");     
                String password = Lector.nextLine();

            }else if (opcion == 2) {
                System.out.println("___________________");
                System.out.println("|INGRESE USUARIO  |");
                System.out.println("___________________\n");     
                String usuario_nuevo = Lector.nextLine();
                System.out.println("____________________");
                System.out.println("|INGRESE CONTRASEÑA|");
                System.out.println("____________________\n");     
                String password_nuevo = Lector.nextLine();
            }else{

            }
        } while (opcion != 1 || opcion != 2);

        System.out.println("|______________________________________|");
        System.out.println("          MENU DE OPCIONES              ");
        System.out.println("_______________________________________");
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
        
    }
}