package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpKt;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TooltipDefaults {
    public static final int $stable = 0;
    public static final TooltipDefaults INSTANCE = new TooltipDefaults();
    private static final long caretSize = DpKt.m33523DpSizeYgX7TsA(C3186Dp.m33501constructorimpl(16), C3186Dp.m33501constructorimpl(8));

    private TooltipDefaults() {
    }

    /* renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m29451getCaretSizeMYxV2XQ() {
        return caretSize;
    }

    public final RichTooltipColors getDefaultRichTooltipColors$material3_release(ColorScheme colorScheme) {
        RichTooltipColors defaultRichTooltipColorsCached$material3_release = colorScheme.getDefaultRichTooltipColorsCached$material3_release();
        if (defaultRichTooltipColorsCached$material3_release != null) {
            return defaultRichTooltipColorsCached$material3_release;
        }
        RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
        RichTooltipColors richTooltipColors = new RichTooltipColors(ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSubheadColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getActionLabelTextColor()), null);
        colorScheme.setDefaultRichTooltipColorsCached$material3_release(richTooltipColors);
        return richTooltipColors;
    }

    @Composable
    public final long getPlainTooltipContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102696215, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:244)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getPlainTooltipContainerShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(49570325, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:240)");
        }
        Shape value = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final long getPlainTooltipContentColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1982928937, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:248)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getRichTooltipContainerShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138709783, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:252)");
        }
        Shape value = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    /* renamed from: rememberPlainTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m29452rememberPlainTooltipPositionProviderkHDZbjc(float f10, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047866909, i10, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:302)");
        }
        final int iMo27093roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo27093roundToPx0680j_4(f10);
        boolean zChanged = composer.changed(iMo27093roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                @Override // androidx.compose.p014ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo27067calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
                    int left = intRect.getLeft() + ((intRect.getWidth() - IntSize.m33672getWidthimpl(j11)) / 2);
                    int top2 = (intRect.getTop() - IntSize.m33671getHeightimpl(j11)) - iMo27093roundToPx0680j_4;
                    if (top2 < 0) {
                        top2 = iMo27093roundToPx0680j_4 + intRect.getBottom();
                    }
                    return IntOffsetKt.IntOffset(left, top2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$1 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberPlainTooltipPositionProvider$1$1;
    }

    @Composable
    /* renamed from: rememberRichTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m29453rememberRichTooltipPositionProviderkHDZbjc(float f10, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538806795, i10, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:335)");
        }
        final int iMo27093roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo27093roundToPx0680j_4(f10);
        boolean zChanged = composer.changed(iMo27093roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberRichTooltipPositionProvider$1$1
                @Override // androidx.compose.p014ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo27067calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
                    int left = intRect.getLeft();
                    if (IntSize.m33672getWidthimpl(j11) + left > IntSize.m33672getWidthimpl(j10) && (left = intRect.getRight() - IntSize.m33672getWidthimpl(j11)) < 0) {
                        left = intRect.getLeft() + ((intRect.getWidth() - IntSize.m33672getWidthimpl(j11)) / 2);
                    }
                    int top2 = (intRect.getTop() - IntSize.m33671getHeightimpl(j11)) - iMo27093roundToPx0680j_4;
                    if (top2 < 0) {
                        top2 = iMo27093roundToPx0680j_4 + intRect.getBottom();
                    }
                    return IntOffsetKt.IntOffset(left, top2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberRichTooltipPositionProvider$1$1 tooltipDefaults$rememberRichTooltipPositionProvider$1$1 = (TooltipDefaults$rememberRichTooltipPositionProvider$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberRichTooltipPositionProvider$1$1;
    }

    @Composable
    public final RichTooltipColors richTooltipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1622312141, i10, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:261)");
        }
        RichTooltipColors defaultRichTooltipColors$material3_release = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultRichTooltipColors$material3_release;
    }

    @Composable
    /* renamed from: richTooltipColors-ro_MJ88, reason: not valid java name */
    public final RichTooltipColors m29454richTooltipColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, i10, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:274)");
        }
        long j14 = j10;
        RichTooltipColors richTooltipColorsM28999copyjRlVdoo = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28999copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return richTooltipColorsM28999copyjRlVdoo;
    }
}
