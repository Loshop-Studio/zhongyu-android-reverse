package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DpRect;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u0010*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0016\u001a\u00020\u0010*\u00020\u0007H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0016\u001a\u00020\u0010*\u00020\u000fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u0007*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010!\u001a\u00020\u0007*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0018J\r\u0010$\u001a\u00020%*\u00020&H\u0097\u0001J\u001a\u0010'\u001a\u00020\u001e*\u00020\u001dH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010 J\u001a\u0010)\u001a\u00020\u0013*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001d\u0010)\u001a\u00020\u0013*\u00020\u0007H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010+J\u001d\u0010)\u001a\u00020\u0013*\u00020\u000fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006."}, m5175d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/Density;", "density", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)V", "", "getDensity", "()F", "fontScale", "getFontScale", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = density;
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p006ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p006ui.layout.MeasureScope
    public /* synthetic */ MeasureResult layout(int i4, int i5, Map map, Function1 function1) {
        return MeasureScope.CC.m619a(this, i4, i5, map, function1);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo7199roundToPxR2X_6o(long j4) {
        return this.$$delegate_0.mo7199roundToPxR2X_6o(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo7200roundToPx0680j_4(float f4) {
        return this.$$delegate_0.mo7200roundToPx0680j_4(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo7201toDpGaN1DYA(long j4) {
        return this.$$delegate_0.mo7201toDpGaN1DYA(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7202toDpu2uoSUM(float f4) {
        return this.$$delegate_0.mo7202toDpu2uoSUM(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo7204toDpSizekrfVVM(long j4) {
        return this.$$delegate_0.mo7204toDpSizekrfVVM(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo7205toPxR2X_6o(long j4) {
        return this.$$delegate_0.mo7205toPxR2X_6o(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo7206toPx0680j_4(float f4) {
        return this.$$delegate_0.mo7206toPx0680j_4(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo7207toSizeXkaWNTQ(long j4) {
        return this.$$delegate_0.mo7207toSizeXkaWNTQ(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo7208toSp0xMU5do(float f4) {
        return this.$$delegate_0.mo7208toSp0xMU5do(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7209toSpkPz2Gy4(float f4) {
        return this.$$delegate_0.mo7209toSpkPz2Gy4(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7203toDpu2uoSUM(int i4) {
        return this.$$delegate_0.mo7203toDpu2uoSUM(i4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7210toSpkPz2Gy4(int i4) {
        return this.$$delegate_0.mo7210toSpkPz2Gy4(i4);
    }
}
