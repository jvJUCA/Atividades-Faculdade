package Atividade_27_03_2023;

import java.util.Scanner;

public class Rendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escreva o valor do seu investimento");
        double V = sc.nextDouble();
        System.out.println("Escreva o valor da taxa de juros por mês");
        double T = sc.nextDouble();
        System.out.println("Escreva quantos meses voce vai deixar rendendo");
        double M = sc.nextDouble();
        
        double R = ((V*T/100)*M) + V;
        System.out.println("O valor bruto depois do rendimento seria de: " + R);
    }
}
