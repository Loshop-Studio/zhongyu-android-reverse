package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJN\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010(\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001cJN\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'J\u0017\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u00100J\r\u00101\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u00101\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cJN\u00103\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010'R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m5110d2 = {"Landroidx/compose/material3/CardDefaults;", "", "()V", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "defaultCardColors", "Landroidx/compose/material3/CardColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultElevatedCardColors", "getDefaultElevatedCardColors$material3_release", "defaultOutlinedCardColors", "getDefaultOutlinedCardColors$material3_release", "cardColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "cardElevation", "Landroidx/compose/material3/CardElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "elevatedCardElevation", "elevatedCardElevation-aqJV_2Y", "outlinedCardBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "outlinedCardElevation", "outlinedCardElevation-aqJV_2Y", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1#2:852\n1223#3,6:853\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n*L\n627#1:853,6\n*E\n"})
/* loaded from: classes.dex */
public final class CardDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    @Composable
    @NotNull
    public final CardColors cardColors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        CardColors defaultCardColors$material3_release = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCardColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m8213cardColorsro_MJ88(long j7, long j8, long j9, long j10, @Nullable Composer composer, int i, int i8) {
        long j11;
        long jM10681copywmQWz5c$default;
        long jM10718getUnspecified0d7_KjU = (i8 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM8316contentColorForek8zF_U = (i8 & 2) != 0 ? ColorSchemeKt.m8316contentColorForek8zF_U(jM10718getUnspecified0d7_KjU, composer, i & 14) : j8;
        long jM10718getUnspecified0d7_KjU2 = (i8 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9;
        if ((i8 & 8) != 0) {
            long j12 = jM8316contentColorForek8zF_U;
            jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(j12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j11 = j12;
        } else {
            j11 = jM8316contentColorForek8zF_U;
            jM10681copywmQWz5c$default = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColorsM8208copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m8208copyjRlVdoo(jM10718getUnspecified0d7_KjU, j11, jM10718getUnspecified0d7_KjU2, jM10681copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM8208copyjRlVdoo;
    }

    @Composable
    @NotNull
    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m8214cardElevationaqJV_2Y(float f, float f7, float f8, float f9, float f10, float f11, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            f = FilledCardTokens.INSTANCE.m9665getContainerElevationD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f7 = FilledCardTokens.INSTANCE.m9671getPressedContainerElevationD9Ej5fM();
        }
        if ((i8 & 4) != 0) {
            f8 = FilledCardTokens.INSTANCE.m9668getFocusContainerElevationD9Ej5fM();
        }
        if ((i8 & 8) != 0) {
            f9 = FilledCardTokens.INSTANCE.m9669getHoverContainerElevationD9Ej5fM();
        }
        if ((i8 & 16) != 0) {
            f10 = FilledCardTokens.INSTANCE.m9667getDraggedContainerElevationD9Ej5fM();
        }
        float f12 = f10;
        if ((i8 & 32) != 0) {
            f11 = FilledCardTokens.INSTANCE.m9666getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        float f13 = f11;
        float f14 = f8;
        float f15 = f;
        CardElevation cardElevation = new CardElevation(f15, f7, f14, f9, f12, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    @Composable
    @NotNull
    public final CardColors elevatedCardColors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
        }
        CardColors defaultElevatedCardColors$material3_release = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedCardColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m8215elevatedCardColorsro_MJ88(long j7, long j8, long j9, long j10, @Nullable Composer composer, int i, int i8) {
        long j11;
        long jM10681copywmQWz5c$default;
        long jM10718getUnspecified0d7_KjU = (i8 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM8316contentColorForek8zF_U = (i8 & 2) != 0 ? ColorSchemeKt.m8316contentColorForek8zF_U(jM10718getUnspecified0d7_KjU, composer, i & 14) : j8;
        long jM10718getUnspecified0d7_KjU2 = (i8 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9;
        if ((i8 & 8) != 0) {
            long j12 = jM8316contentColorForek8zF_U;
            jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(j12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j11 = j12;
        } else {
            j11 = jM8316contentColorForek8zF_U;
            jM10681copywmQWz5c$default = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:540)");
        }
        CardColors cardColorsM8208copyjRlVdoo = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m8208copyjRlVdoo(jM10718getUnspecified0d7_KjU, j11, jM10718getUnspecified0d7_KjU2, jM10681copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM8208copyjRlVdoo;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m8216elevatedCardElevationaqJV_2Y(float f, float f7, float f8, float f9, float f10, float f11, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            f = ElevatedCardTokens.INSTANCE.m9584getContainerElevationD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f7 = ElevatedCardTokens.INSTANCE.m9590getPressedContainerElevationD9Ej5fM();
        }
        if ((i8 & 4) != 0) {
            f8 = ElevatedCardTokens.INSTANCE.m9587getFocusContainerElevationD9Ej5fM();
        }
        if ((i8 & 8) != 0) {
            f9 = ElevatedCardTokens.INSTANCE.m9588getHoverContainerElevationD9Ej5fM();
        }
        if ((i8 & 16) != 0) {
            f10 = ElevatedCardTokens.INSTANCE.m9586getDraggedContainerElevationD9Ej5fM();
        }
        float f12 = f10;
        if ((i8 & 32) != 0) {
            f11 = ElevatedCardTokens.INSTANCE.m9585getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
        }
        float f13 = f11;
        float f14 = f8;
        float f15 = f;
        CardElevation cardElevation = new CardElevation(f15, f7, f14, f9, f12, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    @NotNull
    public final CardColors getDefaultCardColors$material3_release(@NotNull ColorScheme colorScheme) {
        CardColors defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorSchemeKt.m8315contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), ColorKt.m10727compositeOverOWjLjI(Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), filledCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), Color.m10681copywmQWz5c$default(ColorSchemeKt.m8315contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    @NotNull
    public final CardColors getDefaultElevatedCardColors$material3_release(@NotNull ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached = colorScheme.getDefaultElevatedCardColorsCached();
        if (defaultElevatedCardColorsCached != null) {
            return defaultElevatedCardColorsCached;
        }
        ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor()), ColorSchemeKt.m8315contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), ColorKt.m10727compositeOverOWjLjI(Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor()), elevatedCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor())), Color.m10681copywmQWz5c$default(ColorSchemeKt.m8315contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    @NotNull
    public final CardColors getDefaultOutlinedCardColors$material3_release(@NotNull ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached = colorScheme.getDefaultOutlinedCardColorsCached();
        if (defaultOutlinedCardColorsCached != null) {
            return defaultOutlinedCardColorsCached;
        }
        OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), ColorSchemeKt.m8315contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.m8315contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
    @NotNull
    public final Shape getElevatedShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
        }
        Shape value = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
        }
        Shape value = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @NotNull
    public final BorderStroke outlinedCardBorder(boolean z8, @Nullable Composer composer, int i, int i8) {
        long jM10727compositeOverOWjLjI;
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if (z8) {
            composer.startReplaceGroup(-134409770);
            jM10727compositeOverOWjLjI = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-134330379);
            jM10727compositeOverOWjLjI = ColorKt.m10727compositeOverOWjLjI(Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM10727compositeOverOWjLjI);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m6783BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m9770getOutlineWidthD9Ej5fM(), jM10727compositeOverOWjLjI);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    @Composable
    @NotNull
    public final CardColors outlinedCardColors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
        }
        CardColors defaultOutlinedCardColors$material3_release = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedCardColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m8217outlinedCardColorsro_MJ88(long j7, long j8, long j9, long j10, @Nullable Composer composer, int i, int i8) {
        long jM10718getUnspecified0d7_KjU = (i8 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM8316contentColorForek8zF_U = (i8 & 2) != 0 ? ColorSchemeKt.m8316contentColorForek8zF_U(jM10718getUnspecified0d7_KjU, composer, i & 14) : j8;
        long jM10718getUnspecified0d7_KjU2 = (i8 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9;
        long jM10681copywmQWz5c$default = (i8 & 8) != 0 ? Color.m10681copywmQWz5c$default(ColorSchemeKt.m8316contentColorForek8zF_U(jM10718getUnspecified0d7_KjU, composer, i & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
        }
        CardColors cardColorsM8208copyjRlVdoo = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m8208copyjRlVdoo(jM10718getUnspecified0d7_KjU, jM8316contentColorForek8zF_U, jM10718getUnspecified0d7_KjU2, jM10681copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM8208copyjRlVdoo;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m8218outlinedCardElevationaqJV_2Y(float f, float f7, float f8, float f9, float f10, float f11, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            f = OutlinedCardTokens.INSTANCE.m9764getContainerElevationD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f7 = f;
        }
        if ((i8 & 4) != 0) {
            f8 = f;
        }
        if ((i8 & 8) != 0) {
            f9 = f;
        }
        if ((i8 & 16) != 0) {
            f10 = OutlinedCardTokens.INSTANCE.m9766getDraggedContainerElevationD9Ej5fM();
        }
        float f12 = f10;
        if ((i8 & 32) != 0) {
            f11 = OutlinedCardTokens.INSTANCE.m9765getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
        }
        float f13 = f11;
        float f14 = f8;
        float f15 = f;
        CardElevation cardElevation = new CardElevation(f15, f7, f14, f9, f12, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }
}
