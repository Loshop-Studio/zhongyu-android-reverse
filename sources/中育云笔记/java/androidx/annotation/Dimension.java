package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: DP */
    public static final int f187DP = 0;

    /* renamed from: PX */
    public static final int f188PX = 1;

    /* renamed from: SP */
    public static final int f189SP = 2;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: DP */
        public static final int f190DP = 0;

        /* renamed from: PX */
        public static final int f191PX = 1;

        /* renamed from: SP */
        public static final int f192SP = 2;

        private Companion() {
        }
    }

    int unit() default 1;
}
