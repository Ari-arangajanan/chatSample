package com.wonder.chatSample.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wonder.chatSample.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
