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
    @Path("iterations/{iterations}")
    public String doLoad(@PathParam("iterations") int iterations) throws Exception {
        System.out.println("Starting load test with "+iterations);
        String time = this.loadGenerator.doWork(iterations);
        System.out.println("Load test finished in "+time);
        return "Performed "+iterations+" in "+time;
    }


}
