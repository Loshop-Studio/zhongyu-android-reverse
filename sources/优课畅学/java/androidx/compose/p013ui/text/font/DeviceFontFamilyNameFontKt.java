package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.font.FontVariation;

/* loaded from: classes2.dex */
public final class DeviceFontFamilyNameFontKt {
    /* renamed from: Font-vxs03AY, reason: not valid java name */
    public static final Font m26445Fontvxs03AY(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        return new DeviceFontFamilyNameFont(str, fontWeight, i10, settings, null);
    }

    /* renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ Font m26446Fontvxs03AY$default(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.Companion.m26482getNormal_LCdwA();
        }
        if ((i11 & 8) != 0) {
            settings = new FontVariation.Settings(new FontVariation.Setting[0]);
        }
        return m26445Fontvxs03AY(str, fontWeight, i10, settings);
    }
}
