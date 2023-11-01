package Controllers;

import Services.IGroupService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@WebServlet
@Path("/groups")
public class GroupController
{
    private final IGroupService groupService;

    @Inject
    public GroupController(IGroupService groupService)
    {
        this.groupService = groupService;
    }
    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getGroups()
    {
        return Response.status(Response.Status.OK)
                .entity(groupService.getAll())
                .build();
    }

    @GET
    @Path("/ok")
    @Produces({MediaType.APPLICATION_JSON})
    public Response ok()
    {
        return Response.status(Response.Status.OK)
                .build();
    }
}
