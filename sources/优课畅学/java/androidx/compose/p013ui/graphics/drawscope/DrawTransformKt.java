package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.graphics.DegreesKt;

/* loaded from: classes2.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f10, float f11) {
        drawTransform.inset(f10, f11, f10, f11);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawTransform.inset(f10, f11, f10, f11);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m24892rotateRad0AR0LA0(DrawTransform drawTransform, float f10, long j10) {
        drawTransform.mo24754rotateUv8p0NA(DegreesKt.degrees(f10), j10);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m24893rotateRad0AR0LA0$default(DrawTransform drawTransform, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo24752getCenterF1C5BW0();
        }
        drawTransform.mo24754rotateUv8p0NA(DegreesKt.degrees(f10), j10);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m24894scale0AR0LA0(DrawTransform drawTransform, float f10, long j10) {
        drawTransform.mo24755scale0AR0LA0(f10, f10, j10);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m24895scale0AR0LA0$default(DrawTransform drawTransform, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo24752getCenterF1C5BW0();
        }
        drawTransform.mo24755scale0AR0LA0(f10, f10, j10);
    }

    public static final void inset(DrawTransform drawTransform, float f10) {
        drawTransform.inset(f10, f10, f10, f10);
    }
}
