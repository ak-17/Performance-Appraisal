package com.akshay.performance.appraisal.model;

import java.util.Date;

/**
 * @author akshay
 *
 */
public class Leave {

	private enum LEAVETYPE {
		SICK_LEAVE, PUBLIC_HOLIDAY, ANNUAL_LEAVE, PARENTAL
	}

	private LEAVETYPE leaveType;
	private Date startDate;
	private Date endDate;

	/**
	 * @return the leaveType
	 */
	public LEAVETYPE getLeaveType() {
		return leaveType;
	}

	/**
	 * @param leaveType the leaveType to set
	 */
	public void setLeaveType(LEAVETYPE leaveType) {
		this.leaveType = leaveType;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
