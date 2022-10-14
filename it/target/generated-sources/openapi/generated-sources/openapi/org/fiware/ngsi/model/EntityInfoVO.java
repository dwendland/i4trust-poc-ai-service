package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class EntityInfoVO {

	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_ID_PATTERN = "idPattern";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Object id;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID_PATTERN)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String idPattern;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		EntityInfoVO other = (EntityInfoVO) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(idPattern, other.idPattern);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, type, idPattern);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("EntityInfoVO[")
				.append("id=").append(id).append(",")
				.append("type=").append(type).append(",")
				.append("idPattern=").append(idPattern)
				.append("]")
				.toString();
	}

	// fluent

	public EntityInfoVO id(Object newId) {
		this.id = newId;
		return this;
	}

	public Object id() {
		return id;
	}

	public EntityInfoVO type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public java.lang.String type() {
		return type;
	}

	public EntityInfoVO idPattern(java.lang.String newIdPattern) {
		this.idPattern = newIdPattern;
		return this;
	}

	public java.lang.String idPattern() {
		return idPattern;
	}


	// getter/setter
	public Object getId() {
		return id;
	}

	public EntityInfoVO setId(Object newId) {
		this.id = newId;
		return this;
	}


	public java.lang.String getType() {
		return type;
	}

	public EntityInfoVO setType(java.lang.String newType) {
		this.type = newType;
		return this;
	}


	public java.lang.String getIdPattern() {
		return idPattern;
	}

	public EntityInfoVO setIdPattern(java.lang.String newIdPattern) {
		this.idPattern = newIdPattern;
		return this;
	}




    
}

