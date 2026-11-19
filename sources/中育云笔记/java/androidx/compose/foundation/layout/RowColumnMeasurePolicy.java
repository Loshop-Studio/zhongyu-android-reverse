package androidx.compose.foundation.layout;

import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;

/* loaded from: classes.dex */
public interface RowColumnMeasurePolicy {
    /* renamed from: createConstraints-xF2OJ5Q$default, reason: not valid java name */
    static /* synthetic */ long m27485createConstraintsxF2OJ5Q$default(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i14 & 16) != 0) {
            z10 = false;
        }
        return rowColumnMeasurePolicy.mo27371createConstraintsxF2OJ5Q(i10, i11, i12, i13, z10);
    }

    /* renamed from: createConstraints-xF2OJ5Q */
    long mo27371createConstraintsxF2OJ5Q(int i10, int i11, int i12, int i13, boolean z10);

    int crossAxisSize(Placeable placeable);

    int mainAxisSize(Placeable placeable);

    MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15);

    void populateMainAxisPositions(int i10, int[] iArr, int[] iArr2, MeasureScope measureScope);
}
