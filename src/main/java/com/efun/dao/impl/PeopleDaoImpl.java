package com.efun.dao.impl;

import com.efun.dao.PeopleDao;
import com.efun.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("peopleDao")
public class PeopleDaoImpl implements PeopleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;



    public People getById(Integer id) {
        String sql = "SELECT * FROM people WHERE id = ?";

        Map<String, Object> map = jdbcTemplate.queryForMap(sql, new Object[]{id});
        return People.toObject(map);
    }

    public List<People> findAll() {
        return null;
    }

    public Integer save(People entity) {
        return null;
    }
}
