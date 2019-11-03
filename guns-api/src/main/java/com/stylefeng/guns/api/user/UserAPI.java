package com.stylefeng.guns.api.user;

import com.stylefeng.guns.api.user.vo.UserInfoModel;
import com.stylefeng.guns.api.user.vo.UserModel;

public interface UserAPI {
    /**
     * 1 登陆
     */
    int login(String username, String password);

    /**
     * 2 userModel:注册的实体类，必要的额字段name和password
     */
    boolean register(UserModel userModel);

    /**
     * 3 校验用户名是否存在
     */
    boolean checkUsername(String username);

    /**
     * 4 获取用户信息根据用户的id
     */
    UserInfoModel getUserInfo(int uuid);

    /**
     * 5 更新用户信息
     */
    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);
    /**just test*/
    Object justTest();

}
