/**
 *
 */
package com.Easy3.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;

import com.Easy3.entity.TEvent;

/**
 * @author sekikuchi
 *
 */
public interface TEventDao {

	public static final Class<TEvent> BEAN = TEvent.class;
	public static final String selectById_ARGS = "user_id, event_id";

	// 全てのイベント一覧の取得
	// arg : asc   : 昇順でSQLを発行。
	//       desc  : 降順でSQLを発行。
	@Arguments("option")
	public List<TEvent> getAllEvent(String option);
//	/**
//	 * @return
//	 */
//	public TEvent[] selectAll();
//
//	/**
//	 * @param userId
//	 * @param eventId
//	 * @return
//	 */
//	public TEvent selectById(String userId, String eventId);
//
//	/**
//	 * @param tEvent
//	 * @return
//	 */
//	public int insert(TEvent tEvent);
//
//	/**
//	 * @param tEvent
//	 * @return
//	 */
//	public int update(TEvent tEvent);
//
//	/**
//	 * @param tEvent
//	 * @return
//	 */
//	public int delete(TEvent tEvent);

}
