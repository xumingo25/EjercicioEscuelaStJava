package interfaz;

import entidad.Alumno;

public class App {
    public static void main(String[] args) {
        String nombre, apellido, direccion, curso;
        double notas[];
        int edad;

        Alumno alumno = null;

        int opcion;
        do{
            System.out.println("---------- Escuela ST. Java ---------------");
            System.out.println("--------- 1) Registrar alumno -------------");
            System.out.println("--------- 2) Calcular peor nota alumno ----");
            System.out.println("--------- 3) Calcular mejor nota alumno ---");
            System.out.println("--------- 4) Promedio notas alumno --------");
            System.out.println("--------- 5) Evaluar Situación Academica --");
            System.out.println("--------- 6) Salir");
            System.out.println("-------------------------------------------");
            System.out.println(" Favor ingrese una opción para continuar... EJ: 1");
            opcion = Leer.datoInt();

            switch (opcion){
                case 1:
                    //opcion 1 (Ingreso)
                    System.out.println("Favor ingrese el nombre del alumno");
                    nombre = Leer.dato();

                    System.out.println("Favor ingrese el apellido del alumno");
                    apellido = Leer.dato();

                    System.out.println("Favor ingrese dirección  del alumno");
                    direccion = Leer.dato();

                    System.out.println("Favor ingrese la edad del alumno");
                    edad = Leer.datoInt();

                    int cantidadNotas; // > entre 3 y 7 notas <
                    do{
                        System.out.println("favor indique cantidad de notas del alumno (minimo 3 notas y 7 notas maximo)");
                        cantidadNotas = Leer.datoInt(); //5

                    }while(cantidadNotas < 3 || cantidadNotas > 7); //false
                            //false          //false
                                        //false
                    notas = new double[cantidadNotas];

                    for(int i=0; i < notas.length; i++){

                        do{
                            System.out.println("Ingrese nota nro "+ (i+1));
                            notas[i] = Leer.datoDouble(); //15
                        }while(notas[i] < 1 || notas[i] > 10);
                    }

                    System.out.println("favor ingrese el curso");
                    curso = Leer.dato();

                    alumno = new Alumno(nombre,apellido,direccion,edad,notas,curso);

                    System.out.println("El alumno "+ alumno.getNombre() + " " + alumno.getApellido()+ " Se registro correctamente");

                    break;
                case 2:
                    //opcion 2 (nota peor)
                    if(alumno==null){
                        System.out.println("El alumno no esta registrado. Favor ingrese alumno.");
                    }else{
                        System.out.println("La peor nota de "+ alumno.getNombre() + " " + alumno.getApellido() +
                                " es: "+alumno.peorNota());
                    }
                    break;
                case 3:
                    //opcion 3 (nota mayor)
                    if(alumno==null){
                        System.out.println("El alumno no esta registrado. Favor ingrese alumno.");
                    }else{
                        System.out.println("La mejor nota de "+ alumno.getNombre() + " " + alumno.getApellido() +
                                " es: "+alumno.mejorNota());
                    }
                    break;
                case 4:
                    //opcion 4 (promedio)
                    if(alumno==null){
                        System.out.println("Favor registre alumno para continiuar...");
                    }else{
                        System.out.println("El promedio de "+ alumno.getNombre() + " " + alumno.getApellido() +
                                " es: "+alumno.promedio());
                    }
                    break;
                case 5:
                    //opcion 5 (situación academica)
                    if(alumno==null){
                        System.out.println("Favor registre alumnno para continuar...");
                    }else{
                        System.out.println(alumno.evaluarSituacionAcademica());
                    }
                    break;
            }

        }while(opcion !=6);

    }
}
