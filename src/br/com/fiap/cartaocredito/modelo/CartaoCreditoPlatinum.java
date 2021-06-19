package br.com.fiap.cartaocredito.modelo;

public class CartaoCreditoPlatinum extends CartaoCredito {
	
	private boolean saldoReduzido;

	public boolean isSaldoReduzido() {
		return saldoReduzido;
	}

	public void setSaldoReduzido(boolean saldoReduzido) {
		this.saldoReduzido = saldoReduzido;
	}
	

}
