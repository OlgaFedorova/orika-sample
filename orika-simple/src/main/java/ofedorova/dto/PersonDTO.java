package ofedorova.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonDTO {

    private Long id;
    private String name;
    private List<String> lastNames;

    private String streetAddress;
    private String city;
    private String postalCode;
}
