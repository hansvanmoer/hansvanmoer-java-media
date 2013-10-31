package org.media.repository;

import java.util.regex.Pattern;

public class Name {
	public static final char SEPARATOR_CHAR = ':';
	public static final String SEPARATOR = new String(new char[]{SEPARATOR_CHAR});
	
	public static final String VALUE_REGEX = "\\w{1,128}";
	public static final Pattern VALUE_PATTERN = Pattern.compile(VALUE_REGEX);
	
	private String value;
	
	public Name(String value){
		this.value = value;
	}
	
	public Name(String namespace, String localName){
		if(namespace.isEmpty()){
			this.value = localName;
		}else{
			this.value = namespace+SEPARATOR+localName;
		}
	}
	
	public String getNamespace(){
		int index = value.lastIndexOf(SEPARATOR_CHAR);
		if(index != -1 && index != value.length() -1){
			return value.substring(0,index);
		}else{
			return new String();
		}
	}
	
	public String getLocalString(){
		int index = value.lastIndexOf(SEPARATOR_CHAR)+1;
		if(index != 0 && index != value.length()){
			return value.substring(index);
		}else{
			return new String();
		}
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
		if(o instanceof Name){
			return ((Name)o).value.equals(value);
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
	
	public Name createName(String value) throws ReferenceSyntaxException{
		if(isValid(value)){
			return new Name(value);
		}else{
			throw new ReferenceSyntaxException(value);
		}
	}
}
