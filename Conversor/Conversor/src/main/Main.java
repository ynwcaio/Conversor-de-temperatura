package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double verifica, cel, fah, res, res1, res2;
        
        System.out.println("Bem-Vindo ao Conversor de temperaturas");
        System.out.println("1. Celsius para Fahrenheit \n 2.Fahrenheit para celsius ");
        verifica = grava.nextDouble();
        
        if(verifica == 1){
            System.out.println("Digite a temperatura em Celsius: ");
            cel = grava.nextDouble();
            res = (cel * 9/5) + 32;
            System.out.println("A temperatura convertida em Fahrenheit é: " + res + "°F");
            
        }else if(verifica == 2){
            System.out.println("Digite a temperatura em Fahrenheit : ");
            fah = grava.nextDouble();
            res1 = (fah - 32) * 5/9;
            System.out.println("A temperatura convertida em Celsius é: " + res1 + "°C");
            
        }else{
            System.out.println("Opção inválida, escolha entre 1 e 2");
        }
        
        grava.close();
    }
}
