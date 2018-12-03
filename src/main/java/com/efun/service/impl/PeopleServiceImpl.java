package com.efun.service.impl;

import com.efun.dao.PeopleDao;
import com.efun.pojo.People;
import com.efun.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleDao peopleDao;

    public People getById(Integer id) {
        return peopleDao.getById(id);
    }
}