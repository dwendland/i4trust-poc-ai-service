package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class PointVO {

	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_COORDINATES = "coordinates";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Type type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_COORDINATES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private PositionDefinitionVO coordinates = new PositionDefinitionVO();


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		PointVO other = (PointVO) object;
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
				.append("PointVO[")
				.append("type=").append(type).append(",")
				.append("coordinates=").append(coordinates)
				.append("]")
				.toString();
	}

	// fluent

	public PointVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public PointVO coordinates(PositionDefinitionVO newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}

	public PositionDefinitionVO coordinates() {
		return coordinates;
	}


	// getter/setter
	public Type getType() {
		return type;
	}

	public PointVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public PositionDefinitionVO getCoordinates() {
		return coordinates;
	}

	public PointVO setCoordinates(PositionDefinitionVO newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	POINT("Point");

	public static final java.lang.String POINT_VALUE = "Point";

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

