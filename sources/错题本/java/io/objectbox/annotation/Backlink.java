package io.objectbox.annotation;

import io.objectbox.annotation.apihint.Beta;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Beta
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface Backlink {
    /* renamed from: to */
    String m5042to() default "";
}
