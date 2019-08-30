package proto.jcwu.restValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NullOrNotBlankValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NullOrNotBlankConstraint {
    String message() default "Cannot use an empty string.  Use `null` instead";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
