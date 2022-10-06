package com.company.java_core.homework21.task1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface StudentSocial {
    String value() default "make it better";
}
