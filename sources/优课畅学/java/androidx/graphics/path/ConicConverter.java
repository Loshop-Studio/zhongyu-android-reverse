package androidx.graphics.path;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class ConicConverter {
    private int currentQuadratic;
    private int quadraticCount;
    private float[] quadraticData = new float[130];

    public static /* synthetic */ void convert$default(ConicConverter conicConverter, float[] fArr, float f10, float f11, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        conicConverter.convert(fArr, f10, f11, i10);
    }

    private final native int internalConicToQuadratics(float[] fArr, int i10, float[] fArr2, float f10, float f11);

    public static /* synthetic */ boolean nextQuadratic$default(ConicConverter conicConverter, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return conicConverter.nextQuadratic(fArr, i10);
    }

    public final void convert(float[] points, float f10, float f11, int i10) {
        AbstractC9133u.m16133g(points, "points");
        int iInternalConicToQuadratics = internalConicToQuadratics(points, i10, this.quadraticData, f10, f11);
        this.quadraticCount = iInternalConicToQuadratics;
        int i11 = (iInternalConicToQuadratics * 4) + 2;
        if (i11 > this.quadraticData.length) {
            float[] fArr = new float[i11];
            this.quadraticData = fArr;
            this.quadraticCount = internalConicToQuadratics(points, i10, fArr, f10, f11);
        }
        this.currentQuadratic = 0;
    }

    public final int getCurrentQuadratic() {
        return this.currentQuadratic;
    }

    public final int getQuadraticCount() {
        return this.quadraticCount;
    }

    public final boolean nextQuadratic(float[] points, int i10) {
        AbstractC9133u.m16133g(points, "points");
        int i11 = this.currentQuadratic;
        if (i11 >= this.quadraticCount) {
            return false;
        }
        int i12 = i11 * 4;
        float[] fArr = this.quadraticData;
        points[i10] = fArr[i12];
        points[i10 + 1] = fArr[i12 + 1];
        points[i10 + 2] = fArr[i12 + 2];
        points[i10 + 3] = fArr[i12 + 3];
        points[i10 + 4] = fArr[i12 + 4];
        points[i10 + 5] = fArr[i12 + 5];
        this.currentQuadratic = i11 + 1;
        return true;
    }

    public final void setCurrentQuadratic(int i10) {
        this.currentQuadratic = i10;
    }
}
