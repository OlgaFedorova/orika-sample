package ofedorova.domain;

import lombok.Data;

import java.util.List;

@Data
public class Person {

    private Long id;
    private String name;
    private List<String> surnames;
    private Address address;

}
