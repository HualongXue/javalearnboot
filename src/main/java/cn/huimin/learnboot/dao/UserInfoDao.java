package cn.huimin.learnboot.dao;

import java.util.*;
import cn.huimin.learnboot.dto.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public interface UserInfoDao{

    public List<UserInfoDTO> getInfo();
    public void addInfo(@Param("username")String username,@Param("userage")int userage);
    public void updateInfo(int id);
    public void delInfo(@Param("id")int id);

}