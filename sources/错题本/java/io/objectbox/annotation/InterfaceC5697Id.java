package io.objectbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: io.objectbox.annotation.Id */
/* loaded from: classes3.dex */
public @interface InterfaceC5697Id {
    boolean assignable() default false;
}
