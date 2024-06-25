package com.test1;

public class BillerCodeScreen {
	private Integer recordId;
	private Integer bcScreenId;
	private String bcScreenName;
	private String bcScreenUrl;
	private String bcPageUrl;
	private String actionIds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BillerCodeScreen() {

	}

	public BillerCodeScreen(Integer recordId, Integer bcScreenId, String bcScreenName, String bcScreenUrl,
			String bcPageUrl, String actionIds, String creationDate, String modifiedDate, String entityState) {
		super();
		this.recordId = recordId;
		this.bcScreenId = bcScreenId;
		this.bcScreenName = bcScreenName;
		this.bcScreenUrl = bcScreenUrl;
		this.bcPageUrl = bcPageUrl;
		this.actionIds = actionIds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getBcScreenId() {
		return bcScreenId;
	}

	public void setBcScreenId(Integer bcScreenId) {
		this.bcScreenId = bcScreenId;
	}

	public String getBcScreenName() {
		return bcScreenName;
	}

	public void setBcScreenName(String bcScreenName) {
		this.bcScreenName = bcScreenName;
	}

	public String getBcScreenUrl() {
		return bcScreenUrl;
	}

	public void setBcScreenUrl(String bcScreenUrl) {
		this.bcScreenUrl = bcScreenUrl;
	}

	public String getBcPageUrl() {
		return bcPageUrl;
	}

	public void setBcPageUrl(String bcPageUrl) {
		this.bcPageUrl = bcPageUrl;
	}

	public String getActionIds() {
		return actionIds;
	}

	public void setActionIds(String actionIds) {
		this.actionIds = actionIds;
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
