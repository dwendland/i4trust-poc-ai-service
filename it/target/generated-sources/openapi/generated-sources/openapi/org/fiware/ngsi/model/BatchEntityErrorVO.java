package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class BatchEntityErrorVO {

	public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
	public static final String JSON_PROPERTY_ERROR = "error";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ENTITY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI entityId;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ERROR)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private ProblemDetailsVO error = new ProblemDetailsVO();


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		BatchEntityErrorVO other = (BatchEntityErrorVO) object;
		return java.util.Objects.equals(entityId, other.entityId)
				&& java.util.Objects.equals(error, other.error);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(entityId, error);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("BatchEntityErrorVO[")
				.append("entityId=").append(entityId).append(",")
				.append("error=").append(error)
				.append("]")
				.toString();
	}

	// fluent

	public BatchEntityErrorVO entityId(java.net.URI newEntityId) {
		this.entityId = newEntityId;
		return this;
	}

	public java.net.URI entityId() {
		return entityId;
	}

	public BatchEntityErrorVO error(ProblemDetailsVO newError) {
		this.error = newError;
		return this;
	}

	public ProblemDetailsVO error() {
		return error;
	}


	// getter/setter
	public java.net.URI getEntityId() {
		return entityId;
	}

	public BatchEntityErrorVO setEntityId(java.net.URI newEntityId) {
		this.entityId = newEntityId;
		return this;
	}


	public ProblemDetailsVO getError() {
		return error;
	}

	public BatchEntityErrorVO setError(ProblemDetailsVO newError) {
		this.error = newError;
		return this;
	}




    
}

