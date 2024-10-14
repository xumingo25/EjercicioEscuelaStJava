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

                    break;
                case 2:
                    //opcion 2 (nota peor)
                    System.out.println("Opción 2");
                    break;
                case 3:
                    //opcion 3 (nota mayor)
                    System.out.println("Opción 3");
                    break;
                case 4:
                    //opcion 4 (promedio)
                    System.out.println("Opción 4");
                    break;
                case 5:
                    //opcion 5 (situación academica)
                    System.out.println("Opción 5");
                    break;
            }

        }while(opcion !=6);

    }
}
