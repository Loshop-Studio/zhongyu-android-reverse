package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {
    public static final int $stable = 0;
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i10;
    }

    /* renamed from: createItem-O3s9Psw */
    public abstract LazyGridMeasuredItem mo27600createItemO3s9Psw(int i10, Object obj, Object obj2, int i11, int i12, List<? extends Placeable> list, long j10, int i13, int i14);

    /* renamed from: getAndMeasure-m8Kt_7k, reason: not valid java name */
    public final LazyGridMeasuredItem m27605getAndMeasurem8Kt_7k(int i10, long j10, int i11, int i12, int i13) {
        int iM33455getMinHeightimpl;
        Object key = this.itemProvider.getKey(i10);
        Object contentType = this.itemProvider.getContentType(i10);
        List<Placeable> listMo27634measure0kLqBqw = this.measureScope.mo27634measure0kLqBqw(i10, j10);
        if (Constraints.m33452getHasFixedWidthimpl(j10)) {
            iM33455getMinHeightimpl = Constraints.m33456getMinWidthimpl(j10);
        } else {
            if (!Constraints.m33451getHasFixedHeightimpl(j10)) {
                InlineClassHelperKt.throwIllegalArgumentException("does not have fixed height");
            }
            iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
        }
        return mo27600createItemO3s9Psw(i10, key, contentType, iM33455getMinHeightimpl, i13, listMo27634measure0kLqBqw, j10, i11, i12);
    }

    public final IntList getHeaderIndices() {
        return this.itemProvider.getHeaderIndexes();
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc */
    public LazyGridMeasuredItem mo27574getAndMeasurehBUhpc(int i10, int i11, int i12, long j10) {
        return m27605getAndMeasurem8Kt_7k(i10, j10, i11, i12, this.defaultMainAxisSpacing);
    }
}
