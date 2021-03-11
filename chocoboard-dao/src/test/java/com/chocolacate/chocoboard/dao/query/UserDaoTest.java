package com.chocolacate.chocoboard.dao.query;

import com.chocolacate.chocoboard.dao.BaseDaoTest;
import com.chocolacate.chocoboard.dao.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetUserByUserName() {
        User wenjun = userDao.getUserByUserName("wenjun");

    }
}