package es.fercbrt.mamadin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import es.fercbrt.mamadin.model.entity.WorkoutEntity;

@Repository
public interface WorkoutRepository extends JpaRepository<WorkoutEntity, Long>, JpaSpecificationExecutor<WorkoutEntity> {
    
}
