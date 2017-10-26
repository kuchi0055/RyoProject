package com.Easy3.form;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.apache.struts.action.ActionMessages;

import com.Easy3.entity.TEmployeeDatas;

public class SA0104Form {

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
	public String eventId;
	/**
	 *
	 */
	public String eventName;
	/**
	 *
	 */
	public String eventPersonnel;
	/**
	 *
	 */
	public String eventDatetime;
	/**
	 *
	 */
	public String eventPlace;
	/**
	 *
	 */
	public String eventStatus;
	/**
	 *
	 */
	public String eventSummary;
	/**
	 *
	 */
	public String deleteFlg;
	/**
	 *
	 */
	public String createUser;
	/**
	 *
	 */
	public Timestamp createDate;
	/**
	 *
	 */
	public String updateUser;
	/**
	 *
	 */
	public Timestamp updateDate;
	/**
	 *
	 */
	public ArrayList<TEmployeeDatas> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<TEmployeeDatas> userList) {
		this.userList = userList;
	}
	public ArrayList<TEmployeeDatas> userList;


	public ActionMessages validate(){

		ActionMessages errMsg = new ActionMessages();
		return errMsg;
	}
}
