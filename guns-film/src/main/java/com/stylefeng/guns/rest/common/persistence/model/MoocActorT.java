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
 * 演员表
 * </p>
 *
 * @author jiangzh
 * @since 2018-08-26
 */
@TableName("mooc_actor_t")
@Setter
@Getter
@ToString
public class MoocActorT extends Model<MoocActorT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 演员名称
     */
    @TableField("actor_name")
    private String actorName;
    /**
     * 3 演员图片位置
     */
    @TableField("actor_img")
    private String actorImg;


    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

}
