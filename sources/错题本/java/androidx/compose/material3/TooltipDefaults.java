package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpKt;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.window.PopupPositionProvider;
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
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\"J:\u0010!\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, m5110d2 = {"Landroidx/compose/material3/TooltipDefaults;", "", "()V", "caretSize", "Landroidx/compose/ui/unit/DpSize;", "getCaretSize-MYxV2XQ", "()J", "J", "plainTooltipContainerColor", "Landroidx/compose/ui/graphics/Color;", "getPlainTooltipContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "plainTooltipContainerShape", "Landroidx/compose/ui/graphics/Shape;", "getPlainTooltipContainerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "plainTooltipContentColor", "getPlainTooltipContentColor", "richTooltipContainerShape", "getRichTooltipContainerShape", "defaultRichTooltipColors", "Landroidx/compose/material3/RichTooltipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultRichTooltipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RichTooltipColors;", "rememberPlainTooltipPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "spacingBetweenTooltipAndAnchor", "Landroidx/compose/ui/unit/Dp;", "rememberPlainTooltipPositionProvider-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;", "rememberRichTooltipPositionProvider", "rememberRichTooltipPositionProvider-kHDZbjc", "richTooltipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RichTooltipColors;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "richTooltipColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RichTooltipColors;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n1#2:646\n77#3:647\n77#3:654\n1223#4,6:648\n1223#4,6:655\n148#5:661\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n*L\n305#1:647\n338#1:654\n306#1:648,6\n339#1:655,6\n256#1:661\n*E\n"})
/* loaded from: classes.dex */
public final class TooltipDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final TooltipDefaults INSTANCE = new TooltipDefaults();
    private static final long caretSize = DpKt.m13327DpSizeYgX7TsA(C2331Dp.m13305constructorimpl(16), C2331Dp.m13305constructorimpl(8));

    private TooltipDefaults() {
    }

    /* renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m9255getCaretSizeMYxV2XQ() {
        return caretSize;
    }

    @NotNull
    public final RichTooltipColors getDefaultRichTooltipColors$material3_release(@NotNull ColorScheme colorScheme) {
        RichTooltipColors defaultRichTooltipColorsCached = colorScheme.getDefaultRichTooltipColorsCached();
        if (defaultRichTooltipColorsCached != null) {
            return defaultRichTooltipColorsCached;
        }
        RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
        RichTooltipColors richTooltipColors = new RichTooltipColors(ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSubheadColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getActionLabelTextColor()), null);
        colorScheme.setDefaultRichTooltipColorsCached$material3_release(richTooltipColors);
        return richTooltipColors;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContainerColor")
    public final long getPlainTooltipContainerColor(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102696215, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:244)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContainerShape")
    @NotNull
    public final Shape getPlainTooltipContainerShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(49570325, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:240)");
        }
        Shape value = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContentColor")
    public final long getPlainTooltipContentColor(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1982928937, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:248)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @JvmName(name = "getRichTooltipContainerShape")
    @NotNull
    public final Shape getRichTooltipContainerShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138709783, i, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:252)");
        }
        Shape value = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @NotNull
    /* renamed from: rememberPlainTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m9256rememberPlainTooltipPositionProviderkHDZbjc(float f, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047866909, i, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:302)");
        }
        final int iMo6897roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo6897roundToPx0680j_4(f);
        boolean zChanged = composer.changed(iMo6897roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                @Override // androidx.compose.p011ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo6871calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
                    int width = ((anchorBounds.getWidth() - IntSize.m13476getWidthimpl(popupContentSize)) / 2) + anchorBounds.getLeft();
                    int top2 = (anchorBounds.getTop() - IntSize.m13475getHeightimpl(popupContentSize)) - iMo6897roundToPx0680j_4;
                    if (top2 < 0) {
                        top2 = iMo6897roundToPx0680j_4 + anchorBounds.getBottom();
                    }
                    return IntOffsetKt.IntOffset(width, top2);
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
    @NotNull
    /* renamed from: rememberRichTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m9257rememberRichTooltipPositionProviderkHDZbjc(float f, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538806795, i, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:335)");
        }
        final int iMo6897roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo6897roundToPx0680j_4(f);
        boolean zChanged = composer.changed(iMo6897roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberRichTooltipPositionProvider$1$1
                @Override // androidx.compose.p011ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo6871calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
                    int left = anchorBounds.getLeft();
                    if (IntSize.m13476getWidthimpl(popupContentSize) + left > IntSize.m13476getWidthimpl(windowSize) && (left = anchorBounds.getRight() - IntSize.m13476getWidthimpl(popupContentSize)) < 0) {
                        left = ((anchorBounds.getWidth() - IntSize.m13476getWidthimpl(popupContentSize)) / 2) + anchorBounds.getLeft();
                    }
                    int top2 = (anchorBounds.getTop() - IntSize.m13475getHeightimpl(popupContentSize)) - iMo6897roundToPx0680j_4;
                    if (top2 < 0) {
                        top2 = iMo6897roundToPx0680j_4 + anchorBounds.getBottom();
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
    @NotNull
    public final RichTooltipColors richTooltipColors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1622312141, i, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:261)");
        }
        RichTooltipColors defaultRichTooltipColors$material3_release = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultRichTooltipColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: richTooltipColors-ro_MJ88, reason: not valid java name */
    public final RichTooltipColors m9258richTooltipColorsro_MJ88(long j7, long j8, long j9, long j10, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            j7 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        if ((i8 & 2) != 0) {
            j8 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        if ((i8 & 4) != 0) {
            j9 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        if ((i8 & 8) != 0) {
            j10 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, i, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:274)");
        }
        long j11 = j7;
        RichTooltipColors richTooltipColorsM8803copyjRlVdoo = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m8803copyjRlVdoo(j11, j8, j9, j10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return richTooltipColorsM8803copyjRlVdoo;
    }
}
