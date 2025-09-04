/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.cibertec.capitulo4.service;

import java.util.List;
import pe.edu.cibertec.capitulo4.entity.CursoEntity;

/**
 *
 * @author Dennys
 */
public interface CursoService {
    
    public List<CursoEntity> listar();
    
    public void insertar(CursoEntity curso);
    public void eliminar(int codigo);
    
    
}
