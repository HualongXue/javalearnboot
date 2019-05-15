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
import cn.huimin.learnboot.services.*;
import cn.huimin.learnboot.dto.UserInfoDTO;


@Controller
public class FirstBootControl{
 Logger log=LoggerFactory.getLogger(this.getClass());

 @Resource(name="UserInfoService")
 private UserInfoService userservice;


 @GetMapping("/firstH")
 public ModelAndView home(){
  ModelAndView mv=new ModelAndView("/index");
  return mv;
 }

 @PostMapping("addUserInfo")
 public ModelAndView AddUserInfo(@RequestParam String uname,@RequestParam String uage)
 {
    userservice.AddUserInfo(uname, uage);
    List<UserInfoDTO> users = userservice.GetUserInfo();
    ModelAndView mv=new ModelAndView("/UserList");
    mv.addObject("users",users);
    return mv;
 }
 
 @PostMapping("deleteUserInfo")
 public ModelAndView DeleteUserInfo(@RequestParam int uid)
 {
    userservice.DeleteUserInfo(uid);
    List<UserInfoDTO> users = userservice.GetUserInfo();
    ModelAndView mv=new ModelAndView("/UserList");
    mv.addObject("users",users);
    return mv;
 }

 @GetMapping("getUserInfo")
 public ModelAndView GetUserInfo()
 {
    List<UserInfoDTO> users = userservice.GetUserInfo();
    ModelAndView mv=new ModelAndView("/UserList");
    mv.addObject("users",users);
    return mv;
 }


}

