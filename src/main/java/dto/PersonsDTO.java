/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustav
 */
public class PersonsDTO {
    private List<PersonDTO> personsDTO = new ArrayList();

    public PersonsDTO(List<Person> persons) {
        persons.forEach((p) -> { personsDTO.add(new PersonDTO(p));
        });
    }

    public List<PersonDTO> getAll() {
        return personsDTO;
    }
}
