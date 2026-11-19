package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface Nls {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Capitalization {
        public static final Capitalization NotSpecified;
        public static final Capitalization Sentence;
        public static final Capitalization Title;

        /* renamed from: a */
        public static final /* synthetic */ Capitalization[] f10394a;

        static {
            Capitalization capitalization = new Capitalization("NotSpecified", 0);
            NotSpecified = capitalization;
            Capitalization capitalization2 = new Capitalization("Title", 1);
            Title = capitalization2;
            Capitalization capitalization3 = new Capitalization("Sentence", 2);
            Sentence = capitalization3;
            f10394a = new Capitalization[]{capitalization, capitalization2, capitalization3};
        }

        public static Capitalization valueOf(String str) {
            return (Capitalization) Enum.valueOf(Capitalization.class, str);
        }

        public static Capitalization[] values() {
            return (Capitalization[]) f10394a.clone();
        }
    }

    Capitalization capitalization() default Capitalization.NotSpecified;
}
