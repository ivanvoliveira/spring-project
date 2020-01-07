package com.ivanv.cursomc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ivanv.cursomc.domain.Cliente;
import com.ivanv.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

	@Transactional(readOnly = true)
	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);
}
