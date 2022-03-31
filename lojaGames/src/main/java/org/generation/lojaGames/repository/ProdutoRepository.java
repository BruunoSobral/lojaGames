package org.generation.lojaGames.repository;

import java.util.List;
import java.math.BigDecimal;
import org.generation.lojaGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produto> findAllByValor(BigDecimal valor);
	public List<Produto> findAllByCodigo(int codigo);

}
