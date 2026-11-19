package androidx.paging;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$LoadStateListenerRunnable$1 implements Runnable {
    private AtomicReference<CombinedLoadStates> loadState = new AtomicReference<>(null);
    final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

    public AsyncPagingDataDiffer$LoadStateListenerRunnable$1(AsyncPagingDataDiffer<T> asyncPagingDataDiffer) {
        this.this$0 = asyncPagingDataDiffer;
    }

    public final AtomicReference<CombinedLoadStates> getLoadState() {
        return this.loadState;
    }

    @Override // java.lang.Runnable
    public void run() {
        CombinedLoadStates combinedLoadStates = this.loadState.get();
        if (combinedLoadStates != null) {
            Iterator it = ((AsyncPagingDataDiffer) this.this$0).childLoadStateListeners.iterator();
            while (it.hasNext()) {
                ((InterfaceC9540l) it.next()).invoke(combinedLoadStates);
            }
        }
    }

    public final void setLoadState(AtomicReference<CombinedLoadStates> atomicReference) {
        AbstractC9979u.m20294g(atomicReference, "<set-?>");
        this.loadState = atomicReference;
    }
}
