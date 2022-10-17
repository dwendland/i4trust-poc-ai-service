package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class SubscriptionFragmentVO {

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


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		SubscriptionFragmentVO other = (SubscriptionFragmentVO) object;
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
				&& java.util.Objects.equals(csf, other.csf);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(atContext, entities, name, description, watchedAttributes, timeInterval, expires, isActive, throttling, q, geoQ, csf);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("SubscriptionFragmentVO[")
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
				.append("csf=").append(csf)
				.append("]")
				.toString();
	}

	// fluent

	public SubscriptionFragmentVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public SubscriptionFragmentVO entities(java.util.List<EntityInfoVO> newEntities) {
		this.entities = newEntities;
		return this;
	}

	public java.util.List<EntityInfoVO> entities() {
		return entities;
	}

	public SubscriptionFragmentVO name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public java.lang.String name() {
		return name;
	}

	public SubscriptionFragmentVO description(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}

	public java.lang.String description() {
		return description;
	}

	public SubscriptionFragmentVO watchedAttributes(java.util.Set<java.lang.String> newWatchedAttributes) {
		this.watchedAttributes = newWatchedAttributes;
		return this;
	}

	public java.util.Set<java.lang.String> watchedAttributes() {
		return watchedAttributes;
	}

	public SubscriptionFragmentVO timeInterval(java.lang.Double newTimeInterval) {
		this.timeInterval = newTimeInterval;
		return this;
	}

	public java.lang.Double timeInterval() {
		return timeInterval;
	}

	public SubscriptionFragmentVO expires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}

	public java.util.Date expires() {
		return expires;
	}

	public SubscriptionFragmentVO isActive(java.lang.Boolean newIsActive) {
		this.isActive = newIsActive;
		return this;
	}

	public java.lang.Boolean isActive() {
		return isActive;
	}

	public SubscriptionFragmentVO throttling(java.lang.Double newThrottling) {
		this.throttling = newThrottling;
		return this;
	}

	public java.lang.Double throttling() {
		return throttling;
	}

	public SubscriptionFragmentVO q(java.lang.String newQ) {
		this.q = newQ;
		return this;
	}

	public java.lang.String q() {
		return q;
	}

	public SubscriptionFragmentVO geoQ(GeoQueryVO newGeoQ) {
		this.geoQ = newGeoQ;
		return this;
	}

	public GeoQueryVO geoQ() {
		return geoQ;
	}

	public SubscriptionFragmentVO csf(java.lang.String newCsf) {
		this.csf = newCsf;
		return this;
	}

	public java.lang.String csf() {
		return csf;
	}


	// getter/setter
	public Object getAtContext() {
		return atContext;
	}

	public SubscriptionFragmentVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public java.util.List<EntityInfoVO> getEntities() {
		return entities;
	}

	public SubscriptionFragmentVO setEntities(java.util.List<EntityInfoVO> newEntities) {
		this.entities = newEntities;
		return this;
	}

	public SubscriptionFragmentVO addEntitiesItem(EntityInfoVO entitiesItem) {
		if (this.entities == null) {
			this.entities = new java.util.ArrayList<>();
		}
		this.entities.add(entitiesItem);
		return this;
	}

	public java.lang.String getName() {
		return name;
	}

	public SubscriptionFragmentVO setName(java.lang.String newName) {
		this.name = newName;
		return this;
	}


	public java.lang.String getDescription() {
		return description;
	}

	public SubscriptionFragmentVO setDescription(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}


	public java.util.Set<java.lang.String> getWatchedAttributes() {
		return watchedAttributes;
	}

	public SubscriptionFragmentVO setWatchedAttributes(java.util.Set<java.lang.String> newWatchedAttributes) {
		this.watchedAttributes = newWatchedAttributes;
		return this;
	}

	public SubscriptionFragmentVO addWatchedAttributesItem(java.lang.String watchedAttributesItem) {
		if (this.watchedAttributes == null) {
			this.watchedAttributes = new java.util.LinkedHashSet<>();
		}
		this.watchedAttributes.add(watchedAttributesItem);
		return this;
	}

	public java.lang.Double getTimeInterval() {
		return timeInterval;
	}

	public SubscriptionFragmentVO setTimeInterval(java.lang.Double newTimeInterval) {
		this.timeInterval = newTimeInterval;
		return this;
	}


	public java.util.Date getExpires() {
		return expires;
	}

	public SubscriptionFragmentVO setExpires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}


	public java.lang.Boolean getIsActive() {
		return isActive;
	}

	public SubscriptionFragmentVO setIsActive(java.lang.Boolean newIsActive) {
		this.isActive = newIsActive;
		return this;
	}


	public java.lang.Double getThrottling() {
		return throttling;
	}

	public SubscriptionFragmentVO setThrottling(java.lang.Double newThrottling) {
		this.throttling = newThrottling;
		return this;
	}


	public java.lang.String getQ() {
		return q;
	}

	public SubscriptionFragmentVO setQ(java.lang.String newQ) {
		this.q = newQ;
		return this;
	}


	public GeoQueryVO getGeoQ() {
		return geoQ;
	}

	public SubscriptionFragmentVO setGeoQ(GeoQueryVO newGeoQ) {
		this.geoQ = newGeoQ;
		return this;
	}


	public java.lang.String getCsf() {
		return csf;
	}

	public SubscriptionFragmentVO setCsf(java.lang.String newCsf) {
		this.csf = newCsf;
		return this;
	}




    
}

