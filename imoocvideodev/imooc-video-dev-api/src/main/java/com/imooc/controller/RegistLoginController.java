package com.imooc.controller;

import com.imooc.pojo.Users;
import com.imooc.pojo.vo.UsersVo;
import com.imooc.service.UserService;
import com.imooc.utils.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Api(value = "用户登录注册", tags = {"RegistLoginController"})
public class RegistLoginController extends BasisController{

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户注册", notes = "regist")
    @PutMapping("/regist")
    @ResponseBody
    public IMoocJSONResult regist(@RequestBody Users user) {
        //1.判空
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            return IMoocJSONResult.errorException("用户名和密码不能为空");
        }
        //2.判断用户是否存在
        if (userService.queryByUsername(user.getUsername())) {
            return IMoocJSONResult.errorException("该用户已经存在");
        }
        //3.保存用户
        Users result = userService.addUser(user);

        return IMoocJSONResult.ok(setUserRdisSession(result));
    }

    @ApiOperation(value = "用户登录", notes = "login")
    @PostMapping("/login")
    @ResponseBody
    public IMoocJSONResult login(@RequestBody Users user) {
        //1.判空
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            return IMoocJSONResult.errorException("用户名和密码不能为空");
        }
        //2.判断用户是否存在
        if (userService.queryByUsername(user.getUsername())) {
            //3.校验用户密码是否正确
            Users result = userService.queryUserlogin(user.getUsername(), user.getPassword());
            if (result == null) {
                return IMoocJSONResult.errorException("请确认用户密码是否正确");
            } else {
                return IMoocJSONResult.ok(setUserRdisSession(result));
            }
        } else {
            return IMoocJSONResult.errorException("该用户不存在");
        }
    }

    /**
     * 将usersession存到redis中
     *
     * @param user
     * @return
     */
    public UsersVo setUserRdisSession(Users user){
        //存到redis中
        String unickToken = UUID.randomUUID().toString();
        redisOperator.set(USER_REDIS_SESSION+":"+unickToken, unickToken, 30*60*1000);
        UsersVo vo = new UsersVo();
        vo.setUserToken(unickToken);
        BeanUtils.copyProperties(user,vo);
        return vo;
    }
}
