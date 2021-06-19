package br.com.fiap.cartaocredito.teste;

import br.com.fiap.cartaocredito.modelo.Cliente;
import br.com.fiap.cartaocredito.modelo.GerenteRelacionamento;
import br.com.fiap.cartaocredito.modelo.Portador;

public class PessoaHerancaTeste {

	public static void main(String[] args) {
		
		GerenteRelacionamento gerenteRelacionamento = new GerenteRelacionamento();
		
		gerenteRelacionamento.setDocumentoIdentificacao("1111");
		
		Portador portador = new Portador();
		
		Cliente cliente = new Cliente();

	}

}
