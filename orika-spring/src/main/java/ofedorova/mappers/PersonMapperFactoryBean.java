package ofedorova.mappers;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import ofedorova.domain.Address;
import ofedorova.domain.Person;
import ofedorova.dto.PersonDTO;
import org.springframework.stereotype.Component;

@Component
public class PersonMapperFactoryBean extends CustomMapper<PersonDTO, Person> {

    @Override
    public void mapAtoB(PersonDTO personDTO, Person person, MappingContext context) {
        person.setId(personDTO.getId());
        person.setName(personDTO.getName());
        person.setSurnames(personDTO.getLastNames());
        Address address = new Address();
        address.setStreet(personDTO.getStreetAddress());
        address.setCity(personDTO.getCity());
        address.setZipCode(personDTO.getPostalCode());
        person.setAddress(address);
    }

    @Override
    public void mapBtoA(Person person, PersonDTO personDTO, MappingContext context) {
        personDTO.setId(person.getId());
        personDTO.setName(person.getName());
        personDTO.setLastNames(person.getSurnames());
        Address address = person.getAddress();
        if (address != null) {
            personDTO.setStreetAddress(address.getStreet());
            personDTO.setCity(address.getCity());
            personDTO.setPostalCode(address.getZipCode());
        }
    }
}
