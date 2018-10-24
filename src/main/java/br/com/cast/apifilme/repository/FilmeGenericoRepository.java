package br.com.cast.apifilme.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.cast.apifilme.entity.FilmeGenerico;

@Repository
public class FilmeGenericoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<FilmeGenerico> buscarFilme(String titulo) {
		
		StringBuilder jpql = new StringBuilder();
		
		jpql.append("SELECT fg FROM ")
			.append(FilmeGenerico.class.getName()).append(" fg ")
			.append(" LEFT JOIN f.filme f ")
			.append(" WHERE 1=1 ")
			.append(" AND UPPER(fg.titulo) LIKE :titulo ");
		
		Query query = entityManager.createQuery(jpql.toString());
		
		query.setParameter("titulo","%" + titulo.toUpperCase() + "%");
		
		List<FilmeGenerico> filmeGenericos = query.getResultList();
		
		return filmeGenericos;
	}
	
	@Transactional
	public void inserir(FilmeGenerico filmeGenerico) {
		entityManager.persist(filmeGenerico);
	}
	
	public FilmeGenerico buscaPorId(String id) {
		return entityManager.find(FilmeGenerico.class, id);
	}
	
	@Transactional
	public void alterar(FilmeGenerico filmeGenerico) {
		entityManager.merge(filmeGenerico);
	}
}
