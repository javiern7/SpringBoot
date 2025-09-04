package pe.edu.cibertec.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.matricula.entity.CursoEntity;

public interface CursoRepositorio extends JpaRepository<CursoEntity, Integer> {
}
