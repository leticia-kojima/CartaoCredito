package br.com.fiap.cartaocredito.action;

import br.com.fiap.cartaocredito.businessrules.PagamentoFaturaRegras;
import br.com.fiap.cartaocredito.modelo.CartaoCredito;

public class PagarFatura {
	
	public void efetuarPagamento(CartaoCredito cartaoCredito, 
								 double valorPagamento) {
		
		PagamentoFaturaRegras regras = new PagamentoFaturaRegras();
		boolean ehPossivelPagar = regras.validarPagamento(cartaoCredito, valorPagamento);
		
		if (ehPossivelPagar) {
		
			// debitar conta do portador
			System.out.println("Debitando conta do portador");
		
			// creditar conta do banco
			System.out.println("Creditando conta do banco");
		
			// liberar o limite do cartão
			System.out.println("Liberando o limite");
		
			// iniciar novo ciclo de compra
			System.out.println("Liberando novo ciclo de compra");
		
			System.out.println("*************************************");
			System.out.println("Cliente: " + cartaoCredito.getPortador().getNomePortador());
			System.out.println("N. Cartão: " + cartaoCredito.getNumeroCartao());
			System.out.println("Valor Pago: R$ " + valorPagamento);
			System.out.println(" ");
			System.out.println("Autenticacao: " + cartaoCredito);
			System.out.println("*************************************");
		
		}
		
		else {
			
			System.out.println("**************************************");
			System.out.println("Pagamento não possível de ser efetuado");
			System.out.println("**************************************");
			
		}
		
		
	}

}
