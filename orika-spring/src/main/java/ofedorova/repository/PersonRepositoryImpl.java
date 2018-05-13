package ofedorova.repository;

import ofedorova.dto.PersonDTO;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Random;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private Random random = new Random();

    @Override
    public PersonDTO find() {
        return this.createPersonDTO(random.nextLong());
    }

    private PersonDTO createPersonDTO(long l) {
        PersonDTO dto = new PersonDTO();
        dto.setId(l);
        dto.setName("Olga");
        dto.setLastNames(Arrays.asList("Alexandrovna", "Fedorova"));
        dto.setCity("Saint Petersburg");
        dto.setPostalCode("190013");
        dto.setStreetAddress("Podolskaya");
        return dto;
    }
}
