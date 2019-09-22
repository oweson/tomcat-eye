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
 * 影院信息表
 * </p>
 *
 * @author jiangzh
 * @since 2018-09-15
 */
@TableName("mooc_cinema_t")
@Setter
@Getter
@ToString
public class MoocCinemaT extends Model<MoocCinemaT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 影院名称
     */
    @TableField("cinema_name")
    private String cinemaName;
    /**
     * 3 影院电话
     */
    @TableField("cinema_phone")
    private String cinemaPhone;
    /**
     * 4 品牌编号
     */
    @TableField("brand_id")
    private Integer brandId;
    /**
     * 5 地域编号
     */
    @TableField("area_id")
    private Integer areaId;
    /**
     * 6 包含的影厅类型,以#作为分割
     */
    @TableField("hall_ids")
    private String hallIds;
    /**
     * 7 影院图片地址
     */
    @TableField("img_address")
    private String imgAddress;
    /**
     * 8 影院地址
     */
    @TableField("cinema_address")
    private String cinemaAddress;
    /**
     * 9 最低票价
     */
    @TableField("minimum_price")
    private Integer minimumPrice;

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

}
