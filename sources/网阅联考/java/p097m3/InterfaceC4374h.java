package p097m3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: m3.h */
/* loaded from: classes2.dex */
public @interface InterfaceC4374h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
