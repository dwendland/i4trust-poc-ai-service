package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class EntityListVO extends java.util.ArrayList<EntityVO> {



	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		EntityListVO other = (EntityListVO) object;
		return super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash();
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("EntityListVO[")
				.append("super").append(super.toString())
				.append("]")
				.toString();
	}

	// fluent


	// getter/setter


    
}

