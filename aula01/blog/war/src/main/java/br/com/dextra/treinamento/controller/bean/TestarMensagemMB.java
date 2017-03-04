package br.com.dextra.treinamento.controller.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dextra.treinamento.model.service.jms.TesteJMSLocal;

@ManagedBean(name = "testarMensagemMB")
@SessionScoped
public class TestarMensagemMB {

	@EJB
	private TesteJMSLocal testeLocal;
	
	public void enviarMensagem(){
		testeLocal.enviarMensagemQueue();
	}
}
