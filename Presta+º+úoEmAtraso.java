package Atividade_27_03_2023;

import java.util.Scanner;

public class PrestaçãoEmAtraso {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
                
            System.out.println("Escreva o valor do qual atrasou");
            int VALOR = sc.nextInt();
            
            System.out.println("Escreva a taxa em dias que estão te cobrando");
            double TAX = sc.nextDouble();
            
            System.out.println("Escreva o tempo que atrasou o pagamento em dias");
            int TEMPO = sc.nextInt();
            double TAXA = TAX*VALOR/100;
                    
            double PRESTACAO = VALOR + (VALOR+(TAXA*TEMPO));

            System.out.println("O valor que ficou a prestação é: " + PRESTACAO);
                
    }

    
}
