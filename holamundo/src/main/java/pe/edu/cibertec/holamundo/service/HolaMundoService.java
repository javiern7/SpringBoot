package pe.edu.cibertec.holamundo.service;

import org.springframework.stereotype.Service;

@Service
public class HolaMundoService {
    public void saludar(){
        System.out.println("Saludando desde el Service!");
    }
}
