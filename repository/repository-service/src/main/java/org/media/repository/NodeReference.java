package org.media.repository;

import java.util.regex.Pattern;

public class NodeReference {

	public static final char SEPARATOR_CHAR = '/';
	public static final String SEPARATOR = new String(new char[]{SEPARATOR_CHAR});
	
	public static final String VALUE_REGEX = StoreReference.VALUE_REGEX+SEPARATOR+"\\pXDigit{16,16}";
	public static final Pattern VALUE_PATTERN = Pattern.compile(VALUE_REGEX);
	
	private String value;
	
	public NodeReference(String value){
		this.value = value;
	}
	
	public NodeReference(StoreReference store, String uniqueId){
		this.value = store.getValue()+SEPARATOR+uniqueId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString(){
		return value;
	}
	
	public StoreReference getStoreReference(){
		return new StoreReference(value.substring(0,value.lastIndexOf(SEPARATOR_CHAR)));
	}
	
	public String getUniqueId(){
		return value.substring(value.lastIndexOf(SEPARATOR_CHAR)+1);
	}
	
	public boolean equals(Object o){
		if(o instanceof NodeReference){
			return ((NodeReference)o).value.equals(value);
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
	
	public NodeReference createReference(String value) throws ReferenceSyntaxException{
		if(isValid(value)){
			return new NodeReference(value);
		}else{
			throw new ReferenceSyntaxException(value);
		}
	}
}
