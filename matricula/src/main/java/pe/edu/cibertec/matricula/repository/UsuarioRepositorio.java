package pe.edu.cibertec.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.matricula.entity.UsuarioEntity;

public interface UsuarioRepositorio extends JpaRepository<UsuarioEntity,String> {
    public UsuarioEntity findByUsuarioAndClave(String usuario, String clave);
}
