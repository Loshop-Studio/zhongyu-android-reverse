package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.graphics.c1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1291c1 {
    /* renamed from: a */
    public static void m375a(Canvas canvas, Rect rect, int i4) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        canvas.mo9040clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i4);
    }

    /* renamed from: b */
    public static void m376b(Canvas canvas, Rect rect, float f4, float f5, boolean z3, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f4, f5, z3, paint);
    }

    /* renamed from: c */
    public static void m377c(Canvas canvas, Rect rect, float f4, float f5, boolean z3, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect, DegreesKt.degrees(f4), DegreesKt.degrees(f5), z3, paint);
    }

    /* renamed from: d */
    public static void m378d(Canvas canvas, Rect rect, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    /* renamed from: e */
    public static void m379e(Canvas canvas, Rect rect, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    /* renamed from: f */
    public static void m380f(Canvas canvas, float f4, float f5) {
        canvas.skew(DegreesKt.degrees(f4), DegreesKt.degrees(f5));
    }

    /* renamed from: m */
    public static /* synthetic */ void m387m(Canvas canvas, Path path, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i5 & 2) != 0) {
            i4 = ClipOp.INSTANCE.m9167getIntersectrtfAjoo();
        }
        canvas.mo9039clipPathmtrdDE(path, i4);
    }

    /* renamed from: n */
    public static /* synthetic */ void m388n(Canvas canvas, float f4, float f5, float f6, float f7, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i5 & 16) != 0) {
            i4 = ClipOp.INSTANCE.m9167getIntersectrtfAjoo();
        }
        canvas.mo9040clipRectN_I0leg(f4, f5, f6, f7, i4);
    }

    /* renamed from: o */
    public static /* synthetic */ void m389o(Canvas canvas, Rect rect, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i5 & 2) != 0) {
            i4 = ClipOp.INSTANCE.m9167getIntersectrtfAjoo();
        }
        canvas.mo9041clipRectmtrdDE(rect, i4);
    }

    /* renamed from: p */
    public static /* synthetic */ void m390p(Canvas canvas, ImageBitmap imageBitmap, long j4, long j5, long j6, long j7, Paint paint, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM11653getZeronOccac = (i4 & 2) != 0 ? IntOffset.INSTANCE.m11653getZeronOccac() : j4;
        long jIntSize = (i4 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j5;
        canvas.mo9045drawImageRectHPBpro0(imageBitmap, jM11653getZeronOccac, jIntSize, (i4 & 8) != 0 ? IntOffset.INSTANCE.m11653getZeronOccac() : j6, (i4 & 16) != 0 ? jIntSize : j7, paint);
    }

    /* renamed from: q */
    public static /* synthetic */ void m391q(Canvas canvas, float f4, float f5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i4 & 2) != 0) {
            f5 = f4;
        }
        canvas.scale(f4, f5);
    }
}
