package gf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: gf.h */
/* loaded from: classes6.dex */
public @interface InterfaceC9415h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
