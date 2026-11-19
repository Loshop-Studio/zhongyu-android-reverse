package androidx.compose.p013ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.geometry.CornerRadius;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.FilterQuality;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import java.util.List;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

@DrawScopeMarker
/* loaded from: classes2.dex */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m24218getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m24375getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m24829getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m24830getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m24836drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
            DrawScope.super.mo24729drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m24851getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.mo24826getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m24852getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.mo24827getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m24853recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j10, InterfaceC10570l interfaceC10570l) {
            DrawScope.super.mo24828recordJVtK1S4(graphicsLayer, j10, interfaceC10570l);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m24855roundToPxR2X_6o(DrawScope drawScope, long j10) {
            return DrawScope.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m24856roundToPx0680j_4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo20491roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m24857toDpGaN1DYA(DrawScope drawScope, long j10) {
            return DrawScope.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m24858toDpu2uoSUM(DrawScope drawScope, float f10) {
            return DrawScope.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m24860toDpSizekrfVVM(DrawScope drawScope, long j10) {
            return DrawScope.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m24861toPxR2X_6o(DrawScope drawScope, long j10) {
            return DrawScope.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m24862toPx0680j_4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m24863toSizeXkaWNTQ(DrawScope drawScope, long j10) {
            return DrawScope.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m24864toSp0xMU5do(DrawScope drawScope, float f10) {
            return DrawScope.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m24865toSpkPz2Gy4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo20500toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m24859toDpu2uoSUM(DrawScope drawScope, int i10) {
            return DrawScope.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m24866toSpkPz2Gy4(DrawScope drawScope, int i10) {
            return DrawScope.super.mo20501toSpkPz2Gy4(i10);
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m24805drawArcillE91I$default(DrawScope drawScope, Brush brush, float f10, float f11, boolean z10, long j10, long j11, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        DrawScope drawScope2;
        long jM24824offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 16) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j10;
        if ((i11 & 32) != 0) {
            drawScope2 = drawScope;
            jM24824offsetSizePENXr5M = drawScope2.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM24824offsetSizePENXr5M = j11;
        }
        drawScope2.mo24724drawArcillE91I(brush, f10, f11, z10, jM24051getZeroF1C5BW0, jM24824offsetSizePENXr5M, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 256) != 0 ? null : colorFilter, (i11 & 512) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m24806drawArcyD3GUKo$default(DrawScope drawScope, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        DrawScope drawScope2;
        long jM24824offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 16) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j11;
        if ((i11 & 32) != 0) {
            drawScope2 = drawScope;
            jM24824offsetSizePENXr5M = drawScope2.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM24824offsetSizePENXr5M = j12;
        }
        drawScope2.mo24725drawArcyD3GUKo(j10, f10, f11, z10, jM24051getZeroF1C5BW0, jM24824offsetSizePENXr5M, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 256) != 0 ? null : colorFilter, (i11 & 512) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m24807drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f10, long j10, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo24726drawCircleV9BoPsw(brush, (i11 & 2) != 0 ? Size.m24103getMinDimensionimpl(drawScope.mo24827getSizeNHjbRc()) / 2.0f : f10, (i11 & 4) != 0 ? drawScope.mo24826getCenterF1C5BW0() : j10, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m24808drawCircleVaOC9Bg$default(DrawScope drawScope, long j10, float f10, long j11, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i11 & 2) != 0) {
            f10 = Size.m24103getMinDimensionimpl(drawScope.mo24827getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo24727drawCircleVaOC9Bg(j10, f10, (i11 & 4) != 0 ? drawScope.mo24826getCenterF1C5BW0() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m24809drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM27038getZeronOccac = (i11 & 2) != 0 ? IntOffset.Companion.m27038getZeronOccac() : j10;
        long jM27065constructorimpl = (i11 & 4) != 0 ? IntSize.m27065constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j11;
        drawScope.mo24728drawImage9jGpkUE(imageBitmap, jM27038getZeronOccac, jM27065constructorimpl, (i11 & 8) != 0 ? IntOffset.Companion.m27038getZeronOccac() : j12, (i11 & 16) != 0 ? jM27065constructorimpl : j13, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 128) != 0 ? null : colorFilter, (i11 & 256) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m24810drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM27038getZeronOccac = (i12 & 2) != 0 ? IntOffset.Companion.m27038getZeronOccac() : j10;
        long jM27065constructorimpl = (i12 & 4) != 0 ? IntSize.m27065constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j11;
        drawScope.mo24729drawImageAZ2fEMs(imageBitmap, jM27038getZeronOccac, jM27065constructorimpl, (i12 & 8) != 0 ? IntOffset.Companion.m27038getZeronOccac() : j12, (i12 & 16) != 0 ? jM27065constructorimpl : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10, (i12 & 512) != 0 ? Companion.m24830getDefaultFilterQualityfv9h1I() : i11);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m24811drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo24730drawImagegbVJVH8(imageBitmap, (i11 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 16) != 0 ? null : colorFilter, (i11 & 32) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m24812drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j10, long j11, float f10, int i10, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo24731drawLine1RTmtNc(brush, j10, j11, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? Stroke.Companion.m24898getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m24813drawLineNGM6Ib0$default(DrawScope drawScope, long j10, long j11, long j12, float f10, int i10, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo24732drawLineNGM6Ib0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? Stroke.Companion.m24898getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m24814drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j10, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j10;
        drawScope.mo24733drawOvalAsUm42w(brush, jM24051getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m24815drawOvalnJ9OG0$default(DrawScope drawScope, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j11;
        drawScope.mo24734drawOvalnJ9OG0(j10, jM24051getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m24816drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
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
            i10 = Companion.m24829getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo24735drawPathGBMwjPU(path, brush, f11, drawStyle2, colorFilter2, i10);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m24817drawPathLG529CI$default(DrawScope drawScope, Path path, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
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
        drawScope.mo24736drawPathLG529CI(path, j10, f11, drawStyle2, colorFilter, (i11 & 32) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m24818drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i10, long j10, float f10, int i11, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo24737drawPointsF8ZwMP8(list, i10, j10, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? StrokeCap.Companion.m24629getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m24819drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i10, Brush brush, float f10, int i11, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo24738drawPointsGsft0Ws(list, i10, brush, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? StrokeCap.Companion.m24629getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m24820drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j10, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j10;
        drawScope.mo24739drawRectAsUm42w(brush, jM24051getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m24821drawRectnJ9OG0$default(DrawScope drawScope, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j11;
        drawScope.mo24740drawRectnJ9OG0(j10, jM24051getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m24822drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j10;
        drawScope.mo24741drawRoundRectZuiqVtQ(brush, jM24051getZeroF1C5BW0, (i11 & 4) != 0 ? drawScope.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? CornerRadius.Companion.m24007getZerokKHJgLs() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 64) != 0 ? null : colorFilter, (i11 & 128) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m24823drawRoundRectuAw5IA$default(DrawScope drawScope, long j10, long j11, long j12, long j13, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, Object obj) {
        DrawScope drawScope2;
        long jM24824offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM24051getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j11;
        if ((i11 & 4) != 0) {
            drawScope2 = drawScope;
            jM24824offsetSizePENXr5M = drawScope2.m24824offsetSizePENXr5M(drawScope.mo24827getSizeNHjbRc(), jM24051getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM24824offsetSizePENXr5M = j12;
        }
        drawScope2.mo24742drawRoundRectuAw5IA(j10, jM24051getZeroF1C5BW0, jM24824offsetSizePENXr5M, (i11 & 8) != 0 ? CornerRadius.Companion.m24007getZerokKHJgLs() : j13, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? null : colorFilter, (i11 & 128) != 0 ? Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m24824offsetSizePENXr5M(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Size.m24095constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m24825recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i10 & 1) != 0) {
            j10 = IntSizeKt.m27081toIntSizeuvyYCjk(drawScope.mo24827getSizeNHjbRc());
        }
        drawScope.mo24828recordJVtK1S4(graphicsLayer, j10, interfaceC10570l);
    }

    /* renamed from: drawArc-illE91I */
    void mo24724drawArcillE91I(Brush brush, float f10, float f11, boolean z10, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawArc-yD3GUKo */
    void mo24725drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawCircle-V9BoPsw */
    void mo24726drawCircleV9BoPsw(Brush brush, float f10, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo24727drawCircleVaOC9Bg(long j10, float f10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    @InterfaceC8721a
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo24728drawImage9jGpkUE(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo24729drawImageAZ2fEMs(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
        m24810drawImageAZ2fEMs$default(this, imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo24730drawImagegbVJVH8(ImageBitmap imageBitmap, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawLine-1RTmtNc */
    void mo24731drawLine1RTmtNc(Brush brush, long j10, long j11, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo24732drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11);

    /* renamed from: drawOval-AsUm42w */
    void mo24733drawOvalAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawOval-n-J9OG0 */
    void mo24734drawOvalnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawPath-GBMwjPU */
    void mo24735drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawPath-LG529CI */
    void mo24736drawPathLG529CI(Path path, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo24737drawPointsF8ZwMP8(List<Offset> list, int i10, long j10, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo24738drawPointsGsft0Ws(List<Offset> list, int i10, Brush brush, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12);

    /* renamed from: drawRect-AsUm42w */
    void mo24739drawRectAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawRect-n-J9OG0 */
    void mo24740drawRectnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo24741drawRoundRectZuiqVtQ(Brush brush, long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo24742drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, DrawStyle drawStyle, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, ColorFilter colorFilter, int i10);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo24826getCenterF1C5BW0() {
        return SizeKt.m24114getCenteruvyYCjk(getDrawContext().mo24748getSizeNHjbRc());
    }

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo24827getSizeNHjbRc() {
        return getDrawContext().mo24748getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo24828recordJVtK1S4(GraphicsLayer graphicsLayer, long j10, final InterfaceC10570l interfaceC10570l) {
        graphicsLayer.m24921recordmLhObY(this, getLayoutDirection(), j10, new InterfaceC10570l() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DrawScope drawScope) {
                DrawScope drawScope2 = this.this$0;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                long jMo24748getSizeNHjbRc = drawScope.getDrawContext().mo24748getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long jMo24748getSizeNHjbRc2 = drawScope2.getDrawContext().mo24748getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer2);
                canvas.save();
                try {
                    interfaceC10570l2.invoke(drawScope2);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }
        });
    }
}
