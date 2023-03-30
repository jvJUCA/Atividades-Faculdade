package Atividades;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escreva um numero");
        int n1 = sc.nextInt();
        
        if (n1>=20 && n1<=90){
            System.out.println("O seu numero " + n1 + " está entre 20 e 90!");           
        }else{
            System.out.println("O seu numero " + n1 + " não está entre 20 e 90!");
        }
}
}