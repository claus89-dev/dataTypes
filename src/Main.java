//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


    int primitivoInt = 10;
    Integer wrapperInt = 10;

    System.out.println(primitivoInt);
    System.out.println(wrapperInt);

    Integer autobox = primitivoInt;
    int unbox = wrapperInt;
    System.out.println(autobox);
    System.out.println(unbox);


    int a = 100;
    int b = 100;
    System.out.println(a + b);
    Integer X = 100;
    Integer Y = 100;
    Integer z = 100;
    System.out.println("\nComparaciones;");
    System.out.println(a == b);
    System.out.println(X == Y);
    System.out.println(X == z);
    System.out.println(X.equals(Y));
    System.out.println(X.equals(z));

    //operaciones aritmeticas
    int sumaPrimitivos = a + b;
    Integer sumaWrapper = a + b;
    System.out.println(sumaPrimitivos);
    System.out.println(sumaWrapper);
    //Conversion de string a numero
    String numeroText0="123";
    int numPrimitivo=Integer.parseInt(numeroText0);
    Integer numWrapper=Integer.valueOf(numeroText0);
    System.out.println("Integer.parseInt(123)"+numPrimitivo);
    System.out.println(numWrapper);

    //uso en colecciones
    java.util.List<Integer> lista = new java.util.ArrayList<>();
    lista.add(10);
    lista.add(20);
    lista.add(30);

    System.out.println("\nLista con wrappers");
    for (Integer integer : lista) {
        System.out.println("Elemento"+integer);
                                   }
    //nulability/(solo los wrappers pueden ser null)

    Integer puedeserNull=null;
    System.out.println("\nwrapper con null permitida");
    System.out.println("Integer puede ser null"+puedeserNull);
 //Si descomentas esa linea dara nullpointer exception
    //int primitivoNull=puedeserNull;

}

