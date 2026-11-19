package gf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: gf.k */
/* loaded from: classes6.dex */
public @interface InterfaceC9418k {
    boolean allowUnsafeNonAsciiValues() default false;

    String[] value();
}
