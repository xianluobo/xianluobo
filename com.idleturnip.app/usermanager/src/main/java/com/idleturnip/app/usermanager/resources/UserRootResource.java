package com.idleturnip.app.usermanager.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

/**
 * @program: com.idleturnip.app
 * @description:
 * @author: lidong
 * @create: 2019/07/08
 */
@Component
@Path("/userroot")
public class UserRootResource {

    @Path("/users")
    public Class <UsersResource> usersResource() {
        return UsersResource.class;
    }

}
