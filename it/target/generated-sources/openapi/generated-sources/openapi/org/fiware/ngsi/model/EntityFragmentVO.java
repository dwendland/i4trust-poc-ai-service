package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class EntityFragmentVO {

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
		EntityFragmentVO other = (EntityFragmentVO) object;
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
				.append("EntityFragmentVO[")
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

	public EntityFragmentVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public EntityFragmentVO location(GeoPropertyVO newLocation) {
		this.location = newLocation;
		return this;
	}

	public GeoPropertyVO location() {
		return location;
	}

	public EntityFragmentVO observationSpace(GeoPropertyVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public GeoPropertyVO observationSpace() {
		return observationSpace;
	}

	public EntityFragmentVO operationSpace(GeoPropertyVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public GeoPropertyVO operationSpace() {
		return operationSpace;
	}

	public EntityFragmentVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public EntityFragmentVO type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public java.lang.String type() {
		return type;
	}

	public EntityFragmentVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public EntityFragmentVO modifiedAt(java.util.Date newModifiedAt) {
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
	public EntityFragmentVO setAdditionalProperties(java.lang.String propertyKey, java.lang.Object value) {
	    if (this.additionalProperties == null) {
            this.additionalProperties = new java.util.HashMap<>();
        }
        this.additionalProperties.put(propertyKey, value);
        return this;
	}

	public EntityFragmentVO setAdditionalProperties(java.util.Map<java.lang.String, java.lang.Object> newAdditionalProperties) {
	this.additionalProperties = newAdditionalProperties;
	return this;
    }


	public Object getAtContext() {
		return atContext;
	}

	public EntityFragmentVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public GeoPropertyVO getLocation() {
		return location;
	}

	public EntityFragmentVO setLocation(GeoPropertyVO newLocation) {
		this.location = newLocation;
		return this;
	}


	public GeoPropertyVO getObservationSpace() {
		return observationSpace;
	}

	public EntityFragmentVO setObservationSpace(GeoPropertyVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}


	public GeoPropertyVO getOperationSpace() {
		return operationSpace;
	}

	public EntityFragmentVO setOperationSpace(GeoPropertyVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}


	public java.net.URI getId() {
		return id;
	}

	public EntityFragmentVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public java.lang.String getType() {
		return type;
	}

	public EntityFragmentVO setType(java.lang.String newType) {
		this.type = newType;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public EntityFragmentVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public EntityFragmentVO setModifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}




    
}

