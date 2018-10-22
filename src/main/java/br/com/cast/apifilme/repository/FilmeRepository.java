package br.com.cast.apifilme.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.cast.apifilme.entity.Filme;

@Repository
public class FilmeRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Filme> buscarFilmes(String titulo) {
		
		StringBuilder jpql = new StringBuilder();
		
		jpql.append("FROM ")
			.append(Filme.class.getName())
			.append("WHERE titulo = (:titulo)");
		
		Query query = entityManager.createQuery(jpql.toString());
		
		query.setParameter("titulo", titulo);
		
		return query.getResultList();
	}
	
	public void inserir(Filme filme) {
		entityManager.persist(filme);
	}
	
}
