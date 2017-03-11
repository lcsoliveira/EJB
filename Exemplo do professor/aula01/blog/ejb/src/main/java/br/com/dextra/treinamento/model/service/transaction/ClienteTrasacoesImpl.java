package br.com.dextra.treinamento.model.service.transaction;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ClienteTrasacoesImpl implements ClienteTransacoesLocal {
	
	@EJB
	private TestarTrasacoesLocal testarTransacoesLocal;
	
	
	//Aqui não vai entrar nada no banco de dados pois estamos usando a transacao
	//REQUIRED 
	
	@Override
	public void testarRequeried() {
		testarTransacoesLocal.criarPostRequeried("titulo required");
		testarTransacoesLocal.criarPostRequeried(null);
	}

	//Aqui não vai verificar as trasacoes a que estiver correta vai pro  banco de dados pois estamos usando a transacao
	//REQUIRES NEW 
	@Override
	public void testarRequeriesNew() {
		testarTransacoesLocal.criarPostRequeriesNew("titulo requires new");
		testarTransacoesLocal.criarPostRequeriesNew(null);
	}

}
