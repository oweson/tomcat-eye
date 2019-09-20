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
 * 影片与演员映射表
 * </p>
 *
 * @author jiangzh
 * @since 2018-09-08
 */
@TableName("mooc_film_actor_t")
@Setter
@Getter
@ToString
public class MoocFilmActorT extends Model<MoocFilmActorT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 影片编号,对应mooc_film_t
     */
    @TableField("film_id")
    private Integer filmId;
    /**
     * 3 演员编号,对应mooc_actor_t
     */
    @TableField("actor_id")
    private Integer actorId;
    /**
     * 4 角色名称
     */
    @TableField("role_name")
    private String roleName;

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

}
