package br.com.fiap.cartaocredito.teste;

import br.com.fiap.cartaocredito.action.PagarFatura;
import br.com.fiap.cartaocredito.modelo.CartaoCreditoBlack;
import br.com.fiap.cartaocredito.modelo.Portador;

public class PagamentoFaturaTeste {
	
	public static void main(String[] args) {
		
		CartaoCreditoBlack cartaoCredito = new CartaoCreditoBlack();
		
		cartaoCredito.setNumeroCartao("5063 0000 0000 9999");
		cartaoCredito.setBandeira("Master");
		cartaoCredito.setCvv(123);
		cartaoCredito.setValorSaldo(2390.99);
		cartaoCredito.setSegmento("Black");
		cartaoCredito.setEmissor("Pagseguro");
		
		Portador portador = new Portador();
		
		portador.setCpfPortador("191");
		portador.setNomePortador("Leticia Kojima");
		portador.setValorLimite(10000.00);
		
		Portador titular = new Portador();
		
		titular.setCpfPortador("991");
		titular.setNomePortador("Leticia M Kojima");
		titular.setValorLimite(100000.00);
		
		cartaoCredito.setPortador(portador);
		cartaoCredito.setTitular(titular);
		
		//System.out.println(cartaoCredito);
		
		//Operação para pagar a fatura
		PagarFatura pagarFatura = new PagarFatura();
		
		pagarFatura.efetuarPagamento(cartaoCredito, 2390.99);
		
		
	}

}
