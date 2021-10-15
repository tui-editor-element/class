package org.yunai.online_class.mapper;

import org.apache.ibatis.annotations.Param;
import org.yunai.online_class.model.entity.Episode;

public interface EpisodeMapper {


    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);

}
