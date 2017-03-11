package br.com.dextra.treinamento.controller.bean;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.dextra.treinamento.model.service.transaction.ClienteTransacoesLocal;


@ManagedBean(name ="testarTrasacoesMB")
@RequestScoped
public class TestarTrasacoesMB {

	@EJB
	private ClienteTransacoesLocal clienteTransacoesLocal;
	
	public void testarRequired(){
		try{
			clienteTransacoesLocal.testarRequeried();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void testarRequiresNew(){
		try{
			clienteTransacoesLocal.testarRequeriesNew();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
}
