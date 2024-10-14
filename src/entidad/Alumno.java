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
                              //0,1,2,3,4
    public double peorNota(){ //7,4,3,6,5
        double min = this.getNotas()[0]; //7

        for(int i=1;i<this.getNotas().length;i++){
                if(getNotas()[i]<min){
                    min = getNotas()[i];
                }
        }
        return min; //logica
    }

    public double mejorNota(){//7,4,3,6,5
        double max = 0;
        for(int i=0;i<this.notas.length;i++){
            if(notas[i]>max){ //el elemento del arreglo es mayor
                max = notas[i];
            }
        }
        return max;
    }

    public double promedio(){
        double suma = 0;
        for(double nota : this.getNotas()){
            suma = suma + nota;
        }

        return suma / this.getNotas().length;
    }

    public String evaluarSituacionAcademica(){
       if(this.promedio()>=4){
           //aprueba
           return "La situación academica de "+ this.getNombre() + " "+
                   this.getApellido() + " es: Aprobado :D";
       }else{
           return "La situación academica de "+ this.getNombre() + " "+
                   this.getApellido() + " es: Reprobado :/";
       }
    }
}
