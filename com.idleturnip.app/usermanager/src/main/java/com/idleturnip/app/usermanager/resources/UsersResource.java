package com.idleturnip.app.usermanager.resources;

import com.idleturnip.app.usermanager.commontypes.UserInfo;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: com.idleturnip.app
 * @description:
 * @author: lidong
 * @create: 2019/07/08
 */
@Component
public class UsersResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List <UserInfo> testUser(){
        List <UserInfo>list = new ArrayList <>();
        UserInfo userInfo = new UserInfo();
        userInfo.userName = "zhangsan";
        userInfo.password = "156165456";
        list.add(userInfo);
        return list;
    }
}
