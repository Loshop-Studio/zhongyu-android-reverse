package androidx.compose.p012ui.text.font;

import androidx.compose.p012ui.text.ExperimentalTextApi;
import androidx.compose.p012ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(m13412d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m13413d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class FontKt {
    @ExperimentalTextApi
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m23547FontF3nL8kk(int i9, FontWeight fontWeight, int i10, int i11, FontVariation.Settings settings) {
        return new ResourceFont(i9, fontWeight, i10, settings, i11, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m23548FontF3nL8kk$default(int i9, FontWeight fontWeight, int i10, int i11, FontVariation.Settings settings, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i12 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m23578getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            i11 = FontLoadingStrategy.INSTANCE.m23563getBlockingPKNRLFQ();
        }
        if ((i12 & 16) != 0) {
            settings = FontVariation.INSTANCE.m23593Settings6EWAqTQ(fontWeight, i10, new FontVariation.Setting[0]);
        }
        return m23547FontF3nL8kk(i9, fontWeight, i10, i11, settings);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m23549FontRetOiIg(int i9, FontWeight fontWeight, int i10) {
        return new ResourceFont(i9, fontWeight, i10, null, FontLoadingStrategy.INSTANCE.m23563getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m23550FontRetOiIg$default(int i9, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m23578getNormal_LCdwA();
        }
        return m23549FontRetOiIg(i9, fontWeight, i10);
    }

    @Stable
    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m23551FontYpTlLL0(int i9, FontWeight fontWeight, int i10, int i11) {
        return new ResourceFont(i9, fontWeight, i10, new FontVariation.Settings(new FontVariation.Setting[0]), i11, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m23552FontYpTlLL0$default(int i9, FontWeight fontWeight, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i12 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m23578getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            i11 = FontLoadingStrategy.INSTANCE.m23563getBlockingPKNRLFQ();
        }
        return m23551FontYpTlLL0(i9, fontWeight, i10, i11);
    }

    @Stable
    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
