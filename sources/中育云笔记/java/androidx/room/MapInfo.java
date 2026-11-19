package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p309qc.InterfaceC10770a;

@Target({ElementType.METHOD})
@InterfaceC10770a
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface MapInfo {
    String keyColumn() default "";

    String keyTable() default "";

    String valueColumn() default "";

    String valueTable() default "";
}
