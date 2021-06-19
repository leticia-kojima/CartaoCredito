package br.com.fiap.cartaocredito.action;

import br.com.fiap.cartaocredito.modelo.CartaoCreditoBlack;

public class PagarFaturaBlack extends PagarFatura {
	
	public void liberarSalaVip(CartaoCreditoBlack cartaoCredito) {
		System.out.println("**********************************************");
		System.out.println("Sala Vip liberado com sucesso para o Cartão: " +
							cartaoCredito.getNumeroCartao());
		System.out.println("**********************************************");
	}

}
