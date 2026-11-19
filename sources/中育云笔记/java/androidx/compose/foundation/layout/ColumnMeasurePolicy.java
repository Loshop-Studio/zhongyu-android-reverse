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
public final class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Alignment.Horizontal horizontalAlignment;
    private final Arrangement.Vertical verticalArrangement;

    public ColumnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        this.verticalArrangement = vertical;
        this.horizontalAlignment = horizontal;
    }

    private final Arrangement.Vertical component1() {
        return this.verticalArrangement;
    }

    private final Alignment.Horizontal component2() {
        return this.horizontalAlignment;
    }

    public static /* synthetic */ ColumnMeasurePolicy copy$default(ColumnMeasurePolicy columnMeasurePolicy, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vertical = columnMeasurePolicy.verticalArrangement;
        }
        if ((i10 & 2) != 0) {
            horizontal = columnMeasurePolicy.horizontalAlignment;
        }
        return columnMeasurePolicy.copy(vertical, horizontal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i10, int i11, LayoutDirection layoutDirection) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout_release(i10 - placeable.getWidth(), layoutDirection, placeable, i11) : this.horizontalAlignment.align(0, i10 - placeable.getWidth(), layoutDirection);
    }

    public final ColumnMeasurePolicy copy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        return new ColumnMeasurePolicy(vertical, horizontal);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q, reason: not valid java name */
    public long mo27371createConstraintsxF2OJ5Q(int i10, int i11, int i12, int i13, boolean z10) {
        return ColumnKt.createColumnConstraints(z10, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return AbstractC9979u.m20289b(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && AbstractC9979u.m20289b(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxHeight(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.verticalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxWidth(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.verticalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        return RowColumnMeasurePolicyKt.measure(this, Constraints.m33455getMinHeightimpl(j10), Constraints.m33456getMinWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), Constraints.m33454getMaxWidthimpl(j10), measureScope.mo27093roundToPx0680j_4(this.verticalArrangement.mo27345getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinHeight(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.verticalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinWidth(list, i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(this.verticalArrangement.mo27345getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(final Placeable[] placeableArr, final MeasureScope measureScope, final int i10, final int[] iArr, int i11, final int i12, int[] iArr2, int i13, int i14, int i15) {
        return MeasureScope.layout$default(measureScope, i12, i11, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.ColumnMeasurePolicy$placeHelper$1$1
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
                ColumnMeasurePolicy columnMeasurePolicy = this;
                int i16 = i12;
                int i17 = i10;
                MeasureScope measureScope2 = measureScope;
                int[] iArr3 = iArr;
                int length = placeableArr2.length;
                int i18 = 0;
                int i19 = 0;
                while (i18 < length) {
                    Placeable placeable = placeableArr2[i18];
                    AbstractC9979u.m20291d(placeable);
                    Placeable.PlacementScope.place$default(placementScope, placeable, columnMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i16, i17, measureScope2.getLayoutDirection()), iArr3[i19], 0.0f, 4, null);
                    i18++;
                    i19++;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i10, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.verticalArrangement.arrange(measureScope, i10, iArr, iArr2);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}
