package Atividades;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escreva um numero");
        int n1 = sc.nextInt();
        
        System.out.println("Escreva outro numero");
        int n2 = sc.nextInt();
        
        if(n1 == n2){
            System.out.println("Os numeros são iguais");
        }else{
            System.out.println("Os numeros são diferentes");
        }
}
}