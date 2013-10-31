package org.media.repository.model;

import java.io.Serializable;

public class Permission implements Serializable{
	private Long permissionId;
	private Long resourceId;
	private Long resourceType;
	private Long groupId;
	private String name;
	
	public Permission(){}
	
	public Permission(Long resourceId, Long resourceType,
			Long groupId, String name) {
		this.permissionId = 0L;
		this.resourceId = resourceId;
		this.resourceType = resourceType;
		this.groupId = groupId;
		this.name = name;
	}



	public Long getPermissionId() {
		return permissionId;
	}
	
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public Long getResourceId() {
		return resourceId;
	}
	
	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}
	
	public Long getResourceType() {
		return resourceType;
	}
	
	public void setResourceType(Long resourceType) {
		this.resourceType = resourceType;
	}
	
	public Long getGroupId() {
		return groupId;
	}
	
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
