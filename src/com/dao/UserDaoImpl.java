package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

	@Override
	public void select() {
		//连接对象
		Connection conn = null;
		//执行对象
		PreparedStatement pstmt = null;
		//货车
		ResultSet rs = null;
		
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

}
