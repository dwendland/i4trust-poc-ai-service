package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class TemporalQueryVO {

	public static final String JSON_PROPERTY_TIMEREL = "timerel";
	public static final String JSON_PROPERTY_TIME_AT = "timeAt";
	public static final String JSON_PROPERTY_END_TIME_AT = "endTimeAt";
	public static final String JSON_PROPERTY_TIMEPROPERTY = "timeproperty";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TIMEREL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String timerel;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TIME_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date timeAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_END_TIME_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date endTimeAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TIMEPROPERTY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String timeproperty;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		TemporalQueryVO other = (TemporalQueryVO) object;
		return java.util.Objects.equals(timerel, other.timerel)
				&& java.util.Objects.equals(timeAt, other.timeAt)
				&& java.util.Objects.equals(endTimeAt, other.endTimeAt)
				&& java.util.Objects.equals(timeproperty, other.timeproperty);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(timerel, timeAt, endTimeAt, timeproperty);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("TemporalQueryVO[")
				.append("timerel=").append(timerel).append(",")
				.append("timeAt=").append(timeAt).append(",")
				.append("endTimeAt=").append(endTimeAt).append(",")
				.append("timeproperty=").append(timeproperty)
				.append("]")
				.toString();
	}

	// fluent

	public TemporalQueryVO timerel(java.lang.String newTimerel) {
		this.timerel = newTimerel;
		return this;
	}

	public java.lang.String timerel() {
		return timerel;
	}

	public TemporalQueryVO timeAt(java.util.Date newTimeAt) {
		this.timeAt = newTimeAt;
		return this;
	}

	public java.util.Date timeAt() {
		return timeAt;
	}

	public TemporalQueryVO endTimeAt(java.util.Date newEndTimeAt) {
		this.endTimeAt = newEndTimeAt;
		return this;
	}

	public java.util.Date endTimeAt() {
		return endTimeAt;
	}

	public TemporalQueryVO timeproperty(java.lang.String newTimeproperty) {
		this.timeproperty = newTimeproperty;
		return this;
	}

	public java.lang.String timeproperty() {
		return timeproperty;
	}


	// getter/setter
	public java.lang.String getTimerel() {
		return timerel;
	}

	public TemporalQueryVO setTimerel(java.lang.String newTimerel) {
		this.timerel = newTimerel;
		return this;
	}


	public java.util.Date getTimeAt() {
		return timeAt;
	}

	public TemporalQueryVO setTimeAt(java.util.Date newTimeAt) {
		this.timeAt = newTimeAt;
		return this;
	}


	public java.util.Date getEndTimeAt() {
		return endTimeAt;
	}

	public TemporalQueryVO setEndTimeAt(java.util.Date newEndTimeAt) {
		this.endTimeAt = newEndTimeAt;
		return this;
	}


	public java.lang.String getTimeproperty() {
		return timeproperty;
	}

	public TemporalQueryVO setTimeproperty(java.lang.String newTimeproperty) {
		this.timeproperty = newTimeproperty;
		return this;
	}




    
}

