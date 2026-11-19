package p054f1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: f1.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6295g {
    /* renamed from: a */
    public static final String m6445a(String str, int i6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= i6) {
            return str;
        }
        String strSubstring = str.substring(0, i6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
