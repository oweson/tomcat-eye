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
 * 影片主表
 * </p>
 *
 * @author jiangzh
 * @since 2018-08-26
 */
@TableName("mooc_film_t")
@Setter
@Getter
@ToString
public class MoocFilmT extends Model<MoocFilmT> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 2 影片名称
     */
    @TableField("film_name")
    private String filmName;
    /**
     * 3 片源类型: 0-2D,1-3D,2-3DIMAX,4-无
     */
    @TableField("film_type")
    private Integer filmType;
    /**
     * 4 影片主图地址
     */
    @TableField("img_address")
    private String imgAddress;
    /**
     * 5 影片评分
     */
    @TableField("film_score")
    private String filmScore;
    /**
     * 6 影片预售数量
     */
    @TableField("film_preSaleNum")
    private Integer filmPresalenum;
    /**
     * 7 影片票房：每日更新，以万为单位
     */
    @TableField("film_box_office")
    private Integer filmBoxOffice;
    /**
     * 8 影片片源，参照片源字典表
     */
    @TableField("film_source")
    private String filmSource;
    /**
     * 9 影片分类，参照分类表,多个分类以,分割
     */
    @TableField("film_cats")
    private String filmCats;
    /**
     * 10 影片区域，参照区域表
     */
    @TableField("film_area")
    private Integer filmArea;
    /**
     * 11 影片上映年代，参照年代表
     */
    @TableField("film_date")
    private Integer filmDate;
    /**
     * 12 影片上映时间
     */
    @TableField("film_time")
    private Date filmTime;
    /**
     * 13 影片状态,1-正在热映，2-即将上映，3-经典影片
     */
    @TableField("film_status")
    private Integer filmStatus;


    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

}
