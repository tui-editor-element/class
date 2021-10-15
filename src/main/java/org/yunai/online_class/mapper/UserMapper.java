package org.yunai.online_class.mapper;
import org.apache.ibatis.annotations.Param;
import org.yunai.online_class.model.entity.User;

public interface UserMapper {

    int save(User user);

    User findByPhone(@Param("phone") String phone);
    
    User findByPhoneAndPwd(@Param("phone") String phone, @Param("pwd") String pwd);


    User findByUserId(Integer userId);
}
