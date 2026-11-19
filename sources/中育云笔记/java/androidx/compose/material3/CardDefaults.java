package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    @Composable
    public final CardColors cardColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        CardColors defaultCardColors$material3_release = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCardColors$material3_release;
    }

    @Composable
    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m28409cardColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        long j14;
        long jM30877copywmQWz5c$default;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM28512contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM30914getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j15 = jM28512contentColorForek8zF_U;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j15;
        } else {
            j14 = jM28512contentColorForek8zF_U;
            jM30877copywmQWz5c$default = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColorsM28404copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28404copyjRlVdoo(jM30914getUnspecified0d7_KjU, j14, jM30914getUnspecified0d7_KjU2, jM30877copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM28404copyjRlVdoo;
    }

    @Composable
    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m28410cardElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilledCardTokens.INSTANCE.m29861getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilledCardTokens.INSTANCE.m29867getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilledCardTokens.INSTANCE.m29864getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilledCardTokens.INSTANCE.m29865getHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = FilledCardTokens.INSTANCE.m29863getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = FilledCardTokens.INSTANCE.m29862getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i10, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        CardElevation cardElevation = new CardElevation(f19, f11, f18, f13, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    @Composable
    public final CardColors elevatedCardColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
        }
        CardColors defaultElevatedCardColors$material3_release = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedCardColors$material3_release;
    }

    @Composable
    /* renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m28411elevatedCardColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        long j14;
        long jM30877copywmQWz5c$default;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM28512contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM30914getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j15 = jM28512contentColorForek8zF_U;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j15;
        } else {
            j14 = jM28512contentColorForek8zF_U;
            jM30877copywmQWz5c$default = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:540)");
        }
        CardColors cardColorsM28404copyjRlVdoo = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28404copyjRlVdoo(jM30914getUnspecified0d7_KjU, j14, jM30914getUnspecified0d7_KjU2, jM30877copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM28404copyjRlVdoo;
    }

    @Composable
    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m28412elevatedCardElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = ElevatedCardTokens.INSTANCE.m29780getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = ElevatedCardTokens.INSTANCE.m29786getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = ElevatedCardTokens.INSTANCE.m29783getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = ElevatedCardTokens.INSTANCE.m29784getHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = ElevatedCardTokens.INSTANCE.m29782getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = ElevatedCardTokens.INSTANCE.m29781getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        CardElevation cardElevation = new CardElevation(f19, f11, f18, f13, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors getDefaultCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached$material3_release = colorScheme.getDefaultCardColorsCached$material3_release();
        if (defaultCardColorsCached$material3_release != null) {
            return defaultCardColorsCached$material3_release;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), ColorKt.m30923compositeOverOWjLjI(Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), filledCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), Color.m30877copywmQWz5c$default(ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultElevatedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached$material3_release = colorScheme.getDefaultElevatedCardColorsCached$material3_release();
        if (defaultElevatedCardColorsCached$material3_release != null) {
            return defaultElevatedCardColorsCached$material3_release;
        }
        ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), ColorKt.m30923compositeOverOWjLjI(Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor()), elevatedCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor())), Color.m30877copywmQWz5c$default(ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultOutlinedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached$material3_release = colorScheme.getDefaultOutlinedCardColorsCached$material3_release();
        if (defaultOutlinedCardColorsCached$material3_release != null) {
            return defaultOutlinedCardColorsCached$material3_release;
        }
        OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    @Composable
    public final Shape getElevatedShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i10, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
        }
        Shape value = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i10, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
        }
        Shape value = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i10, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final BorderStroke outlinedCardBorder(boolean z10, Composer composer, int i10, int i11) {
        long jM30923compositeOverOWjLjI;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if (z10) {
            composer.startReplaceGroup(-134409770);
            jM30923compositeOverOWjLjI = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-134330379);
            jM30923compositeOverOWjLjI = ColorKt.m30923compositeOverOWjLjI(Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM30923compositeOverOWjLjI);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m26979BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m29966getOutlineWidthD9Ej5fM(), jM30923compositeOverOWjLjI);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    @Composable
    public final CardColors outlinedCardColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
        }
        CardColors defaultOutlinedCardColors$material3_release = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedCardColors$material3_release;
    }

    @Composable
    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m28413outlinedCardColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM28512contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM30914getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30877copywmQWz5c$default = (i11 & 8) != 0 ? Color.m30877copywmQWz5c$default(ColorSchemeKt.m28512contentColorForek8zF_U(jM30914getUnspecified0d7_KjU, composer, i10 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
        }
        CardColors cardColorsM28404copyjRlVdoo = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28404copyjRlVdoo(jM30914getUnspecified0d7_KjU, jM28512contentColorForek8zF_U, jM30914getUnspecified0d7_KjU2, jM30877copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM28404copyjRlVdoo;
    }

    @Composable
    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m28414outlinedCardElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = OutlinedCardTokens.INSTANCE.m29960getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = f10;
        }
        if ((i11 & 4) != 0) {
            f12 = f10;
        }
        if ((i11 & 8) != 0) {
            f13 = f10;
        }
        if ((i11 & 16) != 0) {
            f14 = OutlinedCardTokens.INSTANCE.m29962getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = OutlinedCardTokens.INSTANCE.m29961getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        CardElevation cardElevation = new CardElevation(f19, f11, f18, f13, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }
}
