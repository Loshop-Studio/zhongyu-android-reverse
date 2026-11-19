package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Arrangement.Horizontal horizontalArrangement;
    private final Alignment.Vertical verticalAlignment;

    public RowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
    }

    private final Arrangement.Horizontal component1() {
        return this.horizontalArrangement;
    }

    private final Alignment.Vertical component2() {
        return this.verticalAlignment;
    }

    public static /* synthetic */ RowMeasurePolicy copy$default(RowMeasurePolicy rowMeasurePolicy, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            horizontal = rowMeasurePolicy.horizontalArrangement;
        }
        if ((i10 & 2) != 0) {
            vertical = rowMeasurePolicy.verticalAlignment;
        }
        return rowMeasurePolicy.copy(horizontal, vertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i10, int i11) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout_release(i10 - placeable.getHeight(), LayoutDirection.Ltr, placeable, i11) : this.verticalAlignment.align(0, i10 - placeable.getHeight());
    }

    public final RowMeasurePolicy copy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        return new RowMeasurePolicy(horizontal, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public long mo27371createConstraintsxF2OJ5Q(int i10, int i11, int i12, int i13, boolean z10) {
        return RowKt.createRowConstraints(z10, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return AbstractC9979u.m20289b(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && AbstractC9979u.m20289b(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxHeight(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.horizontalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxWidth(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.horizontalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        return RowColumnMeasurePolicyKt.measure(this, Constraints.m33456getMinWidthimpl(j10), Constraints.m33455getMinHeightimpl(j10), Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), measureScope.mo27093roundToPx0680j_4(this.horizontalArrangement.mo27345getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinHeight(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.horizontalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinWidth(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.horizontalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(final Placeable[] placeableArr, MeasureScope measureScope, final int i10, final int[] iArr, int i11, final int i12, int[] iArr2, int i13, int i14, int i15) {
        return MeasureScope.layout$default(measureScope, i11, i12, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.RowMeasurePolicy$placeHelper$1$1
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
                Placeable[] placeableArr2 = placeableArr;
                RowMeasurePolicy rowMeasurePolicy = this;
                int i16 = i12;
                int i17 = i10;
                int[] iArr3 = iArr;
                int length = placeableArr2.length;
                int i18 = 0;
                int i19 = 0;
                while (i18 < length) {
                    Placeable placeable = placeableArr2[i18];
                    AbstractC9979u.m20291d(placeable);
                    Placeable.PlacementScope.place$default(placementScope, placeable, iArr3[i19], rowMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i16, i17), 0.0f, 4, null);
                    i18++;
                    i19++;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i10, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.horizontalArrangement.arrange(measureScope, i10, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }
}
