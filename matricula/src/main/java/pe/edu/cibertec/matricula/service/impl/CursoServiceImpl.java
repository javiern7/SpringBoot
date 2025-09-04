package pe.edu.cibertec.matricula.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.matricula.entity.CursoEntity;
import pe.edu.cibertec.matricula.repository.CursoRepositorio;
import pe.edu.cibertec.matricula.service.CursoService;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepositorio cursoRepositorio;

    @Override
    public List<CursoEntity> listarTodos() {
        return cursoRepositorio.findAll();
    }
    @Override
    public void insertar(CursoEntity ce) {
        cursoRepositorio.save(ce);
    }
    @Override
    public void eliminar(int codigo) {
        cursoRepositorio.deleteById(codigo);
    }
}
