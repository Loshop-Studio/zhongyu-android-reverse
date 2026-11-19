package androidx.compose.p006ui.graphics.drawscope;

import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.ClipOp;
import androidx.compose.p006ui.graphics.Path;

/* renamed from: androidx.compose.ui.graphics.drawscope.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1313c {
    /* renamed from: a */
    public static long m465a(DrawTransform drawTransform) {
        float f4 = 2;
        return OffsetKt.Offset(Size.m9014getWidthimpl(drawTransform.mo9625getSizeNHjbRc()) / f4, Size.m9011getHeightimpl(drawTransform.mo9625getSizeNHjbRc()) / f4);
    }

    /* renamed from: c */
    public static /* synthetic */ void m467c(DrawTransform drawTransform, Path path, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i5 & 2) != 0) {
            i4 = ClipOp.INSTANCE.m9167getIntersectrtfAjoo();
        }
        drawTransform.mo9622clipPathmtrdDE(path, i4);
    }

    /* renamed from: d */
    public static /* synthetic */ void m468d(DrawTransform drawTransform, float f4, float f5, float f6, float f7, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i5 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f6 = Size.m9014getWidthimpl(drawTransform.mo9625getSizeNHjbRc());
        }
        if ((i5 & 8) != 0) {
            f7 = Size.m9011getHeightimpl(drawTransform.mo9625getSizeNHjbRc());
        }
        if ((i5 & 16) != 0) {
            i4 = ClipOp.INSTANCE.m9167getIntersectrtfAjoo();
        }
        drawTransform.mo9623clipRectN_I0leg(f4, f5, f6, f7, i4);
    }

    /* renamed from: e */
    public static /* synthetic */ void m469e(DrawTransform drawTransform, float f4, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i4 & 2) != 0) {
            j4 = drawTransform.mo9624getCenterF1C5BW0();
        }
        drawTransform.mo9626rotateUv8p0NA(f4, j4);
    }

    /* renamed from: f */
    public static /* synthetic */ void m470f(DrawTransform drawTransform, float f4, float f5, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i4 & 4) != 0) {
            j4 = drawTransform.mo9624getCenterF1C5BW0();
        }
        drawTransform.mo9627scale0AR0LA0(f4, f5, j4);
    }

    /* renamed from: g */
    public static /* synthetic */ void m471g(DrawTransform drawTransform, float f4, float f5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        drawTransform.translate(f4, f5);
    }
}
