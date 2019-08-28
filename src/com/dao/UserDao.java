package com.dao;

public interface UserDao {
	/**
	 * 查询
	 */
	public void select();
	
	/**
	 * 增加
	 * @return
	 */
	public int add();
	
	
	/**
	 * 修改
	 */
	public int update();
}
