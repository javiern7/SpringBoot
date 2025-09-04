package pe.edu.cibertec.capitulo4.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public void bienvenida(){
        System.out.println("Bienvenido a SpringBoot");
    }
}
