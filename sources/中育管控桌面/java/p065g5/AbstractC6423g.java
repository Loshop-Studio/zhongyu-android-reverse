package p065g5;

import java.text.Normalizer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g5.g */
/* loaded from: classes4.dex */
public abstract class AbstractC6423g {
    /* renamed from: a */
    public static final String m6981a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
