package pe.edu.cibertec.matricula.controller;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.cibertec.matricula.entity.CursoEntity;
import pe.edu.cibertec.matricula.service.CursoService;

@Controller
public class CursoController {

    Logger logger = LoggerFactory.getLogger(CursoController.class);

    @Autowired
    private CursoService cursoService;

    @RequestMapping("cursoListar")
    public ModelAndView cursoMostrar() {
        logger.debug("Listando los cursos");
        ModelAndView mv = new ModelAndView("curso", "lista", cursoService.listarTodos());
        mv.addObject("cursoBean", new CursoEntity());
        return mv;
    }

    @RequestMapping("cursoGrabar")
    public ModelAndView cursoGrabar(@Valid @ModelAttribute("cursoBean") CursoEntity ce,
                                    BindingResult valida) {
        logger.info("Antes de insertar un curso");
        ModelAndView mv = new ModelAndView("curso");
        if (valida.hasErrors()) {
            mv.addObject("lista", cursoService.listarTodos());
            mv.addObject("cursoBean", ce);
        }
        else
        {
            cursoService.insertar(ce);
            mv.addObject("lista", cursoService.listarTodos());
            mv.addObject("cursoBean", new CursoEntity());
            logger.warn("Grabo el curso! " + ce.getIdCurso());
        }
        return mv;
    }

    @RequestMapping("cursoEliminar")
    public ModelAndView cursoEliminar(@RequestParam("codigo") int codigo) {
        logger.info("CursoController: Antes de eliminar curso");
        cursoService.eliminar(codigo);
        logger.warn("Después de eliminar un curso " + codigo);
        return new ModelAndView("redirect:cursoListar");
    }
}
