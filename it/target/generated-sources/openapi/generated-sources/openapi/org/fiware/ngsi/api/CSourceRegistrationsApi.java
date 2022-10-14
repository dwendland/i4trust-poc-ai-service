package org.fiware.ngsi.api;
import org.fiware.ngsi.model.*;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
public interface CSourceRegistrationsApi {


	@io.micronaut.http.annotation.Get("/csourceRegistrations/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	ContextSourceRegistrationListVO queryCsources(
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "id")
			java.lang.String id,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "idPattern")
			java.lang.String idPattern,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "type")
			java.lang.String type,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "attrs")
			java.lang.String attrs,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "q")
			java.lang.String q,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "georel")
			java.lang.String georel,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "geometry")
			java.lang.String geometry,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "coordinates")
			java.lang.String coordinates,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "geoproperty")
			java.lang.String geoproperty,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "limit")
			java.lang.Integer limit);

	@io.micronaut.http.annotation.Post("/csourceRegistrations/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.CREATED)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void registerCsource(
			@io.micronaut.http.annotation.Body
			ContextSourceRegistrationVO contextSourceRegistrationVO);

	@io.micronaut.http.annotation.Delete("/csourceRegistrations/{registrationId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void removeCsource(
			@io.micronaut.http.annotation.PathVariable(name = "registrationId")
			java.net.URI registrationId);

	@io.micronaut.http.annotation.Get("/csourceRegistrations/{registrationId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	java.util.Optional<ContextSourceRegistrationVO> retrieveCsource(
			@io.micronaut.http.annotation.PathVariable(name = "registrationId")
			java.net.URI registrationId);
}