package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Merchandise;

public interface MerchandiseRepository extends JpaRepository<Merchandise, Long> {
    
}
