public class Condicionales {
    public static void main(String[] args) {
        //ejemplos de condicionales

        int edad=20;

        if(edad>=18){
            System.out.println("es mayor de edad");

        }

        if(edad>=20){
            System.out.println("es mayor de edad");

        }
        else{
            System.out.println("es menor de edad");
        }

        //operador ternario
        String mensaje=(edad>=18)?"eres mayor de edad":"es menor de edad";
        System.out.println(mensaje);

        int numero=-5;
        String tipo=(numero>0)?"positivo":"negativo";
        System.out.println("el numero es"+tipo);

        int nota=75;
        if(nota>=90){
        System.out.println("excelente");}
        if(nota>=70){
            System.out.println("aprobado");
        }
        if(nota>=60){
            System.out.println("reprobado");
        }

        //switch
        //desde java 14 se pueden usar switch con flechas
        int dia=3;
        //mala implementacion
        if(dia==1){
            System.out.println("lunes");
        }
        if(dia==2){
            System.out.println("martes");
        }
        if(dia==3){
            System.out.println("miercoles");
        }
        if(dia==4){
            System.out.println("jueves");

        }
        if(dia==5){
            System.out.println("viernes");
        }
        if(dia==6){
            System.out.println("sabado");
        }
        if(dia==7){
            System.out.println("domingo");
        }else
        {
            System.out.println("fin de semana");
        }

        //optimizacion
        switch(dia){
            case 1->System.out.println("lunes");
            case 2->System.out.println("martes");
            case 3->System.out.println("miercoles");
            case 4->System.out.println("jueves");
            case 5->System.out.println("viernes");
            default->System.out.println("fin de semana");
        }

        //buenas practicas
        //condicionales claras y expresivas
        int x=1;
        int y=2;
        int z=3;
        int w=4;

        //malo
        if(x==1 && y !=2 ||z==3 && w<5)
        {

            }

        boolean cumpleCondicion=(x==1 && y!=2 ||z==3 && w<5);
        if(cumpleCondicion){
            System.out.println("cumple condicion");
        }

        //evitar anidaciones profundas
        //dificil de leer

        boolean tieneIdentificacion=false;
        if(edad>=18){
            if(tieneIdentificacion){
                System.out.println("puede entrar");
            }
        }
//mejor

        if(edad>=18 && tieneIdentificacion){
            System.out.println("puede entrar");
        }

        //consideraciones
        //usar switch en ligar de muchos if
        //el operador ternario solo en caso de usos multiples
        //si la logica es mas compleja es mejor usar if-else para legibilidad

    }
}
