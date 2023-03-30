package Atividade_27_03_2023;

import java.util.Scanner;

public class Graus_Farenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva a temperatura em Graus celcius");
        int C = sc.nextInt();
        
        int F = (9*C + 160)/5;
        
        System.out.println("O valor em Graus Farenheit é" + F);
        
       
    
    }
}
