/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.cibertec.capitulo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.capitulo4.entity.CursoEntity;

/**
 *
 * @author Dennys
 */
public interface CursoRepository extends JpaRepository<CursoEntity,Integer>{
    
}
