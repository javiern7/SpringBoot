/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.cibertec.capitulo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.capitulo4.entity.UserEntity;

/**
 *
 * @author Dennys
 */
public interface UserRepository extends JpaRepository<UserEntity, String>{
    
    public UserEntity findByUserAndPassword(String user, String password);
}
