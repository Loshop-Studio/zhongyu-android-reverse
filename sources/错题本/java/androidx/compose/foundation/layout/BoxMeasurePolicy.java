package androidx.compose.foundation.layout;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J,\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "alignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "(Landroidx/compose/ui/Alignment;Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,334:1\n202#2:335\n70#3,6:336\n70#3,6:342\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n*L\n136#1:335\n166#1:336,6\n187#1:342,6\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class BoxMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(@NotNull Alignment alignment, boolean z8) {
        this.alignment = alignment;
        this.propagateMinConstraints = z8;
    }

    /* renamed from: component1, reason: from getter */
    private final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getPropagateMinConstraints() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy boxMeasurePolicy, Alignment alignment, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i & 2) != 0) {
            z8 = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z8);
    }

    @NotNull
    public final BoxMeasurePolicy copy(@NotNull Alignment alignment, boolean propagateMinConstraints) {
        return new BoxMeasurePolicy(alignment, propagateMinConstraints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) other;
        return AbstractC5830k.m5325b(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return Boolean.hashCode(this.propagateMinConstraints) + (this.alignment.hashCode() * 31);
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6545measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull final List<? extends Measurable> list, long j7) {
        int iM13259getMinHeightimpl;
        final int i;
        final Placeable placeableMo12033measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m13260getMinWidthimpl(j7), Constraints.m13259getMinHeightimpl(j7), null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }, 4, null);
        }
        long jM13246constructorimpl = this.propagateMinConstraints ? j7 : Constraints.m13246constructorimpl(ConstraintsKt.MaxDimensionsAndFocusMask & j7);
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            if (BoxKt.getMatchesParentSize(measurable)) {
                int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
                iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
                i = iM13260getMinWidthimpl;
                placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.INSTANCE.m13268fixedJhjzzOo(Constraints.m13260getMinWidthimpl(j7), Constraints.m13259getMinHeightimpl(j7)));
            } else {
                Placeable placeableMo12033measureBRTryo02 = measurable.mo12033measureBRTryo0(jM13246constructorimpl);
                int iMax = Math.max(Constraints.m13260getMinWidthimpl(j7), placeableMo12033measureBRTryo02.getWidth());
                iM13259getMinHeightimpl = Math.max(Constraints.m13259getMinHeightimpl(j7), placeableMo12033measureBRTryo02.getHeight());
                i = iMax;
                placeableMo12033measureBRTryo0 = placeableMo12033measureBRTryo02;
            }
            final int i8 = iM13259getMinHeightimpl;
            return MeasureScope.layout$default(measureScope, i, i8, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    BoxKt.placeInBox(placementScope, placeableMo12033measureBRTryo0, measurable, measureScope.getLayoutDirection(), i, i8, this.alignment);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = Constraints.m13260getMinWidthimpl(j7);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = Constraints.m13259getMinHeightimpl(j7);
        int size = list.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            Measurable measurable2 = list.get(i9);
            if (BoxKt.getMatchesParentSize(measurable2)) {
                z8 = true;
            } else {
                Placeable placeableMo12033measureBRTryo03 = measurable2.mo12033measureBRTryo0(jM13246constructorimpl);
                placeableArr[i9] = placeableMo12033measureBRTryo03;
                ref$IntRef.element = Math.max(ref$IntRef.element, placeableMo12033measureBRTryo03.getWidth());
                ref$IntRef2.element = Math.max(ref$IntRef2.element, placeableMo12033measureBRTryo03.getHeight());
            }
        }
        if (z8) {
            int i10 = ref$IntRef.element;
            int i11 = i10 != Integer.MAX_VALUE ? i10 : 0;
            int i12 = ref$IntRef2.element;
            long jConstraints = ConstraintsKt.Constraints(i11, i10, i12 != Integer.MAX_VALUE ? i12 : 0, i12);
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Measurable measurable3 = list.get(i13);
                if (BoxKt.getMatchesParentSize(measurable3)) {
                    placeableArr[i13] = measurable3.mo12033measureBRTryo0(jConstraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, ref$IntRef.element, ref$IntRef2.element, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2 = placeableArr;
                List<Measurable> list2 = list;
                MeasureScope measureScope2 = measureScope;
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = placeableArr2.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    Placeable placeable = placeableArr2[i14];
                    AbstractC5830k.m5328e(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.placeInBox(placementScope, placeable, list2.get(i15), measureScope2.getLayoutDirection(), ref$IntRef3.element, ref$IntRef4.element, boxMeasurePolicy.alignment);
                    i14++;
                    i15++;
                }
            }
        }, 4, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.alignment);
        sb.append(", propagateMinConstraints=");
        return AbstractC0037f.m93r(sb, this.propagateMinConstraints, ')');
    }
}
