package com.zensar.services;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("/fileUploads")
public class FileUploadService {

	@POST
	@Path("/upload")
	@Produces("text/html")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFile(@FormDataParam("myfile")InputStream uploadStream,@FormDataParam("myfile")FormDataContentDisposition filedetails){
		String fileLocation ="d:/uploads/" + filedetails.getFileName();
		
		//Saving File
		try{
			FileOutputStream fos = new FileOutputStream(new File(fileLocation));
			byte[] b = new byte[1024];
			
		}
	}
}
