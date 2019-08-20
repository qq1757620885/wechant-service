package com.imooc.service.impl;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.service.UserService;
import com.imooc.utils.IdWorker;
import com.imooc.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;

    @Autowired
    IdWorker idWorker;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean queryByUsername(String username) {
        Users record = new Users();
        record.setUsername(username);
        Users result = usersMapper.selectOne(record);
        return result == null ? false : true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Users addUser(Users users) {
        Users dto = new Users();
        dto.setId(idWorker.nextId()+"");
        dto.setUsername(users.getUsername());
        dto.setNickname(users.getUsername());
        dto.setPassword(MD5Utils.toMD5(users.getPassword()));
        dto.setReceiveLikeCount(0);
        dto.setFansCount(0);
        dto.setFollowCount(0);
        usersMapper.insertSelective(dto);
        dto.setPassword("");
        return dto;
    }

    @Override
    public Users queryUserlogin(String username, String password) {
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        criteria.andEqualTo("password",MD5Utils.toMD5(password));
        Users result = usersMapper.selectOneByExample(example);
        if(result!=null) {
            result.setPassword("");
        }
        return result;
    }


}
