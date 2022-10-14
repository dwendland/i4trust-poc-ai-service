package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class ContextSourceRegistrationAllOfVO {

	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
	public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.net.URI id;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private Type type;

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
		ContextSourceRegistrationAllOfVO other = (ContextSourceRegistrationAllOfVO) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(createdAt, other.createdAt)
				&& java.util.Objects.equals(modifiedAt, other.modifiedAt);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, type, createdAt, modifiedAt);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("ContextSourceRegistrationAllOfVO[")
				.append("id=").append(id).append(",")
				.append("type=").append(type).append(",")
				.append("createdAt=").append(createdAt).append(",")
				.append("modifiedAt=").append(modifiedAt)
				.append("]")
				.toString();
	}

	// fluent

	public ContextSourceRegistrationAllOfVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public ContextSourceRegistrationAllOfVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public ContextSourceRegistrationAllOfVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public ContextSourceRegistrationAllOfVO modifiedAt(java.util.Date newModifiedAt) {
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

	public ContextSourceRegistrationAllOfVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public Type getType() {
		return type;
	}

	public ContextSourceRegistrationAllOfVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public ContextSourceRegistrationAllOfVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public ContextSourceRegistrationAllOfVO setModifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	CONTEXTSOURCEREGISTRATION("ContextSourceRegistration");

	public static final java.lang.String CONTEXTSOURCEREGISTRATION_VALUE = "ContextSourceRegistration";

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

