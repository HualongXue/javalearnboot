package cn.huimin.learnboot.controls;

import org.slf4j.*;
import javax.annotation.Resource;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;
import cn.huimin.learnboot.dao.UserInfoDao;
import cn.huimin.learnboot.dto.*;
import cn.huimin.learnboot.services.*;


@RestController
public class TestBootControl{
 Logger log=LoggerFactory.getLogger(this.getClass());

@Resource(name="UserDao")
private UserInfoDao userdao;

@Resource(name="UserInfoService")
private UserInfoService userservice;

 @GetMapping("/testF")
 public List<UserInfoDTO> GetUserInfo(@RequestParam String uname,@RequestParam String uage){
    List<UserInfoDTO> lud = userdao.getInfo();
    //HashMap<String,String> hmp = new HashMap();
    //hmp.put("result",lud);
    return lud;
 }

 @PostMapping("/AddUserInfo")
 public void AddUserInfo(@RequestParam String uname,@RequestParam String uage){
    log.info("--新增用户信息请求参数{}",uname+uage);
    userservice.AddUserInfo(uname, uage);
 }
 

}
