import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> nombres=new ArrayList<>();
        nombres.add("carlos");
        nombres.add("ana");
        nombres.add("pedro");
        nombres.add("lucia");

        System.out.println("Lista original"+nombres);
        //acceder a un elemento
        String primero=nombres.get(0);
        System.out.println("Lista primero"+primero);

        //iterar con for tradicional
        System.out.println("Iteracion con for tradicional");
        for(int i=0;i<nombres.size();i++){
            System.out.println("indice"+i+": "+nombres.get(i));
        }

        //iterar con while
        //int index=0;
       // while(index<nombres.size()-1){
         //   System.out.println("Indice "+index+": "+nombres.get(index));
        //}

        //iterar con for each y lamda

        System.out.println("Iteracion con for each y landa ");
        nombres.forEach(nombre->System.out.println(nombre));

        //buscar elementos comtains
        System.out.println("la lista contine a ana? "+nombres.contains("ana"));
        //ordenar con comparator
        Collections.sort(nombres);
        System.out.println("lista ordenada alfabeticamente"+nombres);
        //orden inverso con comparator
        nombres.sort(Comparator.reverseOrder());
        System.out.println("lista ordenada inversamente"+nombres);
        //eliminar un elemento
        nombres.remove("pedro");
        System.out.println("se eliminara apedroa"+nombres);
        //filtrar con streams
        System.out.println("nombres que empiezan con c");
        nombres.stream().filter(nombre->nombre.startsWith("c"));
        List<String> nombresinmutables=List.copyOf(nombres);
        System.out.println(nombresinmutables );
    }
}
