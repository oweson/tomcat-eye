package com.stylefeng.guns.api.user.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 注册的时候需要的字段；网关和user之间传输，必须添加序列化的标识
 */
@Data
public class UserModel implements Serializable {

    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;

}
