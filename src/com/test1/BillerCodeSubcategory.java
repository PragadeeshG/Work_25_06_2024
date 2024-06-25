package com.test1;

public class BillerCodeSubcategory {
	private String billerCodeSubCatCode;
	private String billerCodeSubCatName;
	private String billerCodeSubCatDescription;
	private String billerCodeSubCatdefinition;
	private String billerCodeSubCatRefAuthName;
	private long errorCode;
	private String errorSeverity;
	private String ncType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BillerCodeSubcategory() {

	}

	public BillerCodeSubcategory(String billerCodeSubCatCode, String billerCodeSubCatName,
			String billerCodeSubCatDescription, String billerCodeSubCatdefinition, String billerCodeSubCatRefAuthName,
			long errorCode, String errorSeverity, String ncType, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.billerCodeSubCatCode = billerCodeSubCatCode;
		this.billerCodeSubCatName = billerCodeSubCatName;
		this.billerCodeSubCatDescription = billerCodeSubCatDescription;
		this.billerCodeSubCatdefinition = billerCodeSubCatdefinition;
		this.billerCodeSubCatRefAuthName = billerCodeSubCatRefAuthName;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.ncType = ncType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getBillerCodeSubCatCode() {
		return billerCodeSubCatCode;
	}

	public void setBillerCodeSubCatCode(String billerCodeSubCatCode) {
		this.billerCodeSubCatCode = billerCodeSubCatCode;
	}

	public String getBillerCodeSubCatName() {
		return billerCodeSubCatName;
	}

	public void setBillerCodeSubCatName(String billerCodeSubCatName) {
		this.billerCodeSubCatName = billerCodeSubCatName;
	}

	public String getBillerCodeSubCatDescription() {
		return billerCodeSubCatDescription;
	}

	public void setBillerCodeSubCatDescription(String billerCodeSubCatDescription) {
		this.billerCodeSubCatDescription = billerCodeSubCatDescription;
	}

	public String getBillerCodeSubCatdefinition() {
		return billerCodeSubCatdefinition;
	}

	public void setBillerCodeSubCatdefinition(String billerCodeSubCatdefinition) {
		this.billerCodeSubCatdefinition = billerCodeSubCatdefinition;
	}

	public String getBillerCodeSubCatRefAuthName() {
		return billerCodeSubCatRefAuthName;
	}

	public void setBillerCodeSubCatRefAuthName(String billerCodeSubCatRefAuthName) {
		this.billerCodeSubCatRefAuthName = billerCodeSubCatRefAuthName;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getNcType() {
		return ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
