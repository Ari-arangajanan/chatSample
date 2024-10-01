package com.wonder.chatSample.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wonder.chatSample.mapper.UserMapper;
import com.wonder.chatSample.model.User;
import com.wonder.chatSample.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
