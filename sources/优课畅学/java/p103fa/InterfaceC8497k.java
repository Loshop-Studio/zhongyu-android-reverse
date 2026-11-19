package p103fa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fa.k */
/* loaded from: classes5.dex */
public @interface InterfaceC8497k {
    boolean allowUnsafeNonAsciiValues() default false;

    String[] value();
}
