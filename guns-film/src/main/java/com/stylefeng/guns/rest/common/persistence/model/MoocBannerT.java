package com.stylefeng.guns.rest.common.persistence.model;

import com.baomidou.mybatisplus.enums.IdType;
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
 * banner信息表
 * </p>
 *
 * @author jiangzh
 * @since 2018-08-26
 */
@TableName("mooc_banner_t")
@Setter
@Getter
@ToString
public class MoocBannerT extends Model<MoocBannerT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 banner图存放路径
     */
    @TableField("banner_address")
    private String bannerAddress;
    /**
     * 3 banner点击跳转url
     */
    @TableField("banner_url")
    private String bannerUrl;
    /**
     * 4 是否弃用 0-失效,1-失效
     */
    @TableField("is_valid")
    private Integer isValid;

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

}
