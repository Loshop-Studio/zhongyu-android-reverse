package p310qd;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.C10405j;

/* renamed from: qd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC10788a {
    /* renamed from: a */
    public static int m23073a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C10405j(2, 36));
    }

    /* renamed from: b */
    public static final int m23074b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* renamed from: c */
    public static boolean m23075c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    /* renamed from: d */
    public static String m23076d(char c10, Locale locale) {
        AbstractC9979u.m20294g(locale, "locale");
        String strValueOf = String.valueOf(c10);
        AbstractC9979u.m20292e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: e */
    public static String m23077e(char c10, Locale locale) {
        AbstractC9979u.m20294g(locale, "locale");
        String strM23078f = m23078f(c10, locale);
        if (strM23078f.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            AbstractC9979u.m20292e(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC9979u.m20293f(upperCase, "toUpperCase(...)");
            if (AbstractC9979u.m20289b(strM23078f, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strM23078f.charAt(0);
            AbstractC9979u.m20292e(strM23078f, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strM23078f.substring(1);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            AbstractC9979u.m20292e(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strM23078f;
    }

    /* renamed from: f */
    public static final String m23078f(char c10, Locale locale) {
        AbstractC9979u.m20294g(locale, "locale");
        String strValueOf = String.valueOf(c10);
        AbstractC9979u.m20292e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC9979u.m20293f(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
