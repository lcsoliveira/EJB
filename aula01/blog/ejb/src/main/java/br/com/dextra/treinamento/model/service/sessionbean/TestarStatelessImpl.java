package br.com.dextra.treinamento.model.service.sessionbean;

import javax.ejb.Stateless;


//ele vai gerar um poll de instâncias 

//Implementamos a interface TestarStatelessLocal

@Stateless

public class TestarStatelessImpl implements TestarStatelessLocal {

	Integer contador = 0;

	@Override
	public Integer adicionar() {
		contador++;
		return contador;
	}

}
