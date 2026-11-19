package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    default long mo20769createConstraintsxF2OJ5Q(int i10, int i11, int i12, int i13, boolean z10) {
        return isHorizontal() ? RowKt.createRowConstraints(z10, i10, i11, i12, i13) : ColumnKt.createColumnConstraints(z10, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int crossAxisSize(Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredHeight() : placeable.getMeasuredWidth();
    }

    CrossAxisAlignment getCrossAxisAlignment();

    default int getCrossAxisPosition(Placeable placeable, int i10, LayoutDirection layoutDirection, int i11) {
        CrossAxisAlignment crossAxisAlignment;
        RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(placeable);
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = getCrossAxisAlignment();
        }
        return crossAxisAlignment.align$foundation_layout_release(i10 - crossAxisSize(placeable), layoutDirection, placeable, i11);
    }

    Arrangement.Horizontal getHorizontalArrangement();

    Arrangement.Vertical getVerticalArrangement();

    boolean isHorizontal();

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int mainAxisSize(Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredWidth() : placeable.getMeasuredHeight();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default MeasureResult placeHelper(final Placeable[] placeableArr, MeasureScope measureScope, final int i10, final int[] iArr, int i11, final int i12, final int[] iArr2, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        if (isHorizontal()) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i17 = i12;
        }
        final LayoutDirection layoutDirection = isHorizontal() ? LayoutDirection.Ltr : measureScope.getLayoutDirection();
        return MeasureScope.layout$default(measureScope, i17, i16, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
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
                Placeable.PlacementScope placementScope2;
                int[] iArr3 = iArr2;
                int i18 = iArr3 != null ? iArr3[i13] : 0;
                int i19 = i14;
                while (i19 < i15) {
                    Placeable placeable = placeableArr[i19];
                    AbstractC9133u.m16130d(placeable);
                    int crossAxisPosition = this.getCrossAxisPosition(placeable, i12, layoutDirection, i10) + i18;
                    if (this.isHorizontal()) {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.place$default(placementScope2, placeable, iArr[i19 - i14], crossAxisPosition, 0.0f, 4, null);
                    } else {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.place$default(placementScope2, placeable, crossAxisPosition, iArr[i19 - i14], 0.0f, 4, null);
                    }
                    i19++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void populateMainAxisPositions(int i10, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (isHorizontal()) {
            getHorizontalArrangement().arrange(measureScope, i10, iArr, measureScope.getLayoutDirection(), iArr2);
        } else {
            getVerticalArrangement().arrange(measureScope, i10, iArr, iArr2);
        }
    }
}
