package com.mybatis.demo.test;

import com.mybatis.demo.dao.UserMapper;
import com.mybatis.demo.datacontract.request.GetUserListRequest;
import com.mybatis.demo.datacontract.response.GetUserListResponse;
import com.mybatis.demo.model.UserModel;
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
    private UserMapper userMapper;

    @Test
    public void getAllUser() {
        List<UserModel> list = userMapper.getAllUser();
        for (UserModel m : list) {
            System.out.println("------------------------------------");
            System.out.println("->Name:" + m.getName());
            System.out.println("->UserName:" + m.getUserName());
        }
    }

    @Test
    public void getUserList() {
        GetUserListRequest request = new GetUserListRequest();
        request.setUserName("admin");
        List<GetUserListResponse> list = userMapper.getUserList(request);
        for (GetUserListResponse m : list) {
            System.out.println("------------------------------------");
            System.out.println("->Name:" + m.getName());
            System.out.println("->UserName:" + m.getUserName());
            System.out.println("->RoleName:" + m.getRoleName());
        }
    }
}
