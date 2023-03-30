package Atividade_27_03_2023;

import java.util.Scanner;

public class SalarioProf {
    public static void main(String[] args) {
        double ht,vh,pd,sb,td,sl;
        Scanner sc = new Scanner (System.in);
        System.out.println("Escreva o total de horas trabalhadas no mês:");
        ht = sc.nextDouble();
        
        System.out.println("Escreva o valor de sua hora aula");
        vh = sc.nextDouble();
        
        System.out.println("escreva o seu percentual do INSS");
        pd = sc.nextDouble();
        
        sb = (ht * vh);
        td = (pd * sb)/100;
        sl = (sb - td);
        System.out.println("O seu Salario liquido é :\n" + sl);
    }
  
}
