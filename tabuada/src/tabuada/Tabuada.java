/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package tabuada;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author ADM
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
   // }
    
    public static void main(String[] args) throws IOException
    {
          
     Scanner ler = new Scanner(System.in);
    int i, n;
    
    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();
 
        try (FileWriter arq = new FileWriter("d:\\tabuada.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.printf("+--Resultado--+%n");
            for (i=1; i<=10; i++) {
                gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
            }
            gravarArq.printf("+-------------+%n");
        }
 
    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);
  
    Scanner ler2 = new Scanner(System.in);
      System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler2.nextLine();
 
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
      while (linha != null) {
        System.out.printf("%s\n", linha);
 
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();
  }
    
}

