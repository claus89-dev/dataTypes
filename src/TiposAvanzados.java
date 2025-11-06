import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class TiposAvanzados {
    public static void main(String[] args) {
        //bigdecimal
        System.out.println("\nBigdecimal finanzas");
        BigDecimal precio = new BigDecimal("2500.75");
        BigDecimal iva = new BigDecimal("0.16");
        BigDecimal descuento = new BigDecimal("0.10");

        //calcular iva y descuento
        BigDecimal conIva = precio.add(precio.multiply(iva));
        BigDecimal conDescuento = precio.add(precio.multiply(iva));
        System.out.println("Precio Finanzas: " + precio);
        System.out.println("Precio IVA: " + precio);
        System.out.println("Precio Descuento: " + precio);

        //Interes compuesto:montofinal=monto *(1+tasa)^amños

        BigDecimal monto = new BigDecimal("1000");
        BigDecimal tasa=new BigDecimal("0.05");
        int anios=10;
        BigDecimal montoFinal = monto.multiply((BigDecimal.ONE.add(tasa)).pow(anios));
        System.out.println("Monto final: " + montoFinal);

        //BigInteger
        System.out.println("BigInteger (NumerosEnormes)");
        int n=30;
        BigInteger factorial=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial: "+n+";" + factorial);
        //LOCALDATE
        System.out.println("LocalDate(Fechas)");
        LocalDate hoy = LocalDate.now();
        LocalDate navidad = LocalDate.of(2020, 12, 31);
        Period periodo = Period.between(hoy,navidad);
        System.out.println("Faltan: "+periodo.getDays()+"meses"+periodo.getMonths()+"dias"+periodo.getYears());

        //localdatetime
        System.out.println("localdatetime fecha y hora");
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime evento = LocalDateTime.of(2025, 10, 10, 15, 30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Ahora: "+ahora.format(formatter));
        System.out.println("Evento Hora: "+evento.format(formatter));
        Duration duracion = Duration.between(evento, ahora);
        System.out.println("Faltan: "+duracion.toMinutes()+""+duracion.toDays());
    }

}
