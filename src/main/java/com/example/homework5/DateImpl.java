package com.example.homework5;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;

public class DateImpl implements ConstraintValidator<DateConstraint, LocalDate> {
    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        Period constraint = Period.of(100, 0, 0);
        LocalDate now = LocalDate.now();
        return !(value.isBefore(now.minus(constraint)) || value.isAfter(now) || value.equals(null));
    }
}
