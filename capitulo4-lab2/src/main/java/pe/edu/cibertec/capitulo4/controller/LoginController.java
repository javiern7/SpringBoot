package pe.edu.cibertec.capitulo4.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Value("${weellcome.mesage: No se encontro la propiedad}")
    private String mensajeBienvenida;

    @RequestMapping("/")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("validarLogin")
    public ModelAndView validarLogin(HttpServletRequest request){

        ModelAndView respuesta = new ModelAndView();
        String usuario = request.getParameter("txtUser");
        String password = request.getParameter("txtPassword");

        if("lnavarro".equals(usuario) && "12345".equals(password)){
            respuesta.setViewName("bienvenida");
            respuesta.addObject("mensaje",mensajeBienvenida);
        }else{
            respuesta.addObject("errorMsg","Credenciales Invalidas !!!");
            respuesta.setViewName("login");
        }

        return respuesta;
    }
}
