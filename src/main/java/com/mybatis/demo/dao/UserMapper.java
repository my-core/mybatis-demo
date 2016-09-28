package com.mybatis.demo.dao;

import com.mybatis.demo.datacontract.request.GetUserListRequest;
import com.mybatis.demo.datacontract.response.GetUserListResponse;
import com.mybatis.demo.model.UserModel;

import java.util.List;

/**
 * Created by yangliangbin on 2016/9/28.
 */
public interface UserMapper {
    /**
     *
     * @return
     */
    List<UserModel> getAllUser();

    /**
     *
     * @param request
     * @return
     */
    List<GetUserListResponse> getUserList(GetUserListRequest request);
}
