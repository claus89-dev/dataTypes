import java.util.ArrayList;
import java.util.List;

public class Bucles {
    public static void main(String[] args) {
        int contador=1;
        //while(contador<=5){
          //  System.out.println("contador:"+contador);
       // }

        //do while
        int numero=1;
        do{
          System.out.println("numero:"+numero);
          numero++;
        }while(numero<=5);

        //for clasico
        for(int i=0;i<=5;i++){
            System.out.println("iteracion:"+i);
        }

        //for each(enhanced for)
        String[]frutas={"manzana","banana","naranja","cereza"};
        for(String fruta:frutas){
            System.out.println("fruta:"+fruta);
        }

        List<String> nombres=List.of("ana","pedro","luis","maria");
        //for-each para listas
        nombres.forEach(System.out::println);
        //for-each para listas
        nombres.forEach(nombre->System.out.println("nombre"+nombre));
        //stream filtrar y recorrer
        nombres.stream().filter(nombre->nombre.length()>3).forEach(System.out::println);
    }
}
