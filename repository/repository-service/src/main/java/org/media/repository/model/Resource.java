package org.media.repository.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Resource implements Serializable{
	private Long ownerId;
	private Long status;
	private Timestamp created;
	private Timestamp modified;
	
	public Resource(){
		this.ownerId = 0L;
		this.status = 0L;
		this.created = new Timestamp(System.currentTimeMillis());
		this.modified = new Timestamp(this.created.getTime());
	}
	
	public Long getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	
	public Long getStatus() {
		return status;
	}
	
	public void setStatus(Long status) {
		this.status = status;
	}
	
	public Timestamp getCreated() {
		return created;
	}
	
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
	public Timestamp getModified() {
		return modified;
	}
	
	public void setModified(Timestamp modified) {
		this.modified = modified;
	}
	
	public void update(){
		this.modified = new Timestamp(System.currentTimeMillis());
	}
}
