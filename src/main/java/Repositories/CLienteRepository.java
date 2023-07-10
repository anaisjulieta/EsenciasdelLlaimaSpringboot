package Repositories;

import Entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CLienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
