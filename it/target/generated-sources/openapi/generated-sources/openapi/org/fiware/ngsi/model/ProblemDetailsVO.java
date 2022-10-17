package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class ProblemDetailsVO {

	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_TITLE = "title";
	public static final String JSON_PROPERTY_DETAIL = "detail";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.net.URI type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TITLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String title;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DETAIL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String detail;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ProblemDetailsVO other = (ProblemDetailsVO) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(title, other.title)
				&& java.util.Objects.equals(detail, other.detail);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, title, detail);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("ProblemDetailsVO[")
				.append("type=").append(type).append(",")
				.append("title=").append(title).append(",")
				.append("detail=").append(detail)
				.append("]")
				.toString();
	}

	// fluent

	public ProblemDetailsVO type(java.net.URI newType) {
		this.type = newType;
		return this;
	}

	public java.net.URI type() {
		return type;
	}

	public ProblemDetailsVO title(java.lang.String newTitle) {
		this.title = newTitle;
		return this;
	}

	public java.lang.String title() {
		return title;
	}

	public ProblemDetailsVO detail(java.lang.String newDetail) {
		this.detail = newDetail;
		return this;
	}

	public java.lang.String detail() {
		return detail;
	}


	// getter/setter
	public java.net.URI getType() {
		return type;
	}

	public ProblemDetailsVO setType(java.net.URI newType) {
		this.type = newType;
		return this;
	}


	public java.lang.String getTitle() {
		return title;
	}

	public ProblemDetailsVO setTitle(java.lang.String newTitle) {
		this.title = newTitle;
		return this;
	}


	public java.lang.String getDetail() {
		return detail;
	}

	public ProblemDetailsVO setDetail(java.lang.String newDetail) {
		this.detail = newDetail;
		return this;
	}




    
}

