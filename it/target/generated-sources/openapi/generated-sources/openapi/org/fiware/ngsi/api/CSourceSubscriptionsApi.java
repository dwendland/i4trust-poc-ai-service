package org.fiware.ngsi.api;
import org.fiware.ngsi.model.*;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T13:33:13.913287+02:00[Europe/Berlin]")
@lombok.Generated
public interface CSourceSubscriptionsApi {


	@io.micronaut.http.annotation.Post("/csourceSubscriptions/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.CREATED)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void createCSourceSubscription(
			@io.micronaut.http.annotation.Body
			SubscriptionVO subscriptionVO);

	@io.micronaut.http.annotation.Delete("/csourceSubscriptions/{subscriptionId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void removeCSourceSubscription(
			@io.micronaut.http.annotation.PathVariable(name = "subscriptionId")
			java.net.URI subscriptionId);

	@io.micronaut.http.annotation.Get("/csourceSubscriptions/")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	SubscriptionListVO retrieveCSourceSubscriptions(
			@javax.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "limit")
			java.lang.Integer limit);

	@io.micronaut.http.annotation.Get("/csourceSubscriptions/{subscriptionId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	java.util.Optional<SubscriptionVO> retrieveCSourceSubscriptionsById(
			@io.micronaut.http.annotation.PathVariable(name = "subscriptionId")
			java.net.URI subscriptionId);

	@io.micronaut.http.annotation.Patch("/csourceSubscriptions/{subscriptionId}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Consumes({ "application/ld+json" })
	@io.micronaut.http.annotation.Produces({ "application/ld+json" })
	void updateCSourceSubscription(
			@io.micronaut.http.annotation.PathVariable(name = "subscriptionId")
			java.net.URI subscriptionId,
			@io.micronaut.http.annotation.Body
			SubscriptionFragmentVO subscriptionFragmentVO);
}