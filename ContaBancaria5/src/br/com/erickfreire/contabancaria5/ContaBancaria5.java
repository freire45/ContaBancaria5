package br.com.erickfreire.contabancaria5;

/**
 * Melhore a conta bancaria 4 para não repetir códigos
 * @author Erick Freire
 * @version 1 - Criado em 02/04/2021 as 16:18
 */

public class ContaBancaria5 {
	
	private String nome;
	private double saldo;
	
	public ContaBancaria5(String nome, double saldo) {
		this.nome = nome;
		
		if(saldo > 0.0)
			this.saldo = saldo;
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
	
	public String getNome() {
		return nome;
	}
	

    public void deposito(double deposito) {
    	if(deposito > 0.0)
    		saldo = saldo + deposito;
    }
    
    public double getSaldo() {
    	return saldo;
    }
    
    
    public void debito(double deb) {
    	if(deb > saldo)
    		System.out.println("Débito não aceito, saldo insufiente na conta!");
    	
    	if(deb <= saldo)
    		saldo = saldo - deb;
    	
    }
    
    public void mostraConta() {
    	System.out.printf("o Saldo de %s é de: %.2f%n", nome, saldo);
    }

}
