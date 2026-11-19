package androidx.compose.p013ui.text.android;

import android.text.Spanned;

/* loaded from: classes2.dex */
public final class SpannedExtensions_androidKt {
    public static final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean hasSpan(Spanned spanned, Class<?> cls, int i10, int i11) {
        return spanned.nextSpanTransition(i10 - 1, i11, cls) != i11;
    }
}
