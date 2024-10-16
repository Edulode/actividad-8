public class Perro {
    private String nombre, raza;
    private  int edad;
    private boolean hambriento;

    public Perro(String nombre, String raza, int edad, boolean hambriento) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.hambriento = hambriento;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean getHambriento(){
        return hambriento;
    }
    public void setHambriento(boolean hambriento){
        this.hambriento = hambriento;
    }
    public void ladrar(){
        System.out.println("guau guau");
    }
    public void comer(String comida, double gramos){
        if(getHambriento()){
            System.out.println("El perro ha comido " + gramos + "g de " + comida);
            System.out.println("EL perro ya no tiene hambre");
            setHambriento(false);
        }else{
            System.out.println("El perro no tiene hambre");
        }
    }
    public void informcaionPerro (){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Edad: " + this.edad);
        if(this.hambriento){
            System.out.println("Hambriento: Si");
        }else {
            System.out.println("Hambriento: No");
        }
    }
}
