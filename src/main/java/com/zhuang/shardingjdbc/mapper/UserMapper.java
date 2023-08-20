package com.zhuang.shardingjdbc.mapper;

import com.zhuang.shardingjdbc.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
