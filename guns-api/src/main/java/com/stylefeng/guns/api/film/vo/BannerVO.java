package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BannerVO implements Serializable {

    /**
     * 1 主键编号
     */
    private String bannerId;
    /**
     * 2 banner图存放路径
     */
    private String bannerAddress;
    /**
     * 3 banner点击跳转url
     */
    private String bannerUrl;


}
