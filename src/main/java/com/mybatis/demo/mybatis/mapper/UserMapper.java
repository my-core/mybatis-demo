package com.mybatis.demo.mybatis.mapper;

import com.mybatis.demo.datacontract.request.GetUserListRequest;
import com.mybatis.demo.datacontract.response.GetUserListResponse;
import com.mybatis.demo.model.UserModel;

import java.util.List;

/**
 * Created by yangliangbin on 2016/9/28.
 */
public interface UserMapper extends BaseMapper {
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
