package line.bot;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
 
@Provider
public class MissingExceptionMapper implements ExceptionMapper<MissingException>
{
 
    @Override
    public Response toResponse(MissingException exception)
    {	
    	System.out.println("ExceptionMapper executed");
        return Response
        		.status(400)
        		.type(MediaType.APPLICATION_JSON)
        		.entity(exception.getErrorInfo())
        		.build();
    }
}