package androidx.compose.p006ui.graphics.drawscope;

import androidx.compose.p006ui.geometry.CornerRadius;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.ColorFilter;
import androidx.compose.p006ui.graphics.ImageBitmap;
import androidx.compose.p006ui.graphics.Path;
import androidx.compose.p006ui.graphics.PathEffect;
import androidx.compose.p006ui.graphics.StrokeCap;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.graphics.drawscope.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1312b {
    static {
        DrawScope.Companion companion = DrawScope.INSTANCE;
    }

    /* renamed from: A */
    public static /* synthetic */ void m426A(DrawScope drawScope, ImageBitmap imageBitmap, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo9600drawImagegbVJVH8(imageBitmap, (i5 & 2) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j4, (i5 & 4) != 0 ? 1.0f : f4, (i5 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 16) != 0 ? null : colorFilter, (i5 & 32) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: B */
    public static /* synthetic */ void m427B(DrawScope drawScope, Brush brush, long j4, long j5, float f4, int i4, PathEffect pathEffect, float f5, ColorFilter colorFilter, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo9601drawLine1RTmtNc(brush, j4, j5, (i6 & 8) != 0 ? 0.0f : f4, (i6 & 16) != 0 ? Stroke.INSTANCE.m9703getDefaultCapKaPHkGw() : i4, (i6 & 32) != 0 ? null : pathEffect, (i6 & 64) != 0 ? 1.0f : f5, (i6 & 128) != 0 ? null : colorFilter, (i6 & 256) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i5);
    }

    /* renamed from: C */
    public static /* synthetic */ void m428C(DrawScope drawScope, long j4, long j5, long j6, float f4, int i4, PathEffect pathEffect, float f5, ColorFilter colorFilter, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo9602drawLineNGM6Ib0(j4, j5, j6, (i6 & 8) != 0 ? 0.0f : f4, (i6 & 16) != 0 ? Stroke.INSTANCE.m9703getDefaultCapKaPHkGw() : i4, (i6 & 32) != 0 ? null : pathEffect, (i6 & 64) != 0 ? 1.0f : f5, (i6 & 128) != 0 ? null : colorFilter, (i6 & 256) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i5);
    }

    /* renamed from: D */
    public static /* synthetic */ void m429D(DrawScope drawScope, Brush brush, long j4, long j5, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 2) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j4;
        drawScope.mo9603drawOvalAsUm42w(brush, jM8961getZeroF1C5BW0, (i5 & 4) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j5, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 32) != 0 ? null : colorFilter, (i5 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: E */
    public static /* synthetic */ void m430E(DrawScope drawScope, long j4, long j5, long j6, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 2) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j5;
        drawScope.mo9604drawOvalnJ9OG0(j4, jM8961getZeroF1C5BW0, (i5 & 4) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j6, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 32) != 0 ? null : colorFilter, (i5 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: F */
    public static /* synthetic */ void m431F(DrawScope drawScope, Path path, Brush brush, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i5 & 4) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        if ((i5 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i5 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i5 & 32) != 0) {
            i4 = DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo9605drawPathGBMwjPU(path, brush, f5, drawStyle2, colorFilter2, i4);
    }

    /* renamed from: G */
    public static /* synthetic */ void m432G(DrawScope drawScope, Path path, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        drawScope.mo9606drawPathLG529CI(path, j4, (i5 & 4) != 0 ? 1.0f : f4, (i5 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 16) != 0 ? null : colorFilter, (i5 & 32) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: H */
    public static /* synthetic */ void m433H(DrawScope drawScope, List list, int i4, long j4, float f4, int i5, PathEffect pathEffect, float f5, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo9607drawPointsF8ZwMP8(list, i4, j4, (i7 & 8) != 0 ? 0.0f : f4, (i7 & 16) != 0 ? StrokeCap.INSTANCE.m9501getButtKaPHkGw() : i5, (i7 & 32) != 0 ? null : pathEffect, (i7 & 64) != 0 ? 1.0f : f5, (i7 & 128) != 0 ? null : colorFilter, (i7 & 256) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: I */
    public static /* synthetic */ void m434I(DrawScope drawScope, List list, int i4, Brush brush, float f4, int i5, PathEffect pathEffect, float f5, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo9608drawPointsGsft0Ws(list, i4, brush, (i7 & 8) != 0 ? 0.0f : f4, (i7 & 16) != 0 ? StrokeCap.INSTANCE.m9501getButtKaPHkGw() : i5, (i7 & 32) != 0 ? null : pathEffect, (i7 & 64) != 0 ? 1.0f : f5, (i7 & 128) != 0 ? null : colorFilter, (i7 & 256) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: J */
    public static /* synthetic */ void m435J(DrawScope drawScope, Brush brush, long j4, long j5, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 2) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j4;
        drawScope.mo9609drawRectAsUm42w(brush, jM8961getZeroF1C5BW0, (i5 & 4) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j5, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 32) != 0 ? null : colorFilter, (i5 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: K */
    public static /* synthetic */ void m436K(DrawScope drawScope, long j4, long j5, long j6, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 2) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j5;
        drawScope.mo9610drawRectnJ9OG0(j4, jM8961getZeroF1C5BW0, (i5 & 4) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j6, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 32) != 0 ? null : colorFilter, (i5 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: L */
    public static /* synthetic */ void m437L(DrawScope drawScope, Brush brush, long j4, long j5, long j6, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 2) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j4;
        drawScope.mo9611drawRoundRectZuiqVtQ(brush, jM8961getZeroF1C5BW0, (i5 & 4) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j5, (i5 & 8) != 0 ? CornerRadius.INSTANCE.m8930getZerokKHJgLs() : j6, (i5 & 16) != 0 ? 1.0f : f4, (i5 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 64) != 0 ? null : colorFilter, (i5 & 128) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: M */
    public static /* synthetic */ void m438M(DrawScope drawScope, long j4, long j5, long j6, long j7, DrawStyle drawStyle, float f4, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 2) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j5;
        drawScope.mo9612drawRoundRectuAw5IA(j4, jM8961getZeroF1C5BW0, (i5 & 4) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j6, (i5 & 8) != 0 ? CornerRadius.INSTANCE.m8930getZerokKHJgLs() : j7, (i5 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 32) != 0 ? 1.0f : f4, (i5 & 64) != 0 ? null : colorFilter, (i5 & 128) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: a */
    public static void m439a(DrawScope drawScope, ImageBitmap image, long j4, long j5, long j6, long j7, float f4, DrawStyle style, ColorFilter colorFilter, int i4, int i5) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        m464z(drawScope, image, j4, j5, j6, j7, f4, style, colorFilter, i4, 0, 512, null);
    }

    /* renamed from: b */
    public static long m440b(DrawScope drawScope) {
        return SizeKt.m9024getCenteruvyYCjk(drawScope.getDrawContext().mo9620getSizeNHjbRc());
    }

    /* renamed from: c */
    public static long m441c(DrawScope drawScope) {
        return drawScope.getDrawContext().mo9620getSizeNHjbRc();
    }

    /* renamed from: d */
    public static long m442d(DrawScope drawScope, long j4, long j5) {
        return SizeKt.Size(Size.m9014getWidthimpl(j4) - Offset.m8945getXimpl(j5), Size.m9011getHeightimpl(j4) - Offset.m8946getYimpl(j5));
    }

    /* renamed from: u */
    public static /* synthetic */ void m459u(DrawScope drawScope, Brush brush, float f4, float f5, boolean z3, long j4, long j5, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 16) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j4;
        drawScope.mo9594drawArcillE91I(brush, f4, f5, z3, jM8961getZeroF1C5BW0, (i5 & 32) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j5, (i5 & 64) != 0 ? 1.0f : f6, (i5 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 256) != 0 ? null : colorFilter, (i5 & 512) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: v */
    public static /* synthetic */ void m460v(DrawScope drawScope, long j4, float f4, float f5, boolean z3, long j5, long j6, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM8961getZeroF1C5BW0 = (i5 & 16) != 0 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j5;
        drawScope.mo9595drawArcyD3GUKo(j4, f4, f5, z3, jM8961getZeroF1C5BW0, (i5 & 32) != 0 ? m442d(drawScope, drawScope.mo9614getSizeNHjbRc(), jM8961getZeroF1C5BW0) : j6, (i5 & 64) != 0 ? 1.0f : f6, (i5 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 256) != 0 ? null : colorFilter, (i5 & 512) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: w */
    public static /* synthetic */ void m461w(DrawScope drawScope, Brush brush, float f4, long j4, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo9596drawCircleV9BoPsw(brush, (i5 & 2) != 0 ? Size.m9013getMinDimensionimpl(drawScope.mo9614getSizeNHjbRc()) / 2.0f : f4, (i5 & 4) != 0 ? drawScope.mo9613getCenterF1C5BW0() : j4, (i5 & 8) != 0 ? 1.0f : f5, (i5 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 32) != 0 ? null : colorFilter, (i5 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: x */
    public static /* synthetic */ void m462x(DrawScope drawScope, long j4, float f4, long j5, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        drawScope.mo9597drawCircleVaOC9Bg(j4, (i5 & 2) != 0 ? Size.m9013getMinDimensionimpl(drawScope.mo9614getSizeNHjbRc()) / 2.0f : f4, (i5 & 4) != 0 ? drawScope.mo9613getCenterF1C5BW0() : j5, (i5 & 8) != 0 ? 1.0f : f5, (i5 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 32) != 0 ? null : colorFilter, (i5 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: y */
    public static /* synthetic */ void m463y(DrawScope drawScope, ImageBitmap imageBitmap, long j4, long j5, long j6, long j7, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM11653getZeronOccac = (i5 & 2) != 0 ? IntOffset.INSTANCE.m11653getZeronOccac() : j4;
        long jIntSize = (i5 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j5;
        drawScope.mo9598drawImage9jGpkUE(imageBitmap, jM11653getZeronOccac, jIntSize, (i5 & 8) != 0 ? IntOffset.INSTANCE.m11653getZeronOccac() : j6, (i5 & 16) != 0 ? jIntSize : j7, (i5 & 32) != 0 ? 1.0f : f4, (i5 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: z */
    public static /* synthetic */ void m464z(DrawScope drawScope, ImageBitmap imageBitmap, long j4, long j5, long j6, long j7, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM11653getZeronOccac = (i6 & 2) != 0 ? IntOffset.INSTANCE.m11653getZeronOccac() : j4;
        long jIntSize = (i6 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j5;
        drawScope.mo9599drawImageAZ2fEMs(imageBitmap, jM11653getZeronOccac, jIntSize, (i6 & 8) != 0 ? IntOffset.INSTANCE.m11653getZeronOccac() : j6, (i6 & 16) != 0 ? jIntSize : j7, (i6 & 32) != 0 ? 1.0f : f4, (i6 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i6 & 128) != 0 ? null : colorFilter, (i6 & 256) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4, (i6 & 512) != 0 ? DrawScope.INSTANCE.m9645getDefaultFilterQualityfv9h1I() : i5);
    }
}
