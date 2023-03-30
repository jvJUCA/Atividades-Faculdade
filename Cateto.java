package Atividade_27_03_2023;

import java.util.Scanner;

public class Cateto {
    public static void main(String[] args) {
        int h,h2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Escreva o valor de um cateto");
        int c1 = sc.nextInt();
        
        System.out.println("Escreva o valor do outro cateto");
        int c2 = sc.nextInt();
        
        h2 = (c1*c1) + (c2*c2);
        h = (int) Math. sqrt(h2);
        
        System.out.println("O valor da Hipotenusa é de:" + h);
    
    }
}
