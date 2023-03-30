package Atividades;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escreva um numero");
        int n1 = sc.nextInt();
        
        System.out.println("Escreva outro numero");
        int n2 = sc.nextInt();
        
        int n3 = (n1 + n2);
        
        if (n3 > 10){
            System.out.println("O resultado é: " + n3);
        }else{
            System.out.println("O seu numero não é valido");
        }
    }
}
