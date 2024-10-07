package interfaz;

import entidad.Alumno;

public class App {
    public static void main(String[] args) {
            Alumno alumno1 = new Alumno();
            double[] notas = {3,4,5,6,7};
            Alumno alumno2 = new Alumno("Domingo","Saavedra","Avda por ahi 123",33,notas,"4to basico");

        System.out.println("Favor ingrese nombre");
        String nombre = Leer.dato();

        System.out.println("El promedio de "+alumno1.getNombre() + " " + alumno1.getApellido() +
                " es: "+alumno1.promedio());

        System.out.println("El promedio de "+alumno2.getNombre() + " " + alumno2.getApellido() +
                " es: "+alumno2.promedio());


    }
}
