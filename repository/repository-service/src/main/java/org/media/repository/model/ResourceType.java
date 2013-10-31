package org.media.repository.model;

public class ResourceType {
	private Long resourceTypeId;
	private String name;
	
	public ResourceType(){}
	
	public ResourceType(Class type){
		this.resourceTypeId = 0L;
		this.name = type.getName();
	}
	
	public Long getResourceTypeId() {
		return resourceTypeId;
	}
	
	public void setResourceTypeId(Long resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
