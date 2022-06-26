public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();

        persona.setNombre("Julio");
        persona.setEdad(25);
        persona.setTelefono(987763829);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());

    }
}

class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
