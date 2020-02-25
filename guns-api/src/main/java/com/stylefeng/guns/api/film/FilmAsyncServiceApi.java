package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.*;

import java.util.List;

/**
 * 需要同步的接口
 */
public interface FilmAsyncServiceApi {

    /**
     * 1 获取影片描述信息
     */
    FilmDescVO getFilmDesc(String filmId);

    /**
     * 2 获取图片信息
     */
    ImgVO getImgs(String filmId);

    /**
     * 3 获取导演信息
     */
    ActorVO getDectInfo(String filmId);

    /**
     * 4 获取演员信息
     */
    List<ActorVO> getActors(String filmId);

}
