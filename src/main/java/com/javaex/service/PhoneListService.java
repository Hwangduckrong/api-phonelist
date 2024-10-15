package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneListDao;
import com.javaex.vo.PersonVo;

@Service
public class PhoneListService {

	@Autowired
	private PhoneListDao phonelistDao;
	

	// 리스트 가져오기
	public List<PersonVo> exeGetPersonList() {

		List<PersonVo> personList = phonelistDao.getPersonList();

		return personList;
	}
	
	
}
