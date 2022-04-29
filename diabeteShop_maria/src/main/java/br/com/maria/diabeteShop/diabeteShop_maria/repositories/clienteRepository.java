package br.com.maria.diabeteShop.diabeteShop_maria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.maria.diabeteShop.diabeteShop_maria.model.cliente;

@Repository
public interface clienteRepository extends JpaRepository<cliente, Long>{
    
}