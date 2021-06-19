package br.com.fiap.cartaocredito.modelo;

import java.util.Arrays;
import java.util.Date;

public abstract class CartaoCredito {
	
	private long cartaoCreditoId;
	private String numeroCartao;
	private String bandeira;
	
	private Portador portador;
	
	private Portador titular;
	
	private Date validade;
	private int cvv;
	private String emissor;
	private int diaVencimentoFatura;
	private double valorLimite; //ver depois
	private double valorSaldo;
	private String segmento; //Black, Infinite
	private double valorAnuidade;
	private String tecnologia[]; //tarja, chip, contactless
	
	public CartaoCredito() {
		System.out.println("Inicializando a classe pai cartão de crédito");
	}
	
	public CartaoCredito(String numeroCartao, Portador portador) {
		this.numeroCartao = numeroCartao;
		this.portador = portador;
	}
	
	
	public long getCartaoCreditoId() {
		return cartaoCreditoId;
	}
	public void setCartaoCreditoId(long cartaoCreditoId) {
		this.cartaoCreditoId = cartaoCreditoId;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public Portador getPortador() {
		return portador;
	}
	public void setPortador(Portador portador) {
		this.portador = portador;
	}
	public Portador getTitular() {
		return titular;
	}
	public void setTitular(Portador titular) {
		this.titular = titular;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public int getDiaVencimentoFatura() {
		return diaVencimentoFatura;
	}
	public void setDiaVencimentoFatura(int diaVencimentoFatura) {
		this.diaVencimentoFatura = diaVencimentoFatura;
	}
	public double getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	public double getValorSaldo() {
		return valorSaldo;
	}
	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public double getValorAnuidade() {
		return valorAnuidade;
	}
	public void setValorAnuidade(double valorAnuidade) {
		this.valorAnuidade = valorAnuidade;
	}
	public String[] getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String[] tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	@Override
	public String toString() {
		return "CartaoCredito [cartaoCreditoId=" + cartaoCreditoId + ", numeroCartao=" + numeroCartao + ", bandeira="
				+ bandeira + ", portador=" + portador + ", titular=" + titular + ", validade=" + validade + ", cvv="
				+ cvv + ", emissor=" + emissor + ", diaVencimentoFatura=" + diaVencimentoFatura + ", valorLimite="
				+ valorLimite + ", valorSaldo=" + valorSaldo + ", segmento=" + segmento + ", valorAnuidade="
				+ valorAnuidade + ", tecnologia=" + Arrays.toString(tecnologia) + "]";
	}
	
	

}
