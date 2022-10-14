package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class EndpointVO {

	public static final String JSON_PROPERTY_URI = "uri";
	public static final String JSON_PROPERTY_ACCEPT = "accept";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_URI)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.net.URI uri;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ACCEPT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Accept accept;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		EndpointVO other = (EndpointVO) object;
		return java.util.Objects.equals(uri, other.uri)
				&& java.util.Objects.equals(accept, other.accept);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(uri, accept);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("EndpointVO[")
				.append("uri=").append(uri).append(",")
				.append("accept=").append(accept)
				.append("]")
				.toString();
	}

	// fluent

	public EndpointVO uri(java.net.URI newUri) {
		this.uri = newUri;
		return this;
	}

	public java.net.URI uri() {
		return uri;
	}

	public EndpointVO accept(Accept newAccept) {
		this.accept = newAccept;
		return this;
	}

	public Accept accept() {
		return accept;
	}


	// getter/setter
	public java.net.URI getUri() {
		return uri;
	}

	public EndpointVO setUri(java.net.URI newUri) {
		this.uri = newUri;
		return this;
	}


	public Accept getAccept() {
		return accept;
	}

	public EndpointVO setAccept(Accept newAccept) {
		this.accept = newAccept;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Accept {

	APPLICATION_LD_JSON("application/ld+json");

	public static final java.lang.String APPLICATION_LD_JSON_VALUE = "application/ld+json";

	private final java.lang.String value;

	private Accept(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Accept toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Accept> toOptional(java.lang.String value) {
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

