package pe.edu.cibertec.holamundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import pe.edu.cibertec.holamundo.service.HolaMundoService;

import java.util.Arrays;

@SpringBootApplication
public class HolamundoApplication implements CommandLineRunner {

    @Autowired
    private HolaMundoService holaMundoService;

    public static void main(String[] args) {
		SpringApplication.run(HolamundoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        holaMundoService.saludar();
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Inspeccionando los beans creados por Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
