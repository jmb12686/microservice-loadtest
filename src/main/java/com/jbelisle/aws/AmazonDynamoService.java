package com.jbelisle.aws;

import javax.enterprise.context.Dependent;

@Dependent
public class AmazonDynamoService {
    public AmazonDynamoService() {

    }
    public String getService() {
        return "test";
    }
}
