package Atividades;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escreva um numero");
        int n1 = sc.nextInt();
        
        if  (n1 >= 20) {
            System.out.println("O seu numero é: " + n1);
        }else{
            System.out.println("O seu numero não é valido");
        }
            
    }
    
}
