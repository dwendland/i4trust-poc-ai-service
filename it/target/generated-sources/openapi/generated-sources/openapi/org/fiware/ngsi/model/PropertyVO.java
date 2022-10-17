package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class PropertyVO {

	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_VALUE = "value";
	public static final String JSON_PROPERTY_OBSERVED_AT = "observedAt";
	public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
	public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
	public static final String JSON_PROPERTY_DATASET_ID = "datasetId";
	public static final String JSON_PROPERTY_INSTANCE_ID = "instanceId";
	public static final String JSON_PROPERTY_UNIT_CODE = "unitCode";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private Type type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_VALUE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.Object value;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OBSERVED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date observedAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CREATED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date createdAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MODIFIED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date modifiedAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATASET_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI datasetId;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_INSTANCE_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI instanceId;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_UNIT_CODE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String unitCode;


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
		PropertyVO other = (PropertyVO) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(value, other.value)
				&& java.util.Objects.equals(observedAt, other.observedAt)
				&& java.util.Objects.equals(createdAt, other.createdAt)
				&& java.util.Objects.equals(modifiedAt, other.modifiedAt)
				&& java.util.Objects.equals(datasetId, other.datasetId)
				&& java.util.Objects.equals(instanceId, other.instanceId)
				&& java.util.Objects.equals(unitCode, other.unitCode);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, value, observedAt, createdAt, modifiedAt, datasetId, instanceId, unitCode);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("PropertyVO[")
				.append("type=").append(type).append(",")
				.append("value=").append(value).append(",")
				.append("observedAt=").append(observedAt).append(",")
				.append("createdAt=").append(createdAt).append(",")
				.append("modifiedAt=").append(modifiedAt).append(",")
				.append("datasetId=").append(datasetId).append(",")
				.append("instanceId=").append(instanceId).append(",")
				.append("unitCode=").append(unitCode)
				.append("]")
				.toString();
	}

	// fluent

	public PropertyVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public PropertyVO value(java.lang.Object newValue) {
		this.value = newValue;
		return this;
	}

	public java.lang.Object value() {
		return value;
	}

	public PropertyVO observedAt(java.util.Date newObservedAt) {
		this.observedAt = newObservedAt;
		return this;
	}

	public java.util.Date observedAt() {
		return observedAt;
	}

	public PropertyVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public PropertyVO modifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}

	public java.util.Date modifiedAt() {
		return modifiedAt;
	}

	public PropertyVO datasetId(java.net.URI newDatasetId) {
		this.datasetId = newDatasetId;
		return this;
	}

	public java.net.URI datasetId() {
		return datasetId;
	}

	public PropertyVO instanceId(java.net.URI newInstanceId) {
		this.instanceId = newInstanceId;
		return this;
	}

	public java.net.URI instanceId() {
		return instanceId;
	}

	public PropertyVO unitCode(java.lang.String newUnitCode) {
		this.unitCode = newUnitCode;
		return this;
	}

	public java.lang.String unitCode() {
		return unitCode;
	}


	// getter/setter

	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public PropertyVO setAdditionalProperties(java.lang.String propertyKey, java.lang.Object value) {
	    if (this.additionalProperties == null) {
            this.additionalProperties = new java.util.HashMap<>();
        }
        this.additionalProperties.put(propertyKey, value);
        return this;
	}

	public PropertyVO setAdditionalProperties(java.util.Map<java.lang.String, java.lang.Object> newAdditionalProperties) {
	this.additionalProperties = newAdditionalProperties;
	return this;
    }


	public Type getType() {
		return type;
	}

	public PropertyVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public java.lang.Object getValue() {
		return value;
	}

	public PropertyVO setValue(java.lang.Object newValue) {
		this.value = newValue;
		return this;
	}


	public java.util.Date getObservedAt() {
		return observedAt;
	}

	public PropertyVO setObservedAt(java.util.Date newObservedAt) {
		this.observedAt = newObservedAt;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public PropertyVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public PropertyVO setModifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}


	public java.net.URI getDatasetId() {
		return datasetId;
	}

	public PropertyVO setDatasetId(java.net.URI newDatasetId) {
		this.datasetId = newDatasetId;
		return this;
	}


	public java.net.URI getInstanceId() {
		return instanceId;
	}

	public PropertyVO setInstanceId(java.net.URI newInstanceId) {
		this.instanceId = newInstanceId;
		return this;
	}


	public java.lang.String getUnitCode() {
		return unitCode;
	}

	public PropertyVO setUnitCode(java.lang.String newUnitCode) {
		this.unitCode = newUnitCode;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	PROPERTY("Property");

	public static final java.lang.String PROPERTY_VALUE = "Property";

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
}

