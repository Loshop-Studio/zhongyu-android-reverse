package p103fa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fa.h */
/* loaded from: classes5.dex */
public @interface InterfaceC8494h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
