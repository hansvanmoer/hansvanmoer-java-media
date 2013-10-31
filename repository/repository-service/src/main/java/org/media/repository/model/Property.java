package org.media.repository.model;

import java.io.Serializable;

import org.media.repository.Name;

public class Property implements Serializable{

	private Long nodeTypeId;
	private String name;
	private String type;
	private Boolean required;
	
	public Property(){}
	
	public Long getNodeTypeId() {
		return nodeTypeId;
	}

	public void setNodeTypeId(Long nodeTypeId) {
		this.nodeTypeId = nodeTypeId;
	}

	public Name getName() {
		return new Name(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(Name name){
		this.name = name.toString();
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Boolean getRequired() {
		return required;
	}
	
	public void setRequired(Boolean required) {
		this.required = required;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nodeTypeId == null) ? 0 : nodeTypeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Property other = (Property) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nodeTypeId == null) {
			if (other.nodeTypeId != null)
				return false;
		} else if (!nodeTypeId.equals(other.nodeTypeId))
			return false;
		return true;
	}
	
	
}
