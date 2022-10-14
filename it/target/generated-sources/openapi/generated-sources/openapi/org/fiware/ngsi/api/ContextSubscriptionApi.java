package org.fiware.ngsi.api;
import org.fiware.ngsi.model.*;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
public interface ContextSubscriptionApi {


	@io.micronaut.http.annotation.Post("/subscriptions/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.CREATED)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void createSubscription(
			@io.micronaut.http.annotation.Body
			SubscriptionVO subscriptionVO,
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.Header("NGSILD-Tenant")
			java.lang.String ngSILDTenant);

	@io.micronaut.http.annotation.Delete("/subscriptions/{subscriptionId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void removeSubscription(
			@io.micronaut.http.annotation.PathVariable(name = "subscriptionId")
			java.net.URI subscriptionId);

	@io.micronaut.http.annotation.Get("/subscriptions/{subscriptionId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	java.util.Optional<SubscriptionVO> retrieveSubscriptionById(
			@io.micronaut.http.annotation.PathVariable(name = "subscriptionId")
			java.net.URI subscriptionId);

	@io.micronaut.http.annotation.Get("/subscriptions/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	SubscriptionListVO retrieveSubscriptions(
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "limit")
			java.lang.Integer limit);

	@io.micronaut.http.annotation.Patch("/subscriptions/{subscriptionId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void updateSubscription(
			@io.micronaut.http.annotation.PathVariable(name = "subscriptionId")
			java.net.URI subscriptionId,
			@io.micronaut.http.annotation.Body
			SubscriptionFragmentVO subscriptionFragmentVO);
}