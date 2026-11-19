package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p123h7.InterfaceC8721a;

@Target({ElementType.METHOD})
@InterfaceC8721a
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface MapInfo {
    String keyColumn() default "";

    String keyTable() default "";

    String valueColumn() default "";

    String valueTable() default "";
}
