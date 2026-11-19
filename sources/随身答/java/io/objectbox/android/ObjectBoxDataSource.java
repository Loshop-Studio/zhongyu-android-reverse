package io.objectbox.android;

import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import io.objectbox.query.Query;
import java.util.Collections;
import java.util.List;
import p109f8.InterfaceC7948a;

/* loaded from: classes5.dex */
public class ObjectBoxDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: a */
    public final Query f14022a;

    /* renamed from: b */
    public final InterfaceC7948a f14023b;

    public static class Factory<Item> extends DataSource.Factory<Integer, Item> {

        /* renamed from: a */
        public final Query f14024a;

        @Override // androidx.paging.DataSource.Factory
        public DataSource create() {
            return new ObjectBoxDataSource(this.f14024a);
        }
    }

    /* renamed from: io.objectbox.android.ObjectBoxDataSource$a */
    public class C8180a implements InterfaceC7948a {
        public C8180a() {
        }

        @Override // p109f8.InterfaceC7948a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12363b(List list) {
            ObjectBoxDataSource.this.invalidate();
        }
    }

    public ObjectBoxDataSource(Query query) {
        this.f14022a = query;
        C8180a c8180a = new C8180a();
        this.f14023b = c8180a;
        query.m13157u().m12499b().m12500c().m12498a(c8180a);
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback loadInitialCallback) {
        int iCount = (int) this.f14022a.count();
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

    private List loadRange(int i9, int i10) {
        return this.f14022a.m13151o(i9, i10);
    }
}
