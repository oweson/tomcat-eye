package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.*;

import java.util.List;

public interface FilmServiceApi {

    /**
     * 1 获取banners
     */
    List<BannerVO> getBanners();

    /**
     * 2  获取热映影片
     * 限制几张，
     */
    FilmVO getHotFilms(boolean isLimit, int nums, int nowPage, int sortId, int sourceId, int yearId, int catId);

    /**
     * 3 获取即将上映影片[受欢迎程度做排序]
     */
    FilmVO getSoonFilms(boolean isLimit, int nums, int nowPage, int sortId, int sourceId, int yearId, int catId);

    /**
     * 4 获取经典影片
     */
    FilmVO getClassicFilms(int nums, int nowPage, int sortId, int sourceId, int yearId, int catId);
    /*
        在正式项目中，推荐大家使用的做法
     */
//    // 获取热映影片
//    FilmVO getHotFilms(int nowPage,int nums ...);

    /**
     * 5 获取票房排行榜
     */
    List<FilmInfo> getBoxRanking();

    /**
     * 6 获取人气排行榜
     */
    List<FilmInfo> getExpectRanking();

    /**
     * 7 获取Top100
     */
    List<FilmInfo> getTop();

    // ==== 获取影片条件接口

    /**
     * 8 分类条件
     */
    List<CatVO> getCats();

    /**
     * 9  片源条件
     */
    List<SourceVO> getSources();

    /**
     * 10 获取年代条件
     */
    List<YearVO> getYears();

    /**
     * 11 根据影片ID或者名称获取影片信息
     */
    FilmDetailVO getFilmDetail(int searchType, String searchParam);

    /**
     * 12获取影片描述信息
     */
    FilmDescVO getFilmDesc(String filmId);

    /**
     * 13获取图片信息
     */
    ImgVO getImgs(String filmId);

    /**
     * 14 获取导演信息
     */
    ActorVO getDectInfo(String filmId);

    /**
     * 15 获取演员信息
     */
    List<ActorVO> getActors(String filmId);

}
