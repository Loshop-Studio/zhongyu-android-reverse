package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p309qc.InterfaceC10770a;

@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC10770a
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Experimental {

    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
