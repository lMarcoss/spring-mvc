package com.test.TestSQLServer.dao;

import com.test.jdbcTemplate.Jdbc;
import org.apache.log4j.Logger;

public class TestDaoImpl extends Jdbc implements TestJdbDao {

    private static final Logger LOG = Logger.getLogger(TestDaoImpl.class);

    @Override
    public void test() {

        try {
            int i = this.jdbcTemplate.queryForObject("Select 1", Integer.class);
            LOG.info(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
