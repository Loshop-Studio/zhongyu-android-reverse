package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class BoxMeasurePolicy implements MeasurePolicy {
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(Alignment alignment, boolean z10) {
        this.alignment = alignment;
        this.propagateMinConstraints = z10;
    }

    private final Alignment component1() {
        return this.alignment;
    }

    private final boolean component2() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy boxMeasurePolicy, Alignment alignment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i10 & 2) != 0) {
            z10 = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z10);
    }

    public final BoxMeasurePolicy copy(Alignment alignment, boolean z10) {
        return new BoxMeasurePolicy(alignment, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return AbstractC9133u.m16128b(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(final MeasureScope measureScope, final List<? extends Measurable> list, long j10) {
        int iM26853getMinHeightimpl;
        final int i10;
        final Placeable placeableMo25627measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m26854getMinWidthimpl(j10), Constraints.m26853getMinHeightimpl(j10), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        long jM26840constructorimpl = this.propagateMinConstraints ? j10 : Constraints.m26840constructorimpl(ConstraintsKt.MaxDimensionsAndFocusMask & j10);
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            if (BoxKt.getMatchesParentSize(measurable)) {
                int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
                iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
                i10 = iM26854getMinWidthimpl;
                placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.Companion.m26862fixedJhjzzOo(Constraints.m26854getMinWidthimpl(j10), Constraints.m26853getMinHeightimpl(j10)));
            } else {
                Placeable placeableMo25627measureBRTryo02 = measurable.mo25627measureBRTryo0(jM26840constructorimpl);
                int iMax = Math.max(Constraints.m26854getMinWidthimpl(j10), placeableMo25627measureBRTryo02.getWidth());
                iM26853getMinHeightimpl = Math.max(Constraints.m26853getMinHeightimpl(j10), placeableMo25627measureBRTryo02.getHeight());
                i10 = iMax;
                placeableMo25627measureBRTryo0 = placeableMo25627measureBRTryo02;
            }
            final int i11 = iM26853getMinHeightimpl;
            return MeasureScope.layout$default(measureScope, i10, i11, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    BoxKt.placeInBox(placementScope, placeableMo25627measureBRTryo0, measurable, measureScope.getLayoutDirection(), i10, i11, this.alignment);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f17471a = Constraints.m26854getMinWidthimpl(j10);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f17471a = Constraints.m26853getMinHeightimpl(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            Measurable measurable2 = list.get(i12);
            if (BoxKt.getMatchesParentSize(measurable2)) {
                z10 = true;
            } else {
                Placeable placeableMo25627measureBRTryo03 = measurable2.mo25627measureBRTryo0(jM26840constructorimpl);
                placeableArr[i12] = placeableMo25627measureBRTryo03;
                ref$IntRef.f17471a = Math.max(ref$IntRef.f17471a, placeableMo25627measureBRTryo03.getWidth());
                ref$IntRef2.f17471a = Math.max(ref$IntRef2.f17471a, placeableMo25627measureBRTryo03.getHeight());
            }
        }
        if (z10) {
            int i13 = ref$IntRef.f17471a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = ref$IntRef2.f17471a;
            long jConstraints = ConstraintsKt.Constraints(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Measurable measurable3 = list.get(i16);
                if (BoxKt.getMatchesParentSize(measurable3)) {
                    placeableArr[i16] = measurable3.mo25627measureBRTryo0(jConstraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, ref$IntRef.f17471a, ref$IntRef2.f17471a, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2 = placeableArr;
                List<Measurable> list2 = list;
                MeasureScope measureScope2 = measureScope;
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = placeableArr2.length;
                int i17 = 0;
                int i18 = 0;
                while (i17 < length) {
                    Placeable placeable = placeableArr2[i17];
                    AbstractC9133u.m16131e(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.placeInBox(placementScope, placeable, list2.get(i18), measureScope2.getLayoutDirection(), ref$IntRef3.f17471a, ref$IntRef4.f17471a, boxMeasurePolicy.alignment);
                    i17++;
                    i18++;
                }
            }
        }, 4, null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }
}
