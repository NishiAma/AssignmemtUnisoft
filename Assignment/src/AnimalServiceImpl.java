import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/animal")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class AnimalServiceImpl implements AnimalService{

    private static Map<Integer,Animal> animals = new HashMap<Integer,Animal>();

    @Override
    @GET
    @Path("/getAll")
    public Animal[] getAllPersons() {
        Set<Integer> ids = animals.keySet();
        Animal[] p = new Animal[ids.size()];
        int i=0;
        for(Integer id : ids){
            p[i] = animals.get(id);
            i++;
        }
        return p;
    }
}
