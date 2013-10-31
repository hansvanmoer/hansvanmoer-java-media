package org.media.repository;

import java.io.Serializable;
import java.util.regex.Pattern;

public class StoreReference implements Serializable{

	public static final String VALUE_REGEX = "\\w{1,32}";
	public static final Pattern VALUE_PATTERN = Pattern.compile(VALUE_REGEX);
	
	private String value;
	
	public StoreReference(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getStoreName(){
		return value;
	}
	
	public String toString(){
		return value;
	}
	
	public boolean equals(Object o){
		if(o instanceof StoreReference){
			return ((StoreReference)o).value.equals(value);
		}else{
			return false;
		}
	}
	
	public void validate() throws ReferenceSyntaxException{
		if(!isValid(value)){
			throw new ReferenceSyntaxException(value);
		}
	}
	
	public boolean isValid(){
		return isValid(value);
	}
	
	public static boolean isValid(String value){
		return VALUE_PATTERN.matcher(value).matches();
	}
	
	public StoreReference createReference(String value) throws ReferenceSyntaxException{
		if(isValid(value)){
			return new StoreReference(value);
		}else{
			throw new ReferenceSyntaxException(value);
		}
	}
}
