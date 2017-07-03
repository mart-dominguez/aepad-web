/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.isi.aepad.aepad.cliente01.resources;


import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author mdominguez
 */
@Path("/test")
@Stateless
public class FakeService {
    
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/metodo1")
    public Response doAlgo(){
        Client client = ClientBuilder.newClient();   
        WebTarget target = client.target("http://172.18.0.5:8080/aepad-logica/api/rrhh/historial/1000");  
        JsonObject response = target.request(MediaType.APPLICATION_JSON).get(JsonObject.class);   
        return Response.ok(response,MediaType.APPLICATION_JSON).build();
    }
    
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/metodo2")
    public Response doAlgo2(){
        Client client = ClientBuilder.newClient();   
        WebTarget target = client.target("http://172.18.0.5:8080/aepad-logica/api/rrhh/liquidar/1000");  
        JsonObject response = target.request(MediaType.APPLICATION_JSON).get(JsonObject.class);   
        return Response.ok(response,MediaType.APPLICATION_JSON).build();
    }
            
}
