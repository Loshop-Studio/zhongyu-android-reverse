package p110f9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f9.h */
/* loaded from: classes5.dex */
public @interface InterfaceC7963h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
