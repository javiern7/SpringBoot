/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.capitulo4.entity.UserEntity;
import pe.edu.cibertec.capitulo4.repository.UserRepository;
import pe.edu.cibertec.capitulo4.service.UserService;

/**
 *
 * @author Dennys
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repositorio;
    
    
    @Override
    public UserEntity login(UserEntity usuario) {
        
        UserEntity respuesta= repositorio.findByUserAndPassword(usuario.getUser(),
                                                                usuario.getPassword());
        return respuesta;
    }
    
    
    
}
