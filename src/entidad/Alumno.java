package entidad;

public class Alumno {
    //atributos
    private String nombre; //pepito
    private String apellido; //vasquez
    private String direccion; //avda por ahi 123
    private int edad; //10
    private double[] notas; // {3,4,5,6,7}
    private String curso;//4to basico

    //Accesadores y mutadores

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

    public double notaMenor(){ //3,4,5,6,4,5,2,7,5
        double min = this.notas[0]; //3
        for(int i=1;i<this.notas.length;i++){
            if(notas[i]<min){ // (4<3)
              min = notas[i];
            }
        }
        return min;
    }

    public double notaMayor(){
        double max = this.notas[0]; //3
        for(int i=1;i<this.notas.length;i++){
            if(notas[i]>max){ // (4<3)
                max = notas[i];
            }
        }
        return max;
    }

    public double promedio(){ //3,4,5,6,7
        double suma = 0;
        for(double nota : this.notas){
            suma = suma + nota;
        }
        return suma/this.notas.length;
    }

    public String situacionAcademica(){
        if(this.promedio()>=4){
            return "la situación academica de "+ this.nombre + " " + this.apellido + " es: Aprobado :D";
        }else{
            return "la situación academica de "+ this.nombre + " " + this.apellido + " es: Reprobado :(";

        }
    }
}
