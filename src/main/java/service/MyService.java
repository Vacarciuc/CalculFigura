package service;

import service.calculate.MathOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/geometrie/{figura}/{var1}/{var2}/{var3}/{varChar}")
public class MyService {

    @GET
    public String getMessage(@PathParam("figura") String figure,
                             @PathParam("var1") Integer var1,
                             @PathParam("var2") Integer var2,
                             @PathParam("var3") Integer var3,
                             @PathParam("varChar") char varChar) {
        MathOperation mathOperation=new MathOperation();
        Double x=mathOperation.mathOperationFunction(figure, var1, var2, var3, varChar);
        return x.toString();
    }
}
