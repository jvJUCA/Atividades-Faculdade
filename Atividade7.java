package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1,n2,n3;
        
        System.out.println("Escreva um numero");
        n1 = sc.nextInt();
        
        System.out.println("Escreva outro numero");
        n2 = sc.nextInt();
        
        System.out.println("Escreva outro numero");
        n3 = sc.nextInt();
        
        System.out.println("OS numeros em ordem são: ");
        int[] numbers = { n1, n2, n3 };
        
        Arrays.sort(numbers, 0, 3);
           
        for (int ordem : numbers) {
            
        System.out.println(ordem);
}
 
        

}
}
