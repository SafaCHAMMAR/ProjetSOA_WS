/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Vol;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
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
    public Response checkDetails(@FormParam("login") String login, @FormParam("pwd") String pwd) throws URISyntaxException {
       if (metier.existAdmin(login, pwd)) {
            URI uri= UriBuilder.fromPath("http://localhost:8080/TravelAgencyJSPClient/espaceAdmin.jsp").build();
            return Response.seeOther(uri).build();

        } else {
            URI uri = UriBuilder.fromPath("http://localhost:8080/TravelAgencyJSPClient").build();
            return Response.seeOther(uri).build();

        }
        
    }
   @GET
    @Path("/allVoyages")
    public List<Vol> produitsParMC()
     {
         return metier.getAllVol();
     } 

}
