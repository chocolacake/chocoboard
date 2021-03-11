package com.chocolacate.chocoboard.dao;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@Sql("/sql/database_init.sql")
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseDaoTest {

    
}
