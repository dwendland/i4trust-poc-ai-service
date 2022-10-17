package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class SubscriptionVO {

	public static final String JSON_PROPERTY_AT_CONTEXT = "@context";
	public static final String JSON_PROPERTY_ENTITIES = "entities";
	public static final String JSON_PROPERTY_NAME = "name";
	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	public static final String JSON_PROPERTY_WATCHED_ATTRIBUTES = "watchedAttributes";
	public static final String JSON_PROPERTY_TIME_INTERVAL = "timeInterval";
	public static final String JSON_PROPERTY_EXPIRES = "expires";
	public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
	public static final String JSON_PROPERTY_THROTTLING = "throttling";
	public static final String JSON_PROPERTY_Q = "q";
	public static final String JSON_PROPERTY_GEO_Q = "geoQ";
	public static final String JSON_PROPERTY_CSF = "csf";
	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_NOTIFICATION = "notification";
	public static final String JSON_PROPERTY_STATUS = "status";
	public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
	public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_CONTEXT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Object atContext;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ENTITIES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<EntityInfoVO> entities;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String name;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DESCRIPTION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String description;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WATCHED_ATTRIBUTES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.String> watchedAttributes;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TIME_INTERVAL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double timeInterval;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EXPIRES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date expires;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_IS_ACTIVE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Boolean isActive;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_THROTTLING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double throttling;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_Q)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String q;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_GEO_Q)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeoQueryVO geoQ = new GeoQueryVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CSF)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String csf;

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
		SubscriptionVO other = (SubscriptionVO) object;
		return java.util.Objects.equals(atContext, other.atContext)
				&& java.util.Objects.equals(entities, other.entities)
				&& java.util.Objects.equals(name, other.name)
				&& java.util.Objects.equals(description, other.description)
				&& java.util.Objects.equals(watchedAttributes, other.watchedAttributes)
				&& java.util.Objects.equals(timeInterval, other.timeInterval)
				&& java.util.Objects.equals(expires, other.expires)
				&& java.util.Objects.equals(isActive, other.isActive)
				&& java.util.Objects.equals(throttling, other.throttling)
				&& java.util.Objects.equals(q, other.q)
				&& java.util.Objects.equals(geoQ, other.geoQ)
				&& java.util.Objects.equals(csf, other.csf)
				&& java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(notification, other.notification)
				&& java.util.Objects.equals(status, other.status)
				&& java.util.Objects.equals(createdAt, other.createdAt)
				&& java.util.Objects.equals(modifiedAt, other.modifiedAt);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(atContext, entities, name, description, watchedAttributes, timeInterval, expires, isActive, throttling, q, geoQ, csf, id, type, notification, status, createdAt, modifiedAt);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("SubscriptionVO[")
				.append("atContext=").append(atContext).append(",")
				.append("entities=").append(entities).append(",")
				.append("name=").append(name).append(",")
				.append("description=").append(description).append(",")
				.append("watchedAttributes=").append(watchedAttributes).append(",")
				.append("timeInterval=").append(timeInterval).append(",")
				.append("expires=").append(expires).append(",")
				.append("isActive=").append(isActive).append(",")
				.append("throttling=").append(throttling).append(",")
				.append("q=").append(q).append(",")
				.append("geoQ=").append(geoQ).append(",")
				.append("csf=").append(csf).append(",")
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

	public SubscriptionVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public SubscriptionVO entities(java.util.List<EntityInfoVO> newEntities) {
		this.entities = newEntities;
		return this;
	}

	public java.util.List<EntityInfoVO> entities() {
		return entities;
	}

	public SubscriptionVO name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public java.lang.String name() {
		return name;
	}

	public SubscriptionVO description(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}

	public java.lang.String description() {
		return description;
	}

	public SubscriptionVO watchedAttributes(java.util.Set<java.lang.String> newWatchedAttributes) {
		this.watchedAttributes = newWatchedAttributes;
		return this;
	}

	public java.util.Set<java.lang.String> watchedAttributes() {
		return watchedAttributes;
	}

	public SubscriptionVO timeInterval(java.lang.Double newTimeInterval) {
		this.timeInterval = newTimeInterval;
		return this;
	}

	public java.lang.Double timeInterval() {
		return timeInterval;
	}

	public SubscriptionVO expires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}

	public java.util.Date expires() {
		return expires;
	}

	public SubscriptionVO isActive(java.lang.Boolean newIsActive) {
		this.isActive = newIsActive;
		return this;
	}

	public java.lang.Boolean isActive() {
		return isActive;
	}

	public SubscriptionVO throttling(java.lang.Double newThrottling) {
		this.throttling = newThrottling;
		return this;
	}

	public java.lang.Double throttling() {
		return throttling;
	}

	public SubscriptionVO q(java.lang.String newQ) {
		this.q = newQ;
		return this;
	}

	public java.lang.String q() {
		return q;
	}

	public SubscriptionVO geoQ(GeoQueryVO newGeoQ) {
		this.geoQ = newGeoQ;
		return this;
	}

	public GeoQueryVO geoQ() {
		return geoQ;
	}

	public SubscriptionVO csf(java.lang.String newCsf) {
		this.csf = newCsf;
		return this;
	}

	public java.lang.String csf() {
		return csf;
	}

	public SubscriptionVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public SubscriptionVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public SubscriptionVO notification(NotificationParamsVO newNotification) {
		this.notification = newNotification;
		return this;
	}

	public NotificationParamsVO notification() {
		return notification;
	}

	public SubscriptionVO status(Status newStatus) {
		this.status = newStatus;
		return this;
	}

	public Status status() {
		return status;
	}

	public SubscriptionVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public SubscriptionVO modifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}

	public java.util.Date modifiedAt() {
		return modifiedAt;
	}


	// getter/setter
	public Object getAtContext() {
		return atContext;
	}

	public SubscriptionVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public java.util.List<EntityInfoVO> getEntities() {
		return entities;
	}

	public SubscriptionVO setEntities(java.util.List<EntityInfoVO> newEntities) {
		this.entities = newEntities;
		return this;
	}

	public SubscriptionVO addEntitiesItem(EntityInfoVO entitiesItem) {
		if (this.entities == null) {
			this.entities = new java.util.ArrayList<>();
		}
		this.entities.add(entitiesItem);
		return this;
	}

	public java.lang.String getName() {
		return name;
	}

	public SubscriptionVO setName(java.lang.String newName) {
		this.name = newName;
		return this;
	}


	public java.lang.String getDescription() {
		return description;
	}

	public SubscriptionVO setDescription(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}


	public java.util.Set<java.lang.String> getWatchedAttributes() {
		return watchedAttributes;
	}

	public SubscriptionVO setWatchedAttributes(java.util.Set<java.lang.String> newWatchedAttributes) {
		this.watchedAttributes = newWatchedAttributes;
		return this;
	}

	public SubscriptionVO addWatchedAttributesItem(java.lang.String watchedAttributesItem) {
		if (this.watchedAttributes == null) {
			this.watchedAttributes = new java.util.LinkedHashSet<>();
		}
		this.watchedAttributes.add(watchedAttributesItem);
		return this;
	}

	public java.lang.Double getTimeInterval() {
		return timeInterval;
	}

	public SubscriptionVO setTimeInterval(java.lang.Double newTimeInterval) {
		this.timeInterval = newTimeInterval;
		return this;
	}


	public java.util.Date getExpires() {
		return expires;
	}

	public SubscriptionVO setExpires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}


	public java.lang.Boolean getIsActive() {
		return isActive;
	}

	public SubscriptionVO setIsActive(java.lang.Boolean newIsActive) {
		this.isActive = newIsActive;
		return this;
	}


	public java.lang.Double getThrottling() {
		return throttling;
	}

	public SubscriptionVO setThrottling(java.lang.Double newThrottling) {
		this.throttling = newThrottling;
		return this;
	}


	public java.lang.String getQ() {
		return q;
	}

	public SubscriptionVO setQ(java.lang.String newQ) {
		this.q = newQ;
		return this;
	}


	public GeoQueryVO getGeoQ() {
		return geoQ;
	}

	public SubscriptionVO setGeoQ(GeoQueryVO newGeoQ) {
		this.geoQ = newGeoQ;
		return this;
	}


	public java.lang.String getCsf() {
		return csf;
	}

	public SubscriptionVO setCsf(java.lang.String newCsf) {
		this.csf = newCsf;
		return this;
	}


	public java.net.URI getId() {
		return id;
	}

	public SubscriptionVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public Type getType() {
		return type;
	}

	public SubscriptionVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public NotificationParamsVO getNotification() {
		return notification;
	}

	public SubscriptionVO setNotification(NotificationParamsVO newNotification) {
		this.notification = newNotification;
		return this;
	}


	public Status getStatus() {
		return status;
	}

	public SubscriptionVO setStatus(Status newStatus) {
		this.status = newStatus;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public SubscriptionVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public SubscriptionVO setModifiedAt(java.util.Date newModifiedAt) {
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

