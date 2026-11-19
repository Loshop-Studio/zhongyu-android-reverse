package androidx.compose.p014ui.platform;

import android.graphics.Matrix;
import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p014ui.graphics.MatrixKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final InterfaceC9544p getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = androidx.compose.p014ui.graphics.Matrix.m31108constructorimpl$default(null, 1, null);
    private float[] inverseMatrixCache = androidx.compose.p014ui.graphics.Matrix.m31108constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    public LayerMatrixCache(InterfaceC9544p interfaceC9544p) {
        this.getMatrix = interfaceC9544p;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m32669calculateInverseMatrixbWbORWo(T t10) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m32667invertToJiSxe2E(m32670calculateMatrixGrdbGEg(t10), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m32670calculateMatrixGrdbGEg(T t10) {
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
        AndroidMatrixConversions_androidKt.m30749setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m31133isIdentity58bKbWc(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T t10, MutableRect mutableRect) {
        float[] fArrM32670calculateMatrixGrdbGEg = m32670calculateMatrixGrdbGEg(t10);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.p014ui.graphics.Matrix.m31116mapimpl(fArrM32670calculateMatrixGrdbGEg, mutableRect);
    }

    /* renamed from: map-R5De75A, reason: not valid java name */
    public final long m32671mapR5De75A(T t10, long j10) {
        return !this.isIdentity ? androidx.compose.p014ui.graphics.Matrix.m31114mapMKHz9U(m32670calculateMatrixGrdbGEg(t10), j10) : j10;
    }

    public final void mapInverse(T t10, MutableRect mutableRect) {
        float[] fArrM32669calculateInverseMatrixbWbORWo = m32669calculateInverseMatrixbWbORWo(t10);
        if (fArrM32669calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.p014ui.graphics.Matrix.m31116mapimpl(fArrM32669calculateInverseMatrixbWbORWo, mutableRect);
        }
    }

    /* renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m32672mapInverseR5De75A(T t10, long j10) {
        float[] fArrM32669calculateInverseMatrixbWbORWo = m32669calculateInverseMatrixbWbORWo(t10);
        return fArrM32669calculateInverseMatrixbWbORWo == null ? Offset.Companion.m30651getInfiniteF1C5BW0() : !this.isIdentity ? androidx.compose.p014ui.graphics.Matrix.m31114mapMKHz9U(fArrM32669calculateInverseMatrixbWbORWo, j10) : j10;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.p014ui.graphics.Matrix.m31117resetimpl(this.matrixCache);
        androidx.compose.p014ui.graphics.Matrix.m31117resetimpl(this.inverseMatrixCache);
    }
}
