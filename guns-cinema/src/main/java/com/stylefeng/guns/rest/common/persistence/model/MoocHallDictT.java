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
 * 地域信息表
 * </p>
 *
 * @author jiangzh
 * @since 2018-09-15
 */
@TableName("mooc_hall_dict_t")
@Setter
@Getter
@ToString
public class MoocHallDictT extends Model<MoocHallDictT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 显示名称
     */
    @TableField("show_name")
    private String showName;
    /**
     * 3 座位文件存放地址
     */
    @TableField("seat_address")
    private String seatAddress;

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }
}
