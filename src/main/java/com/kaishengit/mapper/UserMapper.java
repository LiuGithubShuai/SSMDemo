package com.kaishengit.mapper;

import com.kaishengit.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/20.
 */

public interface UserMapper {

    void save(User user);
    void update(User user);
    void del(Integer id);
    User findById(Integer id);

    List<User> findAll();

}
