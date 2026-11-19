package p029c6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c6.h */
/* loaded from: classes4.dex */
public @interface InterfaceC4517h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
