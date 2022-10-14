package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class UpdateResultVO {

	public static final String JSON_PROPERTY_UPDATED = "updated";
	public static final String JSON_PROPERTY_NOT_UPDATED = "notUpdated";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_UPDATED)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.String> updated;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NOT_UPDATED)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<NotUpdatedDetailsVO> notUpdated;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		UpdateResultVO other = (UpdateResultVO) object;
		return java.util.Objects.equals(updated, other.updated)
				&& java.util.Objects.equals(notUpdated, other.notUpdated);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(updated, notUpdated);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("UpdateResultVO[")
				.append("updated=").append(updated).append(",")
				.append("notUpdated=").append(notUpdated)
				.append("]")
				.toString();
	}

	// fluent

	public UpdateResultVO updated(java.util.List<java.lang.String> newUpdated) {
		this.updated = newUpdated;
		return this;
	}

	public java.util.List<java.lang.String> updated() {
		return updated;
	}

	public UpdateResultVO notUpdated(java.util.List<NotUpdatedDetailsVO> newNotUpdated) {
		this.notUpdated = newNotUpdated;
		return this;
	}

	public java.util.List<NotUpdatedDetailsVO> notUpdated() {
		return notUpdated;
	}


	// getter/setter
	public java.util.List<java.lang.String> getUpdated() {
		return updated;
	}

	public UpdateResultVO setUpdated(java.util.List<java.lang.String> newUpdated) {
		this.updated = newUpdated;
		return this;
	}

	public UpdateResultVO addUpdatedItem(java.lang.String updatedItem) {
		if (this.updated == null) {
			this.updated = new java.util.ArrayList<>();
		}
		this.updated.add(updatedItem);
		return this;
	}

	public java.util.List<NotUpdatedDetailsVO> getNotUpdated() {
		return notUpdated;
	}

	public UpdateResultVO setNotUpdated(java.util.List<NotUpdatedDetailsVO> newNotUpdated) {
		this.notUpdated = newNotUpdated;
		return this;
	}

	public UpdateResultVO addNotUpdatedItem(NotUpdatedDetailsVO notUpdatedItem) {
		if (this.notUpdated == null) {
			this.notUpdated = new java.util.ArrayList<>();
		}
		this.notUpdated.add(notUpdatedItem);
		return this;
	}



    
}

