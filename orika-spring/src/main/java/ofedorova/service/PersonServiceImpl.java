package ofedorova.service;

import ma.glasnost.orika.MapperFacade;
import ofedorova.domain.Person;
import ofedorova.dto.PersonDTO;
import ofedorova.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private MapperFacade mapper;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, MapperFacade mapper) {
        this.personRepository = personRepository;
        this.mapper = mapper;
    }

    @Override
    public Person obtainPerson() {
        return this.mapper.map(this.personRepository.find(), Person.class);
    }

    @Override
    public PersonDTO convertToDto(Person person) {
        return this.mapper.map(person, PersonDTO.class);
    }
}
