package p113g8;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;

/* renamed from: g8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8656a {
    /* renamed from: a */
    public static int m13939a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C8321f(2, 36));
    }

    /* renamed from: b */
    public static final int m13940b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* renamed from: c */
    public static boolean m13941c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    /* renamed from: d */
    public static String m13942d(char c10, Locale locale) {
        AbstractC9133u.m16133g(locale, "locale");
        String strValueOf = String.valueOf(c10);
        AbstractC9133u.m16131e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: e */
    public static String m13943e(char c10, Locale locale) {
        AbstractC9133u.m16133g(locale, "locale");
        String strM13944f = m13944f(c10, locale);
        if (strM13944f.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            AbstractC9133u.m16131e(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC9133u.m16132f(upperCase, "toUpperCase(...)");
            if (AbstractC9133u.m16128b(strM13944f, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strM13944f.charAt(0);
            AbstractC9133u.m16131e(strM13944f, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strM13944f.substring(1);
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            AbstractC9133u.m16131e(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strM13944f;
    }

    /* renamed from: f */
    public static final String m13944f(char c10, Locale locale) {
        AbstractC9133u.m16133g(locale, "locale");
        String strValueOf = String.valueOf(c10);
        AbstractC9133u.m16131e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC9133u.m16132f(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
