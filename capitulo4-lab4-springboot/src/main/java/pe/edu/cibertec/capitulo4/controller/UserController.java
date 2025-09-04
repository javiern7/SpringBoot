/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.cibertec.capitulo4.entity.UserEntity;
import pe.edu.cibertec.capitulo4.service.UserService;

/**
 *
 * @author Dennys
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService service;
    
    @RequestMapping("validarLogin")
    public ModelAndView validarLogin(UserEntity usuarioView) {
        ModelAndView respuesta = null;
        
        UserEntity userValidado = service.login(usuarioView);
        if (userValidado == null) {
            respuesta = new ModelAndView("login","errorMsg","Credenciales Invalidas !!!!");
        } else {
            respuesta = new ModelAndView("menu","usuario",userValidado);
            

        }
        return respuesta;
    }

    @RequestMapping("/")
    public String mostrarLogin(){
    
        return "login";
    }
    
}
