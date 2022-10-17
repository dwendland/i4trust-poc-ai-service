package org.fiware.ngsi.api;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.Optional;

import io.micronaut.context.annotation.BootstrapContextCompatible;
import io.micronaut.core.convert.ConversionService;
import io.micronaut.core.convert.TypeConverterRegistrar;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.MicronautCodegen", date = "2022-10-14T22:07:48.183710+02:00[Europe/Berlin]")
@lombok.Generated
@javax.inject.Singleton
@BootstrapContextCompatible
public class TimeTypeConverterRegistrar implements TypeConverterRegistrar {

	@Override
	public void register(ConversionService<?> conversionService) {

		conversionService.addConverter(Instant.class, String.class, Instant::toString);
		conversionService.addConverter(String.class, Instant.class, (object, type, context) -> {
			try {
				return object == null ? Optional.empty() : Optional.of(ZonedDateTime.parse(object).toInstant());
			} catch (DateTimeParseException e) {
				try {
					return Optional.of(LocalDateTime.parse(object).toInstant(ZoneOffset.UTC));
				} catch (DateTimeParseException e1) {
					context.reject(object, e);
					return Optional.empty();
				}
			}
		});

		conversionService.addConverter(LocalDate.class, String.class, LocalDate::toString);
		conversionService.addConverter(String.class, LocalDate.class, (object, type, context) -> {
			try {
				return object == null ? Optional.empty() : Optional.of(LocalDate.parse(object));
			} catch (DateTimeParseException e) {
				context.reject(object, e);
				return Optional.empty();
			}
		});
	}
}
