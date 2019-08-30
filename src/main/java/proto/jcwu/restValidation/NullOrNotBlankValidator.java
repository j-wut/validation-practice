package proto.jcwu.restValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullOrNotBlankValidator implements
        ConstraintValidator<NullOrNotBlankConstraint,String> {
    @Override
    public void initialize(NullOrNotBlankConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String fieldValue, ConstraintValidatorContext constraintValidatorContext) {
        return !(fieldValue!=null && fieldValue.isBlank());
    }
}
