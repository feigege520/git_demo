package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

	@Override
	public void select() {
		//���Ӷ���
		Connection conn = null;
		//ִ�ж���
		PreparedStatement pstmt = null;
		//����
		ResultSet rs = null;
		
	}

	@Override
	public int add() {
		//���Ӷ���
		Connection conn = null;
		//ִ�ж���
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
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
