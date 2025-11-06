import javax.swing.*;
import java.io.IOException;
import java.time.Year;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class JavaBasico {

    public static void main(String[] args) {
        System.out.println("programa que pida tu nombre y edad por consola, y luego imprima un mensaje como");

        String nombre;
        int edad = 0;

        Scanner st = new Scanner(System.in);
        System.out.print("ingrese su nombre:");
        nombre = st.nextLine();

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("ingrese su edad:");
            edad = sc.nextInt();

        } catch (Exception e) {
            System.out.print("el numero que ingreso no es un entero");
        }


        System.out.print("\nHola" + nombre + "Tienes" + edad + "años.¡Bienvenido a java!");

        //Calcula en qué año de nacimiento y muéstralo también.
        System.out.println("programa que pida tu nombre y edad por consola,  calcula el año de nacimientos");

        int anio = 0;
        Date fecha = new Date();
        int year = Year.now().getValue();
        anio = year - edad;

        System.out.print("\nHola" + nombre + "Tienes" + edad + "años.¡Bienvenido a java!,naciste en el año" + anio);

        //Operadores aritméticos y lectura de datos
        System.out.println("\nOperadores aritméticos y lectura de datos");

        int a;
        int b;
        int operacion;
        try{
            Scanner sh = new Scanner(System.in);
            System.out.print("ingrese primer numero:");
            a = sh.nextInt();

            Scanner sj = new Scanner(System.in);
            System.out.print("ingrese segundo numero:");
            b = sj.nextInt();

            Scanner sy = new Scanner(System.in);
            System.out.print("\ningrese la operacion deseada (1:suma,2:resta.3:multiplicacion,4:division):");
            operacion = sy.nextInt();
            switch (operacion) {
                case 1 -> System.out.println("\nsuma" + (a + b));
                case 2 -> System.out.println("\nresta" + (a - b));
                case 3 -> System.out.println("\nmultiplicacion" + (a * b));
                case 4 -> System.out.println("\ndivision" + (a / b));
                default -> System.out.println("\nNo se realizo la operacion");
            }
        }
        catch(Exception e){
           System.out.println("error debes ingresar un numero entero");
        }




        //Pide al usuario un número entero y muestra si es par o impar.
        //indica si es ´positivo ,negativo o cero
        System.out.println("\nPide al usuario un número entero y muestra si es par o impar");

        int numero;

        try {
            Scanner t = new Scanner(System.in);
            System.out.print("ingrese primer numero:");
            numero = t.nextInt();
        } catch (Exception e) {
            System.out.print("debes  ingresar un numero entero");
            Scanner t = new Scanner(System.in);
            System.out.print("ingrese primer numero:");
            numero = t.nextInt();
        }



        boolean cumpleCondicion = (numero % 2 == 0);
        if (cumpleCondicion) {
            System.out.println("El numero proporcionado es par");
        } else {
            System.out.println("El numero no proporcionado es impar");
        }

        boolean esPositivoNegativoCero = (numero == 0);
        if (esPositivoNegativoCero) {
            System.out.println("El numero proporcionado es cero");
        } else {
            if (numero > 0) {
                System.out.println("El numero proporcionado es positivo");
            } else {
                System.out.println("El numero no proporcionado es negativo");
            }
        }

        // Mayor de tres números
        System.out.println("\nMuestra el mayor de tres numeros");

        int n1;
        int n2;
        int n3;
        try{
            Scanner r = new Scanner(System.in);
            System.out.print("ingrese primer numero:");
            n1 = r.nextInt();
            Scanner u = new Scanner(System.in);
            System.out.print("ingrese segundo numero:");
            n2 = u.nextInt();
            Scanner v = new Scanner(System.in);
            System.out.print("ingrese segundo numero:");
            n3 = v.nextInt();
            boolean esMayorN1 = (n1 > n2 && n1 > n3);
            if (esMayorN1) {
                System.out.println("El primero es el mayor");
            } else {
                boolean esMayorN2 = (n1 < n2 && n3 < n2);
                if (esMayorN2) {
                    System.out.println("El segundo es el mayor");
                } else {
                    System.out.println("El tercero es el mayor");
                }
            }

            boolean hayIguales = (n1 == n2 || n1 == n3 || n2 == n3);
            if (hayIguales) {
                System.out.println("Si existen numeros iguales");
            }

        }
        catch(Exception e){
            System.out.println("error debes ingresar un numero");
        }


        int n4;
        int suma = 0;
        //Contador de números
        try{
            System.out.println("\ncontador de numeros");
            Scanner m = new Scanner(System.in);
            System.out.print("ingrese segundo numero:");
            n4 = m.nextInt();

            for (int i = 0; i <= n4; i++) {
                System.out.println(i + 1);
                suma =suma+ i ;
            }
            System.out.print("\nla suma de todos los numeros es:" + suma);
        } catch (Exception e) {
            System.out.println("error debes ingresar unicamente numeros enteris");
        }

//tablas de multiplicar

        System.out.println("\nTablas de multiplicacion");
        int n5;
        int n6;
        int multiplica = 0;
        try{
            Scanner n = new Scanner(System.in);
            System.out.print("ingrese un numero n:");
            n5 = n.nextInt();

            Scanner l = new Scanner(System.in);
            System.out.print("Hasta que numero desea mostrar la tabla:");
            n6 = n.nextInt();
            int valor;
            for (int i = 0; i <= n6; i++) {
                System.out.println(i + 1);
                valor = (i + 1);
                multiplica = n5 * (valor);
                System.out.println(n5 + "*" + valor + "=" + multiplica);
            }

        }
        catch(Exception e){
            System.out.println("error debes ingresar unicamente numeros enteris");
        }



        //pares entre 1 y100
        System.out.println("\nPares entre 1 y 100");
        int contador = 0;
        int par;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.print("el numero de pares es!" + contador);

//while hast    u el usuario diga no

//do while
        System.out.println("\nSuma hasta que el usuario diga “no”");
        int numeros = 0;
        String respuesta = "";
        int sumas = 0;
        try{
            do {
                Scanner h = new Scanner(System.in);
                System.out.print("ingrese el numero a sumar:");
                numeros = h.nextInt();

                Scanner j = new Scanner(System.in);
                System.out.print("desea ingresar otro numero?si /no:");
                respuesta = j.nextLine();
                sumas = sumas + numeros;
            } while (!respuesta.equals("no"));

            System.out.println("sumatotal:" + sumas);
        }catch(Exception e){
            System.out.println("error debes ingresar un numero");
        }

//Genera un número aleatorio entre 1 y 50. El usuario debe adivinarlo. Después de cada intento, muestra si el número es mayor o menor.


        int intento = 0;
        int intAletorio = 0;
        int intaleatorio2 = 0;
        String respuesta3;
        do{
            Random aleatorio = new Random(System.currentTimeMillis());
// Producir nuevo int aleatorio entre 0 y 99
             intaleatorio2 = aleatorio.nextInt(50);

            boolean esMayorN2 = (intaleatorio2 > intAletorio);
            if (esMayorN2) {
                System.out.println("El segundo es el mayor");
            } else {
                System.out.println("El tercero es el mayor");
            }

            Scanner k = new Scanner(System.in);
        System.out.print("desea intentarlo?si /no:");
             respuesta3 = k.nextLine();
             intento++;
    }while (!respuesta3.equals("no"));
//operaciones
        System.out.println("\noperaciones aritmeticas");
        int operacions;
        String respuesta2 = "";

        try {
            do{
                int as;
                int bs;
                Scanner c= new Scanner(System.in);
                System.out.print("\ningrese la operacion deseada (\n1:suma,\n2:resta.\n3:multiplicacion,<\n4:division):,\n5:Salir:");
                operacions=c.nextInt();

                Scanner shs= new Scanner(System.in);
                System.out.print("ingrese primer numero:");
                as=shs.nextInt();

                Scanner e= new Scanner(System.in);
                System.out.print("ingrese segundo numero:");
                bs=e.nextInt();

                switch(operacions){
                    case 1->System.out.println("\nsuma"+(as+bs));
                    case 2->System.out.println("\nresta"+(as-bs));
                    case 3->System.out.println("\nmultiplicacion"+(as*bs));
                    case 4->System.out.println("\ndivision"+(as/bs));
                    default->System.out.println("salir");
                }
                Scanner k = new Scanner(System.in);
                System.out.print("desea realizar otra operacion?si /no:");
                respuesta2 = k.nextLine();
            }while (!respuesta2.equals("no"));

        }catch(Exception e){
            System.out.println("error debes ingresar un numero emtero");
        }









    }
}
