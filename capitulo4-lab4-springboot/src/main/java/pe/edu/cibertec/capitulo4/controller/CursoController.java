/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.cibertec.capitulo4.entity.CursoEntity;
import pe.edu.cibertec.capitulo4.service.CursoService;

/**
 *
 * @author Dennys
 */
@Controller
public class CursoController {
    
    @Autowired
    private CursoService service;
    
    @RequestMapping("cursoListar")
    public ModelAndView cursoListar(){
        return new ModelAndView("curso","lista",service.listar());
    } 
    
    @RequestMapping("cursoGrabar")
    public ModelAndView cursoGrabar(CursoEntity curso){
        service.insertar(curso);
        return new ModelAndView("redirect:cursoListar");
    }
    
    @RequestMapping("cursoEliminar")
    public ModelAndView cursoEliminar(@RequestParam("codigo")int codigo){
        service.eliminar(codigo);
        return new ModelAndView("redirect:cursoListar");
    }
    
    
}
