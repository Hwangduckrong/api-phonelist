package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneListDao {

	@Autowired
	private SqlSession sqlSession;

	// 리스트
	public List<PersonVo> getPersonList() {

		List<PersonVo> personList = sqlSession.selectList("phonelist.selectList");

		return personList;
	}
}
