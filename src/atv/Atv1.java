package atv;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Atv1 {
    
    public static String getDataPorExtenso() {
        LocalDate dataAtual = LocalDate.now();
        LocalDateTime horaAtual = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String dataFormatada = dataAtual.format(formatter);
        
        formatter = DateTimeFormatter.ofPattern("HH 'horas e' mm 'minutos'");
        String horaFormatada = horaAtual.format(formatter);
        
        String diaSemana = dataAtual.getDayOfWeek().toString();
        diaSemana = diaSemana.substring(0, 1).toUpperCase() + diaSemana.substring(1).toLowerCase();
        
        return "Hoje é " + diaSemana + ", " + dataFormatada + " e agora são " + horaFormatada + ".";
    }
    
    public static void main(String[] args) {
        System.out.println(getDataPorExtenso());
    }
}
