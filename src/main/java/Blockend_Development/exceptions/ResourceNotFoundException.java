package Blockend_Development.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	String resourceName;
	String FieldName;
	long FieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("% not found with %s with %s : l", resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		FieldName = fieldName;
		FieldValue = fieldValue;
	}
	public ResourceNotFoundException() {
		super();
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return FieldName;
	}
	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}
	public long getFieldValue() {
		return FieldValue;
	}
	public void setFieldValue(long fieldValue) {
		FieldValue = fieldValue;
	}
	
	
	
	

}
