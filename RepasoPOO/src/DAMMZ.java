import java.util.Scanner;
public class DAMMZ {

        public static void main(String[] args) {

            cuentaBancaria cuenta;
            cuenta = new cuentaBancaria("","","");
            //Pido por teclado los datos.
            Scanner sc = new Scanner(System.in);

            System.out.println("IBAN: " );
            String i = sc.nextLine();

            System.out.println("Nombre titulas: ");
            String n = sc.nextLine();

            System.out.println("Apellidos: ");
            String a = sc.nextLine();

            //Creo la cuenta bancaria con los datos introducidos por teclado.
            cuenta = new cuentaBancaria(i,n,a);

            int opcion = 0;
            do{

                System.out.println("-------Bienvienido al banquito---------" + "\nAqui uste puede hace lo sieguiente: "
                        + "\n1.-Ver cuenta " + "\n2.-Realizar Ingreso " + "\n3.- Retirar " + "\n4.- Salir");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        cuenta.imprimirCuenta();
                        break;
                    case 2:
                        System.out.println("Cuanto quieres ingresar ");
                        float cantidad = sc.nextFloat();
                        cuenta.ingreso(cantidad);
                        break;
                    case 3:
                        System.out.println("¿Cuanto quieres retirar?");
                         cantidad = sc.nextFloat();

                         boolean res = cuenta.retirada(cantidad);
                         if (res == false){
                             System.out.println("Lo siento no puede retirar mas dinero");

                         }else if (res == true){
                             System.out.println("Gracias por realizar su operacion");
                         }
                         break;
                    case 4:
                        System.out.println("Gracias por utilizar nuestros servicios.");
                        return;
                }


            }while (opcion != 4);
        }
    }



