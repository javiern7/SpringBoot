package pe.edu.cibertec.capitulo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import pe.edu.cibertec.capitulo4.service.SaludoService;

import java.util.Arrays;

@SpringBootApplication
public class Capitulo4Lab1Application implements CommandLineRunner {

    @Autowired
    private SaludoService saludoService;

	public static void main(String[] args) {
		SpringApplication.run(Capitulo4Lab1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        saludoService.bienvenida();
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            System.out.println("Inspeccionando los Beans creados automaticamente");
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName : beanNames){
                System.out.println(beanName);
            }
        };

    }
}
