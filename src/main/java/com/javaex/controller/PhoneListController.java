package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhoneListService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
public class PhoneListController {

	@Autowired
	private PhoneListService phonelistService;
	
	@GetMapping("/api/persons")
	public JsonResult getList() {

		List<PersonVo> personList = phonelistService.exeGetPersonList();

		return JsonResult.success(personList);
	}

}
