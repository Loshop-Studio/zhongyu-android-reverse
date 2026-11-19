package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import java.util.List;

/* loaded from: classes2.dex */
public interface Canvas {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m24254clipRectmtrdDE(Canvas canvas, Rect rect, int i10) {
            Canvas.super.m24251clipRectmtrdDE(rect, i10);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f10, float f11, boolean z10, Paint paint) {
            Canvas.super.drawArc(rect, f10, f11, z10, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f10, float f11, boolean z10, Paint paint) {
            Canvas.super.drawArcRad(rect, f10, f11, z10, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(Canvas canvas, float f10, float f11) {
            Canvas.super.skewRad(f10, f11);
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m24247clipPathmtrdDE$default(Canvas canvas, Path path, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = ClipOp.Companion.m24265getIntersectrtfAjoo();
        }
        canvas.mo24129clipPathmtrdDE(path, i10);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m24248clipRectN_I0leg$default(Canvas canvas, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = ClipOp.Companion.m24265getIntersectrtfAjoo();
        }
        canvas.mo24130clipRectN_I0leg(f10, f11, f12, f13, i10);
    }

    /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m24249clipRectmtrdDE$default(Canvas canvas, Rect rect, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = ClipOp.Companion.m24265getIntersectrtfAjoo();
        }
        canvas.m24251clipRectmtrdDE(rect, i10);
    }

    /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m24250drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, Paint paint, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM27038getZeronOccac = (i10 & 2) != 0 ? IntOffset.Companion.m27038getZeronOccac() : j10;
        long jM27065constructorimpl = (i10 & 4) != 0 ? IntSize.m27065constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j11;
        canvas.mo24134drawImageRectHPBpro0(imageBitmap, jM27038getZeronOccac, jM27065constructorimpl, (i10 & 8) != 0 ? IntOffset.Companion.m27038getZeronOccac() : j12, (i10 & 16) != 0 ? jM27065constructorimpl : j13, paint);
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        canvas.scale(f10, f11);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo24129clipPathmtrdDE(Path path, int i10);

    /* renamed from: clipRect-N_I0leg */
    void mo24130clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10);

    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m24251clipRectmtrdDE(Rect rect, int i10) {
        mo24130clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i10);
    }

    /* renamed from: concat-58bKbWc */
    void mo24131concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint);

    default void drawArc(Rect rect, float f10, float f11, boolean z10, Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f10, f11, z10, paint);
    }

    default void drawArcRad(Rect rect, float f10, float f11, boolean z10, Paint paint) {
        drawArc(rect, DegreesKt.degrees(f10), DegreesKt.degrees(f11), z10, paint);
    }

    /* renamed from: drawCircle-9KIMszo */
    void mo24132drawCircle9KIMszo(long j10, float f10, Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo24133drawImaged4ec7I(ImageBitmap imageBitmap, long j10, Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo24134drawImageRectHPBpro0(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo24135drawLineWko1d7g(long j10, long j11, Paint paint);

    void drawOval(float f10, float f11, float f12, float f13, Paint paint);

    default void drawOval(Rect rect, Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(Path path, Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo24136drawPointsO7TthRY(int i10, List<Offset> list, Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo24137drawRawPointsO7TthRY(int i10, float[] fArr, Paint paint);

    void drawRect(float f10, float f11, float f12, float f13, Paint paint);

    default void drawRect(Rect rect, Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo24138drawVerticesTPEHhCM(Vertices vertices, int i10, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f10);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f10, float f11);

    void skew(float f10, float f11);

    default void skewRad(float f10, float f11) {
        skew(DegreesKt.degrees(f10), DegreesKt.degrees(f11));
    }

    void translate(float f10, float f11);
}
