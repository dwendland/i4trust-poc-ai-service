package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class TimeIntervalVO {

	public static final String JSON_PROPERTY_START = "start";
	public static final String JSON_PROPERTY_END = "end";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_START)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.Date start;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_END)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date end;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		TimeIntervalVO other = (TimeIntervalVO) object;
		return java.util.Objects.equals(start, other.start)
				&& java.util.Objects.equals(end, other.end);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(start, end);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("TimeIntervalVO[")
				.append("start=").append(start).append(",")
				.append("end=").append(end)
				.append("]")
				.toString();
	}

	// fluent

	public TimeIntervalVO start(java.util.Date newStart) {
		this.start = newStart;
		return this;
	}

	public java.util.Date start() {
		return start;
	}

	public TimeIntervalVO end(java.util.Date newEnd) {
		this.end = newEnd;
		return this;
	}

	public java.util.Date end() {
		return end;
	}


	// getter/setter
	public java.util.Date getStart() {
		return start;
	}

	public TimeIntervalVO setStart(java.util.Date newStart) {
		this.start = newStart;
		return this;
	}


	public java.util.Date getEnd() {
		return end;
	}

	public TimeIntervalVO setEnd(java.util.Date newEnd) {
		this.end = newEnd;
		return this;
	}




    
}

