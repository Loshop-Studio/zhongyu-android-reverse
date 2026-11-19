package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Path;

@DrawScopeMarker
/* loaded from: classes2.dex */
public interface DrawTransform {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m24889getCenterF1C5BW0(DrawTransform drawTransform) {
            return DrawTransform.super.mo24752getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m24883clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = ClipOp.Companion.m24265getIntersectrtfAjoo();
        }
        drawTransform.mo24750clipPathmtrdDE(path, i10);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m24884clipRectN_I0leg$default(DrawTransform drawTransform, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = Float.intBitsToFloat((int) (drawTransform.mo24753getSizeNHjbRc() >> 32));
        }
        if ((i11 & 8) != 0) {
            f13 = Float.intBitsToFloat((int) (drawTransform.mo24753getSizeNHjbRc() & 4294967295L));
        }
        if ((i11 & 16) != 0) {
            i10 = ClipOp.Companion.m24265getIntersectrtfAjoo();
        }
        drawTransform.mo24751clipRectN_I0leg(f10, f11, f12, f13, i10);
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m24885rotateUv8p0NA$default(DrawTransform drawTransform, float f10, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo24752getCenterF1C5BW0();
        }
        drawTransform.mo24754rotateUv8p0NA(f10, j10);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m24886scale0AR0LA0$default(DrawTransform drawTransform, float f10, float f11, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i10 & 4) != 0) {
            j10 = drawTransform.mo24752getCenterF1C5BW0();
        }
        drawTransform.mo24755scale0AR0LA0(f10, f11, j10);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawTransform.translate(f10, f11);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo24750clipPathmtrdDE(Path path, int i10);

    /* renamed from: clipRect-N_I0leg */
    void mo24751clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo24752getCenterF1C5BW0() {
        float f10 = 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mo24753getSizeNHjbRc() >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mo24753getSizeNHjbRc() & 4294967295L)) / f10;
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: getSize-NH-jbRc */
    long mo24753getSizeNHjbRc();

    void inset(float f10, float f11, float f12, float f13);

    /* renamed from: rotate-Uv8p0NA */
    void mo24754rotateUv8p0NA(float f10, long j10);

    /* renamed from: scale-0AR0LA0 */
    void mo24755scale0AR0LA0(float f10, float f11, long j10);

    /* renamed from: transform-58bKbWc */
    void mo24756transform58bKbWc(float[] fArr);

    void translate(float f10, float f11);
}
