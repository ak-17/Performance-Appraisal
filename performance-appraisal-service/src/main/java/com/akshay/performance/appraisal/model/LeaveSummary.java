/**
 * 
 */
package com.akshay.performance.appraisal.model;

/**
 * @author akshay
 *
 */
public class LeaveSummary {
	
	private int empId;
	private int sickLeave;
	private int casualLeave;
	private int publicHoliday;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the sickLeave
	 */
	public int getSickLeave() {
		return sickLeave;
	}
	/**
	 * @param sickLeave the sickLeave to set
	 */
	public void setSickLeave(int sickLeave) {
		this.sickLeave = sickLeave;
	}
	/**
	 * @return the casualLeave
	 */
	public int getCasualLeave() {
		return casualLeave;
	}
	/**
	 * @param casualLeave the casualLeave to set
	 */
	public void setCasualLeave(int casualLeave) {
		this.casualLeave = casualLeave;
	}
	/**
	 * @return the publicHoliday
	 */
	public int getPublicHoliday() {
		return publicHoliday;
	}
	/**
	 * @param publicHoliday the publicHoliday to set
	 */
	public void setPublicHoliday(int publicHoliday) {
		this.publicHoliday = publicHoliday;
	}
	
}
