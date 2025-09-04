/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo4.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.capitulo4.entity.CursoEntity;
import pe.edu.cibertec.capitulo4.repository.CursoRepository;
import pe.edu.cibertec.capitulo4.service.CursoService;

/**
 *
 * @author Dennys
 */
@Service
public class CursoServiceimpl implements CursoService {
    
    @Autowired
    private CursoRepository repository;
    
    @Override
    public List<CursoEntity> listar() {
        
        return repository.findAll();
    }
    
    @Override
    public void insertar(CursoEntity curso) {
        
        repository.save(curso);
    }
    
    @Override
    public void eliminar(int codigo) {
        
        repository.deleteById(codigo);
    }
    
}
