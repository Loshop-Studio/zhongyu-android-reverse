package p070b.p074b.p105b.p112z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: b.b.b.z.a */
/* loaded from: classes.dex */
public @interface InterfaceC0785a {
    boolean nullSafe() default true;

    Class<?> value();
}
