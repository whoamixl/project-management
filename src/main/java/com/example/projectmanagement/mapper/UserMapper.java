package com.example.projectmanagement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.projectmanagement.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：WHOAMI
 * @date ：Created in 2022/1/17 13:50
 * @description：
 * @modified By：
 * @version: $
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
