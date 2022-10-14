package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class ContextSourceRegistrationFragmentVO {

	public static final String JSON_PROPERTY_AT_CONTEXT = "@context";
	public static final String JSON_PROPERTY_INFORMATION = "information";
	public static final String JSON_PROPERTY_OBSERVATION_INTERVAL = "observationInterval";
	public static final String JSON_PROPERTY_MANAGEMENT_INTERVAL = "managementInterval";
	public static final String JSON_PROPERTY_LOCATION = "location";
	public static final String JSON_PROPERTY_OBSERVATION_SPACE = "observationSpace";
	public static final String JSON_PROPERTY_OPERATION_SPACE = "operationSpace";
	public static final String JSON_PROPERTY_EXPIRES = "expires";
	public static final String JSON_PROPERTY_NAME = "name";
	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	public static final String JSON_PROPERTY_ENDPOINT = "endpoint";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_CONTEXT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Object atContext;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_INFORMATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<RegistrationInfoVO> information;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OBSERVATION_INTERVAL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private TimeIntervalVO observationInterval = new TimeIntervalVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MANAGEMENT_INTERVAL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private TimeIntervalVO managementInterval = new TimeIntervalVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_LOCATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeometryVO location = new GeometryVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OBSERVATION_SPACE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeometryVO observationSpace = new GeometryVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPERATION_SPACE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private GeometryVO operationSpace = new GeometryVO();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EXPIRES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date expires;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String name;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DESCRIPTION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String description;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ENDPOINT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI endpoint;


	private java.util.Map<java.lang.String, java.lang.Object> additionalProperties;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ContextSourceRegistrationFragmentVO other = (ContextSourceRegistrationFragmentVO) object;
		return java.util.Objects.equals(atContext, other.atContext)
				&& java.util.Objects.equals(information, other.information)
				&& java.util.Objects.equals(observationInterval, other.observationInterval)
				&& java.util.Objects.equals(managementInterval, other.managementInterval)
				&& java.util.Objects.equals(location, other.location)
				&& java.util.Objects.equals(observationSpace, other.observationSpace)
				&& java.util.Objects.equals(operationSpace, other.operationSpace)
				&& java.util.Objects.equals(expires, other.expires)
				&& java.util.Objects.equals(name, other.name)
				&& java.util.Objects.equals(description, other.description)
				&& java.util.Objects.equals(endpoint, other.endpoint);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(atContext, information, observationInterval, managementInterval, location, observationSpace, operationSpace, expires, name, description, endpoint);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("ContextSourceRegistrationFragmentVO[")
				.append("atContext=").append(atContext).append(",")
				.append("information=").append(information).append(",")
				.append("observationInterval=").append(observationInterval).append(",")
				.append("managementInterval=").append(managementInterval).append(",")
				.append("location=").append(location).append(",")
				.append("observationSpace=").append(observationSpace).append(",")
				.append("operationSpace=").append(operationSpace).append(",")
				.append("expires=").append(expires).append(",")
				.append("name=").append(name).append(",")
				.append("description=").append(description).append(",")
				.append("endpoint=").append(endpoint)
				.append("]")
				.toString();
	}

	// fluent

	public ContextSourceRegistrationFragmentVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public ContextSourceRegistrationFragmentVO information(java.util.List<RegistrationInfoVO> newInformation) {
		this.information = newInformation;
		return this;
	}

	public java.util.List<RegistrationInfoVO> information() {
		return information;
	}

	public ContextSourceRegistrationFragmentVO observationInterval(TimeIntervalVO newObservationInterval) {
		this.observationInterval = newObservationInterval;
		return this;
	}

	public TimeIntervalVO observationInterval() {
		return observationInterval;
	}

	public ContextSourceRegistrationFragmentVO managementInterval(TimeIntervalVO newManagementInterval) {
		this.managementInterval = newManagementInterval;
		return this;
	}

	public TimeIntervalVO managementInterval() {
		return managementInterval;
	}

	public ContextSourceRegistrationFragmentVO location(GeometryVO newLocation) {
		this.location = newLocation;
		return this;
	}

	public GeometryVO location() {
		return location;
	}

	public ContextSourceRegistrationFragmentVO observationSpace(GeometryVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public GeometryVO observationSpace() {
		return observationSpace;
	}

	public ContextSourceRegistrationFragmentVO operationSpace(GeometryVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public GeometryVO operationSpace() {
		return operationSpace;
	}

	public ContextSourceRegistrationFragmentVO expires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}

	public java.util.Date expires() {
		return expires;
	}

	public ContextSourceRegistrationFragmentVO name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public java.lang.String name() {
		return name;
	}

	public ContextSourceRegistrationFragmentVO description(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}

	public java.lang.String description() {
		return description;
	}

	public ContextSourceRegistrationFragmentVO endpoint(java.net.URI newEndpoint) {
		this.endpoint = newEndpoint;
		return this;
	}

	public java.net.URI endpoint() {
		return endpoint;
	}


	// getter/setter

	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public ContextSourceRegistrationFragmentVO setAdditionalProperties(java.lang.String propertyKey, java.lang.Object value) {
	    if (this.additionalProperties == null) {
            this.additionalProperties = new java.util.HashMap<>();
        }
        this.additionalProperties.put(propertyKey, value);
        return this;
	}

	public ContextSourceRegistrationFragmentVO setAdditionalProperties(java.util.Map<java.lang.String, java.lang.Object> newAdditionalProperties) {
	this.additionalProperties = newAdditionalProperties;
	return this;
    }


	public Object getAtContext() {
		return atContext;
	}

	public ContextSourceRegistrationFragmentVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public java.util.List<RegistrationInfoVO> getInformation() {
		return information;
	}

	public ContextSourceRegistrationFragmentVO setInformation(java.util.List<RegistrationInfoVO> newInformation) {
		this.information = newInformation;
		return this;
	}

	public ContextSourceRegistrationFragmentVO addInformationItem(RegistrationInfoVO informationItem) {
		if (this.information == null) {
			this.information = new java.util.ArrayList<>();
		}
		this.information.add(informationItem);
		return this;
	}

	public TimeIntervalVO getObservationInterval() {
		return observationInterval;
	}

	public ContextSourceRegistrationFragmentVO setObservationInterval(TimeIntervalVO newObservationInterval) {
		this.observationInterval = newObservationInterval;
		return this;
	}


	public TimeIntervalVO getManagementInterval() {
		return managementInterval;
	}

	public ContextSourceRegistrationFragmentVO setManagementInterval(TimeIntervalVO newManagementInterval) {
		this.managementInterval = newManagementInterval;
		return this;
	}


	public GeometryVO getLocation() {
		return location;
	}

	public ContextSourceRegistrationFragmentVO setLocation(GeometryVO newLocation) {
		this.location = newLocation;
		return this;
	}


	public GeometryVO getObservationSpace() {
		return observationSpace;
	}

	public ContextSourceRegistrationFragmentVO setObservationSpace(GeometryVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}


	public GeometryVO getOperationSpace() {
		return operationSpace;
	}

	public ContextSourceRegistrationFragmentVO setOperationSpace(GeometryVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}


	public java.util.Date getExpires() {
		return expires;
	}

	public ContextSourceRegistrationFragmentVO setExpires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}


	public java.lang.String getName() {
		return name;
	}

	public ContextSourceRegistrationFragmentVO setName(java.lang.String newName) {
		this.name = newName;
		return this;
	}


	public java.lang.String getDescription() {
		return description;
	}

	public ContextSourceRegistrationFragmentVO setDescription(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}


	public java.net.URI getEndpoint() {
		return endpoint;
	}

	public ContextSourceRegistrationFragmentVO setEndpoint(java.net.URI newEndpoint) {
		this.endpoint = newEndpoint;
		return this;
	}




    
}

