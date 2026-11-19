package androidx.compose.p006ui.unit;

import androidx.compose.p006ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m5175d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "(FF)V", "getDensity", "()F", "getFontScale", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f4, float f5) {
        this.density = f4;
        this.fontScale = f5;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = densityImpl.getDensity();
        }
        if ((i4 & 2) != 0) {
            f5 = densityImpl.getFontScale();
        }
        return densityImpl.copy(f4, f5);
    }

    public final float component1() {
        return getDensity();
    }

    public final float component2() {
        return getFontScale();
    }

    public final DensityImpl copy(float density, float fontScale) {
        return new DensityImpl(density, fontScale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) other;
        return Float.compare(getDensity(), densityImpl.getDensity()) == 0 && Float.compare(getFontScale(), densityImpl.getFontScale()) == 0;
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (Float.floatToIntBits(getDensity()) * 31) + Float.floatToIntBits(getFontScale());
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo7199roundToPxR2X_6o(long j4) {
        return AbstractC1702a.m906a(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo7200roundToPx0680j_4(float f4) {
        return AbstractC1702a.m907b(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo7201toDpGaN1DYA(long j4) {
        return AbstractC1702a.m908c(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo7202toDpu2uoSUM(float f4) {
        return AbstractC1702a.m909d(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo7204toDpSizekrfVVM(long j4) {
        return AbstractC1702a.m911f(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo7205toPxR2X_6o(long j4) {
        return AbstractC1702a.m912g(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo7206toPx0680j_4(float f4) {
        return AbstractC1702a.m913h(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC1702a.m914i(this, dpRect);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo7207toSizeXkaWNTQ(long j4) {
        return AbstractC1702a.m915j(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo7208toSp0xMU5do(float f4) {
        return AbstractC1702a.m916k(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo7209toSpkPz2Gy4(float f4) {
        return AbstractC1702a.m917l(this, f4);
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + getFontScale() + ')';
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo7203toDpu2uoSUM(int i4) {
        return AbstractC1702a.m910e(this, i4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo7210toSpkPz2Gy4(int i4) {
        return AbstractC1702a.m918m(this, i4);
    }
}
