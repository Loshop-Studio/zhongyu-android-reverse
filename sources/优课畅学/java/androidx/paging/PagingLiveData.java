package androidx.paging;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8822b0;

/* loaded from: classes3.dex */
public final class PagingLiveData {
    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, Lifecycle lifecycle) {
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(lifecycle, "lifecycle");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), LifecycleKt.getCoroutineScope(lifecycle)), (InterfaceC9100d) null, 0L, 3, (Object) null);
    }

    public static final <Key, Value> LiveData<PagingData<Value>> getLiveData(Pager<Key, Value> pager) {
        AbstractC9133u.m16133g(pager, "<this>");
        return FlowLiveDataConversions.asLiveData$default(pager.getFlow(), (InterfaceC9100d) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, ViewModel viewModel) {
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(viewModel, "viewModel");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), ViewModelKt.getViewModelScope(viewModel)), (InterfaceC9100d) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(scope, "scope");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), scope), (InterfaceC9100d) null, 0L, 3, (Object) null);
    }
}
