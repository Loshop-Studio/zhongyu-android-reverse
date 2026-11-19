package io.objectbox.android;

import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import io.objectbox.query.Query;
import java.util.Collections;
import java.util.List;
import p222q6.InterfaceC9834a;

/* loaded from: classes5.dex */
public class ObjectBoxDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: a */
    public final Query f16893a;

    /* renamed from: b */
    public final InterfaceC9834a f16894b;

    public static class Factory<Item> extends DataSource.Factory<Integer, Item> {

        /* renamed from: a */
        public final Query f16895a;

        @Override // androidx.paging.DataSource.Factory
        public DataSource create() {
            return new ObjectBoxDataSource(this.f16895a);
        }
    }

    /* renamed from: io.objectbox.android.ObjectBoxDataSource$a */
    public class C8958a implements InterfaceC9834a {
        public C8958a() {
        }

        @Override // p222q6.InterfaceC9834a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo15425b(List list) {
            ObjectBoxDataSource.this.invalidate();
        }
    }

    public ObjectBoxDataSource(Query query) {
        this.f16893a = query;
        C8958a c8958a = new C8958a();
        this.f16894b = c8958a;
        query.m15485q().m18361b().m18362c().m18360a(c8958a);
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback loadInitialCallback) {
        int iCount = (int) this.f16893a.count();
        if (iCount == 0) {
            loadInitialCallback.onResult(Collections.EMPTY_LIST, 0, 0);
            return;
        }
        int iComputeInitialLoadPosition = PositionalDataSource.computeInitialLoadPosition(loadInitialParams, iCount);
        int iComputeInitialLoadSize = PositionalDataSource.computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, iCount);
        List<? extends T> listLoadRange = loadRange(iComputeInitialLoadPosition, iComputeInitialLoadSize);
        if (listLoadRange.size() == iComputeInitialLoadSize) {
            loadInitialCallback.onResult(listLoadRange, iComputeInitialLoadPosition, iCount);
        } else {
            invalidate();
        }
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadRange(PositionalDataSource.LoadRangeParams loadRangeParams, PositionalDataSource.LoadRangeCallback loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    private List loadRange(int i10, int i11) {
        return this.f16893a.m15479k(i10, i11);
    }
}
