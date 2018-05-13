package ofedorova;

import ofedorova.domain.Person;
import ofedorova.dto.PersonDTO;
import ofedorova.mappers.PersonMapper;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(1l);
        personDTO.setName("Olga");
        personDTO.setLastNames(Arrays.asList("Alexandrovna", "Fedorova"));
        personDTO.setCity("Saint Petersburg");
        personDTO.setPostalCode("190013");
        personDTO.setStreetAddress("Podolskaya");

        PersonMapper personMapper = new PersonMapper();
        Person person = personMapper.map(personDTO);
        System.out.println(person);
        System.out.println(personMapper.map(person));
    }

}
