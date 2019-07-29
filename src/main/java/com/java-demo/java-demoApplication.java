package com.java-demo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class java-demoApplication extends Application<java-demoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new java-demoApplication().run(args);
    }

    @Override
    public String getName() {
        return "java-demo";
    }

    @Override
    public void initialize(final Bootstrap<java-demoConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final java-demoConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
