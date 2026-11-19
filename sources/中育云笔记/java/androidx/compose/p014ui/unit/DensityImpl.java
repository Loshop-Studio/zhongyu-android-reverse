package androidx.compose.p014ui.unit;

/* loaded from: classes2.dex */
final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f10, float f11) {
        this.density = f10;
        this.fontScale = f11;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = densityImpl.density;
        }
        if ((i10 & 2) != 0) {
            f11 = densityImpl.fontScale;
        }
        return densityImpl.copy(f10, f11);
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    public final DensityImpl copy(float f10, float f11) {
        return new DensityImpl(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.density, densityImpl.density) == 0 && Float.compare(this.fontScale, densityImpl.fontScale) == 0;
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale);
    }

    public String toString() {
        return "DensityImpl(density=" + this.density + ", fontScale=" + this.fontScale + ')';
    }
}
