package org.yunai.online_class.service;

import org.yunai.online_class.model.entity.VideoOrder;

import java.util.List;

public interface VideoOrderService {


    int save(int userId, int videoId);

    List<VideoOrder> listOrderByUserId(Integer userId);
}
