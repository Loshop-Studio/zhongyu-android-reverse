package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShapeKt;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

@Stable
@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u008a\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 JC\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0013\b\u0002\u0010%\u001a\r\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b$2\u0015\b\u0002\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u001e\u0018\u00010#¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b'\u0010(J\"\u0010/\u001a\u00020,2\u0006\u0010)\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u001d\u00100\u001a\u00020*8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u00104\u001a\u00020*8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0018\u00109\u001a\u00020\u0004*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u001a\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b:\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m5110d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/SegmentedButtonColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "colors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SegmentedButtonColors;", "", "index", "count", "Landroidx/compose/foundation/shape/CornerBasedShape;", "baseShape", "Landroidx/compose/ui/graphics/Shape;", "itemShape", "(IILandroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Shape;", "Ld6/s;", "ActiveIcon", "(Landroidx/compose/runtime/Composer;I)V", "", "active", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "activeContent", "inactiveContent", "Icon", "(ZLr6/e;Lr6/e;Landroidx/compose/runtime/Composer;II)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/foundation/BorderStroke;", "borderStroke-l07J4OM", "(JF)Landroidx/compose/foundation/BorderStroke;", "borderStroke", "BorderWidth", "F", "getBorderWidth-D9Ej5fM", "()F", "IconSize", "getIconSize-D9Ej5fM", "Landroidx/compose/material3/ColorScheme;", "getDefaultSegmentedButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColors", "getBaseShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/CornerBasedShape;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n1#2:775\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    private static final float BorderWidth;

    @NotNull
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();
    private static final float IconSize;

    static {
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
        BorderWidth = outlinedSegmentedButtonTokens.m9777getOutlineWidthD9Ej5fM();
        IconSize = outlinedSegmentedButtonTokens.m9776getIconSizeD9Ej5fM();
    }

    private SegmentedButtonDefaults() {
    }

    /* renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m8857borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j7, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = BorderWidth;
        }
        return segmentedButtonDefaults.m8858borderStrokel07J4OM(j7, f);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ActiveIcon(@Nullable Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1273041460);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i8 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, i8, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:545)");
            }
            IconKt.m8550Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, SizeKt.m7309size3ABfNKs(Modifier.INSTANCE, IconSize), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    SegmentedButtonDefaults.this.ActiveIcon(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Icon(final boolean r17, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r18, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonDefaults.Icon(boolean, r6.e, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    /* renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m8858borderStrokel07J4OM(long color, float width) {
        return BorderStrokeKt.m6783BorderStrokecXLIe8U(width, color);
    }

    @Composable
    @NotNull
    public final SegmentedButtonColors colors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(679457321, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:431)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$material3_release = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSegmentedButtonColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m8859colorsXqyqHi0(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable Composer composer, int i, int i8, int i9) {
        long j19;
        long j20;
        long jM10718getUnspecified0d7_KjU = (i9 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM10718getUnspecified0d7_KjU2 = (i9 & 2) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j8;
        long jM10718getUnspecified0d7_KjU3 = (i9 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9;
        long jM10718getUnspecified0d7_KjU4 = (i9 & 8) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        long jM10718getUnspecified0d7_KjU5 = (i9 & 16) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j11;
        long jM10718getUnspecified0d7_KjU6 = (i9 & 32) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j12;
        long jM10718getUnspecified0d7_KjU7 = (i9 & 64) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j13;
        long jM10718getUnspecified0d7_KjU8 = (i9 & 128) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j14;
        long j21 = jM10718getUnspecified0d7_KjU;
        long jM10718getUnspecified0d7_KjU9 = (i9 & 256) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j15;
        long jM10718getUnspecified0d7_KjU10 = (i9 & 512) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j16;
        long jM10718getUnspecified0d7_KjU11 = (i9 & 1024) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j17;
        long jM10718getUnspecified0d7_KjU12 = (i9 & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j18;
        if (ComposerKt.isTraceInProgress()) {
            j19 = jM10718getUnspecified0d7_KjU11;
            j20 = jM10718getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(132526205, i, i8, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:467)");
        } else {
            j19 = jM10718getUnspecified0d7_KjU11;
            j20 = jM10718getUnspecified0d7_KjU2;
        }
        SegmentedButtonColors segmentedButtonColorsM8844copy2qZNXz8 = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m8844copy2qZNXz8(j21, j20, jM10718getUnspecified0d7_KjU3, jM10718getUnspecified0d7_KjU4, jM10718getUnspecified0d7_KjU5, jM10718getUnspecified0d7_KjU6, jM10718getUnspecified0d7_KjU7, jM10718getUnspecified0d7_KjU8, jM10718getUnspecified0d7_KjU9, jM10718getUnspecified0d7_KjU10, j19, jM10718getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return segmentedButtonColorsM8844copy2qZNXz8;
    }

    @JvmName(name = "getBaseShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final CornerBasedShape getBaseShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264240381, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:512)");
        }
        Shape value = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer, 6);
        AbstractC5830k.m5328e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShape;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m8860getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    @NotNull
    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3_release(@NotNull ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached = colorScheme.getDefaultSegmentedButtonColorsCached();
        if (defaultSegmentedButtonColorsCached != null) {
            return defaultSegmentedButtonColorsCached;
        }
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
        SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), colorScheme.getSurface(), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), outlinedSegmentedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), outlinedSegmentedButtonTokens.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface(), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), null);
        colorScheme.setDefaultSegmentedButtonColorsCached$material3_release(segmentedButtonColors);
        return segmentedButtonColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m8861getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final Shape itemShape(int i, int i8, @Nullable CornerBasedShape cornerBasedShape, @Nullable Composer composer, int i9, int i10) {
        if ((i10 & 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i9 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942072063, i9, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:528)");
        }
        if (i8 == 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return cornerBasedShape;
        }
        Shape shapeStart = i == 0 ? ShapesKt.start(cornerBasedShape) : i == i8 - 1 ? ShapesKt.end(cornerBasedShape) : RectangleShapeKt.getRectangleShape();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapeStart;
    }
}
