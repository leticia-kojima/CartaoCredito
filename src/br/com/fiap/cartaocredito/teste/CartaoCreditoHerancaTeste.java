package br.com.fiap.cartaocredito.teste;

//import br.com.fiap.cartaocredito.modelo.CartaoCredito;
import br.com.fiap.cartaocredito.modelo.CartaoCreditoBlack;

public class CartaoCreditoHerancaTeste {

	public static void main(String[] args) {
		
		//CartaoCredito cartaoCredito = new CartaoCredito();
		
		CartaoCreditoBlack cartaoCreditoBlack = new CartaoCreditoBlack();
		
		//System.out.println(cartaoCredito);
		
		cartaoCreditoBlack.setNumeroCartao("123");
		cartaoCreditoBlack.setCvv(999);
		cartaoCreditoBlack.setSalaVip("1");
		
		System.out.println(cartaoCreditoBlack);

	}

}
