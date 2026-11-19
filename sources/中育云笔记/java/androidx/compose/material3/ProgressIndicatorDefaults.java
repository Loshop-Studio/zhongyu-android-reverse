package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    private static final int CircularDeterminateStrokeCap;
    private static final int CircularIndeterminateStrokeCap;
    private static final float CircularIndicatorTrackGapSize;
    private static final float CircularStrokeWidth;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float LinearIndicatorTrackGapSize;
    private static final int LinearStrokeCap;
    private static final float LinearTrackStopIndicatorSize;
    private static final SpringSpec<Float> ProgressAnimationSpec;

    static {
        ProgressIndicatorTokens progressIndicatorTokens = ProgressIndicatorTokens.INSTANCE;
        CircularStrokeWidth = progressIndicatorTokens.m30082getTrackThicknessD9Ej5fM();
        StrokeCap.Companion companion = StrokeCap.Companion;
        LinearStrokeCap = companion.m31232getRoundKaPHkGw();
        CircularDeterminateStrokeCap = companion.m31232getRoundKaPHkGw();
        CircularIndeterminateStrokeCap = companion.m31232getRoundKaPHkGw();
        LinearTrackStopIndicatorSize = progressIndicatorTokens.m30081getStopSizeD9Ej5fM();
        LinearIndicatorTrackGapSize = progressIndicatorTokens.m30078getActiveTrackSpaceD9Ej5fM();
        CircularIndicatorTrackGapSize = progressIndicatorTokens.m30078getActiveTrackSpaceD9Ej5fM();
        ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private ProgressIndicatorDefaults() {
    }

    @ExperimentalMaterial3Api
    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m28955getCircularIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    @InterfaceC10770a
    public static /* synthetic */ void getCircularTrackColor$annotations() {
    }

    @ExperimentalMaterial3Api
    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m28956getLinearIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    @ExperimentalMaterial3Api
    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m28957getLinearTrackStopIndicatorSizeD9Ej5fM$annotations() {
    }

    /* renamed from: drawStopIndicator-EgI2THU, reason: not valid java name */
    public final void m28958drawStopIndicatorEgI2THU(DrawScope drawScope, float f10, long j10, int i10) {
        float fMin = Math.min(drawScope.mo27099toPx0680j_4(f10), Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc()));
        float fM30703getHeightimpl = (Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc()) - fMin) / 2;
        if (!StrokeCap.m31227equalsimpl0(i10, StrokeCap.Companion.m31232getRoundKaPHkGw())) {
            DrawScope.m31423drawRectnJ9OG0$default(drawScope, j10, OffsetKt.Offset((Size.m30706getWidthimpl(drawScope.mo31429getSizeNHjbRc()) - fMin) - fM30703getHeightimpl, (Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc()) - fMin) / 2.0f), SizeKt.Size(fMin, fMin), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        } else {
            float f11 = fMin / 2.0f;
            DrawScope.m31410drawCircleVaOC9Bg$default(drawScope, j10, f11, OffsetKt.Offset((Size.m30706getWidthimpl(drawScope.mo31429getSizeNHjbRc()) - f11) - fM30703getHeightimpl, Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc()) / 2.0f), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
    }

    @Composable
    public final long getCircularColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getCircularDeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m28959getCircularDeterminateStrokeCapKaPHkGw() {
        return CircularDeterminateStrokeCap;
    }

    @Composable
    public final long getCircularDeterminateTrackColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2143778381, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:864)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getCircularIndeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m28960getCircularIndeterminateStrokeCapKaPHkGw() {
        return CircularIndeterminateStrokeCap;
    }

    @Composable
    public final long getCircularIndeterminateTrackColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947901123, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        long jM30913getTransparent0d7_KjU = Color.Companion.m30913getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM30913getTransparent0d7_KjU;
    }

    @ExperimentalMaterial3Api
    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m28961getCircularIndicatorTrackGapSizeD9Ej5fM() {
        return CircularIndicatorTrackGapSize;
    }

    /* renamed from: getCircularStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m28962getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    @Composable
    public final long getCircularTrackColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404222247, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:860)");
        }
        long jM30913getTransparent0d7_KjU = Color.Companion.m30913getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM30913getTransparent0d7_KjU;
    }

    @Composable
    public final long getLinearColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:843)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @ExperimentalMaterial3Api
    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m28963getLinearIndicatorTrackGapSizeD9Ej5fM() {
        return LinearIndicatorTrackGapSize;
    }

    /* renamed from: getLinearStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m28964getLinearStrokeCapKaPHkGw() {
        return LinearStrokeCap;
    }

    @Composable
    public final long getLinearTrackColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:851)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @ExperimentalMaterial3Api
    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m28965getLinearTrackStopIndicatorSizeD9Ej5fM() {
        return LinearTrackStopIndicatorSize;
    }

    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }
}
