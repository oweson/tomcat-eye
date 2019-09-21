package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmInfo implements Serializable {
    /**多个接口公用的信息*/
    /**
     * 1 影片id
     */
    private String filmId;
    /**
     * 2 影片类型
     */
    private int filmType;
    /**
     * 3 图片地址
     */
    private String imgAddress;
    /**
     * 4 影片名字
     */
    private String filmName;
    /**
     * 5 影片评分
     */
    private String filmScore;
    /**
     * 6 受欢迎的程度，人数
     */
    private int expectNum;
    /**
     * 7 上映的时间
     */
    private String showTime;
    /**
     * 8 数量
     */
    private int boxNum;
    /**
     * 9 分数
     */
    private String score;

}
