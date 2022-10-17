package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class NotificationParamsVO {

	public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
	public static final String JSON_PROPERTY_FORMAT = "format";
	public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
	public static final String JSON_PROPERTY_STATUS = "status";
	public static final String JSON_PROPERTY_TIMES_SENT = "timesSent";
	public static final String JSON_PROPERTY_LAST_NOTIFICATION = "lastNotification";
	public static final String JSON_PROPERTY_LAST_FAILURE = "lastFailure";
	public static final String JSON_PROPERTY_LAST_SUCCESS = "lastSuccess";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ATTRIBUTES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.String> attributes;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FORMAT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String format;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ENDPOINT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private EndpointVO endpoint = new EndpointVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STATUS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Status status;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TIMES_SENT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double timesSent;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_LAST_NOTIFICATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date lastNotification;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_LAST_FAILURE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date lastFailure;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_LAST_SUCCESS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date lastSuccess;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		NotificationParamsVO other = (NotificationParamsVO) object;
		return java.util.Objects.equals(attributes, other.attributes)
				&& java.util.Objects.equals(format, other.format)
				&& java.util.Objects.equals(endpoint, other.endpoint)
				&& java.util.Objects.equals(status, other.status)
				&& java.util.Objects.equals(timesSent, other.timesSent)
				&& java.util.Objects.equals(lastNotification, other.lastNotification)
				&& java.util.Objects.equals(lastFailure, other.lastFailure)
				&& java.util.Objects.equals(lastSuccess, other.lastSuccess);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(attributes, format, endpoint, status, timesSent, lastNotification, lastFailure, lastSuccess);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("NotificationParamsVO[")
				.append("attributes=").append(attributes).append(",")
				.append("format=").append(format).append(",")
				.append("endpoint=").append(endpoint).append(",")
				.append("status=").append(status).append(",")
				.append("timesSent=").append(timesSent).append(",")
				.append("lastNotification=").append(lastNotification).append(",")
				.append("lastFailure=").append(lastFailure).append(",")
				.append("lastSuccess=").append(lastSuccess)
				.append("]")
				.toString();
	}

	// fluent

	public NotificationParamsVO attributes(java.util.Set<java.lang.String> newAttributes) {
		this.attributes = newAttributes;
		return this;
	}

	public java.util.Set<java.lang.String> attributes() {
		return attributes;
	}

	public NotificationParamsVO format(java.lang.String newFormat) {
		this.format = newFormat;
		return this;
	}

	public java.lang.String format() {
		return format;
	}

	public NotificationParamsVO endpoint(EndpointVO newEndpoint) {
		this.endpoint = newEndpoint;
		return this;
	}

	public EndpointVO endpoint() {
		return endpoint;
	}

	public NotificationParamsVO status(Status newStatus) {
		this.status = newStatus;
		return this;
	}

	public Status status() {
		return status;
	}

	public NotificationParamsVO timesSent(java.lang.Double newTimesSent) {
		this.timesSent = newTimesSent;
		return this;
	}

	public java.lang.Double timesSent() {
		return timesSent;
	}

	public NotificationParamsVO lastNotification(java.util.Date newLastNotification) {
		this.lastNotification = newLastNotification;
		return this;
	}

	public java.util.Date lastNotification() {
		return lastNotification;
	}

	public NotificationParamsVO lastFailure(java.util.Date newLastFailure) {
		this.lastFailure = newLastFailure;
		return this;
	}

	public java.util.Date lastFailure() {
		return lastFailure;
	}

	public NotificationParamsVO lastSuccess(java.util.Date newLastSuccess) {
		this.lastSuccess = newLastSuccess;
		return this;
	}

	public java.util.Date lastSuccess() {
		return lastSuccess;
	}


	// getter/setter
	public java.util.Set<java.lang.String> getAttributes() {
		return attributes;
	}

	public NotificationParamsVO setAttributes(java.util.Set<java.lang.String> newAttributes) {
		this.attributes = newAttributes;
		return this;
	}

	public NotificationParamsVO addAttributesItem(java.lang.String attributesItem) {
		if (this.attributes == null) {
			this.attributes = new java.util.LinkedHashSet<>();
		}
		this.attributes.add(attributesItem);
		return this;
	}

	public java.lang.String getFormat() {
		return format;
	}

	public NotificationParamsVO setFormat(java.lang.String newFormat) {
		this.format = newFormat;
		return this;
	}


	public EndpointVO getEndpoint() {
		return endpoint;
	}

	public NotificationParamsVO setEndpoint(EndpointVO newEndpoint) {
		this.endpoint = newEndpoint;
		return this;
	}


	public Status getStatus() {
		return status;
	}

	public NotificationParamsVO setStatus(Status newStatus) {
		this.status = newStatus;
		return this;
	}


	public java.lang.Double getTimesSent() {
		return timesSent;
	}

	public NotificationParamsVO setTimesSent(java.lang.Double newTimesSent) {
		this.timesSent = newTimesSent;
		return this;
	}


	public java.util.Date getLastNotification() {
		return lastNotification;
	}

	public NotificationParamsVO setLastNotification(java.util.Date newLastNotification) {
		this.lastNotification = newLastNotification;
		return this;
	}


	public java.util.Date getLastFailure() {
		return lastFailure;
	}

	public NotificationParamsVO setLastFailure(java.util.Date newLastFailure) {
		this.lastFailure = newLastFailure;
		return this;
	}


	public java.util.Date getLastSuccess() {
		return lastSuccess;
	}

	public NotificationParamsVO setLastSuccess(java.util.Date newLastSuccess) {
		this.lastSuccess = newLastSuccess;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Status {

	OK("ok"),
	FAILED("failed");

	public static final java.lang.String OK_VALUE = "ok";
	public static final java.lang.String FAILED_VALUE = "failed";

	private final java.lang.String value;

	private Status(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Status toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Status> toOptional(java.lang.String value) {
		return java.util.Arrays
				.stream(values())
				.filter(e -> e.value.equals(value))
				.findAny();
	}

	@com.fasterxml.jackson.annotation.JsonValue
	public java.lang.String getValue() {
		return value;
	}
}
}

