package line.bot;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import entity.Bundle;

@Path("/")
public class botTest01 {

	JsonObject jsonObject = new JsonObject();
	
	/**
	 * return Bundle object with a List field
	 * @param searchtype
	 * @return
	 * @throws IOException
	 */
	@Path("/botTest01")
	@GET
	public Response PostFromPath(@QueryParam("searchtype") String searchtype) throws IOException {

		jsonObject.addProperty("testVar01", "value01");

		Bundle bundle = new Bundle();

		return Response.status(200)
				 .type(MediaType.APPLICATION_JSON)
				// .entity(jsonObject.toString())
				.entity(bundle)
				// .header("charser", "utf-8")
				// .header("Access-Control-Allow-Origin", "*")
				// .header("Access-Control-Allow-Methods",
				// "POST, GET, PUT, UPDATE, OPTIONS")
				// .header("Access-Control-Allow-Headers",
				// "Content-Type, Accept, X-Requested-With")
				.build();
	}
	
	/**
	 * return (Object)Bundle object with a List field
	 * @return
	 * @throws IOException
	 */
	@Path("/botTest02")
	@GET
	public Response PostFromPath2() throws IOException {

		Bundle bundle = new Bundle();
		Object obj = (Object)bundle;

		return Response.status(200)
				 .type(MediaType.APPLICATION_JSON)
				// .entity(jsonObject.toString())
				.entity(obj)
				// .header("charser", "utf-8")
				// .header("Access-Control-Allow-Origin", "*")
				// .header("Access-Control-Allow-Methods",
				// "POST, GET, PUT, UPDATE, OPTIONS")
				// .header("Access-Control-Allow-Headers",
				// "Content-Type, Accept, X-Requested-With")
				.build();
	}
	
	/**
	 * return string in json format 
	 * @return
	 * @throws IOException
	 */
	@Path("/botTest03")
	@GET
	public Response PostFromPath3() throws IOException {

		Bundle bundle = new Bundle();
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(bundle);

		return Response.status(200)
				 .type(MediaType.APPLICATION_JSON)
				// .entity(jsonObject.toString())
				.entity(jsonStr)
				// .header("charser", "utf-8")
				// .header("Access-Control-Allow-Origin", "*")
				// .header("Access-Control-Allow-Methods",
				// "POST, GET, PUT, UPDATE, OPTIONS")
				// .header("Access-Control-Allow-Headers",
				// "Content-Type, Accept, X-Requested-With")
				.build();
	}
	
	/**
	 * test ExceptionMapper
	 * @return
	 * @throws MissingException
	 */
	@Path("/botTest04")
	@GET
	public Response PostFromPath4() throws MissingException {
		
		throw new MissingException();
		
	}

}