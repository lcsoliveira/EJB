package br.com.dextra.treinamento.model.service.transaction;

import javax.ejb.Local;

@Local
public interface TestarTrasacoesLocal {
	
	void criarPostRequeried(String titulo);
	
	void criarPostRequeriesNew(String titulo);
}
