package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.InterfaceC8721a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    static {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(24);
        ButtonHorizontalPadding = fM26899constructorimpl;
        float f10 = 8;
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(f10);
        ButtonVerticalPadding = fM26899constructorimpl2;
        PaddingValues paddingValuesM20852PaddingValuesa9UjIt4 = PaddingKt.m20852PaddingValuesa9UjIt4(fM26899constructorimpl, fM26899constructorimpl2, fM26899constructorimpl, fM26899constructorimpl2);
        ContentPadding = paddingValuesM20852PaddingValuesa9UjIt4;
        float f11 = 16;
        float fM26899constructorimpl3 = C3156Dp.m26899constructorimpl(f11);
        ButtonWithIconHorizontalStartPadding = fM26899constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m20852PaddingValuesa9UjIt4(fM26899constructorimpl3, fM26899constructorimpl2, fM26899constructorimpl, fM26899constructorimpl2);
        float fM26899constructorimpl4 = C3156Dp.m26899constructorimpl(12);
        TextButtonHorizontalPadding = fM26899constructorimpl4;
        TextButtonContentPadding = PaddingKt.m20852PaddingValuesa9UjIt4(fM26899constructorimpl4, paddingValuesM20852PaddingValuesa9UjIt4.mo20808calculateTopPaddingD9Ej5fM(), fM26899constructorimpl4, paddingValuesM20852PaddingValuesa9UjIt4.mo20805calculateBottomPaddingD9Ej5fM());
        float fM26899constructorimpl5 = C3156Dp.m26899constructorimpl(f11);
        TextButtonWithIconHorizontalEndPadding = fM26899constructorimpl5;
        TextButtonWithIconContentPadding = PaddingKt.m20852PaddingValuesa9UjIt4(fM26899constructorimpl4, paddingValuesM20852PaddingValuesa9UjIt4.mo20808calculateTopPaddingD9Ej5fM(), fM26899constructorimpl5, paddingValuesM20852PaddingValuesa9UjIt4.mo20805calculateBottomPaddingD9Ej5fM());
        MinWidth = C3156Dp.m26899constructorimpl(58);
        MinHeight = C3156Dp.m26899constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m23257getIconSizeD9Ej5fM();
        IconSpacing = C3156Dp.m26899constructorimpl(f10);
    }

    private ButtonDefaults() {
    }

    @Composable
    public final ButtonColors buttonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        ButtonColors defaultButtonColors$material3_release = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors$material3_release;
    }

    @Composable
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m21787buttonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM21782copyjRlVdoo = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m21782copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM21782copyjRlVdoo;
    }

    @Composable
    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m21788buttonElevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilledButtonTokens.INSTANCE.m23252getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilledButtonTokens.INSTANCE.m23258getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilledButtonTokens.INSTANCE.m23255getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilledButtonTokens.INSTANCE.m23256getHoverContainerElevationD9Ej5fM();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = FilledButtonTokens.INSTANCE.m23254getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        float f16 = f14;
        float f17 = f12;
        ButtonElevation buttonElevation = new ButtonElevation(f10, f11, f17, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    @Composable
    public final ButtonColors elevatedButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:609)");
        }
        ButtonColors defaultElevatedButtonColors$material3_release = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedButtonColors$material3_release;
    }

    @Composable
    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m21789elevatedButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:627)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM21782copyjRlVdoo = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m21782copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM21782copyjRlVdoo;
    }

    @Composable
    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m21790elevatedButtonElevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = ElevatedButtonTokens.INSTANCE.m23171getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = ElevatedButtonTokens.INSTANCE.m23177getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = ElevatedButtonTokens.INSTANCE.m23174getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = ElevatedButtonTokens.INSTANCE.m23175getHoverContainerElevationD9Ej5fM();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = ElevatedButtonTokens.INSTANCE.m23173getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:829)");
        }
        float f16 = f14;
        float f17 = f12;
        ButtonElevation buttonElevation = new ButtonElevation(f10, f11, f17, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    @Composable
    public final ButtonColors filledTonalButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:655)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3_release = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalButtonColors$material3_release;
    }

    @Composable
    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m21791filledTonalButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:674)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM21782copyjRlVdoo = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m21782copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM21782copyjRlVdoo;
    }

    @Composable
    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m21792filledTonalButtonElevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilledTonalButtonTokens.INSTANCE.m23275getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilledTonalButtonTokens.INSTANCE.m23281getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilledTonalButtonTokens.INSTANCE.m23278getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilledTonalButtonTokens.INSTANCE.m23279getHoverContainerElevationD9Ej5fM();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = C3156Dp.m26899constructorimpl(0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:859)");
        }
        float f16 = f14;
        ButtonElevation buttonElevation = new ButtonElevation(f10, f11, f12, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final ButtonColors getDefaultButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached$material3_release = colorScheme.getDefaultButtonColorsCached$material3_release();
        if (defaultButtonColorsCached$material3_release != null) {
            return defaultButtonColorsCached$material3_release;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached$material3_release = colorScheme.getDefaultElevatedButtonColorsCached$material3_release();
        if (defaultElevatedButtonColorsCached$material3_release != null) {
            return defaultElevatedButtonColorsCached$material3_release;
        }
        ElevatedButtonTokens elevatedButtonTokens = ElevatedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getLabelTextColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledContainerColor()), elevatedButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledLabelTextColor()), elevatedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached$material3_release = colorScheme.getDefaultFilledTonalButtonColorsCached$material3_release();
        if (defaultFilledTonalButtonColorsCached$material3_release != null) {
            return defaultFilledTonalButtonColorsCached$material3_release;
        }
        FilledTonalButtonTokens filledTonalButtonTokens = FilledTonalButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getLabelTextColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached$material3_release = colorScheme.getDefaultOutlinedButtonColorsCached$material3_release();
        if (defaultOutlinedButtonColorsCached$material3_release != null) {
            return defaultOutlinedButtonColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        long jM24311getTransparent0d7_KjU = companion.m24311getTransparent0d7_KjU();
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM24311getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getLabelTextColor()), companion.m24311getTransparent0d7_KjU(), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultTextButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached$material3_release = colorScheme.getDefaultTextButtonColorsCached$material3_release();
        if (defaultTextButtonColorsCached$material3_release != null) {
            return defaultTextButtonColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        long jM24311getTransparent0d7_KjU = companion.m24311getTransparent0d7_KjU();
        TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM24311getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getLabelTextColor()), companion.m24311getTransparent0d7_KjU(), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    @Composable
    public final Shape getElevatedShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:546)");
        }
        Shape value = ShapesKt.getValue(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getFilledTonalShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:550)");
        }
        Shape value = ShapesKt.getValue(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m21793getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m21794getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m21795getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m21796getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @InterfaceC8721a
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:877)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke borderStrokeM20377BorderStrokecXLIe8U = BorderStrokeKt.m20377BorderStrokecXLIe8U(outlinedButtonTokens.m23357getOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM20377BorderStrokecXLIe8U;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)");
        }
        Shape value = ShapesKt.getValue(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        Shape value = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    @Composable
    public final Shape getTextShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        Shape value = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final BorderStroke outlinedButtonBorder(boolean z10, Composer composer, int i10, int i11) {
        long jM24275copywmQWz5c$default;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-626854767, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        float fM23357getOutlineWidthD9Ej5fM = outlinedButtonTokens.m23357getOutlineWidthD9Ej5fM();
        if (z10) {
            composer.startReplaceGroup(-855870548);
            jM24275copywmQWz5c$default = ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-855783004);
            jM24275copywmQWz5c$default = Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        BorderStroke borderStrokeM20377BorderStrokecXLIe8U = BorderStrokeKt.m20377BorderStrokecXLIe8U(fM23357getOutlineWidthD9Ej5fM, jM24275copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM20377BorderStrokecXLIe8U;
    }

    @Composable
    public final ButtonColors outlinedButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)");
        }
        ButtonColors defaultOutlinedButtonColors$material3_release = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedButtonColors$material3_release;
    }

    @Composable
    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m21797outlinedButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:719)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM21782copyjRlVdoo = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m21782copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM21782copyjRlVdoo;
    }

    @Composable
    public final ButtonColors textButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        ButtonColors defaultTextButtonColors$material3_release = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextButtonColors$material3_release;
    }

    @Composable
    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m21798textButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM21782copyjRlVdoo = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m21782copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM21782copyjRlVdoo;
    }
}
