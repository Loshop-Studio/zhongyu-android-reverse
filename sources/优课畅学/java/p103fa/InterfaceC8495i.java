package p103fa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fa.i */
/* loaded from: classes5.dex */
public @interface InterfaceC8495i {
    boolean allowUnsafeNonAsciiValues() default false;

    String value();
}
