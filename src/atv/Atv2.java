package atv;

import java.time.LocalDate;
import java.time.Period;

public class Atv2 {
    
    public static void contaTempo(int dia, int mes, int ano) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);
        
        Period periodo = Period.between(dataAtual, dataFutura);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        System.out.println("Faltam " + anos + " anos, " + meses + " meses e " + dias + " dias para a data especificada.");
    }
    
    public static void main(String[] args) {
        contaTempo(24, 4, 2024); // Exemplo de uso do método
    }
}
