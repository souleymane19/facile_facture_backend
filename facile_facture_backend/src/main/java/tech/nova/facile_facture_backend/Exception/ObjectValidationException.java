package tech.nova.facile_facture_backend.Exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;
@RequiredArgsConstructor
@Getter
public class ObjectValidationException extends RuntimeException {

    private final Set<String> validation;

    private final String validationSource;
}
