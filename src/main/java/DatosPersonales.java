import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();
        System.out.println("- Nombre de usuario: ");
        persona1.setNombre(sc.nextLine());
        System.out.println("- Edad : ");
        persona1.setEdad(sc.nextInt());
        System.out.println("- Celular: ");
        persona1.setCelular(sc.next());
        persona1.imprimirPersona();
    }

    public static class Persona{
        private String nombre;
        private String celular;
        private int edad;

        public Persona() {
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public void setCelular(String celular) {
            this.celular = celular;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void imprimirPersona(){
            System.out.println("Bienvenido señor "+this.nombre+", es un placer para nosotros contar con una persona de "+this.edad+" años.\n" +
                    "\n" +
                    "Próximamente nos comunicaremos con usted al numero "+this.celular+".\n" +
                    "\n" +
                    "Feliz día");
        }

    }

}

