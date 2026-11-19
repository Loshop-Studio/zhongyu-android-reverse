package androidx.compose.p014ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.Immutable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10964p;

@Immutable
/* loaded from: classes2.dex */
public final class ColorMatrixColorFilter extends ColorFilter {
    private float[] colorMatrix;

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, ColorFilter colorFilter, AbstractC9972n abstractC9972n) {
        this(fArr, colorFilter);
    }

    /* renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m30954copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = ColorMatrix.m30935constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m30956copyColorMatrixgBh15pI(fArr);
    }

    /* renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m30955obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrActualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
        this.colorMatrix = fArrActualColorMatrixFromFilter;
        return fArrActualColorMatrixFromFilter;
    }

    /* renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m30956copyColorMatrixgBh15pI(float[] fArr) {
        AbstractC10964p.m24026s(m30955obtainColorMatrixp10uLo(), fArr, 0, 0, 0, 14, null);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(m30955obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m30955obtainColorMatrixp10uLo());
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m30941hashCodeimpl(fArr);
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        sb2.append((Object) (fArr == null ? "null" : ColorMatrix.m30952toStringimpl(fArr)));
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, AbstractC9972n abstractC9972n) {
        this(fArr);
    }

    private ColorMatrixColorFilter(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m30742actualColorMatrixColorFilterjHGOpc(fArr), null);
    }
}
