/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.net.URI;
import java.net.URISyntaxException;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import sessions.ITravelAgency;

/**
 *
 * @author safa
 */
@Singleton
@Path("/adminWS")
@Produces(MediaType.APPLICATION_JSON)
public class AdminWSJRS {
    
    @EJB
    private ITravelAgency metier;
    
    @POST
    @Path("/check")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response checkDetails(@FormParam("login") String login,@FormParam("pwd") String pwd ) throws URISyntaxException  {

       // URI uri = new URI("http://localhost:8080/Travel_Agency/adminWS/success");
        //URI uri2= new URI("http://localhost:8080/Travel_Agency/adminWS/failure");
//System.out.println("\n\n ------------login="+name+"   pwd="+pass+"------------\n\n");
       // if(name.equals("admin") && pass.equals("pass"))
    if (metier.existAdmin(login, pwd))
            {//System.out.println("\n test\n");
            URI uri3 = UriBuilder.fromPath("http://localhost:8080/TravelAgencyJSPClient/espaceAdmin.jsp").build();
    return Response.seeOther(uri3).build();
            
            }
       else
        {
            URI uri3 = UriBuilder.fromPath("http://localhost:8080/TravelAgencyJSPClient").build();
    return Response.seeOther(uri3).build();
            //Response.seeOther(uri2);
            //return Response.status(200).entity("user logon failed").build();
            }
   }
     @POST
    @Path("/success")
    public Response successpage()
    {System.out.println("\n succeeeeeeeeeeeeeeees\n");
    return Response.status(200).entity("user successfully login").build();
    }
    @POST
    @Path("/failure")
    public Response failurepage()
    {System.out.println("\n failure \n");
    return Response.status(200).entity("user login failed").build();
    }   
    
}
