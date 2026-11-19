package gf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: gf.i */
/* loaded from: classes6.dex */
public @interface InterfaceC9416i {
    boolean allowUnsafeNonAsciiValues() default false;

    String value();
}
