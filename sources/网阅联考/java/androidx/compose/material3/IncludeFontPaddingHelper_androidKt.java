package androidx.compose.material3;

import androidx.compose.p006ui.text.PlatformTextStyle;
import androidx.compose.p006ui.text.TextStyle;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m5175d2 = {"copyAndSetFontPadding", "Landroidx/compose/ui/text/TextStyle;", "style", "includeFontPadding", "", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class IncludeFontPaddingHelper_androidKt {
    public static final TextStyle copyAndSetFontPadding(TextStyle style, boolean z3) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.m11092copyNOaFTUo((786431 & 1) != 0 ? style.spanStyle.m11037getColor0d7_KjU() : 0L, (786431 & 2) != 0 ? style.spanStyle.getFontSize() : 0L, (786431 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (786431 & 8) != 0 ? style.spanStyle.getFontStyle() : null, (786431 & 16) != 0 ? style.spanStyle.getFontSynthesis() : null, (786431 & 32) != 0 ? style.spanStyle.getFontFamily() : null, (786431 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (786431 & 128) != 0 ? style.spanStyle.getLetterSpacing() : 0L, (786431 & 256) != 0 ? style.spanStyle.getBaselineShift() : null, (786431 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (786431 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (786431 & 2048) != 0 ? style.spanStyle.getBackground() : 0L, (786431 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (786431 & 8192) != 0 ? style.spanStyle.getShadow() : null, (786431 & 16384) != 0 ? style.paragraphStyle.getTextAlign() : null, (786431 & 32768) != 0 ? style.paragraphStyle.getTextDirection() : null, (786431 & 65536) != 0 ? style.paragraphStyle.getLineHeight() : 0L, (786431 & 131072) != 0 ? style.paragraphStyle.getTextIndent() : null, (786431 & 262144) != 0 ? style.platformStyle : new PlatformTextStyle(z3), (786431 & 524288) != 0 ? style.paragraphStyle.getLineHeightStyle() : null);
    }
}
