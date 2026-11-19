package androidx.compose.p014ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class FontScaleConverterTable implements FontScaleConverter {
    private final float[] mFromSpValues;
    private final float[] mToDpValues;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float fConstrainedMap;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fConstrainedMap = fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    f11 = fArr[0];
                    f13 = fArr2[0];
                    f12 = 0.0f;
                } else {
                    f14 = fArr[i11];
                    f11 = fArr[i10];
                    f12 = fArr2[i11];
                    f13 = fArr2[i10];
                }
                fConstrainedMap = MathUtils.INSTANCE.constrainedMap(f12, f13, f14, f11, fAbs);
            }
            return fSignum * fConstrainedMap;
        }

        private Companion() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    @Override // androidx.compose.p014ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f10) {
        return Companion.lookupAndInterpolate(f10, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.p014ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f10) {
        return Companion.lookupAndInterpolate(f10, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues);
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.mToDpValues);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.mFromSpValues);
        AbstractC9979u.m20293f(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.mToDpValues);
        AbstractC9979u.m20293f(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
