package p029c6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c6.i */
/* loaded from: classes4.dex */
public @interface InterfaceC4518i {
    boolean allowUnsafeNonAsciiValues() default false;

    String value();
}
