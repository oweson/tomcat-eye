package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CinemaQueryVO implements Serializable {
    /**
     * 查询条件传输对象；
     * 默认值，99就是全部的
     */
    private Integer brandId = 99;
    private Integer districtId = 99;
    private Integer hallType = 99;
    private Integer pageSize = 12;
    private Integer nowPage = 1;

}
