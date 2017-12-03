package com.jbelisle.microservice.loadtest.rest;

import com.jbelisle.aws.AmazonDynamoService;
import com.jbelisle.utilities.LoadGenerator;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("loadtest-api")
public class LoadTestEndpoint {
    @Inject private AmazonDynamoService dynamoService;
    @Inject private LoadGenerator loadGenerator;

    @GET
    @Path("iterations/{iterations}/requestId/{requestId}/")
    public String doLoad(@PathParam("iterations") int iterations) throws Exception {
        String time = this.loadGenerator.doWork(iterations);
        return "Performed "+iterations+" in "+time;
    }


}
