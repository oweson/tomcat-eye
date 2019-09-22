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
 * 放映场次表
 * </p>
 *
 * @author jiangzh
 * @since 2018-09-15
 */
@TableName("mooc_field_t")
@Setter
@Getter
@ToString
public class MoocFieldT extends Model<MoocFieldT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 影院编号
     */
    @TableField("cinema_id")
    private Integer cinemaId;
    /**
     * 3 电影编号
     */
    @TableField("film_id")
    private Integer filmId;
    /**
     * 4 开始时间
     */
    @TableField("begin_time")
    private String beginTime;
    /**
     * 4 结束时间
     */
    @TableField("end_time")
    private String endTime;
    /**
     * 5 放映厅类型编号
     */
    @TableField("hall_id")
    private Integer hallId;
    /**
     * 6 放映厅名称
     */
    @TableField("hall_name")
    private String hallName;
    /**
     * 7 票价
     */
    private Integer price;

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

}
