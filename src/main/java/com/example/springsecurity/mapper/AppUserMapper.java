package com.example.springsecurity.mapper;

import com.example.springsecurity.model.AppUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppUserMapper implements RowMapper<AppUser> {

        public static final String BASE_SQL //
                = "Select u.User_Id, u.User_Name, u.Encryted_Password From App_User u ";

    @Override
    public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long userId = rs.getLong("User_Id");
        String userName = rs.getString("User_Name");
        String encrytedPassword = rs.getString("Encryted_Password");

        return new AppUser(userId, userName, encrytedPassword);
    }
}
