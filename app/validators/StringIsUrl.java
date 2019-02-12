package validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Constraint(validatedBy = URLStringValidator.class)
public @interface StringIsUrl {
    String message() default "El campo no es una Url valida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}