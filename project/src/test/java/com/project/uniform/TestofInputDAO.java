package com.project.uniform;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.uniform.dao.BoardIDAO;
import com.project.uniform.dao.InputIDAO;
import com.project.uniform.dao.SaleInfoIDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class TestofInputDAO {

	@Inject
	private SqlSession sqlSession;
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		InputIDAO dao = sqlSession.getMapper(InputIDAO.class);
		dao.insert(1, 20, 10000);
	}

}
