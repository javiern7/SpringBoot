package pe.edu.cibertec.matricula.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.matricula.entity.UsuarioEntity;
import pe.edu.cibertec.matricula.repository.UsuarioRepositorio;
import pe.edu.cibertec.matricula.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public UsuarioEntity validarLogin(UsuarioEntity usuario) {
        return usuarioRepositorio.findByUsuarioAndClave(usuario.getUsuario(),
                usuario.getClave());
    }
}
