package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@Stable
/* loaded from: classes2.dex */
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    private static final float BorderWidth;
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();
    private static final float IconSize;

    static {
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
        BorderWidth = outlinedSegmentedButtonTokens.m29973getOutlineWidthD9Ej5fM();
        IconSize = outlinedSegmentedButtonTokens.m29972getIconSizeD9Ej5fM();
    }

    private SegmentedButtonDefaults() {
    }

    /* renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m29053borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = BorderWidth;
        }
        return segmentedButtonDefaults.m29054borderStrokel07J4OM(j10, f10);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ActiveIcon(Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1273041460);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, i11, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:545)");
            }
            IconKt.m28746Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, SizeKt.m27505size3ABfNKs(Modifier.Companion, IconSize), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    SegmentedButtonDefaults.this.ActiveIcon(composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
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
    public final void Icon(final boolean r17, p181hd.InterfaceC9544p r18, p181hd.InterfaceC9544p r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonDefaults.Icon(boolean, hd.p, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m29054borderStrokel07J4OM(long j10, float f10) {
        return BorderStrokeKt.m26979BorderStrokecXLIe8U(f10, j10);
    }

    @Composable
    public final SegmentedButtonColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(679457321, i10, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:431)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$material3_release = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSegmentedButtonColors$material3_release;
    }

    @Composable
    /* renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m29055colorsXqyqHi0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i10, int i11, int i12) {
        long j22;
        long j23;
        long jM30914getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        long jM30914getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j17;
        long j24 = jM30914getUnspecified0d7_KjU;
        long jM30914getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j18;
        long jM30914getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j19;
        long jM30914getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j20;
        long jM30914getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j21;
        if (ComposerKt.isTraceInProgress()) {
            j22 = jM30914getUnspecified0d7_KjU11;
            j23 = jM30914getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(132526205, i10, i11, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:467)");
        } else {
            j22 = jM30914getUnspecified0d7_KjU11;
            j23 = jM30914getUnspecified0d7_KjU2;
        }
        SegmentedButtonColors segmentedButtonColorsM29040copy2qZNXz8 = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m29040copy2qZNXz8(j24, j23, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7, jM30914getUnspecified0d7_KjU8, jM30914getUnspecified0d7_KjU9, jM30914getUnspecified0d7_KjU10, j22, jM30914getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return segmentedButtonColorsM29040copy2qZNXz8;
    }

    @Composable
    @ReadOnlyComposable
    public final CornerBasedShape getBaseShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264240381, i10, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:512)");
        }
        Shape value = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer, 6);
        AbstractC9979u.m20292e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShape;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m29056getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3_release(ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached$material3_release = colorScheme.getDefaultSegmentedButtonColorsCached$material3_release();
        if (defaultSegmentedButtonColorsCached$material3_release != null) {
            return defaultSegmentedButtonColorsCached$material3_release;
        }
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
        SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), colorScheme.m28498getSurface0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), outlinedSegmentedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), outlinedSegmentedButtonTokens.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m28498getSurface0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), null);
        colorScheme.setDefaultSegmentedButtonColorsCached$material3_release(segmentedButtonColors);
        return segmentedButtonColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29057getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @ReadOnlyComposable
    public final Shape itemShape(int i10, int i11, CornerBasedShape cornerBasedShape, Composer composer, int i12, int i13) {
        if ((i13 & 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i12 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942072063, i12, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:528)");
        }
        if (i11 == 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return cornerBasedShape;
        }
        Shape shapeStart = i10 == 0 ? ShapesKt.start(cornerBasedShape) : i10 == i11 - 1 ? ShapesKt.end(cornerBasedShape) : RectangleShapeKt.getRectangleShape();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapeStart;
    }
}
