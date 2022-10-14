package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class PolygonVO {

	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_COORDINATES = "coordinates";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Type type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_COORDINATES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private PolygonDefinitionVO coordinates = new PolygonDefinitionVO();


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		PolygonVO other = (PolygonVO) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(coordinates, other.coordinates);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, coordinates);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("PolygonVO[")
				.append("type=").append(type).append(",")
				.append("coordinates=").append(coordinates)
				.append("]")
				.toString();
	}

	// fluent

	public PolygonVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public PolygonVO coordinates(PolygonDefinitionVO newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}

	public PolygonDefinitionVO coordinates() {
		return coordinates;
	}


	// getter/setter
	public Type getType() {
		return type;
	}

	public PolygonVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public PolygonDefinitionVO getCoordinates() {
		return coordinates;
	}

	public PolygonVO setCoordinates(PolygonDefinitionVO newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	POLYGON("Polygon");

	public static final java.lang.String POLYGON_VALUE = "Polygon";

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

