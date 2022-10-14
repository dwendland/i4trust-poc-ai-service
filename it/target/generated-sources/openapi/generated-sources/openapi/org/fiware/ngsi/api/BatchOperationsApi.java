package org.fiware.ngsi.api;
import org.fiware.ngsi.model.*;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:54.467100+02:00[Europe/Berlin]")
@lombok.Generated
public interface BatchOperationsApi {


	@io.micronaut.http.annotation.Post("/entityOperations/create")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	BatchOperationResultVO batchEntityCreation(
			@io.micronaut.http.annotation.Body
			EntityListVO entityListVO);

	@io.micronaut.http.annotation.Post("/entityOperations/delete")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	BatchOperationResultVO batchEntityDelete(
			@io.micronaut.http.annotation.Body
			java.util.List<java.net.URI> javaNetURI);

	@io.micronaut.http.annotation.Post("/entityOperations/update")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	BatchOperationResultVO batchEntityUpdate(
			@io.micronaut.http.annotation.Body
			EntityListVO entityListVO,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "options")
			java.lang.String options);

	@io.micronaut.http.annotation.Post("/entityOperations/upsert")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	BatchOperationResultVO batchEntityUpsert(
			@io.micronaut.http.annotation.Body
			EntityListVO entityListVO,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "options")
			java.lang.String options);
}