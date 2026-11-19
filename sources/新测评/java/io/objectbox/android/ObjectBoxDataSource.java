package io.objectbox.android;

import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import io.objectbox.query.Query;
import java.util.Collections;
import java.util.List;
import p258u8.InterfaceC9589a;

/* loaded from: classes5.dex */
public class ObjectBoxDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: a */
    public final Query f13208a;

    /* renamed from: b */
    public final InterfaceC9589a f13209b;

    public static class Factory<Item> extends DataSource.Factory<Integer, Item> {

        /* renamed from: a */
        public final Query f13210a;

        @Override // androidx.paging.DataSource.Factory
        public DataSource create() {
            return new ObjectBoxDataSource(this.f13210a);
        }
    }

    /* renamed from: io.objectbox.android.ObjectBoxDataSource$a */
    public class C7751a implements InterfaceC9589a {
        public C7751a() {
        }

        @Override // p258u8.InterfaceC9589a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13021b(List list) {
            ObjectBoxDataSource.this.invalidate();
        }
    }

    public ObjectBoxDataSource(Query query) {
        this.f13208a = query;
        C7751a c7751a = new C7751a();
        this.f13209b = c7751a;
        query.m13038u().m15988b().m15989c().m15987a(c7751a);
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback loadInitialCallback) {
        int iCount = (int) this.f13208a.count();
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
        return this.f13208a.m13032o(i10, i11);
    }
}
