package androidx.compose.p013ui.layout;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f10) {
        this.value = f10;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fixedScale.value;
        }
        return fixedScale.copy(f10);
    }

    public final float component1() {
        return this.value;
    }

    @Override // androidx.compose.p013ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo25620computeScaleFactorH7hwNQA(long j10, long j11) {
        float f10 = this.value;
        return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(f10)));
    }

    public final FixedScale copy(float f10) {
        return new FixedScale(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}
