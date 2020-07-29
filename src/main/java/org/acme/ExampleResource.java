package org.acme;
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/mis-datos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {
    private Set<Person> persons= Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    public ExampleResource(){
        persons.add(new Person(0,"Fernando","Arevalo",20,new Address(0,"Lima","Avenida Central",1131)));
        persons.add(new Person(1,"Juan","Perez",20,new Address(1,"Arequipa","Avenida Brasil",940)));
        for (Person person: persons) {
            System.out.println(person);
        }
    }

    @GET
    public Set<Person> hello() {
        return persons;
    }
}