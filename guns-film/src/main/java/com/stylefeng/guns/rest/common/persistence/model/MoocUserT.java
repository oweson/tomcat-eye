package com.stylefeng.guns.rest.common.persistence.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jiangzh
 * @since 2018-08-02
 */
@TableName("mooc_user_t")
@Setter
@Getter
@ToString
public class MoocUserT extends Model<MoocUserT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 用户账号
     */
    @TableField("user_name")
    private String userName;
    /**
     * 3 用户密码
     */
    @TableField("user_pwd")
    private String userPwd;
    /**
     * 4 用户昵称
     */
    @TableField("nick_name")
    private String nickName;
    /**
     * 5 用户性别 0-男，1-女
     */
    @TableField("user_sex")
    private Integer userSex;
    /**
     * 6 出生日期
     */
    private String birthday;
    /**
     * 7 用户邮箱
     */
    private String email;
    /**
     * 8 用户手机号
     */
    @TableField("user_phone")
    private String userPhone;
    /**
     * 9 用户住址
     */
    private String address;
    /**
     * 10 头像URL
     */
    @TableField("head_url")
    private String headUrl;
    /**
     * 11 生活状态
     */
    @TableField("life_state")
    private Integer lifeState;
    /**
     * 12 生活状态
     */
    @TableField("biography")
    private String biography;
    /**
     * 13 创建时间
     */
    @TableField("begin_time")
    private Date beginTime;
    /**
     * 14 修改时间
     */
    @TableField("update_time")
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }


}
