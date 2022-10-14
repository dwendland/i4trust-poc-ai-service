package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class ContextSourceRegistrationVO {

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
	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
	public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_CONTEXT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Object atContext;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_INFORMATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<RegistrationInfoVO> information = new java.util.ArrayList<>();

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
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.net.URI endpoint;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.net.URI id;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private Type type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CREATED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date createdAt;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MODIFIED_AT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Date modifiedAt;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ContextSourceRegistrationVO other = (ContextSourceRegistrationVO) object;
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
				&& java.util.Objects.equals(endpoint, other.endpoint)
				&& java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(createdAt, other.createdAt)
				&& java.util.Objects.equals(modifiedAt, other.modifiedAt);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(atContext, information, observationInterval, managementInterval, location, observationSpace, operationSpace, expires, name, description, endpoint, id, type, createdAt, modifiedAt);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("ContextSourceRegistrationVO[")
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
				.append("endpoint=").append(endpoint).append(",")
				.append("id=").append(id).append(",")
				.append("type=").append(type).append(",")
				.append("createdAt=").append(createdAt).append(",")
				.append("modifiedAt=").append(modifiedAt)
				.append("]")
				.toString();
	}

	// fluent

	public ContextSourceRegistrationVO atContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}

	public Object atContext() {
		return atContext;
	}

	public ContextSourceRegistrationVO information(java.util.List<RegistrationInfoVO> newInformation) {
		this.information = newInformation;
		return this;
	}

	public java.util.List<RegistrationInfoVO> information() {
		return information;
	}

	public ContextSourceRegistrationVO observationInterval(TimeIntervalVO newObservationInterval) {
		this.observationInterval = newObservationInterval;
		return this;
	}

	public TimeIntervalVO observationInterval() {
		return observationInterval;
	}

	public ContextSourceRegistrationVO managementInterval(TimeIntervalVO newManagementInterval) {
		this.managementInterval = newManagementInterval;
		return this;
	}

	public TimeIntervalVO managementInterval() {
		return managementInterval;
	}

	public ContextSourceRegistrationVO location(GeometryVO newLocation) {
		this.location = newLocation;
		return this;
	}

	public GeometryVO location() {
		return location;
	}

	public ContextSourceRegistrationVO observationSpace(GeometryVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}

	public GeometryVO observationSpace() {
		return observationSpace;
	}

	public ContextSourceRegistrationVO operationSpace(GeometryVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}

	public GeometryVO operationSpace() {
		return operationSpace;
	}

	public ContextSourceRegistrationVO expires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}

	public java.util.Date expires() {
		return expires;
	}

	public ContextSourceRegistrationVO name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public java.lang.String name() {
		return name;
	}

	public ContextSourceRegistrationVO description(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}

	public java.lang.String description() {
		return description;
	}

	public ContextSourceRegistrationVO endpoint(java.net.URI newEndpoint) {
		this.endpoint = newEndpoint;
		return this;
	}

	public java.net.URI endpoint() {
		return endpoint;
	}

	public ContextSourceRegistrationVO id(java.net.URI newId) {
		this.id = newId;
		return this;
	}

	public java.net.URI id() {
		return id;
	}

	public ContextSourceRegistrationVO type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public ContextSourceRegistrationVO createdAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}

	public java.util.Date createdAt() {
		return createdAt;
	}

	public ContextSourceRegistrationVO modifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}

	public java.util.Date modifiedAt() {
		return modifiedAt;
	}


	// getter/setter
	public Object getAtContext() {
		return atContext;
	}

	public ContextSourceRegistrationVO setAtContext(Object newAtContext) {
		this.atContext = newAtContext;
		return this;
	}


	public java.util.List<RegistrationInfoVO> getInformation() {
		return information;
	}

	public ContextSourceRegistrationVO setInformation(java.util.List<RegistrationInfoVO> newInformation) {
		this.information = newInformation;
		return this;
	}

	public ContextSourceRegistrationVO addInformationItem(RegistrationInfoVO informationItem) {
		if (this.information == null) {
			this.information = new java.util.ArrayList<>();
		}
		this.information.add(informationItem);
		return this;
	}

	public TimeIntervalVO getObservationInterval() {
		return observationInterval;
	}

	public ContextSourceRegistrationVO setObservationInterval(TimeIntervalVO newObservationInterval) {
		this.observationInterval = newObservationInterval;
		return this;
	}


	public TimeIntervalVO getManagementInterval() {
		return managementInterval;
	}

	public ContextSourceRegistrationVO setManagementInterval(TimeIntervalVO newManagementInterval) {
		this.managementInterval = newManagementInterval;
		return this;
	}


	public GeometryVO getLocation() {
		return location;
	}

	public ContextSourceRegistrationVO setLocation(GeometryVO newLocation) {
		this.location = newLocation;
		return this;
	}


	public GeometryVO getObservationSpace() {
		return observationSpace;
	}

	public ContextSourceRegistrationVO setObservationSpace(GeometryVO newObservationSpace) {
		this.observationSpace = newObservationSpace;
		return this;
	}


	public GeometryVO getOperationSpace() {
		return operationSpace;
	}

	public ContextSourceRegistrationVO setOperationSpace(GeometryVO newOperationSpace) {
		this.operationSpace = newOperationSpace;
		return this;
	}


	public java.util.Date getExpires() {
		return expires;
	}

	public ContextSourceRegistrationVO setExpires(java.util.Date newExpires) {
		this.expires = newExpires;
		return this;
	}


	public java.lang.String getName() {
		return name;
	}

	public ContextSourceRegistrationVO setName(java.lang.String newName) {
		this.name = newName;
		return this;
	}


	public java.lang.String getDescription() {
		return description;
	}

	public ContextSourceRegistrationVO setDescription(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}


	public java.net.URI getEndpoint() {
		return endpoint;
	}

	public ContextSourceRegistrationVO setEndpoint(java.net.URI newEndpoint) {
		this.endpoint = newEndpoint;
		return this;
	}


	public java.net.URI getId() {
		return id;
	}

	public ContextSourceRegistrationVO setId(java.net.URI newId) {
		this.id = newId;
		return this;
	}


	public Type getType() {
		return type;
	}

	public ContextSourceRegistrationVO setType(Type newType) {
		this.type = newType;
		return this;
	}


	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public ContextSourceRegistrationVO setCreatedAt(java.util.Date newCreatedAt) {
		this.createdAt = newCreatedAt;
		return this;
	}


	public java.util.Date getModifiedAt() {
		return modifiedAt;
	}

	public ContextSourceRegistrationVO setModifiedAt(java.util.Date newModifiedAt) {
		this.modifiedAt = newModifiedAt;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	CONTEXTSOURCEREGISTRATION("ContextSourceRegistration");

	public static final java.lang.String CONTEXTSOURCEREGISTRATION_VALUE = "ContextSourceRegistration";

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

