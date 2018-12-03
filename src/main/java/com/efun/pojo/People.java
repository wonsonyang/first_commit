package com.efun.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class People  {
    private static Integer id;
    private static String username;
    private static String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static People toObject(Map<String, Object> map) {

        People people = new People();
        people.setId((Integer) map.get("id"));
        people.setUsername((String) map.get("username"));
        people.setPassword((String) map.get("password"));


         return people;
    }



}
