package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class NotUpdatedDetailsVO {

	public static final String JSON_PROPERTY_ATTRIBUTE_NAME = "attributeName";
	public static final String JSON_PROPERTY_REASON = "reason";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ATTRIBUTE_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String attributeName;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_REASON)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String reason;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		NotUpdatedDetailsVO other = (NotUpdatedDetailsVO) object;
		return java.util.Objects.equals(attributeName, other.attributeName)
				&& java.util.Objects.equals(reason, other.reason);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(attributeName, reason);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("NotUpdatedDetailsVO[")
				.append("attributeName=").append(attributeName).append(",")
				.append("reason=").append(reason)
				.append("]")
				.toString();
	}

	// fluent

	public NotUpdatedDetailsVO attributeName(java.lang.String newAttributeName) {
		this.attributeName = newAttributeName;
		return this;
	}

	public java.lang.String attributeName() {
		return attributeName;
	}

	public NotUpdatedDetailsVO reason(java.lang.String newReason) {
		this.reason = newReason;
		return this;
	}

	public java.lang.String reason() {
		return reason;
	}


	// getter/setter
	public java.lang.String getAttributeName() {
		return attributeName;
	}

	public NotUpdatedDetailsVO setAttributeName(java.lang.String newAttributeName) {
		this.attributeName = newAttributeName;
		return this;
	}


	public java.lang.String getReason() {
		return reason;
	}

	public NotUpdatedDetailsVO setReason(java.lang.String newReason) {
		this.reason = newReason;
		return this;
	}




    
}

