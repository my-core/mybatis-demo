package com.mybatis.demo.test;

import com.mybatis.demo.datacontract.request.GetUserListRequest;
import com.mybatis.demo.datacontract.response.GetUserListResponse;
import com.mybatis.demo.model.UserModel;
import com.mybatis.demo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangliangbin on 2016/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring-mybatis.xml"})
public class MyBatisTest {

    @Resource
    private IUserService userService;

    @Test
    public void getAllUser() {
        List<UserModel> list = userService.getAllUser();
        for (UserModel item : list) {
            System.out.println("------------------------------------");
            System.out.println("->Name:" + item.getName());
            System.out.println("->UserName:" + item.getUserName());
        }
    }

    @Test
    public void getUserList() {
        GetUserListRequest request = new GetUserListRequest();
        request.setUserName("admin");
        List<GetUserListResponse> list = userService.getUserList(request);
        for (GetUserListResponse item : list) {
            System.out.println("------------------------------------");
            System.out.println("->Name:" + item.getName());
            System.out.println("->UserName:" + item.getUserName());
            System.out.println("->RoleName:" + item.getRoleName());
        }
    }

    @Test
    public void getUserModel() {
        UserModel model = userService.getModel(UserModel.class, "UserName", "admin");
        System.out.println("------------------------------------");
        System.out.println("->Name:" + model.getName());
        System.out.println("->UserName:" + model.getUserName());
    }
}
