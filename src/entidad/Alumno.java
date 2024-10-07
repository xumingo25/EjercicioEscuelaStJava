package entidad;

public class Alumno {
    //Atributos
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double[] notas;
    private String curso;

    public Alumno(String nombre, String apellido, String direccion, int edad, double[] notas, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.notas = notas;
        this.curso = curso;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double peorNota(){
        return 0.0; //logica
    }

    public double mejorNota(){
        return 0.0;
    }

    public double promedio(){
        return 0.0;
    }

    public String evaluarSituacionAcademica(){
        return "por construir";
    }
}
