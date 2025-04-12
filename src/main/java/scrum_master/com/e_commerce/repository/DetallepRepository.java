package scrum_master.com.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scrum_master.com.e_commerce.entities.DetallepEntity;

@Repository
public interface DetallepRepository extends JpaRepository<DetallepEntity, Integer> {
}
