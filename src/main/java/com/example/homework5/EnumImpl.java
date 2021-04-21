package com.example.homework5;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnumImpl implements ConstraintValidator<EnumConstraint, Sex> {
    @Override
    public boolean isValid(Sex value, ConstraintValidatorContext context) {
        return value.equals(Sex.FEMALE) || value.equals(Sex.MALE);
    }
}
