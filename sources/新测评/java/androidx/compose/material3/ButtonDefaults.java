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
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010:\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010:\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJD\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010L\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010BJD\u0010N\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010KJ\r\u0010P\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010P\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bQ\u0010BJD\u0010R\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bS\u0010KJ\u0017\u0010#\u001a\u00020$2\b\b\u0002\u0010T\u001a\u00020UH\u0007¢\u0006\u0002\u0010VJ\r\u0010W\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010W\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010BJ\r\u0010Y\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010Y\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bZ\u0010BR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0016\u0010\u0019\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0016\u0010\u001c\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010)\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0018\u0010-\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0018\u00104\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0018\u00106\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0018\u00108\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, m13558d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ButtonWithIconContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getButtonWithIconContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconHorizontalStartPadding", "ContentPadding", "getContentPadding", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "TextButtonWithIconHorizontalEndPadding", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledTonalShape", "getFilledTonalShape", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "textShape", "getTextShape", "defaultButtonColors", "Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultElevatedButtonColors", "getDefaultElevatedButtonColors$material3_release", "defaultFilledTonalButtonColors", "getDefaultFilledTonalButtonColors$material3_release", "defaultOutlinedButtonColors", "getDefaultOutlinedButtonColors$material3_release", "defaultTextButtonColors", "getDefaultTextButtonColors$material3_release", "buttonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "textButtonColors", "textButtonColors-ro_MJ88", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1108:1\n1#2:1109\n148#3:1110\n148#3:1111\n148#3:1112\n148#3:1113\n148#3:1114\n148#3:1115\n148#3:1116\n148#3:1117\n148#3:1118\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n858#1:1110\n465#1:1111\n466#1:1112\n484#1:1113\n495#1:1114\n510#1:1115\n525#1:1116\n531#1:1117\n539#1:1118\n*E\n"})
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
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(24);
        ButtonHorizontalPadding = fM23561constructorimpl;
        float f10 = 8;
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(f10);
        ButtonVerticalPadding = fM23561constructorimpl2;
        PaddingValues paddingValuesM17677PaddingValuesa9UjIt4 = PaddingKt.m17677PaddingValuesa9UjIt4(fM23561constructorimpl, fM23561constructorimpl2, fM23561constructorimpl, fM23561constructorimpl2);
        ContentPadding = paddingValuesM17677PaddingValuesa9UjIt4;
        float f11 = 16;
        float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(f11);
        ButtonWithIconHorizontalStartPadding = fM23561constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m17677PaddingValuesa9UjIt4(fM23561constructorimpl3, fM23561constructorimpl2, fM23561constructorimpl, fM23561constructorimpl2);
        float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl(12);
        TextButtonHorizontalPadding = fM23561constructorimpl4;
        TextButtonContentPadding = PaddingKt.m17677PaddingValuesa9UjIt4(fM23561constructorimpl4, paddingValuesM17677PaddingValuesa9UjIt4.getTop(), fM23561constructorimpl4, paddingValuesM17677PaddingValuesa9UjIt4.getBottom());
        float fM23561constructorimpl5 = C3127Dp.m23561constructorimpl(f11);
        TextButtonWithIconHorizontalEndPadding = fM23561constructorimpl5;
        TextButtonWithIconContentPadding = PaddingKt.m17677PaddingValuesa9UjIt4(fM23561constructorimpl4, paddingValuesM17677PaddingValuesa9UjIt4.getTop(), fM23561constructorimpl5, paddingValuesM17677PaddingValuesa9UjIt4.getBottom());
        MinWidth = C3127Dp.m23561constructorimpl(58);
        MinHeight = C3127Dp.m23561constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m19981getIconSizeD9Ej5fM();
        IconSpacing = C3127Dp.m23561constructorimpl(f10);
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
    public final ButtonColors m18545buttonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM18540copyjRlVdoo = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18540copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM18540copyjRlVdoo;
    }

    @Composable
    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m18546buttonElevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilledButtonTokens.INSTANCE.m19976getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilledButtonTokens.INSTANCE.m19982getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilledButtonTokens.INSTANCE.m19979getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilledButtonTokens.INSTANCE.m19980getHoverContainerElevationD9Ej5fM();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = FilledButtonTokens.INSTANCE.m19978getDisabledContainerElevationD9Ej5fM();
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
    public final ButtonColors m18547elevatedButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:627)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM18540copyjRlVdoo = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18540copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM18540copyjRlVdoo;
    }

    @Composable
    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m18548elevatedButtonElevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = ElevatedButtonTokens.INSTANCE.m19895getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = ElevatedButtonTokens.INSTANCE.m19901getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = ElevatedButtonTokens.INSTANCE.m19898getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = ElevatedButtonTokens.INSTANCE.m19899getHoverContainerElevationD9Ej5fM();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = ElevatedButtonTokens.INSTANCE.m19897getDisabledContainerElevationD9Ej5fM();
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
    public final ButtonColors m18549filledTonalButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:674)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM18540copyjRlVdoo = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18540copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM18540copyjRlVdoo;
    }

    @Composable
    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m18550filledTonalButtonElevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilledTonalButtonTokens.INSTANCE.m19999getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilledTonalButtonTokens.INSTANCE.m20005getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilledTonalButtonTokens.INSTANCE.m20002getFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilledTonalButtonTokens.INSTANCE.m20003getHoverContainerElevationD9Ej5fM();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = C3127Dp.m23561constructorimpl(0);
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
        ButtonColors defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached = colorScheme.getDefaultElevatedButtonColorsCached();
        if (defaultElevatedButtonColorsCached != null) {
            return defaultElevatedButtonColorsCached;
        }
        ElevatedButtonTokens elevatedButtonTokens = ElevatedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getLabelTextColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledContainerColor()), elevatedButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledLabelTextColor()), elevatedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached = colorScheme.getDefaultFilledTonalButtonColorsCached();
        if (defaultFilledTonalButtonColorsCached != null) {
            return defaultFilledTonalButtonColorsCached;
        }
        FilledTonalButtonTokens filledTonalButtonTokens = FilledTonalButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getLabelTextColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached = colorScheme.getDefaultOutlinedButtonColorsCached();
        if (defaultOutlinedButtonColorsCached != null) {
            return defaultOutlinedButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM21011getTransparent0d7_KjU = companion.m21011getTransparent0d7_KjU();
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM21011getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getLabelTextColor()), companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultTextButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM21011getTransparent0d7_KjU = companion.m21011getTransparent0d7_KjU();
        TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM21011getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getLabelTextColor()), companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
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
    @JvmName(name = "getFilledTonalShape")
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
    public final float m18551getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m18552getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m18553getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m18554getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Deprecated(message = "Please use the version that takes an `enabled` param to get the `BorderStroke` with the correct opacity", replaceWith = @ReplaceWith(expression = "outlinedButtonBorder(enabled)", imports = {}))
    @Composable
    @JvmName(name = "getOutlinedButtonBorder")
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:877)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke borderStrokeM17217BorderStrokecXLIe8U = BorderStrokeKt.m17217BorderStrokecXLIe8U(outlinedButtonTokens.m20081getOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM17217BorderStrokecXLIe8U;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
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
    @JvmName(name = "getShape")
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
    @JvmName(name = "getTextShape")
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
    public final BorderStroke outlinedButtonBorder(boolean z9, Composer composer, int i10, int i11) {
        long jM20975copywmQWz5c$default;
        if ((i11 & 1) != 0) {
            z9 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-626854767, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        float fM20081getOutlineWidthD9Ej5fM = outlinedButtonTokens.m20081getOutlineWidthD9Ej5fM();
        if (z9) {
            composer.startReplaceGroup(-855870548);
            jM20975copywmQWz5c$default = ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-855783004);
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        BorderStroke borderStrokeM17217BorderStrokecXLIe8U = BorderStrokeKt.m17217BorderStrokecXLIe8U(fM20081getOutlineWidthD9Ej5fM, jM20975copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM17217BorderStrokecXLIe8U;
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
    public final ButtonColors m18555outlinedButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:719)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM18540copyjRlVdoo = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18540copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM18540copyjRlVdoo;
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
    public final ButtonColors m18556textButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
        }
        long j14 = j10;
        ButtonColors buttonColorsM18540copyjRlVdoo = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18540copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM18540copyjRlVdoo;
    }
}
