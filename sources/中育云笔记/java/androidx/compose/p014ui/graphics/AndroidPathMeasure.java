package androidx.compose.p014ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.compose.p014ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class AndroidPathMeasure implements PathMeasure {
    private final PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    public AndroidPathMeasure(PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.p014ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.p014ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo30776getPositiontuRUvjQ(float f10) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f10, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.positionArray;
        AbstractC9979u.m20291d(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.positionArray;
        AbstractC9979u.m20291d(fArr2);
        float f12 = fArr2[1];
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    @Override // androidx.compose.p014ui.graphics.PathMeasure
    public boolean getSegment(float f10, float f11, Path path, boolean z10) {
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f10, f11, ((AndroidPath) path).getInternalPath(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p014ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo30777getTangenttuRUvjQ(float f10) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f10, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.tangentArray;
        AbstractC9979u.m20291d(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.tangentArray;
        AbstractC9979u.m20291d(fArr2);
        float f12 = fArr2[1];
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    @Override // androidx.compose.p014ui.graphics.PathMeasure
    public void setPath(Path path, boolean z10) {
        Path internalPath;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((AndroidPath) path).getInternalPath();
        }
        pathMeasure.setPath(internalPath, z10);
    }
}
