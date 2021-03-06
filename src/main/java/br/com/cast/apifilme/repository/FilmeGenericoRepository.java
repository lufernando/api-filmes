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

		jpql.append("FROM ").append(FilmeGenerico.class.getName()).append(" fg ").append(" WHERE ")
				.append(" UPPER(fg.titulo) LIKE :titulo ");

		Query query = entityManager.createQuery(jpql.toString());

		query.setParameter("titulo", "%" + titulo.toUpperCase() + "%");

		return query.getResultList();
	}

	@Transactional
	public void inserir(FilmeGenerico filmeGenerico) {
		entityManager.persist(filmeGenerico);
	}
	

	public FilmeGenerico buscaPorId(String id) {
		return entityManager.find(FilmeGenerico.class, id);
	}

	@Transactional
	public FilmeGenerico alterar(FilmeGenerico filmeGenerico) {
		return entityManager.merge(filmeGenerico);
	}

	@SuppressWarnings("unchecked")
	public List<FilmeGenerico> buscarFilmeInicial() {

		StringBuilder jpql = new StringBuilder();

		jpql.append("FROM ").append(FilmeGenerico.class.getName()).append(" fg ");

		Query query = entityManager.createQuery(jpql.toString());

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<FilmeGenerico> buscarFilmePorId(String id) {

		StringBuilder jpql = new StringBuilder();

		jpql.append("FROM ").append(FilmeGenerico.class.getName()).append(" WHERE id = (:id)");

		Query query = entityManager.createQuery(jpql.toString());

		query.setParameter("id", id);

		return query.getResultList();
	}
}
