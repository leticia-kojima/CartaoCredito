package br.com.fiap.cartaocredito.businessrules;

import br.com.fiap.cartaocredito.modelo.CartaoCredito;

public class PagamentoFaturaRegras {
	
	public boolean validarPagamento(CartaoCredito cartaoCredito, double valorPagamento) {
		boolean ehValido = true;
		
		//verificar o valor do pagamento > que o saldo
		
		if (valorPagamento > cartaoCredito.getValorSaldo()) {
			ehValido = false;
		}
		
		//verificar o valor do pagamento < 10% do saldo
		//pagamento minimo
		if (valorPagamento < (cartaoCredito.getValorSaldo() *0.1)) {
			ehValido = false;
		}
		
		return ehValido;
		
	}

}
