/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels;

import java.util.Scanner;

/**
 *
 * @author AndresFI
 */
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        char letra;
        String vowels = "";
        String word;
        
        
        System.out.println("Write a word: ");
        
        word = sc.nextLine();
        
        char array[] = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            letra = word.charAt(i);
            switch (letra) {
                case 'a':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'e':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'i':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'o':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'u':
                    array[contador] = letra;
                    contador ++;
                    break;
                
                case 'A':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'E':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'I':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'O':
                    array[contador] = letra;
                    contador ++;
                    break;
                    
                case 'U':
                    array[contador] = letra;
                    contador ++;
                    break;
                
            }
        }
        
        
        System.out.println(word + " has " + contador + " vowels");
        System.out.println("These are the vowels: " + String.valueOf(array));
    }
    
}
