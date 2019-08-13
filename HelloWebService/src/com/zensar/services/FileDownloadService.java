package com.zensar.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/files")
public class FileDownloadService {
	
		private static final String FILE_PATH="D:/nikki.txt";
		
		@GET
		@Path("/txt")
		@Produces("text/html")
		
		public Response getFile(){
			File file = new File(FILE_PATH);
			ResponseBuilder responseBuilder = Response.ok(file);
			responseBuilder.header("Content-Disposition", "attachment;filename=hello_file.txt");
			return responseBuilder.build();
			
		}	
			@GET
			@Path("/images")
			@Produces("image/png")
			
			public Response getImage(){
				File file = new File("D:/Varsha B/image.png");
				ResponseBuilder responseBuilder = Response.ok(file);
				responseBuilder.header("Content-Disposition", "attachment;filename=your_image.png");
				return responseBuilder.build();	
			
		}
}
