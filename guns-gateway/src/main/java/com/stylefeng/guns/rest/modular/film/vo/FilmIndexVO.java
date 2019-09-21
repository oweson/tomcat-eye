package com.stylefeng.guns.rest.modular.film.vo;

import com.stylefeng.guns.api.film.vo.BannerVO;
import com.stylefeng.guns.api.film.vo.FilmInfo;
import com.stylefeng.guns.api.film.vo.FilmVO;
import lombok.Data;

import java.util.List;

@Data
public class FilmIndexVO {
    // map表示维护行差；
    /**
     * 1 首页的横幅
     */

    private List<BannerVO> banners;
    /**
     * 2 热映影片
     */
    private FilmVO hotFilms;
    /**
     * 3 即将上映的影片
     */
    private FilmVO soonFilms;
    /**
     * 4 票房排行榜
     */
    private List<FilmInfo> boxRanking;
    /**
     * 5 人气排行榜
     */
    private List<FilmInfo> expectRanking;
    /**
     * 6 top100的影片
     */
    private List<FilmInfo> top100;

}
