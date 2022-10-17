package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class SubscriptionAllOfVO {

	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_NOTIFICATION = "notification";
	public static final String JSON_PROPERTY_STATUS = "status";
	public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
	public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI id;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Type type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NOTIFICATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private NotificationParamsVO notification = new NotificationParamsVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STATUS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Status status;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CREATED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date createdAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MODIFIED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date modifiedAt;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		SubscriptionAllOfVO other = (SubscriptionAllOfVO) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(notification, other.notification)
				&& java.util.Objects.equals(status, other.status)
				&& java.util.Objects.equals(createdAt, other.createdAt)
				&& java.util.Objects.equals(modifiedAt, other.modifiedAt);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, type, notification, status, createdAt, modifiedAt);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("SubscriptionAllOfVO[")
				.append("id=").append(id).append(",")
				.append("type=").append(type).append(",")
				.append("notification=").append(notification).append(",")
				.append("status=").append(status).append(",")
				.append("createdAt=").append(createdAt).append(",")
				.append("modifiedAt=").append(modifiedAt)
				.append("]")
				.toString();
	}

	// fluent

	public SubscriptionAllOfVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public SubscriptionAllOfVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public SubscriptionAllOfVO notification(NotificationParamsVO newNotification) {
		this.notification = newNotification;
		return this;
	}

	public NotificationParamsVO notification() {
		return notification;
	}

	public SubscriptionAllOfVO status(Status newStatus) {
		this.status = newStatus;
		return this;
	}

	public Status status() {
		return status;
	}

	public SubscriptionAllOfVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public SubscriptionAllOfVO modifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}

	public java.util.Date modifiedAt() {
		return modifiedAt;
	}


	// getter/setter
	public java.net.URI getId() {
		return id;
	}

	public SubscriptionAllOfVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public Type getType() {
		return type;
	}

	public SubscriptionAllOfVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public NotificationParamsVO getNotification() {
		return notification;
	}

	public SubscriptionAllOfVO setNotification(NotificationParamsVO newNotification) {
		this.notification = newNotification;
		return this;
	}


	public Status getStatus() {
		return status;
	}

	public SubscriptionAllOfVO setStatus(Status newStatus) {
		this.status = newStatus;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public SubscriptionAllOfVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public SubscriptionAllOfVO setModifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	SUBSCRIPTION("Subscription");

	public static final java.lang.String SUBSCRIPTION_VALUE = "Subscription";

	private final java.lang.String value;

	private Type(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Type toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Type> toOptional(java.lang.String value) {
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

@io.micronaut.core.annotation.Introspected
public enum Status {

	ACTIVE("active"),
	PAUSED("paused"),
	EXPIRED("expired");

	public static final java.lang.String ACTIVE_VALUE = "active";
	public static final java.lang.String PAUSED_VALUE = "paused";
	public static final java.lang.String EXPIRED_VALUE = "expired";

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

