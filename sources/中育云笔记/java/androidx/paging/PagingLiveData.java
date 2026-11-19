package androidx.paging;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import sd.InterfaceC11122i0;

/* loaded from: classes3.dex */
public final class PagingLiveData {
    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, Lifecycle lifecycle) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(lifecycle, "lifecycle");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), LifecycleKt.getCoroutineScope(lifecycle)), (InterfaceC9945d) null, 0L, 3, (Object) null);
    }

    public static final <Key, Value> LiveData<PagingData<Value>> getLiveData(Pager<Key, Value> pager) {
        AbstractC9979u.m20294g(pager, "<this>");
        return FlowLiveDataConversions.asLiveData$default(pager.getFlow(), (InterfaceC9945d) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, ViewModel viewModel) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(viewModel, "viewModel");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), ViewModelKt.getViewModelScope(viewModel)), (InterfaceC9945d) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, InterfaceC11122i0 scope) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(scope, "scope");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), scope), (InterfaceC9945d) null, 0L, 3, (Object) null);
    }
}
