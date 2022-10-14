package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class EntityTemporalVO {

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
	private java.util.List<GeoPropertyVO> location;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OBSERVATION_SPACE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<GeoPropertyVO> observationSpace;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPERATION_SPACE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<GeoPropertyVO> operationSpace;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.net.URI id;

	/** NGSI-LD Name */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
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
		EntityTemporalVO other = (EntityTemporalVO) object;
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
				.append("EntityTemporalVO[")
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

	public EntityTemporalVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public EntityTemporalVO location(java.util.List<GeoPropertyVO> newLocation) {
		this.location = newLocation;
		return this;
	}

	public java.util.List<GeoPropertyVO> location() {
		return location;
	}

	public EntityTemporalVO observationSpace(java.util.List<GeoPropertyVO> newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public java.util.List<GeoPropertyVO> observationSpace() {
		return observationSpace;
	}

	public EntityTemporalVO operationSpace(java.util.List<GeoPropertyVO> newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public java.util.List<GeoPropertyVO> operationSpace() {
		return operationSpace;
	}

	public EntityTemporalVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public EntityTemporalVO type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public java.lang.String type() {
		return type;
	}

	public EntityTemporalVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public EntityTemporalVO modifiedAt(java.util.Date newModifiedAt) {
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
	public EntityTemporalVO setAdditionalProperties(java.lang.String propertyKey, java.lang.Object value) {
	    if (this.additionalProperties == null) {
            this.additionalProperties = new java.util.HashMap<>();
        }
        this.additionalProperties.put(propertyKey, value);
        return this;
	}

	public EntityTemporalVO setAdditionalProperties(java.util.Map<java.lang.String, java.lang.Object> newAdditionalProperties) {
	this.additionalProperties = newAdditionalProperties;
	return this;
    }


	public Object getAtContext() {
		return atContext;
	}

	public EntityTemporalVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public java.util.List<GeoPropertyVO> getLocation() {
		return location;
	}

	public EntityTemporalVO setLocation(java.util.List<GeoPropertyVO> newLocation) {
		this.location = newLocation;
		return this;
	}

	public EntityTemporalVO addLocationItem(GeoPropertyVO locationItem) {
		if (this.location == null) {
			this.location = new java.util.ArrayList<>();
		}
		this.location.add(locationItem);
		return this;
	}

	public java.util.List<GeoPropertyVO> getObservationSpace() {
		return observationSpace;
	}

	public EntityTemporalVO setObservationSpace(java.util.List<GeoPropertyVO> newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public EntityTemporalVO addObservationSpaceItem(GeoPropertyVO observationSpaceItem) {
		if (this.observationSpace == null) {
			this.observationSpace = new java.util.ArrayList<>();
		}
		this.observationSpace.add(observationSpaceItem);
		return this;
	}

	public java.util.List<GeoPropertyVO> getOperationSpace() {
		return operationSpace;
	}

	public EntityTemporalVO setOperationSpace(java.util.List<GeoPropertyVO> newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public EntityTemporalVO addOperationSpaceItem(GeoPropertyVO operationSpaceItem) {
		if (this.operationSpace == null) {
			this.operationSpace = new java.util.ArrayList<>();
		}
		this.operationSpace.add(operationSpaceItem);
		return this;
	}

	public java.net.URI getId() {
		return id;
	}

	public EntityTemporalVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public java.lang.String getType() {
		return type;
	}

	public EntityTemporalVO setType(java.lang.String newType) {
		this.type = newType;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public EntityTemporalVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public EntityTemporalVO setModifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}




    
}

