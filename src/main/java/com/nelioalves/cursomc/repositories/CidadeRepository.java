package com.nelioalves.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	
	@Query("SELECT obj FROM Cidade obj WHERE obj.estado.id = :estadoId ORDER BY obj.nome")
	public List<Cidade> findCidades(Integer estado_id);
}
