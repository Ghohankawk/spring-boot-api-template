package com.sogou.booking.service;

import com.sogou.booking.mapper.UsersMapper;
import com.sogou.booking.model.Users;
import com.sogou.booking.utils.ParamUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户服务
 *
 * @author hankun
 * @date 2018/8/1
 */
@Service
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public List<Users> findAll() {
        return usersMapper.findAll();
    }

    public void insert(HttpServletRequest request) {
        Users user = new Users();
        String name = ParamUtils.getString(request.getParameter("name"), "");
        Long salary = ParamUtils.getLong(request.getParameter("salary"), 0);
        user.setName(name);
        user.setSalary(salary);
        usersMapper.insert(user);
    }

    public void update(HttpServletRequest request) {
        Users user = new Users();
        Integer id = ParamUtils.getInt(request.getParameter("id"), 0);
        String name = ParamUtils.getString(request.getParameter("name"), "");
        Long salary = ParamUtils.getLong(request.getParameter("salary"), 0);
        user.setId(id);
        user.setName(name);
        user.setSalary(salary);
        usersMapper.update(user);
    }

    public void delete(HttpServletRequest request) {
        Integer id = ParamUtils.getInt(request.getParameter("id"), 0);
        usersMapper.delete(id);
    }
}
