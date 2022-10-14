package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class QueryVO {

	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_ENTITIES = "entities";
	public static final String JSON_PROPERTY_ATTRS = "attrs";
	public static final String JSON_PROPERTY_Q = "q";
	public static final String JSON_PROPERTY_GEO_Q = "geoQ";
	public static final String JSON_PROPERTY_TEMPORAL_Q = "temporalQ";
	public static final String JSON_PROPERTY_CSF = "csf";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Type type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ENTITIES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private EntityInfoVO entities = new EntityInfoVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ATTRS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.String> attrs;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_Q)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String q;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_GEO_Q)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeoQueryVO geoQ = new GeoQueryVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TEMPORAL_Q)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private TemporalQueryVO temporalQ = new TemporalQueryVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CSF)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String csf;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		QueryVO other = (QueryVO) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(entities, other.entities)
				&& java.util.Objects.equals(attrs, other.attrs)
				&& java.util.Objects.equals(q, other.q)
				&& java.util.Objects.equals(geoQ, other.geoQ)
				&& java.util.Objects.equals(temporalQ, other.temporalQ)
				&& java.util.Objects.equals(csf, other.csf);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, entities, attrs, q, geoQ, temporalQ, csf);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("QueryVO[")
				.append("type=").append(type).append(",")
				.append("entities=").append(entities).append(",")
				.append("attrs=").append(attrs).append(",")
				.append("q=").append(q).append(",")
				.append("geoQ=").append(geoQ).append(",")
				.append("temporalQ=").append(temporalQ).append(",")
				.append("csf=").append(csf)
				.append("]")
				.toString();
	}

	// fluent

	public QueryVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public QueryVO entities(EntityInfoVO newEntities) {
		this.entities = newEntities;
		return this;
	}

	public EntityInfoVO entities() {
		return entities;
	}

	public QueryVO attrs(java.util.List<java.lang.String> newAttrs) {
		this.attrs = newAttrs;
		return this;
	}

	public java.util.List<java.lang.String> attrs() {
		return attrs;
	}

	public QueryVO q(java.lang.String newQ) {
		this.q = newQ;
		return this;
	}

	public java.lang.String q() {
		return q;
	}

	public QueryVO geoQ(GeoQueryVO newGeoQ) {
		this.geoQ = newGeoQ;
		return this;
	}

	public GeoQueryVO geoQ() {
		return geoQ;
	}

	public QueryVO temporalQ(TemporalQueryVO newTemporalQ) {
		this.temporalQ = newTemporalQ;
		return this;
	}

	public TemporalQueryVO temporalQ() {
		return temporalQ;
	}

	public QueryVO csf(java.lang.String newCsf) {
		this.csf = newCsf;
		return this;
	}

	public java.lang.String csf() {
		return csf;
	}


	// getter/setter
	public Type getType() {
		return type;
	}

	public QueryVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public EntityInfoVO getEntities() {
		return entities;
	}

	public QueryVO setEntities(EntityInfoVO newEntities) {
		this.entities = newEntities;
		return this;
	}


	public java.util.List<java.lang.String> getAttrs() {
		return attrs;
	}

	public QueryVO setAttrs(java.util.List<java.lang.String> newAttrs) {
		this.attrs = newAttrs;
		return this;
	}

	public QueryVO addAttrsItem(java.lang.String attrsItem) {
		if (this.attrs == null) {
			this.attrs = new java.util.ArrayList<>();
		}
		this.attrs.add(attrsItem);
		return this;
	}

	public java.lang.String getQ() {
		return q;
	}

	public QueryVO setQ(java.lang.String newQ) {
		this.q = newQ;
		return this;
	}


	public GeoQueryVO getGeoQ() {
		return geoQ;
	}

	public QueryVO setGeoQ(GeoQueryVO newGeoQ) {
		this.geoQ = newGeoQ;
		return this;
	}


	public TemporalQueryVO getTemporalQ() {
		return temporalQ;
	}

	public QueryVO setTemporalQ(TemporalQueryVO newTemporalQ) {
		this.temporalQ = newTemporalQ;
		return this;
	}


	public java.lang.String getCsf() {
		return csf;
	}

	public QueryVO setCsf(java.lang.String newCsf) {
		this.csf = newCsf;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	QUERY("Query");

	public static final java.lang.String QUERY_VALUE = "Query";

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

