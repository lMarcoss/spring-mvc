package com.test.TestSQLServer.service;

import com.test.TestSQLServer.dao.TestJdbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestJdbDao _testJdbDao;

    @Override
    public void test() {
        _testJdbDao.test();
    }
}
