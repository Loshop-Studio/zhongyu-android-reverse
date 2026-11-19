package androidx.compose.p011ui.text.font;

import androidx.compose.p011ui.text.ExperimentalTextApi;
import androidx.compose.p011ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m5110d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class FontKt {
    @ExperimentalTextApi
    @NotNull
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m12857FontF3nL8kk(int i, @NotNull FontWeight fontWeight, int i8, int i9, @NotNull FontVariation.Settings settings) {
        return new ResourceFont(i, fontWeight, i8, settings, i9, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m12858FontF3nL8kk$default(int i, FontWeight fontWeight, int i8, int i9, FontVariation.Settings settings, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i10 & 4) != 0) {
            i8 = FontStyle.INSTANCE.m12888getNormal_LCdwA();
        }
        if ((i10 & 8) != 0) {
            i9 = FontLoadingStrategy.INSTANCE.m12873getBlockingPKNRLFQ();
        }
        if ((i10 & 16) != 0) {
            settings = FontVariation.INSTANCE.m12903Settings6EWAqTQ(fontWeight, i8, new FontVariation.Setting[0]);
        }
        return m12857FontF3nL8kk(i, fontWeight, i8, i9, settings);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m12859FontRetOiIg(int i, FontWeight fontWeight, int i8) {
        return new ResourceFont(i, fontWeight, i8, null, FontLoadingStrategy.INSTANCE.m12873getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m12860FontRetOiIg$default(int i, FontWeight fontWeight, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i9 & 4) != 0) {
            i8 = FontStyle.INSTANCE.m12888getNormal_LCdwA();
        }
        return m12859FontRetOiIg(i, fontWeight, i8);
    }

    @Stable
    @NotNull
    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m12861FontYpTlLL0(int i, @NotNull FontWeight fontWeight, int i8, int i9) {
        return new ResourceFont(i, fontWeight, i8, new FontVariation.Settings(new FontVariation.Setting[0]), i9, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m12862FontYpTlLL0$default(int i, FontWeight fontWeight, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i10 & 4) != 0) {
            i8 = FontStyle.INSTANCE.m12888getNormal_LCdwA();
        }
        if ((i10 & 8) != 0) {
            i9 = FontLoadingStrategy.INSTANCE.m12873getBlockingPKNRLFQ();
        }
        return m12861FontYpTlLL0(i, fontWeight, i8, i9);
    }

    @Stable
    @NotNull
    public static final FontFamily toFontFamily(@NotNull Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
