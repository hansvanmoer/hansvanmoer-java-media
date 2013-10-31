package org.media.repository.model;

import java.io.Serializable;

public class Association implements Serializable{
	
	private Long nodeId;
	private Long associatedNodeId;
	private AssociationType type;
	
	public Association(){}
	
	public Association(Long nodeId, Long associatedNodeId, AssociationType type) {
		super();
		this.nodeId = nodeId;
		this.associatedNodeId = associatedNodeId;
		this.type = type;
	}

	public Long getNodeId() {
		return nodeId;
	}
	
	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}
	
	public Long getAssociatedNodeId() {
		return associatedNodeId;
	}
	
	public void setAssociatedNodeId(Long associatedNodeId) {
		this.associatedNodeId = associatedNodeId;
	}
	
	public AssociationType getType() {
		return type;
	}
	
	public void setType(AssociationType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((associatedNodeId == null) ? 0 : associatedNodeId.hashCode());
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Association other = (Association) obj;
		if (associatedNodeId == null) {
			if (other.associatedNodeId != null)
				return false;
		} else if (!associatedNodeId.equals(other.associatedNodeId))
			return false;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
