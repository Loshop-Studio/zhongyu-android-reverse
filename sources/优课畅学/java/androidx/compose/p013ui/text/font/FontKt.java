package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.ExperimentalTextApi;
import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class FontKt {
    @ExperimentalTextApi
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m26451FontF3nL8kk(int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings) {
        return new ResourceFont(i10, fontWeight, i11, settings, i12, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m26452FontF3nL8kk$default(int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i13 & 4) != 0) {
            i11 = FontStyle.Companion.m26482getNormal_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = FontLoadingStrategy.Companion.m26467getBlockingPKNRLFQ();
        }
        if ((i13 & 16) != 0) {
            settings = FontVariation.INSTANCE.m26497Settings6EWAqTQ(fontWeight, i11, new FontVariation.Setting[0]);
        }
        return m26451FontF3nL8kk(i10, fontWeight, i11, i12, settings);
    }

    @Stable
    @InterfaceC8721a
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m26453FontRetOiIg(int i10, FontWeight fontWeight, int i11) {
        return new ResourceFont(i10, fontWeight, i11, null, FontLoadingStrategy.Companion.m26467getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m26454FontRetOiIg$default(int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 4) != 0) {
            i11 = FontStyle.Companion.m26482getNormal_LCdwA();
        }
        return m26453FontRetOiIg(i10, fontWeight, i11);
    }

    @Stable
    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m26455FontYpTlLL0(int i10, FontWeight fontWeight, int i11, int i12) {
        return new ResourceFont(i10, fontWeight, i11, new FontVariation.Settings(new FontVariation.Setting[0]), i12, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m26456FontYpTlLL0$default(int i10, FontWeight fontWeight, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i13 & 4) != 0) {
            i11 = FontStyle.Companion.m26482getNormal_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = FontLoadingStrategy.Companion.m26467getBlockingPKNRLFQ();
        }
        return m26455FontYpTlLL0(i10, fontWeight, i11, i12);
    }

    @Stable
    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
