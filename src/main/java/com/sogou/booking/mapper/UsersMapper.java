package com.sogou.booking.mapper;

import com.sogou.booking.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> findAll();

    @Insert("insert into users(name,salary) values(#{name},#{salary})")
    void insert(Users users);

    @Update("update users set name = #{name}, salary = #{salary} where id = #{id}")
    void update(Users users);

    @Delete("delete from users where id = #{id}")
    void delete(Integer id);
}
