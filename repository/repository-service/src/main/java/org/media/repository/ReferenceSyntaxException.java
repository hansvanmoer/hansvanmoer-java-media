package org.media.repository;

public class ReferenceSyntaxException extends RepositoryException {

	public ReferenceSyntaxException(String ref){
		super("invalid reference: "+ref);
	}
	
}
