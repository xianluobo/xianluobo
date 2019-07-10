package com.idleturnip.app.usermanager.config;

import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import com.idleturnip.app.usermanager.resources.UserRootResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(UserRootResource.class);
        register(FastJsonProvider.class);
    }
}