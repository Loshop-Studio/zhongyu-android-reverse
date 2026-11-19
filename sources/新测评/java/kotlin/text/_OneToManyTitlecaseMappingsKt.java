package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m13558d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class _OneToManyTitlecaseMappingsKt {
    public static final String titlecaseImpl(char c10) {
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        Intrinsics.checkNotNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
