package com.frame.ssh.dao.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class HhJob extends Model {

	private Integer hhJobId;
	private String name;
	private String maskName;
	private Integer companyId;
	private Integer companyUserId;
	private Byte country;
	private Short region; // Province or state.
	private Short city;
	private Short district; // district of city.
	private Short vacancy;
	private Byte nature; // 公司属性，如私营企业、外企等.
	private Byte size; // 公司规模，如50人以下，50-100人等.
	private Short industry;
	private Byte functionCategory;
	private Short function;
	private Integer annualPay;
	private String companyIntro; // 公司介绍.
	private String description; // 职位描述.
	private String requirement; // 职位要求.
	private String welfare; // 薪酬福利.
	private String reportManager;
	private String teamDescription;
	private String department;
	private Date onBoardDate;
	private Character openType; // ENUM(A,H,S). Open Level: A-All, H-headhunter & Referer, S-Job Seeker.
	private Character openLevel; // ENUM(O,H,A,I). 职位开放程度，O-Open, H-Open for headhunter, A-Approval needed for headhunter, I-Open for Internal only.
	private Character priceType; // ENUM(F,P). 佣金类型，F-Fixed charges（固定佣金）, P-Proportional charges（年薪比例）.
	private Integer priceValue;
	private Integer priceMinimum;
	private Integer priceMaximum;
	private BigDecimal percentValue;
	private String remark; // 顾问审核时添加的友情提示.
	private String remarkInternal;
	private Character urgent;
	private Character status; // ENUM(S,V,O,C). 职位提交状态，S-save, V-verify, O-open, C-close.
	private Integer viewCount; // 浏览次数.
	private Date updateTime;
	private Date createTime;
	private Set<HhJobApply> hhJobApplies = new HashSet<HhJobApply>(0);

	public HhJob() {
	}

	public HhJob(String name, Integer companyId, Integer companyUserId, Byte country, Short city, Short vacancy,
			Byte nature, Byte size, Short industry, Byte functionCategory, Integer annualPay, String description,
			String requirement, Date onBoardDate, Character openType, Character openLevel, Character priceType,
			Character urgent, Character status, Date updateTime, Date createTime) {
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
	public HhJob(String name, String maskName, Integer companyId, Integer companyUserId, Byte country, Short region,
			Short city, Short district, Short vacancy, Byte nature, Byte size, Short industry, Byte functionCategory,
			Short function, Integer annualPay, String companyIntro, String description, String requirement,
			String welfare, String reportManager, String teamDescription, String department, Date onBoardDate,
			Character openType, Character openLevel, Character priceType, Integer priceValue, Integer priceMinimum,
			Integer priceMaximum, BigDecimal percentValue, String remark, String remarkInternal, Character urgent,
			Character status, Integer viewCount, Date updateTime, Date createTime, Set<HhJobApply> hhJobApplies) {
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

	@Override
	public Integer getPk() {
		return this.hhJobId;
	}

	@Override
	public void setPk(Integer pk) {
		this.hhJobId = pk;
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

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getCompanyUserId() {
		return this.companyUserId;
	}

	public void setCompanyUserId(Integer companyUserId) {
		this.companyUserId = companyUserId;
	}

	public Byte getCountry() {
		return this.country;
	}

	public void setCountry(Byte country) {
		this.country = country;
	}

	public Short getRegion() {
		return this.region;
	}

	public void setRegion(Short region) {
		this.region = region;
	}

	public Short getCity() {
		return this.city;
	}

	public void setCity(Short city) {
		this.city = city;
	}

	public Short getDistrict() {
		return this.district;
	}

	public void setDistrict(Short district) {
		this.district = district;
	}

	public Short getVacancy() {
		return this.vacancy;
	}

	public void setVacancy(Short vacancy) {
		this.vacancy = vacancy;
	}

	public Byte getNature() {
		return this.nature;
	}

	public void setNature(Byte nature) {
		this.nature = nature;
	}

	public Byte getSize() {
		return this.size;
	}

	public void setSize(Byte size) {
		this.size = size;
	}

	public Short getIndustry() {
		return this.industry;
	}

	public void setIndustry(Short industry) {
		this.industry = industry;
	}

	public Byte getFunctionCategory() {
		return this.functionCategory;
	}

	public void setFunctionCategory(Byte functionCategory) {
		this.functionCategory = functionCategory;
	}

	public Short getFunction() {
		return this.function;
	}

	public void setFunction(Short function) {
		this.function = function;
	}

	public Integer getAnnualPay() {
		return this.annualPay;
	}

	public void setAnnualPay(Integer annualPay) {
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

	public Character getOpenType() {
		return this.openType;
	}

	public void setOpenType(Character openType) {
		this.openType = openType;
	}

	public Character getOpenLevel() {
		return this.openLevel;
	}

	public void setOpenLevel(Character openLevel) {
		this.openLevel = openLevel;
	}

	public Character getPriceType() {
		return this.priceType;
	}

	public void setPriceType(Character priceType) {
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

	public Character getUrgent() {
		return this.urgent;
	}

	public void setUrgent(Character urgent) {
		this.urgent = urgent;
	}

	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
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

	public static enum OpenType {
		A, H, S;
	}
	public static enum OpenLevel {
		O, H, A, I;
	}
	public static enum PriceType {
		F, P;
	}
	public static enum Status {
		S, V, O, C;
	}

	public static enum FieldNamesEnum {
		name, maskName, companyId, companyUserId, country, region, city, district, vacancy, nature, size, industry, functionCategory, function, annualPay, companyIntro, description, requirement, welfare, reportManager, teamDescription, department, onBoardDate, openType, openLevel, priceType, priceValue, priceMinimum, priceMaximum, percentValue, remark, remarkInternal, urgent, status, viewCount, updateTime, createTime, hhJobApplies;
	}

}
