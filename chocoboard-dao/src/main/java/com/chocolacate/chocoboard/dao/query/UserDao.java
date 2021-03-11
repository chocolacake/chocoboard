package com.chocolacate.chocoboard.dao.query;

import com.chocolacate.chocoboard.dao.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface UserDao {

    @Select("SELECT * FROM user")
    @Results(id = "userResultMap", value = {
            @Result(id = true, column = "id", property = "id", jdbcType = JdbcType.BIGINT),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "is_delete", property = "isDelete", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "last_modify_time", property = "lastModifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    User getUserByUserName(String userName);


}
