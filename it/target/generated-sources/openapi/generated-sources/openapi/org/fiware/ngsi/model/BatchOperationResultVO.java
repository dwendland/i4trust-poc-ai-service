package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class BatchOperationResultVO {

	public static final String JSON_PROPERTY_SUCCESS = "success";
	public static final String JSON_PROPERTY_ERROR = "error";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SUCCESS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.net.URI> success;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ERROR)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<BatchEntityErrorVO> error;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		BatchOperationResultVO other = (BatchOperationResultVO) object;
		return java.util.Objects.equals(success, other.success)
				&& java.util.Objects.equals(error, other.error);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(success, error);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("BatchOperationResultVO[")
				.append("success=").append(success).append(",")
				.append("error=").append(error)
				.append("]")
				.toString();
	}

	// fluent

	public BatchOperationResultVO success(java.util.List<java.net.URI> newSuccess) {
		this.success = newSuccess;
		return this;
	}

	public java.util.List<java.net.URI> success() {
		return success;
	}

	public BatchOperationResultVO error(java.util.List<BatchEntityErrorVO> newError) {
		this.error = newError;
		return this;
	}

	public java.util.List<BatchEntityErrorVO> error() {
		return error;
	}


	// getter/setter
	public java.util.List<java.net.URI> getSuccess() {
		return success;
	}

	public BatchOperationResultVO setSuccess(java.util.List<java.net.URI> newSuccess) {
		this.success = newSuccess;
		return this;
	}

	public BatchOperationResultVO addSuccessItem(java.net.URI successItem) {
		if (this.success == null) {
			this.success = new java.util.ArrayList<>();
		}
		this.success.add(successItem);
		return this;
	}

	public java.util.List<BatchEntityErrorVO> getError() {
		return error;
	}

	public BatchOperationResultVO setError(java.util.List<BatchEntityErrorVO> newError) {
		this.error = newError;
		return this;
	}

	public BatchOperationResultVO addErrorItem(BatchEntityErrorVO errorItem) {
		if (this.error == null) {
			this.error = new java.util.ArrayList<>();
		}
		this.error.add(errorItem);
		return this;
	}



    
}

