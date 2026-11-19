package p259u9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: u9.h */
/* loaded from: classes5.dex */
public @interface InterfaceC9604h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
