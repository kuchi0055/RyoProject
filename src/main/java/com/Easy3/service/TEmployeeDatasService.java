package com.Easy3.service;

import javax.annotation.Resource;

import com.Easy3.dao.TEmployeeDatasDao;
import com.Easy3.entity.TEmployeeDatas;

public class TEmployeeDatasService {

	@Resource
	protected TEmployeeDatasDao tEmployeeDatasDao;

	public TEmployeeDatas[] findAll(){

		TEmployeeDatas[] tEmployeeDatasList = tEmployeeDatasDao.selectAll();

		return tEmployeeDatasList;
	}
}
