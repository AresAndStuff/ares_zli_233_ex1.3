package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/add")
public class addition {

    @GET
    @Path("/{num1}/{num2}")
    public String addNumbers(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        int result = num1 + num2;
        return "The sum is: " + result;
    }
}
