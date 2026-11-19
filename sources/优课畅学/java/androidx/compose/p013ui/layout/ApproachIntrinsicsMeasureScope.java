package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ApproachIntrinsicsMeasureScope implements ApproachMeasureScope, ApproachIntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ ApproachIntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    public ApproachIntrinsicsMeasureScope(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = approachIntrinsicMeasureScope;
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p013ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo25603getLookaheadConstraintsmsEJaDk() {
        return this.$$delegate_0.mo25603getLookaheadConstraintsmsEJaDk();
    }

    @Override // androidx.compose.p013ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo25604getLookaheadSizeYbymL2g() {
        return this.$$delegate_0.mo25604getLookaheadSizeYbymL2g();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.p013ui.layout.MeasureScope
    public MeasureResult layout(final int i10, final int i11, final Map<AlignmentLine, Integer> map, final InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        boolean z10 = false;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope.layout.1
            @Override // androidx.compose.p013ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getHeight() {
                return i11;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public InterfaceC10570l getRulers() {
                return interfaceC10570l;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getWidth() {
                return i10;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo20490roundToPxR2X_6o(long j10) {
        return this.$$delegate_0.mo20490roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo20491roundToPx0680j_4(float f10) {
        return this.$$delegate_0.mo20491roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo20492toDpGaN1DYA(long j10) {
        return this.$$delegate_0.mo20492toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20493toDpu2uoSUM(float f10) {
        return this.$$delegate_0.mo20493toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo20495toDpSizekrfVVM(long j10) {
        return this.$$delegate_0.mo20495toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo20496toPxR2X_6o(long j10) {
        return this.$$delegate_0.mo20496toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo20497toPx0680j_4(float f10) {
        return this.$$delegate_0.mo20497toPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo20498toSizeXkaWNTQ(long j10) {
        return this.$$delegate_0.mo20498toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo20499toSp0xMU5do(float f10) {
        return this.$$delegate_0.mo20499toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20500toSpkPz2Gy4(float f10) {
        return this.$$delegate_0.mo20500toSpkPz2Gy4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20494toDpu2uoSUM(int i10) {
        return this.$$delegate_0.mo20494toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20501toSpkPz2Gy4(int i10) {
        return this.$$delegate_0.mo20501toSpkPz2Gy4(i10);
    }
}
