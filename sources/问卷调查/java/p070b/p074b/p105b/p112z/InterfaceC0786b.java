package p070b.p074b.p105b.p112z;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: b.b.b.z.b */
/* loaded from: classes.dex */
public @interface InterfaceC0786b {
    String[] alternate() default {};

    String value();
}
