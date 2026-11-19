package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {
    public static final int $stable = 0;
    private final long childConstraints;
    private final LazyListItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    public /* synthetic */ LazyListMeasuredItemProvider(long j10, boolean z10, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, AbstractC9126n abstractC9126n) {
        this(j10, z10, lazyListItemProvider, lazyLayoutMeasureScope);
    }

    /* renamed from: getAndMeasure-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ LazyListMeasuredItem m20971getAndMeasure0kLqBqw$default(LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i10, long j10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i11 & 2) != 0) {
            j10 = lazyListMeasuredItemProvider.childConstraints;
        }
        return lazyListMeasuredItemProvider.m20973getAndMeasure0kLqBqw(i10, j10);
    }

    /* renamed from: createItem-X9ElhV4 */
    public abstract LazyListMeasuredItem mo20961createItemX9ElhV4(int i10, Object obj, Object obj2, List<? extends Placeable> list, long j10);

    /* renamed from: getAndMeasure-0kLqBqw, reason: not valid java name */
    public final LazyListMeasuredItem m20973getAndMeasure0kLqBqw(int i10, long j10) {
        return mo20961createItemX9ElhV4(i10, this.itemProvider.getKey(i10), this.itemProvider.getContentType(i10), this.measureScope.mo21032measure0kLqBqw(i10, j10), j10);
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m20974getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    public final IntList getHeaderIndexes() {
        return this.itemProvider.getHeaderIndexes();
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    private LazyListMeasuredItemProvider(long j10, boolean z10, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z10 ? Constraints.m26852getMaxWidthimpl(j10) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : Constraints.m26851getMaxHeightimpl(j10), 5, null);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc, reason: not valid java name */
    public LazyListMeasuredItem mo20972getAndMeasurehBUhpc(int i10, int i11, int i12, long j10) {
        return m20973getAndMeasure0kLqBqw(i10, j10);
    }
}
