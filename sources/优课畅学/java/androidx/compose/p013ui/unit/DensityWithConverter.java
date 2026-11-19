package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.unit.fontscaling.FontScaleConverter;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
final class DensityWithConverter implements Density {
    private final FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    public DensityWithConverter(float f10, float f11, FontScaleConverter fontScaleConverter) {
        this.density = f10;
        this.fontScale = f11;
        this.converter = fontScaleConverter;
    }

    private final FontScaleConverter component3() {
        return this.converter;
    }

    public static /* synthetic */ DensityWithConverter copy$default(DensityWithConverter densityWithConverter, float f10, float f11, FontScaleConverter fontScaleConverter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = densityWithConverter.density;
        }
        if ((i10 & 2) != 0) {
            f11 = densityWithConverter.fontScale;
        }
        if ((i10 & 4) != 0) {
            fontScaleConverter = densityWithConverter.converter;
        }
        return densityWithConverter.copy(f10, f11, fontScaleConverter);
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    public final DensityWithConverter copy(float f10, float f11, FontScaleConverter fontScaleConverter) {
        return new DensityWithConverter(f10, f11, fontScaleConverter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && AbstractC9133u.m16128b(this.converter, densityWithConverter.converter);
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo20492toDpGaN1DYA(long j10) {
        if (TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j10), TextUnitType.Companion.m27126getSpUIouoOA())) {
            return C3156Dp.m26899constructorimpl(this.converter.convertSpToDp(TextUnit.m27093getValueimpl(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo20499toSp0xMU5do(float f10) {
        return TextUnitKt.getSp(this.converter.convertDpToSp(f10));
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
