public class ObjectString {

    public static void main(String[] args) {

        String x1="hola";
        String x2="hola";

        System.out.println("s1==s2"+(x1==x2));
        //String creado con new (nuevo objeto en memoria)

        String x3=new String("hola");

        System.out.println("s1==s2"+(x3==x2));
        System.out.println("s1 equals s2"+(x1.equals(x2)));

        //inmutabilidad de string
        String texto="java";
        texto.concat("es genial");
        System.out.println("\n texto original inmutable" + texto);
        texto=texto.concat("es genial");
        texto+="es genial";
        texto+="en web";
        texto+="de escritorio";
        texto=texto.replace(" ","");
        //problema de concatenacion en bucles
        String concatMal="";
        for(int i=0;i<texto.length();i++){
            concatMal+= i +"";
        }
       System.out.println(concatMal);
        //Uso correcto de springbuilder mutable
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<texto.length();i++){
            sb.append(i).append(" ").append("hola").append("como estas ");

        }
        System.out.println("concatenacion perfecta de builder"+sb);

        //comparacion de rendmiento

        long inicio1=System.nanoTime();
        String test1="";
        for (int i=0;i<texto.length();i++){test1+=i;}
        long fim1=System.nanoTime();
        long inicio2=System.nanoTime();
        StringBuilder test2=new StringBuilder();
        for(int i=0;i<texto.length();i++){
            test2.append(i);
        }
        long fim2=System.nanoTime();
        System.out.println("tiempo de concatenacion con string" +(fim1-inicio1));
        System.out.println("tiempo de concatenacion con string" +(fim2-inicio2));


        //stringbuffer similar  a stringbuilder pero mas seguro en hilos

        StringBuffer sbf=new StringBuffer("thread-safe");
        sbf.append("pero mas lento");
        System.out.println("uso de stringbuffer"+sbf);

        String s1="java";
        String s2="java";
        String s3=new String("java");
        String s4=new String("java");
        String s5=new String("java").intern();

        //comparaciones con ==
        System.out.println("s1==s2" + (s1==s2));

        System.out.println("s1==s3" + (s1==s3));
        System.out.println("s3==s4" + (s1==s4));
        System.out.println("s3==s5" + (s1==s5));

        //reasignacion y concatenacion

        s3=s3 +"programming";
        System.out.println("s6 intern de s3" + s3);
        System.out.println("s3==s4" +s3==s4);
        //internacion despues de concatenacion

        String s6=s3.intern();
        System.out.println("s6 intern de s3" + s6);
        System.out.println("s6==s1" +s6==s1);

    }
}
