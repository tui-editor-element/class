package org.yunai.online_class.mapper;

import org.apache.ibatis.annotations.Param;
import org.yunai.online_class.model.entity.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {

    /**
     * 查询用户是否购买过此商品
     * @param userId
     * @param vidoeId
     * @param state
     * @return
     */
    VideoOrder findByUserIdAndVideoIdAndState(@Param("user_id") int userId, @Param("video_id") int videoId, @Param("state") int state);


    /**
     * 下单
     * @return
     */
    int saveOrder(VideoOrder videoOrder);


    List<VideoOrder> listOrderByUserId(Integer userId);
}
