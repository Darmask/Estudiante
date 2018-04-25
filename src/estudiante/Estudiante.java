package estudiante;

/**
 *
 * @author Tamayo
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String identificasion;
    private int puesto;
    private int nota;
    
    public Estudiante(String nombre, String apellido , String indetificasion , int puesto , int nota){
        setNombre(nombre);
        setApellido(apellido);
        setIdentificasion(identificasion);
        setPuesto(puesto);
        setNota(nota);
    }
    
    public String imprimir() {
        return "";

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificasion() {
        return identificasion;
    }

    public int getPuesto() {
        return puesto;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdentificasion(String identificasion) {
        this.identificasion = identificasion;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
