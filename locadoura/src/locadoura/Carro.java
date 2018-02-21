/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoura;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Carro extends Veiculo{
    

private int volumePortaMalas;

private boolean status;
	
	public Carro(){
		incluirCarro();
}


        public boolean isStatus()
{
		return status;
}
        
        public void setStatus(boolean status)
	{
		this.status = status;
	}


	public Carro incluirCarro()
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Marca: ");
		setMarca(scan.nextLine());

		
		System.out.println("Tipo de carro: ");
		setTipoCarro(scan.nextLine());

		
		System.out.println("Quantidade de passageiros: ");
		setPassageiros(scan.nextLine());
	
		
		System.out.println("Locadora: ");
		setLocadora(scan.nextLine());
	
		
		System.out.println("Disponivel (s/n): ");
		String pref = scan.nextLine();

		if( (pref.equals("s")) || (pref.equals("sim")))
		{
			setStatus(true);	
		
		}
		else
		{
			setStatus(false);
		}
		return this;
	}



public void setvolumePortaMalas(int c)
{
volumePortaMalas = c;	
}

public double getvolumePortaMalas()
{
return volumePortaMalas;	
}

public void listarCarro() throws IOException{

      try (FileWriter arq = new FileWriter("d:\\locadora2.txt")) {
           PrintWriter gravarArq = new PrintWriter(arq);
	gravarArq.println("=======================================");
        
	gravarArq.println("Marca: "+getMarca());
        
	gravarArq.println("Tipo de carro: "+getTipoCarro());
	
	gravarArq.println("Quantidade de passageiros: "+getPassageiros());
	
	gravarArq.println("Nome da locadora: "+getLocadora());
	
        gravarArq.println("Status: "+getStatus());
    gravarArq.println("=======================================");
}
      
}
}