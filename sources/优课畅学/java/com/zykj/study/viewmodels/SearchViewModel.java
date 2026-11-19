package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.base.BaseViewModel;
import com.zykj.study.data.SearchHistoryEntity;
import com.zykj.study.repository.SearchHistoryRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p135i8.AbstractC8836g;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p253t4.C10098g;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SearchViewModel extends BaseViewModel {

    /* renamed from: a */
    public final SearchHistoryRepository f14344a;

    /* renamed from: b */
    public final C10098g f14345b;

    /* renamed from: c */
    public final DataStore f14346c;

    /* renamed from: d */
    public final MutableLiveData f14347d;

    /* renamed from: e */
    public final MutableLiveData f14348e;

    /* renamed from: f */
    public final InterfaceC9266c f14349f;

    public SearchViewModel(SearchHistoryRepository historyRepository, C10098g repository, DataStore userDataStore) {
        AbstractC9133u.m16133g(historyRepository, "historyRepository");
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        this.f14344a = historyRepository;
        this.f14345b = repository;
        this.f14346c = userDataStore;
        this.f14347d = new MutableLiveData();
        MutableLiveData mutableLiveData = new MutableLiveData("");
        this.f14348e = mutableLiveData;
        this.f14349f = CachedPagingDataKt.cachedIn(AbstractC9268e.m17009U(FlowLiveDataConversions.asFlow(mutableLiveData), new SearchViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12244i(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.viewmodels.SearchViewModel$getUserId$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.viewmodels.SearchViewModel$getUserId$1 r0 = (com.zykj.study.viewmodels.SearchViewModel$getUserId$1) r0
            int r1 = r0.f14363c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14363c = r1
            goto L18
        L13:
            com.zykj.study.viewmodels.SearchViewModel$getUserId$1 r0 = new com.zykj.study.viewmodels.SearchViewModel$getUserId$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f14361a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f14363c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            androidx.datastore.core.DataStore r5 = r4.f14346c
            l8.c r5 = r5.getData()
            r0.f14363c = r3
            java.lang.Object r5 = p169l8.AbstractC9268e.m17036z(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.zykj.lib.login.proto.UserBean r5 = (com.zykj.lib.login.proto.UserBean) r5
            if (r5 == 0) goto L4f
            java.lang.String r5 = r5.getId()
            if (r5 != 0) goto L4e
            goto L4f
        L4e:
            return r5
        L4f:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.SearchViewModel.m12244i(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/SearchViewModel.smali:178
    }

    /* renamed from: b */
    public final void m12245b() {
        BaseViewModel.launch$default(this, null, null, new SearchViewModel$clearHistory$1(this, null), 3, null);
    }

    /* renamed from: c */
    public final void m12246c(SearchHistoryEntity item) {
        AbstractC9133u.m16133g(item, "item");
        BaseViewModel.launch$default(this, null, null, new SearchViewModel$deleteHistory$1(this, item, null), 3, null);
    }

    /* renamed from: d */
    public final SearchHistoryRepository m12247d() {
        return this.f14344a;
    }

    /* renamed from: e */
    public final C10098g m12248e() {
        return this.f14345b;
    }

    /* renamed from: f */
    public final MutableLiveData m12249f() {
        return this.f14347d;
    }

    /* renamed from: g */
    public final MutableLiveData m12250g() {
        return this.f14348e;
    }

    /* renamed from: h */
    public final InterfaceC9266c m12251h() {
        return this.f14349f;
    }

    /* renamed from: j */
    public final LiveData m12252j() {
        return (LiveData) AbstractC8836g.m14852b(null, new SearchViewModel$initHistoryList$1(this, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m12253k() {
        String string;
        String str = (String) this.f14347d.getValue();
        if (str == null || (string = AbstractC8661c0.m13982W0(str).toString()) == null || string.length() <= 0) {
            return;
        }
        this.f14348e.setValue(string);
        BaseViewModel.launch$default(this, null, null, new SearchViewModel$search$1$1(this, string, null), 3, null);
    }
}
