package io.objectbox.android;

import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import io.objectbox.query.Query;
import java.util.Collections;
import java.util.List;
import nc.InterfaceC10388a;

/* loaded from: classes6.dex */
public class ObjectBoxDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: a */
    public final Query f22281a;

    /* renamed from: b */
    public final InterfaceC10388a f22282b;

    public static class Factory<Item> extends DataSource.Factory<Integer, Item> {

        /* renamed from: a */
        public final Query f22283a;

        @Override // androidx.paging.DataSource.Factory
        public DataSource create() {
            return new ObjectBoxDataSource(this.f22283a);
        }
    }

    /* renamed from: io.objectbox.android.ObjectBoxDataSource$a */
    public class C9646a implements InterfaceC10388a {
        public C9646a() {
        }

        @Override // nc.InterfaceC10388a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo18993b(List list) {
            ObjectBoxDataSource.this.invalidate();
        }
    }

    public ObjectBoxDataSource(Query query) {
        this.f22281a = query;
        C9646a c9646a = new C9646a();
        this.f22282b = c9646a;
        query.m19010u().m21717b().m21718c().m21716a(c9646a);
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback loadInitialCallback) {
        int iCount = (int) this.f22281a.count();
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
        return this.f22281a.m19004m(i10, i11);
    }
}
