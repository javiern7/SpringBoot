package pe.edu.cibertec.matricula.service;

import pe.edu.cibertec.matricula.entity.CursoEntity;

import java.util.List;

public interface CursoService {

    public List<CursoEntity> listarTodos();
    public void insertar(CursoEntity ce);
    public void eliminar(int codigo);
}
