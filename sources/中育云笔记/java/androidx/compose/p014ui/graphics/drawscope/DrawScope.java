package androidx.compose.p014ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.geometry.CornerRadius;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.FilterQuality;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.PathEffect;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import java.util.List;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@DrawScopeMarker
/* loaded from: classes2.dex */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m30820getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m30977getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m31431getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m31432getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m31438drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
            DrawScope.super.mo31331drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m31453getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.mo31428getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m31454getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.mo31429getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m31455recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j10, InterfaceC9540l interfaceC9540l) {
            DrawScope.super.mo31430recordJVtK1S4(graphicsLayer, j10, interfaceC9540l);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m31457roundToPxR2X_6o(DrawScope drawScope, long j10) {
            return DrawScope.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m31458roundToPx0680j_4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo27093roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m31459toDpGaN1DYA(DrawScope drawScope, long j10) {
            return DrawScope.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m31460toDpu2uoSUM(DrawScope drawScope, float f10) {
            return DrawScope.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m31462toDpSizekrfVVM(DrawScope drawScope, long j10) {
            return DrawScope.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m31463toPxR2X_6o(DrawScope drawScope, long j10) {
            return DrawScope.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m31464toPx0680j_4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m31465toSizeXkaWNTQ(DrawScope drawScope, long j10) {
            return DrawScope.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m31466toSp0xMU5do(DrawScope drawScope, float f10) {
            return DrawScope.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m31467toSpkPz2Gy4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo27102toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m31461toDpu2uoSUM(DrawScope drawScope, int i10) {
            return DrawScope.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m31468toSpkPz2Gy4(DrawScope drawScope, int i10) {
            return DrawScope.super.mo27103toSpkPz2Gy4(i10);
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m31407drawArcillE91I$default(DrawScope drawScope, Brush brush, float f10, float f11, boolean z10, long j10, long j11, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        DrawScope drawScope2;
        long jM31426offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 16) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j10;
        if ((i11 & 32) != 0) {
            drawScope2 = drawScope;
            jM31426offsetSizePENXr5M = drawScope2.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM31426offsetSizePENXr5M = j11;
        }
        drawScope2.mo31326drawArcillE91I(brush, f10, f11, z10, jM30653getZeroF1C5BW0, jM31426offsetSizePENXr5M, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 256) != 0 ? null : colorFilter, (i11 & 512) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m31408drawArcyD3GUKo$default(DrawScope drawScope, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        DrawScope drawScope2;
        long jM31426offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 16) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j11;
        if ((i11 & 32) != 0) {
            drawScope2 = drawScope;
            jM31426offsetSizePENXr5M = drawScope2.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM31426offsetSizePENXr5M = j12;
        }
        drawScope2.mo31327drawArcyD3GUKo(j10, f10, f11, z10, jM30653getZeroF1C5BW0, jM31426offsetSizePENXr5M, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 256) != 0 ? null : colorFilter, (i11 & 512) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m31409drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f10, long j10, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo31328drawCircleV9BoPsw(brush, (i11 & 2) != 0 ? Size.m30705getMinDimensionimpl(drawScope.mo31429getSizeNHjbRc()) / 2.0f : f10, (i11 & 4) != 0 ? drawScope.mo31428getCenterF1C5BW0() : j10, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m31410drawCircleVaOC9Bg$default(DrawScope drawScope, long j10, float f10, long j11, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i11 & 2) != 0) {
            f10 = Size.m30705getMinDimensionimpl(drawScope.mo31429getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo31329drawCircleVaOC9Bg(j10, f10, (i11 & 4) != 0 ? drawScope.mo31428getCenterF1C5BW0() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m31411drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM33640getZeronOccac = (i11 & 2) != 0 ? IntOffset.Companion.m33640getZeronOccac() : j10;
        long jM33667constructorimpl = (i11 & 4) != 0 ? IntSize.m33667constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j11;
        drawScope.mo31330drawImage9jGpkUE(imageBitmap, jM33640getZeronOccac, jM33667constructorimpl, (i11 & 8) != 0 ? IntOffset.Companion.m33640getZeronOccac() : j12, (i11 & 16) != 0 ? jM33667constructorimpl : j13, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 128) != 0 ? null : colorFilter, (i11 & 256) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m31412drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM33640getZeronOccac = (i12 & 2) != 0 ? IntOffset.Companion.m33640getZeronOccac() : j10;
        long jM33667constructorimpl = (i12 & 4) != 0 ? IntSize.m33667constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j11;
        drawScope.mo31331drawImageAZ2fEMs(imageBitmap, jM33640getZeronOccac, jM33667constructorimpl, (i12 & 8) != 0 ? IntOffset.Companion.m33640getZeronOccac() : j12, (i12 & 16) != 0 ? jM33667constructorimpl : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10, (i12 & 512) != 0 ? Companion.m31432getDefaultFilterQualityfv9h1I() : i11);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m31413drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo31332drawImagegbVJVH8(imageBitmap, (i11 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 16) != 0 ? null : colorFilter, (i11 & 32) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m31414drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j10, long j11, float f10, int i10, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo31333drawLine1RTmtNc(brush, j10, j11, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? Stroke.Companion.m31500getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m31415drawLineNGM6Ib0$default(DrawScope drawScope, long j10, long j11, long j12, float f10, int i10, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo31334drawLineNGM6Ib0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? Stroke.Companion.m31500getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m31416drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j10, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j10;
        drawScope.mo31335drawOvalAsUm42w(brush, jM30653getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m31417drawOvalnJ9OG0$default(DrawScope drawScope, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j11;
        drawScope.mo31336drawOvalnJ9OG0(j10, jM30653getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m31418drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i11 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i11 & 32) != 0) {
            i10 = Companion.m31431getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo31337drawPathGBMwjPU(path, brush, f11, drawStyle2, colorFilter2, i10);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m31419drawPathLG529CI$default(DrawScope drawScope, Path path, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i11 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.mo31338drawPathLG529CI(path, j10, f11, drawStyle2, colorFilter, (i11 & 32) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m31420drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i10, long j10, float f10, int i11, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo31339drawPointsF8ZwMP8(list, i10, j10, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? StrokeCap.Companion.m31231getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m31421drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i10, Brush brush, float f10, int i11, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo31340drawPointsGsft0Ws(list, i10, brush, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? StrokeCap.Companion.m31231getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m31422drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j10, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j10;
        drawScope.mo31341drawRectAsUm42w(brush, jM30653getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m31423drawRectnJ9OG0$default(DrawScope drawScope, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j11;
        drawScope.mo31342drawRectnJ9OG0(j10, jM30653getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m31424drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j10;
        drawScope.mo31343drawRoundRectZuiqVtQ(brush, jM30653getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? CornerRadius.Companion.m30609getZerokKHJgLs() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 64) != 0 ? null : colorFilter, (i11 & 128) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m31425drawRoundRectuAw5IA$default(DrawScope drawScope, long j10, long j11, long j12, long j13, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, Object obj) {
        DrawScope drawScope2;
        long jM31426offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM30653getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j11;
        if ((i11 & 4) != 0) {
            drawScope2 = drawScope;
            jM31426offsetSizePENXr5M = drawScope2.m31426offsetSizePENXr5M(drawScope.mo31429getSizeNHjbRc(), jM30653getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM31426offsetSizePENXr5M = j12;
        }
        drawScope2.mo31344drawRoundRectuAw5IA(j10, jM30653getZeroF1C5BW0, jM31426offsetSizePENXr5M, (i11 & 8) != 0 ? CornerRadius.Companion.m30609getZerokKHJgLs() : j13, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? null : colorFilter, (i11 & 128) != 0 ? Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m31426offsetSizePENXr5M(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m31427recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i10 & 1) != 0) {
            j10 = IntSizeKt.m33683toIntSizeuvyYCjk(drawScope.mo31429getSizeNHjbRc());
        }
        drawScope.mo31430recordJVtK1S4(graphicsLayer, j10, interfaceC9540l);
    }

    /* renamed from: drawArc-illE91I */
    void mo31326drawArcillE91I(Brush brush, float f10, float f11, boolean z10, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawArc-yD3GUKo */
    void mo31327drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawCircle-V9BoPsw */
    void mo31328drawCircleV9BoPsw(Brush brush, float f10, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo31329drawCircleVaOC9Bg(long j10, float f10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    @InterfaceC10770a
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo31330drawImage9jGpkUE(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo31331drawImageAZ2fEMs(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
        m31412drawImageAZ2fEMs$default(this, imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo31332drawImagegbVJVH8(ImageBitmap imageBitmap, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawLine-1RTmtNc */
    void mo31333drawLine1RTmtNc(Brush brush, long j10, long j11, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo31334drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11);

    /* renamed from: drawOval-AsUm42w */
    void mo31335drawOvalAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawOval-n-J9OG0 */
    void mo31336drawOvalnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawPath-GBMwjPU */
    void mo31337drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawPath-LG529CI */
    void mo31338drawPathLG529CI(Path path, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo31339drawPointsF8ZwMP8(List<Offset> list, int i10, long j10, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo31340drawPointsGsft0Ws(List<Offset> list, int i10, Brush brush, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12);

    /* renamed from: drawRect-AsUm42w */
    void mo31341drawRectAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawRect-n-J9OG0 */
    void mo31342drawRectnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo31343drawRoundRectZuiqVtQ(Brush brush, long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo31344drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, DrawStyle drawStyle, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, ColorFilter colorFilter, int i10);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo31428getCenterF1C5BW0() {
        return SizeKt.m30716getCenteruvyYCjk(getDrawContext().mo31350getSizeNHjbRc());
    }

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo31429getSizeNHjbRc() {
        return getDrawContext().mo31350getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo31430recordJVtK1S4(GraphicsLayer graphicsLayer, long j10, final InterfaceC9540l interfaceC9540l) {
        graphicsLayer.m31523recordmLhObY(this, getLayoutDirection(), j10, new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                DrawScope drawScope2 = this.this$0;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                long jMo31350getSizeNHjbRc = drawScope.getDrawContext().mo31350getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long jMo31350getSizeNHjbRc2 = drawScope2.getDrawContext().mo31350getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer2);
                canvas.save();
                try {
                    interfaceC9540l2.invoke(drawScope2);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }
        });
    }
}
