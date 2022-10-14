package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class LineStringVO {

	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_COORDINATES = "coordinates";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Type type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_COORDINATES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private LineStringDefinitionVO coordinates = new LineStringDefinitionVO();


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		LineStringVO other = (LineStringVO) object;
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
				.append("LineStringVO[")
				.append("type=").append(type).append(",")
				.append("coordinates=").append(coordinates)
				.append("]")
				.toString();
	}

	// fluent

	public LineStringVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public LineStringVO coordinates(LineStringDefinitionVO newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}

	public LineStringDefinitionVO coordinates() {
		return coordinates;
	}


	// getter/setter
	public Type getType() {
		return type;
	}

	public LineStringVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public LineStringDefinitionVO getCoordinates() {
		return coordinates;
	}

	public LineStringVO setCoordinates(LineStringDefinitionVO newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	LINESTRING("LineString");

	public static final java.lang.String LINESTRING_VALUE = "LineString";

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

