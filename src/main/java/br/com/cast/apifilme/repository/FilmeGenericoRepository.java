package br.com.cast.apifilme.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.cast.apifilme.entity.FilmeGenerico;

public class FilmeGenericoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<FilmeGenerico> buscarFilme(String titulo) {
		
		StringBuilder jpql = new StringBuilder();
		
		jpql.append("FROM ")
			.append(FilmeGenerico.class.getName())
			.append(" WHERE titulo = (:titulo)");
		
		Query query = entityManager.createQuery(jpql.toString());
		
		query.setParameter("titulo", titulo);
		
		return query.getResultList();
	}
	
	@Transactional
	public void inserir(FilmeGenerico filmeGenerico) {
		entityManager.persist(filmeGenerico);
	}
	
}
