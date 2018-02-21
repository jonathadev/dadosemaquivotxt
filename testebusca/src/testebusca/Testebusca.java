/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebusca;

/**
 *
 * @author ADM
 */
public class Testebusca {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
	     String teste = "1234 5678 0987 6543 12345";
             
           
             
	     String[] elemento = teste.split(" ");
	     System.out.println("String sem split = " + teste);
	     System.out.print("\n");
	     for(int i = 0; i< elemento.length; i++)
	          System.out.println("Posicao " + i + " do vetor = " + elemento[i]);
	}
    
}
