package com.jflow.sbp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jflow.sbp.domain.User;
import com.jflow.sbp.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class SbpApplicationTests {

	@Autowired
	private DataSource ds;
	
	@Autowired
	private UserMapper mapper;
	
	@Test
	public void testUserMapper() throws Exception {
		User user = mapper.getLoginInfo("user1");
		System.out.println("User>>" + user);
		assertEquals("김일수", user.getUname());
	}
	
	@Ignore @Test
	public void testDataSource() throws Exception{
		System.out.println("DS=" + ds);
		
		try (Connection conn = ds.getConnection()){
			System.out.println("Cooooooon=" + conn);
			assertThat(conn).isInstanceOf(Connection.class);
			
			assertEquals(100, getLong(conn, "select 100"));
			assertTrue(0 < getLong(conn, "select count(*) from User"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private int getLong(Connection conn, String sql) throws SQLException {
		// TODO Auto-generated method stub
		int result = 0;
		ResultSet rs = null;
		try(Statement stmt = conn.createStatement()){
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				result = rs.getInt(1);
				System.out.println(result);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null)
			{
				rs.close();
			}
		}
		return result;
	}

	@Test
	void contextLoads() {
	}

}
