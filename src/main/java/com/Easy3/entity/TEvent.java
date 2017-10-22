/**
 *
 */
package com.Easy3.entity;

import java.sql.Timestamp;

/**
 * @author sekikuchi
 *
 */
public class TEvent {

	public static final String TABLE = "T_EVENT";
	/**
	 *
	 */
	public String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventPersonnel() {
		return eventPersonnel;
	}
	public void setEventPersonnel(String eventPersonnel) {
		this.eventPersonnel = eventPersonnel;
	}
	public String getEventDatetime() {
		return eventDatetime;
	}
	public void setEventDatetime(String eventDatetime) {
		this.eventDatetime = eventDatetime;
	}
	public String getEventPlace() {
		return eventPlace;
	}
	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}
	public String getEventStatus() {
		return eventStatus;
	}
	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}
	public String getEventSummary() {
		return eventSummary;
	}
	public void setEventSummary(String eventSummary) {
		this.eventSummary = eventSummary;
	}
	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	public static final String userId_COLUMN = "user_id";
	/**
	 *
	 */
	public String eventId;
	public static final String eventId_COLUMN = "event_id";
	/**
	 *
	 */
	public String eventName;
	public static final String eventName_COLUMN = "event_name";
	/**
	 *
	 */
	public String eventPersonnel;
	public static final String eventPersonnel_COLUMN = "event_personnel";
	/**
	 *
	 */
	public String eventDatetime;
	public static final String eventDatetime_COLUMN = "event_datetime";
	/**
	 *
	 */
	public String eventPlace;
	public static final String eventPlace_COLUMN = "event_place";
	/**
	 *
	 */
	public String eventStatus;
	public static final String eventStatus_COLUMN = "event_status";
	/**
	 *
	 */
	public String eventSummary;
	public static final String eventSummary_COLUMN = "event_summary";
	/**
	 *
	 */
	public String deleteFlg;
	public static final String deleteFlg_COLUMN = "delete_flg";
	/**
	 *
	 */
	public String createUser;
	public static final String createUser_COLUMN = "create_user";
	/**
	 *
	 */
	public Timestamp createDate;
	public static final String createDate_COLUMN = "create_date";
	/**
	 *
	 */
	public String updateUser;
	public static final String updateUser_COLUMN = "update_user";
	/**
	 *
	 */
	public Timestamp updateDate;
	public static final String updateDate_COLUMN = "update_date";

}
