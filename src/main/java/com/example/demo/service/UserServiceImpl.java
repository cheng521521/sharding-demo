package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cpx
 * @Description
 * @date 2021/7/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public Integer add(User user) {
        return userMapper.insert(user);
    }
    @Override
    public List<User> selectAll() {
        List<User> list=userMapper.selectList(null);
        return list;
    }
}
