package Repositories;

import Entities.InventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<InventarioEntity, Integer> {
}
