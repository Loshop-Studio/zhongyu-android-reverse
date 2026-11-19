package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.font.FontWeight;

/* loaded from: classes2.dex */
public final class AndroidFontUtils_androidKt {
    public static final FontWeight getAndroidBold(FontWeight.Companion companion) {
        return companion.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m26427getAndroidTypefaceStyleFO1MlWM(FontWeight fontWeight, int i10) {
        return getAndroidTypefaceStyle(fontWeight.compareTo(getAndroidBold(FontWeight.Companion)) >= 0, FontStyle.m26475equalsimpl0(i10, FontStyle.Companion.m26481getItalic_LCdwA()));
    }
}
