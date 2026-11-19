package androidx.compose.p014ui;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.BiasAbsoluteAlignment;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class BiasAlignment implements Alignment {
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
            return Math.round(((i11 - i10) / 2.0f) * (1 + (layoutDirection == LayoutDirection.Ltr ? this.bias : (-1) * this.bias)));
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
            return vertical instanceof Vertical ? new BiasAlignment(this.bias, ((Vertical) vertical).getBias()) : super.plus(vertical);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    @Immutable
    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public Vertical(float f10) {
            this.bias = f10;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = vertical.bias;
            }
            return vertical.copy(f10);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int i10, int i11) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.bias));
        }

        public final float component1() {
            return this.bias;
        }

        public final Vertical copy(float f10) {
            return new Vertical(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public final float getBias() {
            return this.bias;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public Alignment plus(Alignment.Horizontal horizontal) {
            return horizontal instanceof Horizontal ? new BiasAlignment(((Horizontal) horizontal).getBias(), this.bias) : horizontal instanceof BiasAbsoluteAlignment.Horizontal ? new BiasAbsoluteAlignment(((BiasAbsoluteAlignment.Horizontal) horizontal).getBias(), this.bias) : super.plus(horizontal);
        }

        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f10, float f11) {
        this.horizontalBias = f10;
        this.verticalBias = f11;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = biasAlignment.horizontalBias;
        }
        if ((i10 & 2) != 0) {
            f11 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f10, f11);
    }

    @Override // androidx.compose.p014ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo30446alignKFBX0sM(long j10, long j11, LayoutDirection layoutDirection) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        float f12 = 1;
        return IntOffset.m33623constructorimpl((Math.round(f10 * ((layoutDirection == LayoutDirection.Ltr ? this.horizontalBias : (-1) * this.horizontalBias) + f12)) << 32) | (Math.round(f11 * (f12 + this.verticalBias)) & 4294967295L));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAlignment copy(float f10, float f11) {
        return new BiasAlignment(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
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
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
