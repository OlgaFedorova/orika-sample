package ofedorova;

import ofedorova.domain.Person;
import ofedorova.service.PersonService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        PersonService personService = context.getBean(PersonService.class);
        Person person = personService.obtainPerson();
        System.out.println(person);
        System.out.println(personService.convertToDto(person));
        context.close();
    }

}
