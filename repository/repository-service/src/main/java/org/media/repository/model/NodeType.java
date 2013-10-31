package org.media.repository.model;

import java.io.Serializable;
import java.util.Map;

import org.media.repository.Name;

public class NodeType extends Resource implements Serializable{
	
	private Long nodeTypeId;
	private String name;
	private Map<String, AssociationType> associations;
	private Map<String, Property> properties;
	
	public NodeType(){}
	
	public Long getNodeTypeId() {
		return nodeTypeId;
	}
	public void setNodeTypeId(Long nodeTypeId) {
		this.nodeTypeId = nodeTypeId;
	}
	
	public Name getName() {
		return new Name(name);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setName(Name name) {
		this.name = name.getValue();
	}
	
	public Map<String, AssociationType> getAssociations() {
		return associations;
	}
	
	public void setAssociations(Map<String, AssociationType> associations) {
		this.associations = associations;
	}
	
	public Map<String, Property> getProperties() {
		return properties;
	}
	
	public void setProperties(Map<String, Property> properties) {
		this.properties = properties;
	}
	
	public Property getProperty(Name name){
		return properties.get(name.getValue());
	}
	
	public boolean hasProperty(Name name){
		return properties.containsKey(name.getValue());
	}
	
	public AssociationType getAssociation(Name name){
		return associations.get(name.getValue());
	}
	
	public boolean hasAssociation(Name name){
		return associations.containsKey(name.getValue());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		NodeType other = (NodeType) obj;
		if (nodeTypeId == null) {
			if (other.nodeTypeId != null)
				return false;
		} else if (!nodeTypeId.equals(other.nodeTypeId))
			return false;
		return true;
	}
	
}
