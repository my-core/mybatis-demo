package com.mybatis.demo.service;

import com.mybatis.demo.mybatis.mapper.UserMapper;
import com.mybatis.demo.datacontract.request.GetUserListRequest;
import com.mybatis.demo.datacontract.response.GetUserListResponse;
import com.mybatis.demo.model.UserModel;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangliangbin on 2016/9/29.
 */
public class UserService extends BaseService implements IUserService {

    @Resource
    private UserMapper userMapper;

    /**
     *
     * @return
     */
    public List<UserModel> getAllUser() {
        return userMapper.getAllUser();
    }

    /**
     *
     * @param request
     * @return
     */
    public List<GetUserListResponse> getUserList(GetUserListRequest request) {
        return userMapper.getUserList(request);
    }
}
