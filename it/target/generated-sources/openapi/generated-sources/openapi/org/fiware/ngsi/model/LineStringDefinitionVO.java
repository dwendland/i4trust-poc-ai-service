package org.fiware.ngsi.model;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
@io.micronaut.core.annotation.Introspected
public class LineStringDefinitionVO extends java.util.ArrayList<PositionDefinitionVO> {



	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		LineStringDefinitionVO other = (LineStringDefinitionVO) object;
		return super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash();
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("LineStringDefinitionVO[")
				.append("super").append(super.toString())
				.append("]")
				.toString();
	}

	// fluent


	// getter/setter


    
}
