package structure.persona;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected int id;

    protected Persona(String nombre, String apellido, String fechaNacimiento, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public String apellido(){
        return apellido;
    }

    public String fechaNacimiento(){
        return fechaNacimiento;
    }

    public int getId(){
        return id;
    }
}
