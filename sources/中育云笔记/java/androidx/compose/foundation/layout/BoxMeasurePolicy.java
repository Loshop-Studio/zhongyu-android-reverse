package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

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
        return AbstractC9979u.m20289b(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(final MeasureScope measureScope, final List<? extends Measurable> list, long j10) {
        int iM33456getMinWidthimpl;
        int iM33455getMinHeightimpl;
        Placeable placeableMo32229measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m33456getMinWidthimpl(j10), Constraints.m33455getMinHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }
            }, 4, null);
        }
        long jM33442constructorimpl = this.propagateMinConstraints ? j10 : Constraints.m33442constructorimpl(j10 & ConstraintsKt.MaxDimensionsAndFocusMask);
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            if (BoxKt.getMatchesParentSize(measurable)) {
                iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
                iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
                placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.Companion.m33464fixedJhjzzOo(Constraints.m33456getMinWidthimpl(j10), Constraints.m33455getMinHeightimpl(j10)));
            } else {
                placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(jM33442constructorimpl);
                iM33456getMinWidthimpl = Math.max(Constraints.m33456getMinWidthimpl(j10), placeableMo32229measureBRTryo0.getWidth());
                iM33455getMinHeightimpl = Math.max(Constraints.m33455getMinHeightimpl(j10), placeableMo32229measureBRTryo0.getHeight());
            }
            final int i10 = iM33456getMinWidthimpl;
            final int i11 = iM33455getMinHeightimpl;
            final Placeable placeable = placeableMo32229measureBRTryo0;
            return MeasureScope.layout$default(measureScope, i10, i11, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    BoxKt.placeInBox(placementScope, placeable, measurable, measureScope.getLayoutDirection(), i10, i11, this.alignment);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f23400c = Constraints.m33456getMinWidthimpl(j10);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f23400c = Constraints.m33455getMinHeightimpl(j10);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            Measurable measurable2 = list.get(i12);
            if (BoxKt.getMatchesParentSize(measurable2)) {
                z10 = true;
            } else {
                Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(jM33442constructorimpl);
                placeableArr[i12] = placeableMo32229measureBRTryo02;
                ref$IntRef.f23400c = Math.max(ref$IntRef.f23400c, placeableMo32229measureBRTryo02.getWidth());
                ref$IntRef2.f23400c = Math.max(ref$IntRef2.f23400c, placeableMo32229measureBRTryo02.getHeight());
            }
        }
        if (z10) {
            int i13 = ref$IntRef.f23400c;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = ref$IntRef2.f23400c;
            long jConstraints = ConstraintsKt.Constraints(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Measurable measurable3 = list.get(i16);
                if (BoxKt.getMatchesParentSize(measurable3)) {
                    placeableArr[i16] = measurable3.mo32229measureBRTryo0(jConstraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, ref$IntRef.f23400c, ref$IntRef2.f23400c, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2 = placeableArr;
                List<Measurable> list3 = list;
                MeasureScope measureScope2 = measureScope;
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = placeableArr2.length;
                int i17 = 0;
                int i18 = 0;
                while (i17 < length) {
                    Placeable placeable2 = placeableArr2[i17];
                    AbstractC9979u.m20292e(placeable2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.placeInBox(placementScope, placeable2, list3.get(i18), measureScope2.getLayoutDirection(), ref$IntRef3.f23400c, ref$IntRef4.f23400c, boxMeasurePolicy.alignment);
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
