package androidx.compose.p013ui;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.BiasAlignment;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    @Immutable
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f10) {
            this.bias = f10;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = horizontal.bias;
            }
            return horizontal.copy(f10);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i10, int i11, LayoutDirection layoutDirection) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.bias));
        }

        public final float component1() {
            return this.bias;
        }

        public final Horizontal copy(float f10) {
            return new Horizontal(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public final float getBias() {
            return this.bias;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public Alignment plus(Alignment.Vertical vertical) {
            return vertical instanceof BiasAlignment.Vertical ? new BiasAbsoluteAlignment(this.bias, ((BiasAlignment.Vertical) vertical).getBias()) : super.plus(vertical);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    public BiasAbsoluteAlignment(float f10, float f11) {
        this.horizontalBias = f10;
        this.verticalBias = f11;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i10 & 2) != 0) {
            f11 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f10, f11);
    }

    @Override // androidx.compose.p013ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo23844alignKFBX0sM(long j10, long j11, LayoutDirection layoutDirection) {
        long jM27065constructorimpl = IntSize.m27065constructorimpl(((((int) (j11 >> 32)) - ((int) (j10 >> 32))) << 32) | ((((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L));
        float f10 = 1;
        float f11 = (((int) (jM27065constructorimpl >> 32)) / 2.0f) * (this.horizontalBias + f10);
        float f12 = (((int) (jM27065constructorimpl & 4294967295L)) / 2.0f) * (f10 + this.verticalBias);
        return IntOffset.m27021constructorimpl((Math.round(f11) << 32) | (Math.round(f12) & 4294967295L));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAbsoluteAlignment copy(float f10, float f11) {
        return new BiasAbsoluteAlignment(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
