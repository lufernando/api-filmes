package br.com.cast.apifilme.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.cast.apifilme.entity.Filme;

@Repository
public class FilmeRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Filme> buscarFilme(String id) {
		
		StringBuilder jpql = new StringBuilder();
		
		jpql.append("FROM ")
			.append(Filme.class.getName())
			.append(" WHERE id = (:id)");
		
		Query query = entityManager.createQuery(jpql.toString());
		
		query.setParameter("id", id);
		
		return query.getResultList();
	}
	
	@Transactional
	public void inserir(Filme filme) {
		entityManager.persist(filme);
	}
	
	public Filme buscaPorId(String id) {
		return entityManager.find(Filme.class, id);
	}
	
}
