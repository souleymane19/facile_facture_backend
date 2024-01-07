package tech.nova.facile_facture_backend.Validators;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Component;
import tech.nova.facile_facture_backend.Exception.ObjectValidationException;

import java.util.Set;
import java.util.stream.Collectors;


@Component
public class ObjectValidator<T> {

    // Création d'une instance de la fabrique de validateurs par défaut
    ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    // Obtention de l'objet Validator à partir de la fabrique
    Validator validator = validatorFactory.getValidator();

 // Maintenant, vous avez un objet Validator que vous pouvez utiliser pour valider des objets.

    public void validate(T objectToValidate) {
        Set<ConstraintViolation<T>> validation = validator.validate(objectToValidate);

        if (!validation.isEmpty()) {
            Set<String> errorMessages = validation.stream()
                    .map(violation -> violation.getMessage())
                    .collect(Collectors.toSet());
            ///ccbscsfcsf

            throw new ObjectValidationException(errorMessages, objectToValidate.getClass().getName());

        }
    }

}
