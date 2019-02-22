package notesAPI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/")


public class Notes {
	
	@GET
	@Path("{num}")
	@Produces(MediaType.TEXT_HTML)
	public String sayNum(@PathParam("num") String num)
	{
		return num;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON() 
	{
		String resource = null;
		return resource;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() 
	{
		String resource = "<h1> Hello there from HTML response</h1>";
		return resource;
	}

}
