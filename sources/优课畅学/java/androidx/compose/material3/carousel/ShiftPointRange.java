package androidx.compose.material3.carousel;

/* loaded from: classes2.dex */
final class ShiftPointRange {
    private final int fromStepIndex;
    private final float steppedInterpolation;
    private final int toStepIndex;

    public ShiftPointRange(int i10, int i11, float f10) {
        this.fromStepIndex = i10;
        this.toStepIndex = i11;
        this.steppedInterpolation = f10;
    }

    public static /* synthetic */ ShiftPointRange copy$default(ShiftPointRange shiftPointRange, int i10, int i11, float f10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = shiftPointRange.fromStepIndex;
        }
        if ((i12 & 2) != 0) {
            i11 = shiftPointRange.toStepIndex;
        }
        if ((i12 & 4) != 0) {
            f10 = shiftPointRange.steppedInterpolation;
        }
        return shiftPointRange.copy(i10, i11, f10);
    }

    public final int component1() {
        return this.fromStepIndex;
    }

    public final int component2() {
        return this.toStepIndex;
    }

    public final float component3() {
        return this.steppedInterpolation;
    }

    public final ShiftPointRange copy(int i10, int i11, float f10) {
        return new ShiftPointRange(i10, i11, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftPointRange)) {
            return false;
        }
        ShiftPointRange shiftPointRange = (ShiftPointRange) obj;
        return this.fromStepIndex == shiftPointRange.fromStepIndex && this.toStepIndex == shiftPointRange.toStepIndex && Float.compare(this.steppedInterpolation, shiftPointRange.steppedInterpolation) == 0;
    }

    public final int getFromStepIndex() {
        return this.fromStepIndex;
    }

    public final float getSteppedInterpolation() {
        return this.steppedInterpolation;
    }

    public final int getToStepIndex() {
        return this.toStepIndex;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.fromStepIndex) * 31) + Integer.hashCode(this.toStepIndex)) * 31) + Float.hashCode(this.steppedInterpolation);
    }

    public String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.fromStepIndex + ", toStepIndex=" + this.toStepIndex + ", steppedInterpolation=" + this.steppedInterpolation + ')';
    }
}
