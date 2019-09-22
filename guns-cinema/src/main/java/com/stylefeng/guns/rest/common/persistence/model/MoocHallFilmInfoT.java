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
 * 影厅电影信息表
 * </p>
 *
 * @author jiangzh
 * @since 2018-09-15
 */
@TableName("mooc_hall_film_info_t")
@Setter
@Getter
@ToString
public class MoocHallFilmInfoT extends Model<MoocHallFilmInfoT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 电影编号
     */
    @TableField("film_id")
    private Integer filmId;
    /**
     * 3 电影名称
     */
    @TableField("film_name")
    private String filmName;
    /**
     * 4 电影时长
     */
    @TableField("film_length")
    private String filmLength;
    /**
     * 5 电影类型
     */
    @TableField("film_cats")
    private String filmCats;
    /**
     * 6 电影语言
     */
    @TableField("film_language")
    private String filmLanguage;
    /**
     * 7 演员列表
     */
    private String actors;
    /**
     * 8 图片地址
     */
    @TableField("img_address")
    private String imgAddress;

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }
}
