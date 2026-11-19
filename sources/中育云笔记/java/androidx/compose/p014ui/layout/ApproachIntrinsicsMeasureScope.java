package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import java.util.Map;
import p181hd.InterfaceC9540l;

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

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p014ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo32205getLookaheadConstraintsmsEJaDk() {
        return this.$$delegate_0.mo32205getLookaheadConstraintsmsEJaDk();
    }

    @Override // androidx.compose.p014ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo32206getLookaheadSizeYbymL2g() {
        return this.$$delegate_0.mo32206getLookaheadSizeYbymL2g();
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.p014ui.layout.MeasureScope
    public MeasureResult layout(final int i10, final int i11, final Map<AlignmentLine, Integer> map, final InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        boolean z10 = false;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i11) == 0) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope.layout.1
            @Override // androidx.compose.p014ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getHeight() {
                return i11;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public InterfaceC9540l getRulers() {
                return interfaceC9540l;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getWidth() {
                return i10;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo27092roundToPxR2X_6o(long j10) {
        return this.$$delegate_0.mo27092roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo27093roundToPx0680j_4(float f10) {
        return this.$$delegate_0.mo27093roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo27094toDpGaN1DYA(long j10) {
        return this.$$delegate_0.mo27094toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27095toDpu2uoSUM(float f10) {
        return this.$$delegate_0.mo27095toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo27097toDpSizekrfVVM(long j10) {
        return this.$$delegate_0.mo27097toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo27098toPxR2X_6o(long j10) {
        return this.$$delegate_0.mo27098toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo27099toPx0680j_4(float f10) {
        return this.$$delegate_0.mo27099toPx0680j_4(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo27100toSizeXkaWNTQ(long j10) {
        return this.$$delegate_0.mo27100toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo27101toSp0xMU5do(float f10) {
        return this.$$delegate_0.mo27101toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27102toSpkPz2Gy4(float f10) {
        return this.$$delegate_0.mo27102toSpkPz2Gy4(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27096toDpu2uoSUM(int i10) {
        return this.$$delegate_0.mo27096toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27103toSpkPz2Gy4(int i10) {
        return this.$$delegate_0.mo27103toSpkPz2Gy4(i10);
    }
}
