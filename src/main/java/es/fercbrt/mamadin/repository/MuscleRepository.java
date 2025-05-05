package es.fercbrt.mamadin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import es.fercbrt.mamadin.model.entity.MuscleEntity;

@Repository
public interface MuscleRepository extends JpaRepository<MuscleEntity, Long>, JpaSpecificationExecutor<MuscleEntity> {
    
}
