package org.fiware.ngsi.api;
import org.fiware.ngsi.model.*;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
public interface EntitiesApi {


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

	@io.micronaut.http.annotation.Post("/entities/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.CREATED)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void createEntity(
			@io.micronaut.http.annotation.Body
			EntityVO entityVO,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("NGSILD-Tenant")
			java.lang.String ngSILDTenant);

	@io.micronaut.http.annotation.Patch("/entities/{entityId}/attrs/{attrId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void partialAttrUpdate(
			@io.micronaut.http.annotation.PathVariable(name = "entityId")
			java.net.URI entityId,
			@io.micronaut.http.annotation.PathVariable(name = "attrId")
			java.lang.String attrId,
			@io.micronaut.http.annotation.Body
			EntityFragmentVO entityFragmentVO,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("NGSILD-Tenant")
			java.lang.String ngSILDTenant);

	@io.micronaut.http.annotation.Get("/entities/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	EntityListVO queryEntities(
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("NGSILD-Tenant")
			java.lang.String ngSILDTenant,
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
			@io.micronaut.http.annotation.QueryValue(value = "csf")
			java.lang.String csf,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "limit")
			java.lang.Integer limit,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "options")
			java.lang.String options,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("Link")
			java.lang.String link);

	@io.micronaut.http.annotation.Delete("/entities/{entityId}/attrs/{attrId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void removeEntityAttr(
			@io.micronaut.http.annotation.PathVariable(name = "entityId")
			java.net.URI entityId,
			@io.micronaut.http.annotation.PathVariable(name = "attrId")
			java.lang.String attrId,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("NGSILD-Tenant")
			java.lang.String ngSILDTenant);

	@io.micronaut.http.annotation.Delete("/entities/{entityId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void removeEntityById(
			@io.micronaut.http.annotation.PathVariable(name = "entityId")
			java.net.URI entityId,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("NGSILD-Tenant")
			java.lang.String ngSILDTenant,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "type")
			java.lang.String type);

	@io.micronaut.http.annotation.Get("/entities/{entityId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	java.util.Optional<EntityVO> retrieveEntityById(
			@io.micronaut.http.annotation.PathVariable(name = "entityId")
			java.net.URI entityId,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("NGSILD-Tenant")
			java.lang.String ngSILDTenant,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "attrs")
			java.lang.String attrs,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "type")
			java.lang.String type,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "options")
			java.lang.String options,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("Link")
			java.lang.String link);
}