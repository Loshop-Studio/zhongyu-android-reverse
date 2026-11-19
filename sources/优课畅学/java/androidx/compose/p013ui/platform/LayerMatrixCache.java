package androidx.compose.p013ui.platform;

import android.graphics.Matrix;
import androidx.compose.p013ui.geometry.MutableRect;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p013ui.graphics.MatrixKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final InterfaceC10574p getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = androidx.compose.p013ui.graphics.Matrix.m24506constructorimpl$default(null, 1, null);
    private float[] inverseMatrixCache = androidx.compose.p013ui.graphics.Matrix.m24506constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    public LayerMatrixCache(InterfaceC10574p interfaceC10574p) {
        this.getMatrix = interfaceC10574p;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m26067calculateInverseMatrixbWbORWo(T t10) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m26065invertToJiSxe2E(m26068calculateMatrixGrdbGEg(t10), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m26068calculateMatrixGrdbGEg(T t10) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t10, matrix);
        AndroidMatrixConversions_androidKt.m24147setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m24531isIdentity58bKbWc(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T t10, MutableRect mutableRect) {
        float[] fArrM26068calculateMatrixGrdbGEg = m26068calculateMatrixGrdbGEg(t10);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.p013ui.graphics.Matrix.m24514mapimpl(fArrM26068calculateMatrixGrdbGEg, mutableRect);
    }

    /* renamed from: map-R5De75A, reason: not valid java name */
    public final long m26069mapR5De75A(T t10, long j10) {
        return !this.isIdentity ? androidx.compose.p013ui.graphics.Matrix.m24512mapMKHz9U(m26068calculateMatrixGrdbGEg(t10), j10) : j10;
    }

    public final void mapInverse(T t10, MutableRect mutableRect) {
        float[] fArrM26067calculateInverseMatrixbWbORWo = m26067calculateInverseMatrixbWbORWo(t10);
        if (fArrM26067calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.p013ui.graphics.Matrix.m24514mapimpl(fArrM26067calculateInverseMatrixbWbORWo, mutableRect);
        }
    }

    /* renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m26070mapInverseR5De75A(T t10, long j10) {
        float[] fArrM26067calculateInverseMatrixbWbORWo = m26067calculateInverseMatrixbWbORWo(t10);
        return fArrM26067calculateInverseMatrixbWbORWo == null ? Offset.Companion.m24049getInfiniteF1C5BW0() : !this.isIdentity ? androidx.compose.p013ui.graphics.Matrix.m24512mapMKHz9U(fArrM26067calculateInverseMatrixbWbORWo, j10) : j10;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.p013ui.graphics.Matrix.m24515resetimpl(this.matrixCache);
        androidx.compose.p013ui.graphics.Matrix.m24515resetimpl(this.inverseMatrixCache);
    }
}
