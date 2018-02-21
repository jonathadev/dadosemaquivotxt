/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public class Locadoura {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        List<Veiculo> listVeiculos = new ArrayList();

        int menu = 0;
        Scanner scan = new Scanner(System.in);
        System.out.printf("  \n\n");
        System.out.println(" ============  CADASTRO E LISTAGEM DE  VEICULOS ,CARROS, LOCADORAS, LOCACOES E BUSCA LOCACOES ========");

        System.out.println("\n1 > CADASTRO DE CARROS:\n");

        //System.out.println("2 > CADASTRO DE LOCADORAS:\n");
        System.out.println("3 > LISTAR CARROS:\n");

        //System.out.println("4 > LISTAR LOCADORAS:\n");
        System.out.println("5 > LISTAR VEICULOS:\n\n");

        System.out.println("6 > SAIR:\n\n");

        while (menu != 6) {

            System.out.printf("  \n\n");

            System.out.printf("DIGITE A OPCAO DESEJADA: ");

            menu = scan.nextInt();

            System.out.printf("  \n\n");

            switch (menu) {
                case 1:

                    Carro c = new Carro();

                    listVeiculos.add(c);

                    break;

                case 2:

                //Funcionario f = new Funcionario();
                //listPessoas.add(f);
                //break;
                case 3:
                    for (int i = 0; i < listVeiculos.size(); i++) {
                        if (listVeiculos.get(i) instanceof Carro) {
                            Carro carro = (Carro) listVeiculos.get(i);
                            carro.listarCarro();
                        }
                    }

                    //leitura completa
                    Scanner ler2 = new Scanner(System.in);
                   // System.out.printf("\n Informe o caminho e nome de arquivo texto exemplo  \"d:\\locadora2.txt\".\n");
                   // String nome = ler2.nextLine();
String nome = "d:\\locadora2.txt";

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
                    break;

                case 4: {
                /*  

                String data_Loc = JOptionPane.showInputDialog("DIGITE A DATA DE LOCACAO:");
                String data_Lim = JOptionPane.showInputDialog("DIGITE A DATA LIMITE DE LOCACAO:");
/*
                String tipo_dia;
                System.out.printf("Digite  o tipo de dia: ");
                int menu3 = scan.nextInt();
                switch (menu3) {
                case 1: {
                tipo_dia = "seg";
                }
                break;
                case 2: {
                tipo_dia = "ter";
                break;
                }
                case 3: {
                tipo_dia = "qua";
                break;
                }
                case 4: {
                tipo_dia = "qui";
                break;
                }
                case 5: {
                tipo_dia = "sex";
                break;
                }
                case 6: {
                tipo_dia = "sab";
                break;
                }
                case 7: {
                tipo_dia = "dom";
                break;
                }
                case 8: {
                System.exit(0);
                }
                break;
                default:
                System.out.printf(" =========================  OPCAO NAO CONSTA ==========================\n");
                }
                 *\
                /*
                // armazenar quantidade_Passageiros = locadora
                int quantidade_Passageiros;
                String tipo_locadora;
                System.out.printf("  System.out.printf(\"Digite  a quantidade de passageiros desejada: ");
                menu = scan.nextInt();
                System.out.printf("  \n\n");
                switch (menu) {
                case 1:
                quantidade_Passageiros = 1;
                //de acordo com mais barrato
                tipo_locadora = "SouthCar";
                //System.out.printf("Carro mais barato disponível: %f  fds %f \n", SouthCar[0], SouthCar[2] );
                case 2:
                quantidade_Passageiros = 2;
                tipo_locadora = "SouthCar";
                case 3:
                quantidade_Passageiros = 3;
                tipo_locadora = "SouthCar";
                case 4:
                quantidade_Passageiros = 4;
                tipo_locadora = "SouthCar";
                case 5:
                quantidade_Passageiros = 5;
                tipo_locadora = "NorthCar";
                case 6:
                quantidade_Passageiros = 6;
                tipo_locadora = "NorthCar";
                case 7:
                quantidade_Passageiros = 7;
                tipo_locadora = "NorthCar";
                default:
                System.out.printf(" =========================  OPCAO NAO CONSTA ==========================\n");
                }
                }*/
                
                }break;
                case 5:

                    for (int i = 0; i < listVeiculos.size(); i++) {
                        Veiculo veiculo = listVeiculos.get(i);
                        veiculo.listarVeiculo();
                    }
                    break;

                case 6: {
                    System.exit(0);
                }
                break;

                default:
                    System.out.printf(" =========================  OPCAO NAO CONSTA ==========================\n");

            }
        }

    }


  //gravacao precos das locadoras e veiculos**********
    

     //   try (FileWriter arq = new FileWriter("d:\\locadora.txt")) {
      ///      PrintWriter gravarArq = new PrintWriter(arq);


 //locadora (nome_Locadora preco_Locacao_regurar_Semana, preco_Locacao_fidelidade_Semana,preco_Locacao_regurar_fds, preco_Locacao_fidelidade_Fds)

//2 SouthCar, 210, 150, 200, 90
//4 WestCar ,530, 150, 200, 90
//7 NorthCar,630, 580, 600, 590

//com base na quantidade ja saberemos  o tipo de veiculo  e  locadora
/*
 Scanner ler2 = new Scanner(System.in);
      System.out.printf("\n Informe o caminho e nome de arquivo texto exemplo  \"d:\\locadora.txt\".\n");
    String nome = ler2.nextLine();
    
    
         gravarArq.println("Dados das locadoras: nome_Locadora preco_Locacao_regurar_Semana, preco_Locacao_fidelidade_Semana,preco_Locacao_regurar_fds, preco_Locacao_fidelidade_Fds)");
             String locadora1 = "210 150 200 90";

	     String[] SouthCar = locadora1.split(" ");
	     gravarArq.println("String sem split = " + locadora1);
	     gravarArq.print("\n");
	     for(int i = 0; i< SouthCar.length; i++)
	          gravarArq.println("Posicao " + i + " do vetor = " + SouthCar[i]);

             String locadora2 = "530 150 200 90";

	     String[] WestCar = locadora2.split(" ");
	     gravarArq.println("String sem split = " + locadora2);
	     gravarArq.print("\n");
	     for(int i = 0; i< WestCar.length; i++)
	          gravarArq.println("Posicao " + i + " do vetor = " + WestCar[i]);

             String locadora3 = "630 580 600 590";

	     String[] NorthCar = locadora3.split(" ");
	     gravarArq.println("String sem split = " + locadora3);
	     gravarArq.print("\n");
	     for(int i = 0; i< NorthCar.length; i++)
	          gravarArq.println("Posicao " + i + " do vetor = " + NorthCar[i]);

             gravarArq.println("---------------");

             gravarArq.println("DATAS");

             String tipo_Dia = "seg ter qua qui sex sab dom ";

	     String[] data = tipo_Dia.split(" ");
	     gravarArq.println("String sem split = " + tipo_Dia);
	     gravarArq.print("\n");
	     for(int i = 0; i< data.length; i++)
	          gravarArq.println("Posicao " + i + " do vetor = " + data[i]);

               gravarArq.println("---------------");

                  gravarArq.println("CARROS");

                  String carro1 = "ferrari, WestCar, disponivel";

	     String[] esportivo1 = carro1.split(" ");
	     gravarArq.println("String sem split = " + carro1);
	     gravarArq.print("\n");
	     for(int i = 0; i< esportivo1.length; i++)
	          gravarArq.println("Posicao " + i + " do vetor = " + esportivo1[i]);


                String carro2 = "mustang, WestCar, disponivel";

	     String[] esportivo2 = carro2.split(" ");
	     gravarArq.println("String sem split = " + carro2);
	     gravarArq.print("\n");
	     for(int i = 0; i< esportivo2.length; i++)
	          gravarArq.println("Posicao " + i + " do vetor = " + esportivo2[i]);

                  gravarArq.println("---------------");
        }

  System.out.printf("\n Os dados das Locadaras foram gravados em \"d:\\locadora.txt\".\n");

/*
        //leitura completa
    Scanner ler2 = new Scanner(System.in);
      System.out.printf("\n Informe o caminho e nome de arquivo texto exemplo  \"d:\\locadora.txt\".\n");
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




                 
                //leitura diferente?

*/
            }
