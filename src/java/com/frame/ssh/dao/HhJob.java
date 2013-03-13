package com.frame.ssh.dao;
// Generated 2013-3-13 17:30:55 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * HhJob generated by hbm2java
 */
public class HhJob implements java.io.Serializable {

	private Integer hhJobId;
	private String name;
	private String maskName;
	private int companyId;
	private int companyUserId;
	private byte country;
	private Short region; // Province or state.
	private short city;
	private Short district; // district of city.
	private short vacancy;
	private byte nature; // 公司属性，如私营企业、外企等.
	private byte size; // 公司规模，如50人以下，50-100人等.
	private short industry;
	private byte functionCategory;
	private Short function;
	private int annualPay;
	private String companyIntro; // 公司介绍.
	private String description; // 职位描述.
	private String requirement; // 职位要求.
	private String welfare; // 薪酬福利.
	private String reportManager;
	private String teamDescription;
	private String department;
	private Date onBoardDate;
	private char openType; // ENUM(A,H,S). Open Level: A-All, H-headhunter & Referer, S-Job Seeker.
	private char openLevel; // ENUM(O,H,A,I). 职位开放程度，O-Open, H-Open for headhunter, A-Approval needed for headhunter, I-Open for Internal only.
	private char priceType; // ENUM(F,P). 佣金类型，F-Fixed charges（固定佣金）, P-Proportional charges（年薪比例）.
	private Integer priceValue;
	private Integer priceMinimum;
	private Integer priceMaximum;
	private BigDecimal percentValue;
	private String remark; // 顾问审核时添加的友情提示.
	private String remarkInternal;
	private char urgent;
	private char status; // ENUM(S,V,O,C). 职位提交状态，S-save, V-verify, O-open, C-close.
	private Integer viewCount; // 浏览次数.
	private Date updateTime;
	private Date createTime;
	private Set<HhJobApply> hhJobApplies = new HashSet<HhJobApply>(0);

	public HhJob() {
	}

	public HhJob(String name, int companyId, int companyUserId, byte country, short city, short vacancy, byte nature,
			byte size, short industry, byte functionCategory, int annualPay, String description, String requirement,
			Date onBoardDate, char openType, char openLevel, char priceType, char urgent, char status, Date updateTime,
			Date createTime) {
		this.name = name;
		this.companyId = companyId;
		this.companyUserId = companyUserId;
		this.country = country;
		this.city = city;
		this.vacancy = vacancy;
		this.nature = nature;
		this.size = size;
		this.industry = industry;
		this.functionCategory = functionCategory;
		this.annualPay = annualPay;
		this.description = description;
		this.requirement = requirement;
		this.onBoardDate = onBoardDate;
		this.openType = openType;
		this.openLevel = openLevel;
		this.priceType = priceType;
		this.urgent = urgent;
		this.status = status;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public HhJob(String name, String maskName, int companyId, int companyUserId, byte country, Short region,
			short city, Short district, short vacancy, byte nature, byte size, short industry, byte functionCategory,
			Short function, int annualPay, String companyIntro, String description, String requirement, String welfare,
			String reportManager, String teamDescription, String department, Date onBoardDate, char openType,
			char openLevel, char priceType, Integer priceValue, Integer priceMinimum, Integer priceMaximum,
			BigDecimal percentValue, String remark, String remarkInternal, char urgent, char status, Integer viewCount,
			Date updateTime, Date createTime, Set<HhJobApply> hhJobApplies) {
		this.name = name;
		this.maskName = maskName;
		this.companyId = companyId;
		this.companyUserId = companyUserId;
		this.country = country;
		this.region = region;
		this.city = city;
		this.district = district;
		this.vacancy = vacancy;
		this.nature = nature;
		this.size = size;
		this.industry = industry;
		this.functionCategory = functionCategory;
		this.function = function;
		this.annualPay = annualPay;
		this.companyIntro = companyIntro;
		this.description = description;
		this.requirement = requirement;
		this.welfare = welfare;
		this.reportManager = reportManager;
		this.teamDescription = teamDescription;
		this.department = department;
		this.onBoardDate = onBoardDate;
		this.openType = openType;
		this.openLevel = openLevel;
		this.priceType = priceType;
		this.priceValue = priceValue;
		this.priceMinimum = priceMinimum;
		this.priceMaximum = priceMaximum;
		this.percentValue = percentValue;
		this.remark = remark;
		this.remarkInternal = remarkInternal;
		this.urgent = urgent;
		this.status = status;
		this.viewCount = viewCount;
		this.updateTime = updateTime;
		this.createTime = createTime;
		this.hhJobApplies = hhJobApplies;
	}

	public Integer getHhJobId() {
		return this.hhJobId;
	}

	public void setHhJobId(Integer hhJobId) {
		this.hhJobId = hhJobId;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getMaskName() {
		return this.maskName;
	}

	public void setMaskName(String maskName) {
		this.maskName = maskName;
	}
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getCompanyUserId() {
		return this.companyUserId;
	}

	public void setCompanyUserId(int companyUserId) {
		this.companyUserId = companyUserId;
	}
	public byte getCountry() {
		return this.country;
	}

	public void setCountry(byte country) {
		this.country = country;
	}
	public Short getRegion() {
		return this.region;
	}

	public void setRegion(Short region) {
		this.region = region;
	}
	public short getCity() {
		return this.city;
	}

	public void setCity(short city) {
		this.city = city;
	}
	public Short getDistrict() {
		return this.district;
	}

	public void setDistrict(Short district) {
		this.district = district;
	}
	public short getVacancy() {
		return this.vacancy;
	}

	public void setVacancy(short vacancy) {
		this.vacancy = vacancy;
	}
	public byte getNature() {
		return this.nature;
	}

	public void setNature(byte nature) {
		this.nature = nature;
	}
	public byte getSize() {
		return this.size;
	}

	public void setSize(byte size) {
		this.size = size;
	}
	public short getIndustry() {
		return this.industry;
	}

	public void setIndustry(short industry) {
		this.industry = industry;
	}
	public byte getFunctionCategory() {
		return this.functionCategory;
	}

	public void setFunctionCategory(byte functionCategory) {
		this.functionCategory = functionCategory;
	}
	public Short getFunction() {
		return this.function;
	}

	public void setFunction(Short function) {
		this.function = function;
	}
	public int getAnnualPay() {
		return this.annualPay;
	}

	public void setAnnualPay(int annualPay) {
		this.annualPay = annualPay;
	}
	public String getCompanyIntro() {
		return this.companyIntro;
	}

	public void setCompanyIntro(String companyIntro) {
		this.companyIntro = companyIntro;
	}
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequirement() {
		return this.requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getWelfare() {
		return this.welfare;
	}

	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}
	public String getReportManager() {
		return this.reportManager;
	}

	public void setReportManager(String reportManager) {
		this.reportManager = reportManager;
	}
	public String getTeamDescription() {
		return this.teamDescription;
	}

	public void setTeamDescription(String teamDescription) {
		this.teamDescription = teamDescription;
	}
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getOnBoardDate() {
		return this.onBoardDate;
	}

	public void setOnBoardDate(Date onBoardDate) {
		this.onBoardDate = onBoardDate;
	}
	public char getOpenType() {
		return this.openType;
	}

	public void setOpenType(char openType) {
		this.openType = openType;
	}
	public char getOpenLevel() {
		return this.openLevel;
	}

	public void setOpenLevel(char openLevel) {
		this.openLevel = openLevel;
	}
	public char getPriceType() {
		return this.priceType;
	}

	public void setPriceType(char priceType) {
		this.priceType = priceType;
	}
	public Integer getPriceValue() {
		return this.priceValue;
	}

	public void setPriceValue(Integer priceValue) {
		this.priceValue = priceValue;
	}
	public Integer getPriceMinimum() {
		return this.priceMinimum;
	}

	public void setPriceMinimum(Integer priceMinimum) {
		this.priceMinimum = priceMinimum;
	}
	public Integer getPriceMaximum() {
		return this.priceMaximum;
	}

	public void setPriceMaximum(Integer priceMaximum) {
		this.priceMaximum = priceMaximum;
	}
	public BigDecimal getPercentValue() {
		return this.percentValue;
	}

	public void setPercentValue(BigDecimal percentValue) {
		this.percentValue = percentValue;
	}
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemarkInternal() {
		return this.remarkInternal;
	}

	public void setRemarkInternal(String remarkInternal) {
		this.remarkInternal = remarkInternal;
	}
	public char getUrgent() {
		return this.urgent;
	}

	public void setUrgent(char urgent) {
		this.urgent = urgent;
	}
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	public Integer getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
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
	public Set<HhJobApply> getHhJobApplies() {
		return this.hhJobApplies;
	}

	public void setHhJobApplies(Set<HhJobApply> hhJobApplies) {
		this.hhJobApplies = hhJobApplies;
	}

	public static enum openType {
		A, H, S;
	}
	public static enum openLevel {
		O, H, A, I;
	}
	public static enum priceType {
		F, P;
	}
	public static enum status {
		S, V, O, C;
	}

	public static enum FieldNamesEnum {
		name, maskName, companyId, companyUserId, country, region, city, district, vacancy, nature, size, industry, functionCategory, function, annualPay, companyIntro, description, requirement, welfare, reportManager, teamDescription, department, onBoardDate, openType, openLevel, priceType, priceValue, priceMinimum, priceMaximum, percentValue, remark, remarkInternal, urgent, status, viewCount, updateTime, createTime, hhJobApplies;
	}

}
