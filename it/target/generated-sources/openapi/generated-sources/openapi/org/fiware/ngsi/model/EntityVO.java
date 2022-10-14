package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class EntityVO {

	public static final String JSON_PROPERTY_AT_CONTEXT = "@context";
	public static final String JSON_PROPERTY_LOCATION = "location";
	public static final String JSON_PROPERTY_OBSERVATION_SPACE = "observationSpace";
	public static final String JSON_PROPERTY_OPERATION_SPACE = "operationSpace";
	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
	public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_CONTEXT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Object atContext;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_LOCATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeoPropertyVO location = new GeoPropertyVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OBSERVATION_SPACE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeoPropertyVO observationSpace = new GeoPropertyVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPERATION_SPACE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeoPropertyVO operationSpace = new GeoPropertyVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI id;

	/** NGSI-LD Name */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CREATED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date createdAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MODIFIED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date modifiedAt;


	private java.util.Map<java.lang.String, java.lang.Object> additionalProperties;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		EntityVO other = (EntityVO) object;
		return java.util.Objects.equals(atContext, other.atContext)
				&& java.util.Objects.equals(location, other.location)
				&& java.util.Objects.equals(observationSpace, other.observationSpace)
				&& java.util.Objects.equals(operationSpace, other.operationSpace)
				&& java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(createdAt, other.createdAt)
				&& java.util.Objects.equals(modifiedAt, other.modifiedAt);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(atContext, location, observationSpace, operationSpace, id, type, createdAt, modifiedAt);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("EntityVO[")
				.append("atContext=").append(atContext).append(",")
				.append("location=").append(location).append(",")
				.append("observationSpace=").append(observationSpace).append(",")
				.append("operationSpace=").append(operationSpace).append(",")
				.append("id=").append(id).append(",")
				.append("type=").append(type).append(",")
				.append("createdAt=").append(createdAt).append(",")
				.append("modifiedAt=").append(modifiedAt)
				.append("]")
				.toString();
	}

	// fluent

	public EntityVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public EntityVO location(GeoPropertyVO newLocation) {
		this.location = newLocation;
		return this;
	}

	public GeoPropertyVO location() {
		return location;
	}

	public EntityVO observationSpace(GeoPropertyVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public GeoPropertyVO observationSpace() {
		return observationSpace;
	}

	public EntityVO operationSpace(GeoPropertyVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public GeoPropertyVO operationSpace() {
		return operationSpace;
	}

	public EntityVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public EntityVO type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public java.lang.String type() {
		return type;
	}

	public EntityVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public EntityVO modifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}

	public java.util.Date modifiedAt() {
		return modifiedAt;
	}


	// getter/setter

	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public EntityVO setAdditionalProperties(java.lang.String propertyKey, java.lang.Object value) {
	    if (this.additionalProperties == null) {
            this.additionalProperties = new java.util.HashMap<>();
        }
        this.additionalProperties.put(propertyKey, value);
        return this;
	}

	public EntityVO setAdditionalProperties(java.util.Map<java.lang.String, java.lang.Object> newAdditionalProperties) {
	this.additionalProperties = newAdditionalProperties;
	return this;
    }


	public Object getAtContext() {
		return atContext;
	}

	public EntityVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public GeoPropertyVO getLocation() {
		return location;
	}

	public EntityVO setLocation(GeoPropertyVO newLocation) {
		this.location = newLocation;
		return this;
	}


	public GeoPropertyVO getObservationSpace() {
		return observationSpace;
	}

	public EntityVO setObservationSpace(GeoPropertyVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}


	public GeoPropertyVO getOperationSpace() {
		return operationSpace;
	}

	public EntityVO setOperationSpace(GeoPropertyVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}


	public java.net.URI getId() {
		return id;
	}

	public EntityVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public java.lang.String getType() {
		return type;
	}

	public EntityVO setType(java.lang.String newType) {
		this.type = newType;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public EntityVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public EntityVO setModifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}




    
}

