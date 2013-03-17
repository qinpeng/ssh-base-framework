package com.frame.ssh.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class HhJobApply extends Model {

	private Integer hhJobApplyId;
	private HhJob hhJob;
	private Integer hhUserId;
	private Integer hhJobSeekerId;
	private String name;
	private String email;
	private String mobile;
	private String phone;
	private String resumeName;
	private Character applyType; // ENUM(T,H,S). 申请类型，T-Trusteeship, H-Headhunting, S-Job Seeker.
	private BigDecimal payPercent;
	private Character currentStep;
	private Character status; // ENUM(O,S,R,C). 申请状态，O-open, S-success, R-reject, C-Cancel.
	private String referenceReport;
	private String offerLetter;
	private Integer offeredAnnualPay; // 实际年薪.
	private Integer finalPay; // 最终佣金.
	private Integer finalPayForUser; // 最终付给猎头或托管者的佣金.
	private String remarkInternal;
	private Date checkpoint;
	private Character contactInfoOpenLevel; // ENUM(H,O). 候选人联系信息公开级别，H-hidden for HR, O-open for HR after approved.
	private Date updateTime;
	private Date createTime;

	public HhJobApply() {
	}

	public HhJobApply(HhJob hhJob, Integer hhUserId, Integer hhJobSeekerId, String name, String email, String mobile,
			String phone, String resumeName, Character applyType, BigDecimal payPercent, Character currentStep,
			Character status, String referenceReport, String offerLetter, Integer offeredAnnualPay, Integer finalPay,
			Integer finalPayForUser, String remarkInternal, Date checkpoint, Character contactInfoOpenLevel,
			Date updateTime, Date createTime) {
		this.hhJob = hhJob;
		this.hhUserId = hhUserId;
		this.hhJobSeekerId = hhJobSeekerId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.phone = phone;
		this.resumeName = resumeName;
		this.applyType = applyType;
		this.payPercent = payPercent;
		this.currentStep = currentStep;
		this.status = status;
		this.referenceReport = referenceReport;
		this.offerLetter = offerLetter;
		this.offeredAnnualPay = offeredAnnualPay;
		this.finalPay = finalPay;
		this.finalPayForUser = finalPayForUser;
		this.remarkInternal = remarkInternal;
		this.checkpoint = checkpoint;
		this.contactInfoOpenLevel = contactInfoOpenLevel;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}

	@Override
	public Integer getPk() {
		return this.hhJobApplyId;
	}

	@Override
	public void setPk(Integer pk) {
		this.hhJobApplyId = pk;
	}

	public Integer getHhJobApplyId() {
		return this.hhJobApplyId;
	}

	public void setHhJobApplyId(Integer hhJobApplyId) {
		this.hhJobApplyId = hhJobApplyId;
	}

	public HhJob getHhJob() {
		return this.hhJob;
	}

	public void setHhJob(HhJob hhJob) {
		this.hhJob = hhJob;
	}

	public Integer getHhUserId() {
		return this.hhUserId;
	}

	public void setHhUserId(Integer hhUserId) {
		this.hhUserId = hhUserId;
	}

	public Integer getHhJobSeekerId() {
		return this.hhJobSeekerId;
	}

	public void setHhJobSeekerId(Integer hhJobSeekerId) {
		this.hhJobSeekerId = hhJobSeekerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResumeName() {
		return this.resumeName;
	}

	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}

	public Character getApplyType() {
		return this.applyType;
	}

	public void setApplyType(Character applyType) {
		this.applyType = applyType;
	}

	public BigDecimal getPayPercent() {
		return this.payPercent;
	}

	public void setPayPercent(BigDecimal payPercent) {
		this.payPercent = payPercent;
	}

	public Character getCurrentStep() {
		return this.currentStep;
	}

	public void setCurrentStep(Character currentStep) {
		this.currentStep = currentStep;
	}

	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public String getReferenceReport() {
		return this.referenceReport;
	}

	public void setReferenceReport(String referenceReport) {
		this.referenceReport = referenceReport;
	}

	public String getOfferLetter() {
		return this.offerLetter;
	}

	public void setOfferLetter(String offerLetter) {
		this.offerLetter = offerLetter;
	}

	public Integer getOfferedAnnualPay() {
		return this.offeredAnnualPay;
	}

	public void setOfferedAnnualPay(Integer offeredAnnualPay) {
		this.offeredAnnualPay = offeredAnnualPay;
	}

	public Integer getFinalPay() {
		return this.finalPay;
	}

	public void setFinalPay(Integer finalPay) {
		this.finalPay = finalPay;
	}

	public Integer getFinalPayForUser() {
		return this.finalPayForUser;
	}

	public void setFinalPayForUser(Integer finalPayForUser) {
		this.finalPayForUser = finalPayForUser;
	}

	public String getRemarkInternal() {
		return this.remarkInternal;
	}

	public void setRemarkInternal(String remarkInternal) {
		this.remarkInternal = remarkInternal;
	}

	public Date getCheckpoint() {
		return this.checkpoint;
	}

	public void setCheckpoint(Date checkpoint) {
		this.checkpoint = checkpoint;
	}

	public Character getContactInfoOpenLevel() {
		return this.contactInfoOpenLevel;
	}

	public void setContactInfoOpenLevel(Character contactInfoOpenLevel) {
		this.contactInfoOpenLevel = contactInfoOpenLevel;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public static enum ApplyType {
		T, H, S;
	}
	public static enum Status {
		O, S, R, C;
	}
	public static enum ContactInfoOpenLevel {
		H, O;
	}

	public static enum FieldNamesEnum {
		hhJobApplyId, hhJob, hhUserId, hhJobSeekerId, name, email, mobile, phone, resumeName, applyType, payPercent, currentStep, status, referenceReport, offerLetter, offeredAnnualPay, finalPay, finalPayForUser, remarkInternal, checkpoint, contactInfoOpenLevel, updateTime, createTime;
	}

}
