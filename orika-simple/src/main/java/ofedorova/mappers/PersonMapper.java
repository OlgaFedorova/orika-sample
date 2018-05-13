package ofedorova.mappers;

import ma.glasnost.orika.BoundMapperFacade;
import ofedorova.domain.Person;
import ofedorova.dto.PersonDTO;

public class PersonMapper extends BaseMapper {

    private final BoundMapperFacade<PersonDTO, Person> boundMapper;

    public PersonMapper() {
        BaseMapper.MAPPER_FACTORY.classMap(PersonDTO.class, Person.class)
                .field("lastNames", "surnames")
                .field("streetAddress", "address.street")
                .field("city", "address.city")
                .field("postalCode", "address.zipCode")
                .byDefault()
                .register();
        this.boundMapper = BaseMapper.MAPPER_FACTORY.getMapperFacade(PersonDTO.class, Person.class);
    }

    public Person map(PersonDTO personDTO){
        return this.boundMapper.map(personDTO);
    }

    public PersonDTO map(Person person){
        return this.boundMapper.mapReverse(person);
    }
}
