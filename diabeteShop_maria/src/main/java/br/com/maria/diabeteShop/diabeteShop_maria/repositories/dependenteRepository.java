package br.com.maria.diabeteShop.diabeteShop_maria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.maria.diabeteShop.diabeteShop_maria.model.dependente;

@Repository
public interface dependenteRepository extends JpaRepository<dependente, Long>{
    
}