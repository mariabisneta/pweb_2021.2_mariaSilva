package br.com.maria.diabeteShop.diabeteShop_maria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maria.diabeteShop.diabeteShop_maria.model.pedidos;

@Repository
public interface pedidosRepository extends JpaRepository<pedidos, Long> {
    
}