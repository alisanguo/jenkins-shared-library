package com.alisanguo.annotation

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Target([ElementType.FIELD, ElementType.PARAMETER])
@Retention(RetentionPolicy.RUNTIME)
@interface AtomInputParam {

    String value()
}