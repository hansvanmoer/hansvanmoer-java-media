package org.media.repository.model;

import java.io.Serializable;

import org.media.repository.Name;

public class AssociationType extends Resource implements Serializable{
	
	public static final long CASCADE_NONE = 0L;
	public static final long CASCADE_DELETE = 1L;
	public static final long CASCADE_UPDATE = 2L;
	public static final long CASCADE_ALL = ~CASCADE_NONE;
	
	private Long associationTypeId;
	private String name;
	private Long cascade;
	private Boolean required;
	
	public AssociationType(){}
	
	public Long getAssociationTypeId() {
		return associationTypeId;
	}
	
	public void setAssociationTypeId(Long associationTypeId) {
		this.associationTypeId = associationTypeId;
	}
	
	public Name getName() {
		return new Name(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(Name name){
		this.name = name.getValue();
	}
	
	public Long getCascade() {
		return cascade;
	}
	
	public void setCascade(Long cascade) {
		this.cascade = cascade;
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
		result = prime
				* result
				+ ((associationTypeId == null) ? 0 : associationTypeId
						.hashCode());
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
		AssociationType other = (AssociationType) obj;
		if (associationTypeId == null) {
			if (other.associationTypeId != null)
				return false;
		} else if (!associationTypeId.equals(other.associationTypeId))
			return false;
		return true;
	}

}
