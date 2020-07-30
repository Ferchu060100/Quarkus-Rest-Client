package org.acme;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

public class PersonDao implements IPersonDao {
    private Set<Person> persons= Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    public PersonDao() {
        persons.add(new Person(0, "Fernando", "Arevalo", 20, new Address(0, "Lima", "Avenida Central", 1131)));
        persons.add(new Person(1, "Juan", "Perez", 20, new Address(1, "Arequipa", "Avenida Brasil", 940)));
    }

    @Override
    public Set<Person> getAll() {
        return persons;
    }
}
