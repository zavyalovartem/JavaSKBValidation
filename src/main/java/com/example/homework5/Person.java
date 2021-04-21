package com.example.homework5;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Person {

    @PastOrPresent
    @DateConstraint
    LocalDate birthday; // дата рождения
    @NotBlank
    @Size(max=125)
    String name; // имя
    @Size(max = 150)
    String sname; // фамилия
    @EnumConstraint
    Sex sex; // пол
}


enum Sex {
    MALE,
    FEMALE
}
