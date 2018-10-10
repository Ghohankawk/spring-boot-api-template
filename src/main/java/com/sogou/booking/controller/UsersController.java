package com.sogou.booking.controller;

import com.sogou.booking.model.Users;
import com.sogou.booking.pojo.CommonResult;
import com.sogou.booking.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/getAllUser")
    public CommonResult getAllUser() {
        CommonResult<List<Users>> result = new CommonResult<>();
        result.setData(usersService.findAll());
        return result;
    }

    @RequestMapping("/insertOneUser")
    public CommonResult insertOneUser(HttpServletRequest request) {
        CommonResult result = new CommonResult();
        usersService.insert(request);
        return result;
    }

    @RequestMapping("/updateOneUser")
    public CommonResult updateOneUser(HttpServletRequest request) {
        CommonResult result = new CommonResult();
        usersService.update(request);
        return result;
    }

    @RequestMapping("/deleteOneUser")
    public CommonResult deleteOneUser(HttpServletRequest request) {
        CommonResult result = new CommonResult();
        usersService.delete(request);
        return result;
    }
}
