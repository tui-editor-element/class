package org.yunai.online_class.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yunai.online_class.model.entity.Video;
import org.yunai.online_class.model.entity.VideoBanner;
import org.yunai.online_class.service.VideoService;
import org.yunai.online_class.utils.JsonData;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {


    @Autowired
    private VideoService videoService;


    /**
     * 轮播图列表
     * @return
     */
    @GetMapping("list_banner")
    public JsonData indexBanner(){


        List<VideoBanner> bannerList =  videoService.listBanner();


        //int i = 1/0;

        return JsonData.buildSuccess(bannerList);

    }


    /**
     * 视频列表
     * @return
     */
    @RequestMapping("list")
    public JsonData listVideo(){

        List<Video> videoList = videoService.listVideo();
        return JsonData.buildSuccess(videoList);
    }


    /**
     * 查询视频详情，包含章，集信息
     * @param videoId
     * @return
     */
    @GetMapping("find_detail_by_id")
    public JsonData findDetailById(@RequestParam(value = "video_id",required = true)int videoId){
        Video video = videoService.findDetailById(videoId);

        return JsonData.buildSuccess(video);

    }
    
}
