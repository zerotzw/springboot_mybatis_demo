package com.example.mybatis.demo;

import com.example.mybatis.demo.dao.ThirdUserAccountMapper;
import com.example.mybatis.demo.entity.ThirdUserAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Autowired
	private ThirdUserAccountMapper thirdUserAccountMapper;

	@Test
	@Transactional(propagation = Propagation.NESTED)
	public void contextLoads() throws  SQLException {

		ThirdUserAccount thirdUserAccount = new ThirdUserAccount();
		thirdUserAccount.setAccountId("33333333");
		thirdUserAccount.setCreateTime(new Date());
		thirdUserAccount.setMobile("ddddddddd");
		thirdUserAccount.setIsDel((byte)0);
		thirdUserAccountMapper.insert(thirdUserAccount);

		throw  new SQLException();
//		thirdUserAccountMapper.?
	}

}
