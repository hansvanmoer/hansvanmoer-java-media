package org.media.repository.model;

import java.io.Serializable;

public class Node extends Resource implements Serializable{
	
	private Long nodeId;
	private String reference;
	private Long nodeTypeId;
	private String properties;
	private String contentUri;
	private String mimeType;
	
	public Node(){}
	
	public Long getNodeId() {
		return nodeId;
	}
	
	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public Long getNodeTypeId() {
		return nodeTypeId;
	}
	
	public void setNodeTypeId(Long nodeTypeId) {
		this.nodeTypeId = nodeTypeId;
	}
	
	public String getProperties() {
		return properties;
	}
	
	public void setProperties(String properties) {
		this.properties = properties;
	}
	
	public String getContentUri() {
		return contentUri;
	}
	
	public void setContentUri(String contentUri) {
		this.contentUri = contentUri;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
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
		Node other = (Node) obj;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		return true;
	}
	
}
