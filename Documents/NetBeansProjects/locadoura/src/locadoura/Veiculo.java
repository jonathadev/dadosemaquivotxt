/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoura;

/**
 *
 * @author ADM
 */
public class Veiculo {
    
    private String placa;
    //tipo veiculo? moto carro?
    
private String marca_Veiculo;
private String tipo_Veiculo;  
private String quantidade_Passageiros; 
private String nome_Locadora;
private String status_Locacao; 

//private boolean preferencial;

	public String getMarca(){

		return marca_Veiculo;
	}
	public void setMarca(String marca_Carro){

		this.marca_Veiculo = marca_Carro;
	}

	public String getTipoCarro(){

		return tipo_Veiculo;
	}
	
	public void setTipoCarro(String tipo_Carro){
		
		this.tipo_Veiculo= tipo_Carro;

	}

	public String getPassageiros(){

		return quantidade_Passageiros;
	}
	
	public void setPassageiros(String quantidade_Passageiros){
		
		this.quantidade_Passageiros = quantidade_Passageiros;

	}

	public String getLocadora(){

		return nome_Locadora;
	}
	
	public void setLocadora(String nome_Locadora){
		
		this.nome_Locadora = nome_Locadora;

	}
        
        
                public String getStatus(){

		return status_Locacao;
	}
	
	public void setStatus(String status_Locacao){
		
		this.status_Locacao = status_Locacao;

	}
	
	public void listarVeiculo(){

	System.out.println("=======================================");
	
	System.out.println("Marca: "+getMarca());
	
	System.out.println("Tipo de carro: "+getTipoCarro());
	
	System.out.println("Quantidade de passageiros: "+getPassageiros());
	
	System.out.println("Nome da locadora: "+getLocadora());
        
        System.out.println("Nome da locadora: "+getLocadora());
	
         System.out.println("Status: "+getStatus());
    System.out.println("=======================================");



}
    public void setPlaca(String p){placa = p;}
    
    public String getPlaca () {return placa;}
    
    
    
}
