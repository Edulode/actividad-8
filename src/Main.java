import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String nombre, raza, hambriento;
        boolean hambre;
        int edad;
        System.out.println("Ingrese los datos del primer perro:");
        System.out.print("Nombre: ");
        nombre = t.nextLine();

        System.out.print("Raza: ");
        raza = t.nextLine();

        System.out.print("El perro tiene hambre (S/N): ");
        hambriento = t.nextLine();
        hambre = hambriento.equals("S");

        System.out.print("Edad: ");
        edad = t.nextInt();
        t.nextLine();

        Perro perro1 = new Perro(nombre, raza, edad, hambre);

        System.out.println("Ingrese los datos del segundo perro:");
        System.out.print("Nombre: ");
        nombre = t.nextLine();

        System.out.print("Raza: ");
        raza = t.nextLine();

        System.out.print("El perro tiene hambre (S/N): ");
        hambriento = t.nextLine();
        hambre = hambriento.equals("S");

        System.out.print("Edad: ");
        edad = t.nextInt();
        t.nextLine();

        Perro perro2 = new Perro(nombre, raza, edad, hambre);

        System.out.println("Primer perro:");
        perro1.informcaionPerro();
        System.out.println("Alimentamos al perro con 400g de pollo.");
        perro1.comer("pollo", 400);
        perro1.ladrar();

        System.out.println("Segundo perro:");
        perro2.informcaionPerro();
        System.out.println("Alimentamos al perro con 250g de croquetas.");
        perro2.comer("Croquetas", 250);
        perro2.ladrar();
    }
}