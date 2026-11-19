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
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102JG\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J=\u0010<\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u00102JG\u0010>\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010;J=\u0010@\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u00102JG\u0010B\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010;J=\u0010D\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u00102J=\u0010F\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u00102R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0019\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010&\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0011\u0010(\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b)\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, m5175d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ButtonWithIconContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getButtonWithIconContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconHorizontalStartPadding", "ContentPadding", "getContentPadding", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledTonalShape", "getFilledTonalShape", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "textShape", "getTextShape", "buttonColors", "Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "textButtonColors", "textButtonColors-ro_MJ88", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
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

    static {
        float fM11525constructorimpl = C1700Dp.m11525constructorimpl(24);
        ButtonHorizontalPadding = fM11525constructorimpl;
        float f4 = 8;
        float fM11525constructorimpl2 = C1700Dp.m11525constructorimpl(f4);
        ButtonVerticalPadding = fM11525constructorimpl2;
        PaddingValues paddingValuesM7312PaddingValuesa9UjIt4 = PaddingKt.m7312PaddingValuesa9UjIt4(fM11525constructorimpl, fM11525constructorimpl2, fM11525constructorimpl, fM11525constructorimpl2);
        ContentPadding = paddingValuesM7312PaddingValuesa9UjIt4;
        float fM11525constructorimpl3 = C1700Dp.m11525constructorimpl(16);
        ButtonWithIconHorizontalStartPadding = fM11525constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m7312PaddingValuesa9UjIt4(fM11525constructorimpl3, fM11525constructorimpl2, fM11525constructorimpl, fM11525constructorimpl2);
        float fM11525constructorimpl4 = C1700Dp.m11525constructorimpl(12);
        TextButtonHorizontalPadding = fM11525constructorimpl4;
        TextButtonContentPadding = PaddingKt.m7312PaddingValuesa9UjIt4(fM11525constructorimpl4, paddingValuesM7312PaddingValuesa9UjIt4.getTop(), fM11525constructorimpl4, paddingValuesM7312PaddingValuesa9UjIt4.getBottom());
        MinWidth = C1700Dp.m11525constructorimpl(58);
        MinHeight = C1700Dp.m11525constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m8484getIconSizeD9Ej5fM();
        IconSpacing = C1700Dp.m11525constructorimpl(f4);
    }

    private ButtonDefaults() {
    }

    @Composable
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m7823buttonColorsro_MJ88(long j4, long j5, long j6, long j7, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-339300779);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j4;
        long color2 = (i5 & 2) != 0 ? ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long jM9177copywmQWz5c$default = (i5 & 4) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM9177copywmQWz5c$default2 = (i5 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i4, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:547)");
        }
        ButtonColors buttonColors = new ButtonColors(color, color2, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m7824buttonElevationR_JCAzs(float f4, float f5, float f6, float f7, float f8, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1827791191);
        float fM8479getContainerElevationD9Ej5fM = (i5 & 1) != 0 ? FilledButtonTokens.INSTANCE.m8479getContainerElevationD9Ej5fM() : f4;
        float fM8485getPressedContainerElevationD9Ej5fM = (i5 & 2) != 0 ? FilledButtonTokens.INSTANCE.m8485getPressedContainerElevationD9Ej5fM() : f5;
        float fM8482getFocusContainerElevationD9Ej5fM = (i5 & 4) != 0 ? FilledButtonTokens.INSTANCE.m8482getFocusContainerElevationD9Ej5fM() : f6;
        float fM8483getHoverContainerElevationD9Ej5fM = (i5 & 8) != 0 ? FilledButtonTokens.INSTANCE.m8483getHoverContainerElevationD9Ej5fM() : f7;
        float fM8481getDisabledContainerElevationD9Ej5fM = (i5 & 16) != 0 ? FilledButtonTokens.INSTANCE.m8481getDisabledContainerElevationD9Ej5fM() : f8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i4, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:674)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM8479getContainerElevationD9Ej5fM, fM8485getPressedContainerElevationD9Ej5fM, fM8482getFocusContainerElevationD9Ej5fM, fM8483getHoverContainerElevationD9Ej5fM, fM8481getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m7825elevatedButtonColorsro_MJ88(long j4, long j5, long j6, long j7, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1507908383);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j4;
        long color2 = (i5 & 2) != 0 ? ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long jM9177copywmQWz5c$default = (i5 & 4) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM9177copywmQWz5c$default2 = (i5 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i4, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:572)");
        }
        ButtonColors buttonColors = new ButtonColors(color, color2, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m7826elevatedButtonElevationR_JCAzs(float f4, float f5, float f6, float f7, float f8, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1065482445);
        float fM8395getContainerElevationD9Ej5fM = (i5 & 1) != 0 ? ElevatedButtonTokens.INSTANCE.m8395getContainerElevationD9Ej5fM() : f4;
        float fM8401getPressedContainerElevationD9Ej5fM = (i5 & 2) != 0 ? ElevatedButtonTokens.INSTANCE.m8401getPressedContainerElevationD9Ej5fM() : f5;
        float fM8398getFocusContainerElevationD9Ej5fM = (i5 & 4) != 0 ? ElevatedButtonTokens.INSTANCE.m8398getFocusContainerElevationD9Ej5fM() : f6;
        float fM8399getHoverContainerElevationD9Ej5fM = (i5 & 8) != 0 ? ElevatedButtonTokens.INSTANCE.m8399getHoverContainerElevationD9Ej5fM() : f7;
        float fM8397getDisabledContainerElevationD9Ej5fM = (i5 & 16) != 0 ? ElevatedButtonTokens.INSTANCE.m8397getDisabledContainerElevationD9Ej5fM() : f8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i4, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:700)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM8395getContainerElevationD9Ej5fM, fM8401getPressedContainerElevationD9Ej5fM, fM8398getFocusContainerElevationD9Ej5fM, fM8399getHoverContainerElevationD9Ej5fM, fM8397getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m7827filledTonalButtonColorsro_MJ88(long j4, long j5, long j6, long j7, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1670757653);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j4;
        long color2 = (i5 & 2) != 0 ? ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long jM9177copywmQWz5c$default = (i5 & 4) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM9177copywmQWz5c$default2 = (i5 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i4, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:598)");
        }
        ButtonColors buttonColors = new ButtonColors(color, color2, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m7828filledTonalButtonElevationR_JCAzs(float f4, float f5, float f6, float f7, float f8, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(5982871);
        float fM8502getContainerElevationD9Ej5fM = (i5 & 1) != 0 ? FilledTonalButtonTokens.INSTANCE.m8502getContainerElevationD9Ej5fM() : f4;
        float fM8508getPressedContainerElevationD9Ej5fM = (i5 & 2) != 0 ? FilledTonalButtonTokens.INSTANCE.m8508getPressedContainerElevationD9Ej5fM() : f5;
        float fM8505getFocusContainerElevationD9Ej5fM = (i5 & 4) != 0 ? FilledTonalButtonTokens.INSTANCE.m8505getFocusContainerElevationD9Ej5fM() : f6;
        float fM8506getHoverContainerElevationD9Ej5fM = (i5 & 8) != 0 ? FilledTonalButtonTokens.INSTANCE.m8506getHoverContainerElevationD9Ej5fM() : f7;
        float fM11525constructorimpl = (i5 & 16) != 0 ? C1700Dp.m11525constructorimpl(0) : f8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i4, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:727)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM8502getContainerElevationD9Ej5fM, fM8508getPressedContainerElevationD9Ej5fM, fM8505getFocusContainerElevationD9Ej5fM, fM8506getHoverContainerElevationD9Ej5fM, fM11525constructorimpl, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
    public final Shape getElevatedShape(Composer composer, int i4) {
        composer.startReplaceableGroup(2143958791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:526)");
        }
        Shape shape = ShapesKt.toShape(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getFilledTonalShape")
    public final Shape getFilledTonalShape(Composer composer, int i4) {
        composer.startReplaceableGroup(-886584987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:529)");
        }
        Shape shape = ShapesKt.toShape(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m7829getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m7830getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m7831getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m7832getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedButtonBorder")
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i4) {
        composer.startReplaceableGroup(-563957672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:744)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke borderStrokeM7087BorderStrokecXLIe8U = BorderStrokeKt.m7087BorderStrokecXLIe8U(outlinedButtonTokens.m8585getOutlineWidthD9Ej5fM(), ColorSchemeKt.toColor(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM7087BorderStrokecXLIe8U;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    public final Shape getOutlinedShape(Composer composer, int i4) {
        composer.startReplaceableGroup(-2045213065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:532)");
        }
        Shape shape = ShapesKt.toShape(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i4) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:523)");
        }
        Shape shape = ShapesKt.toShape(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    @JvmName(name = "getTextShape")
    public final Shape getTextShape(Composer composer, int i4) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:535)");
        }
        Shape shape = ShapesKt.toShape(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m7833outlinedButtonColorsro_MJ88(long j4, long j5, long j6, long j7, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-1778526249);
        long jM9213getTransparent0d7_KjU = (i5 & 1) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j4;
        long color = (i5 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long jM9213getTransparent0d7_KjU2 = (i5 & 4) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j6;
        long jM9177copywmQWz5c$default = (i5 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i4, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:624)");
        }
        ButtonColors buttonColors = new ButtonColors(jM9213getTransparent0d7_KjU, color, jM9213getTransparent0d7_KjU2, jM9177copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m7834textButtonColorsro_MJ88(long j4, long j5, long j6, long j7, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-1402274782);
        long jM9213getTransparent0d7_KjU = (i5 & 1) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j4;
        long color = (i5 & 2) != 0 ? ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long jM9213getTransparent0d7_KjU2 = (i5 & 4) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j6;
        long jM9177copywmQWz5c$default = (i5 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i4, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:648)");
        }
        ButtonColors buttonColors = new ButtonColors(jM9213getTransparent0d7_KjU, color, jM9213getTransparent0d7_KjU2, jM9177copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }
}
