package br.com.fiap.cartaocredito.modelo;

public class Portador {
	
	private long portadorId;
	private String cpfPortador;
	private String nomePortador;
	private String enderecoPortador;	
	private double valorLimite;
		
	public Portador() {
	}
	
	//public Portador(String)
	
	
	public long getPortadorId() {
		return portadorId;
	}
	public void setPortadorId(long portadorId) {
		this.portadorId = portadorId;
	}
	public String getCpfPortador() {
		return cpfPortador;
	}
	public void setCpfPortador(String cpfPortador) {
		this.cpfPortador = cpfPortador;
	}
	public String getNomePortador() {
		return nomePortador;
	}
	public void setNomePortador(String nomePortador) {
		this.nomePortador = nomePortador;
	}
	public String getEnderecoPortador() {
		return enderecoPortador;
	}
	public void setEnderecoPortador(String enderecoPortador) {
		this.enderecoPortador = enderecoPortador;
	}
	public double getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	@Override
	public String toString() {
		return "Portador [portadorId=" + portadorId + ", cpfPortador=" + cpfPortador + ", nomePortador=" + nomePortador
				+ ", enderecoPortador=" + enderecoPortador + ", valorLimite=" + valorLimite + "]";
	}
	
	
	

}
