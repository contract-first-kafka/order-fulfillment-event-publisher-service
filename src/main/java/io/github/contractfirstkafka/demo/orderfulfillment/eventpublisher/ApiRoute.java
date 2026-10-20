package io.github.contractfirstkafka.demo.orderfulfillment.eventpublisher;

import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

@ApplicationScoped
public class ApiRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        restConfiguration().bindingMode(RestBindingMode.json)
                .bindingPackageScan("io.github.contractfirstkafka.demo.orderfulfillment.eventpublisher");
    }
}
