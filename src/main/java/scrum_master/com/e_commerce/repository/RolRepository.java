package scrum_master.com.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scrum_master.com.e_commerce.entities.RolEntity;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Integer> {
}
