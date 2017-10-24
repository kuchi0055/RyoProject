package com.Easy3.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.Easy3.dao.TEmployeeDatasDao;
import com.Easy3.dao.TEventDao;
import com.Easy3.entity.TEmployeeDatas;

public class TEmployeeDatasService {

	@Resource
	protected TEmployeeDatasDao tEmployeeDatasDao;

	public TEmployeeDatas[] findAll(){

		TEmployeeDatas[] tEmployeeDatasList = tEmployeeDatasDao.selectAll();

		return tEmployeeDatasList;
	}
}
