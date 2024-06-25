package com.test1;

public class BillerCodeCategory {
	private String billerCodeCatCode;
	private String billerCodeCatName;
	private String billerCodeCatDescription;
	private String billerCodeCatDefinition;
	private long authorizerId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public BillerCodeCategory() {

	}

	public BillerCodeCategory(String billerCodeCatCode, String billerCodeCatName, String billerCodeCatDescription,
			String billerCodeCatDefinition, long authorizerId, String owner, String psIds, long serviceNameId,
			String creationDate, String modifiedDate) {
		super();
		this.billerCodeCatCode = billerCodeCatCode;
		this.billerCodeCatName = billerCodeCatName;
		this.billerCodeCatDescription = billerCodeCatDescription;
		this.billerCodeCatDefinition = billerCodeCatDefinition;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getBillerCodeCatCode() {
		return billerCodeCatCode;
	}

	public void setBillerCodeCatCode(String billerCodeCatCode) {
		this.billerCodeCatCode = billerCodeCatCode;
	}

	public String getBillerCodeCatName() {
		return billerCodeCatName;
	}

	public void setBillerCodeCatName(String billerCodeCatName) {
		this.billerCodeCatName = billerCodeCatName;
	}

	public String getBillerCodeCatDescription() {
		return billerCodeCatDescription;
	}

	public void setBillerCodeCatDescription(String billerCodeCatDescription) {
		this.billerCodeCatDescription = billerCodeCatDescription;
	}

	public String getBillerCodeCatDefinition() {
		return billerCodeCatDefinition;
	}

	public void setBillerCodeCatDefinition(String billerCodeCatDefinition) {
		this.billerCodeCatDefinition = billerCodeCatDefinition;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
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

}
