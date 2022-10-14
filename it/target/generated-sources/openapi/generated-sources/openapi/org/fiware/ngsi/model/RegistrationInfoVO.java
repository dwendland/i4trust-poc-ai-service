package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class RegistrationInfoVO {

	public static final String JSON_PROPERTY_ENTITIES = "entities";
	public static final String JSON_PROPERTY_PROPERTIES = "properties";
	public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ENTITIES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<EntityInfoVO> entities;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_PROPERTIES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.String> properties;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.String> relationships;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		RegistrationInfoVO other = (RegistrationInfoVO) object;
		return java.util.Objects.equals(entities, other.entities)
				&& java.util.Objects.equals(properties, other.properties)
				&& java.util.Objects.equals(relationships, other.relationships);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(entities, properties, relationships);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("RegistrationInfoVO[")
				.append("entities=").append(entities).append(",")
				.append("properties=").append(properties).append(",")
				.append("relationships=").append(relationships)
				.append("]")
				.toString();
	}

	// fluent

	public RegistrationInfoVO entities(java.util.List<EntityInfoVO> newEntities) {
		this.entities = newEntities;
		return this;
	}

	public java.util.List<EntityInfoVO> entities() {
		return entities;
	}

	public RegistrationInfoVO properties(java.util.Set<java.lang.String> newProperties) {
		this.properties = newProperties;
		return this;
	}

	public java.util.Set<java.lang.String> properties() {
		return properties;
	}

	public RegistrationInfoVO relationships(java.util.Set<java.lang.String> newRelationships) {
		this.relationships = newRelationships;
		return this;
	}

	public java.util.Set<java.lang.String> relationships() {
		return relationships;
	}


	// getter/setter
	public java.util.List<EntityInfoVO> getEntities() {
		return entities;
	}

	public RegistrationInfoVO setEntities(java.util.List<EntityInfoVO> newEntities) {
		this.entities = newEntities;
		return this;
	}

	public RegistrationInfoVO addEntitiesItem(EntityInfoVO entitiesItem) {
		if (this.entities == null) {
			this.entities = new java.util.ArrayList<>();
		}
		this.entities.add(entitiesItem);
		return this;
	}

	public java.util.Set<java.lang.String> getProperties() {
		return properties;
	}

	public RegistrationInfoVO setProperties(java.util.Set<java.lang.String> newProperties) {
		this.properties = newProperties;
		return this;
	}

	public RegistrationInfoVO addPropertiesItem(java.lang.String propertiesItem) {
		if (this.properties == null) {
			this.properties = new java.util.LinkedHashSet<>();
		}
		this.properties.add(propertiesItem);
		return this;
	}

	public java.util.Set<java.lang.String> getRelationships() {
		return relationships;
	}

	public RegistrationInfoVO setRelationships(java.util.Set<java.lang.String> newRelationships) {
		this.relationships = newRelationships;
		return this;
	}

	public RegistrationInfoVO addRelationshipsItem(java.lang.String relationshipsItem) {
		if (this.relationships == null) {
			this.relationships = new java.util.LinkedHashSet<>();
		}
		this.relationships.add(relationshipsItem);
		return this;
	}



    
}

