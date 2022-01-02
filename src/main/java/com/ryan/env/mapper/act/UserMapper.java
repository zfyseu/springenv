package com.ryan.env.mapper.act;

import com.ryan.env.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
//    @Select("select * from user")
//    List<User> getAllUsers();
//
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "username", column = "u"),
//            @Result(property = "address", column = "a")
//    })
//    @Select("select username as u,address as a,id as id from user where id=#{id}")
//    User getUserById(Long id);
//
//    @Select("select * from user where username like concat('%',#{name},'%')")
//    List<User> getUsersByName(String name);
//
//    @Insert({"insert into user(username,address) values(#{username},#{address})"})
//    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Long.class)
//    Integer addUser(User user);
//
//    @Update("update user set username=#{username},address=#{address} where id=#{id}")
//    Integer updateUserById(User user);
//
//    @Delete("delete from user where id=#{id}")
//    Integer deleteUserById(Integer id);


    List<User> getAllUser();

    User getUserById(Long id);

    Integer addUser(User user);

    Integer updateUserById(User user);

    Integer deleteUserById(Long id);
}
