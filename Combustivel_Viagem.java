package Atividade_27_03_2023;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Combustivel_Viagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("informe o tempo gasto na viagem em horas");
        int T = sc.nextInt();
        
        System.out.println("Informe a velocidade media da viagem em kmH");
        int M = sc.nextInt();
        
        int D = (T*M);
        int L = D / 12;
        
        System.out.println("O tempo gasto na viagem foi de: " + T + "horas\n" + "A velocidade media foi de: " + M + " KmH\n"
                + "A distancia percorrida foi de: " + D + " Km\n" + "A Quantidades de litros usados foi: " + L + "Litros");
    } 
    
}
