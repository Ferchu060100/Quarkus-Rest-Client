package org.acme;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/*Principio S(Una sola responsabilidad)
Se cumple ya que poseemos un Resource para
Manejar el Restful
 */
@ApplicationScoped
@Path("/mis-datos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    private PersonDao personDao = new PersonDao();
    public ExampleResource(){
    }

    @GET
    public Set<Person> hello() {
        return personDao.getAll();
    }
}