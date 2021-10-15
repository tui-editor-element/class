package org.yunai.online_class.service;

import org.yunai.online_class.model.entity.Video;
import org.yunai.online_class.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}
