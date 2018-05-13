package ofedorova.service;

import ofedorova.domain.Person;
import ofedorova.dto.PersonDTO;

public interface PersonService {

    Person obtainPerson();
    PersonDTO convertToDto(Person person);
}
