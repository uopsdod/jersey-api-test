package line.bot;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Path("/botTest01")
public class botTest01 {

 JsonObject jsonObject = new JsonObject();
 
 @GET
 public Response PostFromPath(
   @QueryParam("searchtype") String searchtype
   ) throws IOException {
  
  jsonObject.addProperty("testVar01", "value01");
  
  
  
  return Response
    .status(200)
    .entity(jsonObject.toString())
    .header("charser", "utf-8")
    .header("Access-Control-Allow-Origin", "*")
    .header("Access-Control-Allow-Methods",
      "POST, GET, PUT, UPDATE, OPTIONS")
    .header("Access-Control-Allow-Headers",
      "Content-Type, Accept, X-Requested-With").build();
 }

}