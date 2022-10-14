package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public enum GeorelEnumVO {

	EQUALS("equals"),
	DISJOINT("disjoint"),
	INTERSECTS("intersects"),
	WITHIN("within"),
	CONTAINS("contains"),
	OVERLAPS("overlaps"),
	_NEAR_MAXDISTANCE_D_MINDISTANCE_D_("^near;((maxDistance==\\d+)|(minDistance==\\d+))$");

	public static final java.lang.String EQUALS_VALUE = "equals";
	public static final java.lang.String DISJOINT_VALUE = "disjoint";
	public static final java.lang.String INTERSECTS_VALUE = "intersects";
	public static final java.lang.String WITHIN_VALUE = "within";
	public static final java.lang.String CONTAINS_VALUE = "contains";
	public static final java.lang.String OVERLAPS_VALUE = "overlaps";
	public static final java.lang.String _NEAR_MAXDISTANCE_D_MINDISTANCE_D__VALUE = "^near;((maxDistance==\\d+)|(minDistance==\\d+))$";

	private final java.lang.String value;

	private GeorelEnumVO(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static GeorelEnumVO toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<GeorelEnumVO> toOptional(java.lang.String value) {
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
