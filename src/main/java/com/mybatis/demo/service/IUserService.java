package com.mybatis.demo.service;

import com.mybatis.demo.datacontract.request.GetUserListRequest;
import com.mybatis.demo.datacontract.response.GetUserListResponse;
import com.mybatis.demo.model.UserModel;

import java.util.List;

/**
 * Created by yangliangbin on 2016/9/29.
 */
public interface IUserService extends  IBaseService {
    /**
     * @return
     */
    List<UserModel> getAllUser();

    /**
     * @param request
     * @return
     */
    List<GetUserListResponse> getUserList(GetUserListRequest request);
}
