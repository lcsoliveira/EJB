package br.com.dextra.treinamento.model.service.jpa;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.dextra.treinamento.model.domain.Post;

@Stateless
public class PostServiceImpl implements PostServiceLocal {

	@PersistenceContext(unitName = "blog-pu")
	private EntityManager em;
	
	//o merge ele vai fazer um papel de incluir ou alterar 
	//Ou seja se não existir ele cria um novo 
	//Se ja existir ele atualiza 
	
	public void salvar(Post p) {
		em.merge(p);	
	}

	@SuppressWarnings("unchecked")
	public List<Post> listar() {
		
		String sql = "FROM Post";
		Query query = em.createQuery(sql);
		
		return query.getResultList();
	}

	@Override
	public void excluir(Long id) {
		Post post = buscarPorId(id);
		em.remove(post);
		
	}
	
	//passamos o Post que é a nossa classe Banco
	//e o id que desejamos buscar  
	@Override
	public Post buscarPorId(Long id) {
		
		return em.find(Post.class, id);
	}

}
