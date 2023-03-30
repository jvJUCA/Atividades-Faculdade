package Atividade_27_03_2023;

import java.util.Scanner;

public class Antecessor_Sucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escreva um numero inteiro");
        int n1 = sc.nextInt();
        
        System.out.println("O sucessor do seu numero é:" + (n1 + 1) + "\nO antecessor do seu numero é:" + (n1 - 1));
    }
}
