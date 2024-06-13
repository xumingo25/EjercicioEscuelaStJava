package interfaz;
import entidad.Alumno;

public class App {
    public static void main(String[] args) {
        int opcion;
        String nombre, apellido, direccion, curso;
        double[] notas;
        int edad;

        Alumno alumno = null;

        do{
            System.out.println("-------Escuela St. Java - Sistema registro -------");
            System.out.println("1) Registro de alumnos");
            System.out.println("2) Calcular peor nota de alumno");
            System.out.println("3) Calcular mejor nota de alumno");
            System.out.println("4) Promedio de notas");
            System.out.println("5) Situación academica de alumno");
            System.out.println("6) Salir");
            System.out.println("--------------------------------------------------");
            System.out.println("Favor ingrese una opción para continuar....");
            opcion = Leer.datoInt(); //1

            switch (opcion){
                case 1:
                    //registro
                    System.out.println("Favor ingrese nombre del alumno....");
                    nombre = Leer.dato();
                    System.out.println("Favor ingrese apellido del alumno...");
                    apellido = Leer.dato();
                    System.out.println("Favor ingrese dirección del alumno...");
                    direccion = Leer.dato();
                    System.out.println("Favor ingrese la edad...");
                    edad = Leer.datoInt();


                    int cantidadNotas; //entre 3 y 7
                    do{
                        System.out.println("Favor ingresar cantidad de notas del alumno (entre 3 y 7)");
                        cantidadNotas = Leer.datoInt(); //5
                    }while(cantidadNotas<3 || cantidadNotas>7);

                    notas = new double[cantidadNotas]; //

                    for(int i=0; i< notas.length;i++){
                        do{
                            System.out.println("Favor ingrese nota "+ (i+1));
                            notas[i] = Leer.datoDouble();//10
                        }while(notas[i]<1 || notas[i]>7);//-21312312
                    }

                    System.out.println("Favor ingrese el curso..."); curso = Leer.dato();

                    alumno = new Alumno(nombre,apellido,direccion,edad,notas,curso);
                    System.out.println("Se registro "+alumno.getNombre() + " "+alumno.getApellido() +
                            " correctamente.");
                    break;
                case 2:
                    //peor nota
                    if(alumno==null){
                        //no hay registro
                        System.out.println("Favor registre alumno para continuar...");
                    }else{
                        System.out.println("La peor nota de "+ alumno.getNombre() + " es "+alumno.notaMenor());
                    }
                    break;
                case 3:
                    //mejor nota
                    if(alumno==null){
                        //no hay registro
                        System.out.println("Favor registre alumno para continuar...");
                    }else{
                        System.out.println("La mejor nota de "+ alumno.getNombre() + " es "+alumno.notaMayor());
                    }
                    break;
                case 4:
                    //promedio
                    if(alumno==null){
                        //no hay registro
                        System.out.println("Favor registre alumno para continuar...");
                    }else{
                        System.out.println("El promedio de "+ alumno.getNombre() + " es "+alumno.promedio());
                    }
                    break;
                case 5:
                    //situación academica
                    //peor nota
                    if(alumno==null){
                        //no hay registro
                        System.out.println("Favor registre alumno para continuar...");
                    }else{
                        System.out.println(alumno.situacionAcademica());
                    }
                    break;
            }
        }while(opcion!=6);
    }
}
