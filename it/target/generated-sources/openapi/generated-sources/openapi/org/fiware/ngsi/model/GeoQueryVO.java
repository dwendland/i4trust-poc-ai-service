package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class GeoQueryVO {

	public static final String JSON_PROPERTY_GEOREL = "georel";
	public static final String JSON_PROPERTY_COORDINATES = "coordinates";
	public static final String JSON_PROPERTY_GEOMETRY = "geometry";
	public static final String JSON_PROPERTY_GEOPROPERTY = "geoproperty";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_GEOREL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String georel;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_COORDINATES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<java.lang.Object> coordinates = new java.util.ArrayList<>();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_GEOMETRY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String geometry;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_GEOPROPERTY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String geoproperty;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		GeoQueryVO other = (GeoQueryVO) object;
		return java.util.Objects.equals(georel, other.georel)
				&& java.util.Objects.equals(coordinates, other.coordinates)
				&& java.util.Objects.equals(geometry, other.geometry)
				&& java.util.Objects.equals(geoproperty, other.geoproperty);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(georel, coordinates, geometry, geoproperty);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("GeoQueryVO[")
				.append("georel=").append(georel).append(",")
				.append("coordinates=").append(coordinates).append(",")
				.append("geometry=").append(geometry).append(",")
				.append("geoproperty=").append(geoproperty)
				.append("]")
				.toString();
	}

	// fluent

	public GeoQueryVO georel(java.lang.String newGeorel) {
		this.georel = newGeorel;
		return this;
	}

	public java.lang.String georel() {
		return georel;
	}

	public GeoQueryVO coordinates(java.util.List<java.lang.Object> newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}

	public java.util.List<java.lang.Object> coordinates() {
		return coordinates;
	}

	public GeoQueryVO geometry(java.lang.String newGeometry) {
		this.geometry = newGeometry;
		return this;
	}

	public java.lang.String geometry() {
		return geometry;
	}

	public GeoQueryVO geoproperty(java.lang.String newGeoproperty) {
		this.geoproperty = newGeoproperty;
		return this;
	}

	public java.lang.String geoproperty() {
		return geoproperty;
	}


	// getter/setter
	public java.lang.String getGeorel() {
		return georel;
	}

	public GeoQueryVO setGeorel(java.lang.String newGeorel) {
		this.georel = newGeorel;
		return this;
	}


	public java.util.List<java.lang.Object> getCoordinates() {
		return coordinates;
	}

	public GeoQueryVO setCoordinates(java.util.List<java.lang.Object> newCoordinates) {
		this.coordinates = newCoordinates;
		return this;
	}

	public GeoQueryVO addCoordinatesItem(java.lang.Object coordinatesItem) {
		if (this.coordinates == null) {
			this.coordinates = new java.util.ArrayList<>();
		}
		this.coordinates.add(coordinatesItem);
		return this;
	}

	public java.lang.String getGeometry() {
		return geometry;
	}

	public GeoQueryVO setGeometry(java.lang.String newGeometry) {
		this.geometry = newGeometry;
		return this;
	}


	public java.lang.String getGeoproperty() {
		return geoproperty;
	}

	public GeoQueryVO setGeoproperty(java.lang.String newGeoproperty) {
		this.geoproperty = newGeoproperty;
		return this;
	}




    
}

