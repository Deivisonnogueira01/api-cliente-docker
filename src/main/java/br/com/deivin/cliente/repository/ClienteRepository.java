package br.com.deivin.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.deivin.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
