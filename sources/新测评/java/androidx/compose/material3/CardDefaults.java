package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJN\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010(\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001cJN\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'J\u0017\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u00100J\r\u00101\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u00101\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cJN\u00103\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010'R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m13558d2 = {"Landroidx/compose/material3/CardDefaults;", "", "()V", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "defaultCardColors", "Landroidx/compose/material3/CardColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultElevatedCardColors", "getDefaultElevatedCardColors$material3_release", "defaultOutlinedCardColors", "getDefaultOutlinedCardColors$material3_release", "cardColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "cardElevation", "Landroidx/compose/material3/CardElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "elevatedCardElevation", "elevatedCardElevation-aqJV_2Y", "outlinedCardBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "outlinedCardElevation", "outlinedCardElevation-aqJV_2Y", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1#2:852\n1223#3,6:853\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n*L\n627#1:853,6\n*E\n"})
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
    public final CardColors m18565cardColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        long j14;
        long jM20975copywmQWz5c$default;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM18666contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(jM21012getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j15 = jM18666contentColorForek8zF_U;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j15;
        } else {
            j14 = jM18666contentColorForek8zF_U;
            jM20975copywmQWz5c$default = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColorsM18560copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18560copyjRlVdoo(jM21012getUnspecified0d7_KjU, j14, jM21012getUnspecified0d7_KjU2, jM20975copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM18560copyjRlVdoo;
    }

    @Composable
    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m18566cardElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilledCardTokens.INSTANCE.m19983getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilledCardTokens.INSTANCE.m19989getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilledCardTokens.INSTANCE.m19986getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilledCardTokens.INSTANCE.m19987getHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = FilledCardTokens.INSTANCE.m19985getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = FilledCardTokens.INSTANCE.m19984getDisabledContainerElevationD9Ej5fM();
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
    public final CardColors m18567elevatedCardColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        long j14;
        long jM20975copywmQWz5c$default;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM18666contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(jM21012getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j15 = jM18666contentColorForek8zF_U;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j15;
        } else {
            j14 = jM18666contentColorForek8zF_U;
            jM20975copywmQWz5c$default = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:540)");
        }
        CardColors cardColorsM18560copyjRlVdoo = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18560copyjRlVdoo(jM21012getUnspecified0d7_KjU, j14, jM21012getUnspecified0d7_KjU2, jM20975copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM18560copyjRlVdoo;
    }

    @Composable
    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m18568elevatedCardElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = ElevatedCardTokens.INSTANCE.m19902getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = ElevatedCardTokens.INSTANCE.m19908getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = ElevatedCardTokens.INSTANCE.m19905getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = ElevatedCardTokens.INSTANCE.m19906getHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = ElevatedCardTokens.INSTANCE.m19904getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = ElevatedCardTokens.INSTANCE.m19903getDisabledContainerElevationD9Ej5fM();
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
        CardColors defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), filledCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), Color.m20975copywmQWz5c$default(ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultElevatedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached = colorScheme.getDefaultElevatedCardColorsCached();
        if (defaultElevatedCardColorsCached != null) {
            return defaultElevatedCardColorsCached;
        }
        ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor()), elevatedCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor())), Color.m20975copywmQWz5c$default(ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultOutlinedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached = colorScheme.getDefaultOutlinedCardColorsCached();
        if (defaultOutlinedCardColorsCached != null) {
            return defaultOutlinedCardColorsCached;
        }
        OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
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
    @JvmName(name = "getOutlinedShape")
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
    @JvmName(name = "getShape")
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
    public final BorderStroke outlinedCardBorder(boolean z9, Composer composer, int i10, int i11) {
        long jM21021compositeOverOWjLjI;
        if ((i11 & 1) != 0) {
            z9 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if (z9) {
            composer.startReplaceGroup(-134409770);
            jM21021compositeOverOWjLjI = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-134330379);
            jM21021compositeOverOWjLjI = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM21021compositeOverOWjLjI);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m17217BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m20088getOutlineWidthD9Ej5fM(), jM21021compositeOverOWjLjI);
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
    public final CardColors m18569outlinedCardColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM18666contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(jM21012getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM20975copywmQWz5c$default = (i11 & 8) != 0 ? Color.m20975copywmQWz5c$default(ColorSchemeKt.m18666contentColorForek8zF_U(jM21012getUnspecified0d7_KjU, composer, i10 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
        }
        CardColors cardColorsM18560copyjRlVdoo = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18560copyjRlVdoo(jM21012getUnspecified0d7_KjU, jM18666contentColorForek8zF_U, jM21012getUnspecified0d7_KjU2, jM20975copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM18560copyjRlVdoo;
    }

    @Composable
    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m18570outlinedCardElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = OutlinedCardTokens.INSTANCE.m20082getContainerElevationD9Ej5fM();
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
            f14 = OutlinedCardTokens.INSTANCE.m20084getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = OutlinedCardTokens.INSTANCE.m20083getDisabledContainerElevationD9Ej5fM();
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
