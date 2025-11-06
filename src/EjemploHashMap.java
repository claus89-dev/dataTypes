import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> edades=new HashMap<String,Integer>();
        edades.put("oscar",25);
        edades.put("Maria",30);
        edades.put("Carlos",28);

        int edadOScar=edades.get("oscar");
        System.out.println("edad de OScar: "+edadOScar);

        //verificar si una clave existe
        if(edades.containsKey("Maria")){
            System.out.println("maria esta en el mapa ");
        }

        //eliminar una clave
        edades.remove("carlos");

 //recorrer el mapa
        for(String nombre:edades.keySet()){
            System.out.println(nombre+" TIENE: "+edades.get(nombre)+"años");
        }

        //tamaño del hashmap
        System.out.println("tamaño del mapa"+edades.size());

        /*
        *
        *
        * Metodo                 |Description|
        * put(K clave,V valor)    |Inserta o reemplaza un valor
        * get(objact clave)       |obtiene un objeto
        * remove(object,clave)    |elimina una entratda
        * ContainsKey(ob ject clave)|Verifica si existe una clave
        * containsValue(object valor)| verifica si existe un valor
        * size()                      |devuelve cuantos pares hay
        * clear()                     | elimina todos los elementos
        * KeySet()                    |devuelve un valor con las claves
        * values()                    |devuelve una colleccion de los valores
        * entrySet()                  |devuelve un set de pares Map.Entry<K,V>
        *
        * */

        }
}
