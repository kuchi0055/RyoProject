package com.Easy3.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;

import com.Easy3.entity.TEmployeeDatas;

@S2Dao(bean = TEmployeeDatas.class)
public interface TEmployeeDatasDao {

	public static final Class<TEmployeeDatas> BEAN = TEmployeeDatas.class;

	public TEmployeeDatas[] selectAll();

	@Arguments("userId")
	public TEmployeeDatas getSelectTEmployeeDatas(String userId);

//	@Arguments("tEmployeeDatas")
//	public int insert(TEmployeeDatas tEmployeeDatas);
//
//	@Arguments("tEmployeeDatas")
//	public int update(TEmployeeDatas tEmployeeDatas);
//
//	@Arguments("tEmployeeDatas")
//	public int delete(TEmployeeDatas tEmployeeDatas);

}
