package cn.huimin.learnboot.services;

import org.slf4j.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import cn.huimin.learnboot.dao.UserInfoDao;
import cn.huimin.learnboot.dto.*;

@Service("UserInfoService")
public class UserInfoService{

    Logger log=LoggerFactory.getLogger(this.getClass());

    @Resource(name="UserDao")
    private UserInfoDao userdao;

    //新增用户信息
    public void AddUserInfo(String uname,String uage)
    {
        if(uname!=null && uage!=null)
        {
            int age = Integer.parseInt(uage);
            userdao.addInfo(uname, age);
        }
    }

    //查询用户列表
    public List<UserInfoDTO> GetUserInfo()
    {
        return userdao.getInfo();
    }

    //删除用户
    public void DeleteUserInfo(int uid)
    {
        if(uid>0)
        {
            userdao.delInfo(uid);
        }
    }

}
