package com.zensar.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/zenparam")
public class HelloParam {

	@GET
	@Path("/welcome/{nm}")
	@Produces("text/html")
	public Response getMessage(@PathParam("nm")String name){
		return Response
				.status(200)
				.entity("<p>Hello<b><i> " + name + " </i></b>Welcome to Zensar Hello Service</p>")
				.build();
	}	
		@GET
		@Path("/birthday/{dd}/{mm}/{yyyy}")
		@Produces("text/html")
		public Response getMessage(@PathParam("dd") int date,@PathParam("mm") int month,@PathParam("yyyy") int year ){
			return Response
					.status(200)
					.entity("<p>Your Date of Birth is <b><i> " + date + "/ " + month + "/" + year + "</i></b> Dear</p>")
					.build();
	}
		
}
