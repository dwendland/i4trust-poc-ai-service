package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class EntityTemporalFragmentVO {

	public static final String JSON_PROPERTY_AT_CONTEXT = "@context";
	public static final String JSON_PROPERTY_LOCATION = "location";
	public static final String JSON_PROPERTY_OBSERVATION_SPACE = "observationSpace";
	public static final String JSON_PROPERTY_OPERATION_SPACE = "operationSpace";
	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";

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
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI id;

	/** NGSI-LD Name */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String type;


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
		EntityTemporalFragmentVO other = (EntityTemporalFragmentVO) object;
		return java.util.Objects.equals(atContext, other.atContext)
				&& java.util.Objects.equals(location, other.location)
				&& java.util.Objects.equals(observationSpace, other.observationSpace)
				&& java.util.Objects.equals(operationSpace, other.operationSpace)
				&& java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(atContext, location, observationSpace, operationSpace, id, type);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("EntityTemporalFragmentVO[")
				.append("atContext=").append(atContext).append(",")
				.append("location=").append(location).append(",")
				.append("observationSpace=").append(observationSpace).append(",")
				.append("operationSpace=").append(operationSpace).append(",")
				.append("id=").append(id).append(",")
				.append("type=").append(type)
				.append("]")
				.toString();
	}

	// fluent

	public EntityTemporalFragmentVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public EntityTemporalFragmentVO location(java.util.List<GeoPropertyVO> newLocation) {
		this.location = newLocation;
		return this;
	}

	public java.util.List<GeoPropertyVO> location() {
		return location;
	}

	public EntityTemporalFragmentVO observationSpace(java.util.List<GeoPropertyVO> newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public java.util.List<GeoPropertyVO> observationSpace() {
		return observationSpace;
	}

	public EntityTemporalFragmentVO operationSpace(java.util.List<GeoPropertyVO> newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public java.util.List<GeoPropertyVO> operationSpace() {
		return operationSpace;
	}

	public EntityTemporalFragmentVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public EntityTemporalFragmentVO type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public java.lang.String type() {
		return type;
	}


	// getter/setter

	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public EntityTemporalFragmentVO setAdditionalProperties(java.lang.String propertyKey, java.lang.Object value) {
	    if (this.additionalProperties == null) {
            this.additionalProperties = new java.util.HashMap<>();
        }
        this.additionalProperties.put(propertyKey, value);
        return this;
	}

	public EntityTemporalFragmentVO setAdditionalProperties(java.util.Map<java.lang.String, java.lang.Object> newAdditionalProperties) {
	this.additionalProperties = newAdditionalProperties;
	return this;
    }


	public Object getAtContext() {
		return atContext;
	}

	public EntityTemporalFragmentVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public java.util.List<GeoPropertyVO> getLocation() {
		return location;
	}

	public EntityTemporalFragmentVO setLocation(java.util.List<GeoPropertyVO> newLocation) {
		this.location = newLocation;
		return this;
	}

	public EntityTemporalFragmentVO addLocationItem(GeoPropertyVO locationItem) {
		if (this.location == null) {
			this.location = new java.util.ArrayList<>();
		}
		this.location.add(locationItem);
		return this;
	}

	public java.util.List<GeoPropertyVO> getObservationSpace() {
		return observationSpace;
	}

	public EntityTemporalFragmentVO setObservationSpace(java.util.List<GeoPropertyVO> newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public EntityTemporalFragmentVO addObservationSpaceItem(GeoPropertyVO observationSpaceItem) {
		if (this.observationSpace == null) {
			this.observationSpace = new java.util.ArrayList<>();
		}
		this.observationSpace.add(observationSpaceItem);
		return this;
	}

	public java.util.List<GeoPropertyVO> getOperationSpace() {
		return operationSpace;
	}

	public EntityTemporalFragmentVO setOperationSpace(java.util.List<GeoPropertyVO> newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public EntityTemporalFragmentVO addOperationSpaceItem(GeoPropertyVO operationSpaceItem) {
		if (this.operationSpace == null) {
			this.operationSpace = new java.util.ArrayList<>();
		}
		this.operationSpace.add(operationSpaceItem);
		return this;
	}

	public java.net.URI getId() {
		return id;
	}

	public EntityTemporalFragmentVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public java.lang.String getType() {
		return type;
	}

	public EntityTemporalFragmentVO setType(java.lang.String newType) {
		this.type = newType;
		return this;
	}




    
}

