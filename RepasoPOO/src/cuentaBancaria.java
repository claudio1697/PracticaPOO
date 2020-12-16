public class cuentaBancaria {
        private String iban = "";
        private String nombre = "";
        private String apellidos = "";
        private float saldo = 0;


        public cuentaBancaria(String iban, String n, String a){

            this.iban = iban;
            this.nombre = n;
            this.apellidos = a;
            this.saldo = 0;

        }
        public void ingreso(float cantidad){
            if (cantidad > 0){
                //Metodo para ingresar. Si el ingreso es mayor que 3000 imprime aviso.
                this.saldo += cantidad;
                if (cantidad > 3000){
                    System.err.println("AVISO: ¡Notificar a hacienda!");
                }
            }else {
                System.err.println("ERROR: ¡No se permiten ingresos negativos!");
            }

        }
    public boolean retirada(float cantidad){
        //Devuelve falso si no se ha podido realizar la retirada.
        //True si se ha realizado el reintegro correctamente.
        float futuraCantidad = 0;
        futuraCantidad =this.saldo - cantidad;

        if (futuraCantidad <= -50){
            return false;
        }else {
            this.saldo -= cantidad;
            return true;
        }
    }

    public void imprimirCuenta(){
            System.out.println("IBAN: " + iban);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " +apellidos);
            System.out.println("Saldo: " + saldo);
        }


    }





