package androidx.compose.p013ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, m13558d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "fromSp", "", "toDp", "([F[F)V", "mFromSpValues", "getMFromSpValues$annotations", "()V", "getMFromSpValues", "()[F", "mToDpValues", "getMToDpValues$annotations", "getMToDpValues", "convertDpToSp", "", "dp", "convertSpToDp", "sp", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class FontScaleConverterTable implements FontScaleConverter {
    private final float[] mFromSpValues;

    /* renamed from: mToDpValues, reason: from kotlin metadata and from toString */
    private final float[] toDpValues;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\t"}, m13558d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;", "", "()V", "lookupAndInterpolate", "", "sourceValue", "sourceValues", "", "targetValues", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float sourceValue, float[] sourceValues, float[] targetValues) {
            float f10;
            float f11;
            float f12;
            float fConstrainedMap;
            float fAbs = Math.abs(sourceValue);
            float fSignum = Math.signum(sourceValue);
            int iBinarySearch = Arrays.binarySearch(sourceValues, fAbs);
            if (iBinarySearch >= 0) {
                fConstrainedMap = targetValues[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f13 = 0.0f;
                if (i11 >= sourceValues.length - 1) {
                    float f14 = sourceValues[sourceValues.length - 1];
                    float f15 = targetValues[sourceValues.length - 1];
                    if (f14 == 0.0f) {
                        return 0.0f;
                    }
                    return sourceValue * (f15 / f14);
                }
                if (i11 == -1) {
                    f10 = sourceValues[0];
                    f12 = targetValues[0];
                    f11 = 0.0f;
                } else {
                    f13 = sourceValues[i11];
                    f10 = sourceValues[i10];
                    f11 = targetValues[i11];
                    f12 = targetValues[i10];
                }
                fConstrainedMap = MathUtils.INSTANCE.constrainedMap(f11, f12, f13, f10, fAbs);
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
        this.toDpValues = fArr2;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float dp) {
        return INSTANCE.lookupAndInterpolate(dp, this.toDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float sp) {
        return INSTANCE.lookupAndInterpolate(sp, this.mFromSpValues, this.toDpValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) other;
        return Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.toDpValues, fontScaleConverterTable.toDpValues);
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    /* renamed from: getMToDpValues, reason: from getter */
    public final float[] getToDpValues() {
        return this.toDpValues;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.toDpValues);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.mFromSpValues);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.toDpValues);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
