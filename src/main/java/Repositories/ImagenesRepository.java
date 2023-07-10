package Repositories;

import Entities.ImagenesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenesRepository extends JpaRepository<ImagenesEntity, Integer> {
}
