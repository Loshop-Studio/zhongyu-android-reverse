package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.AsyncPagedListDiffer;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p280od.InterfaceC10473g;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10937b0;

@InterfaceC10770a
/* loaded from: classes3.dex */
public class AsyncPagedListDiffer<T> {
    private final AsyncDifferConfig<T> config;
    private final CopyOnWriteArrayList<PagedListListener<T>> listeners;
    private final InterfaceC10473g loadStateListener;
    private final List<InterfaceC9544p> loadStateListeners;
    private final PagedList.LoadStateManager loadStateManager;
    private Executor mainThreadExecutor;
    private int maxScheduledGeneration;
    private PagedList<T> pagedList;
    private final PagedList.Callback pagedListCallback;
    private PagedList<T> snapshot;
    public ListUpdateCallback updateCallback;

    public static final class OnCurrentListChangedWrapper<T> implements PagedListListener<T> {
        private final InterfaceC9544p callback;

        public OnCurrentListChangedWrapper(InterfaceC9544p callback) {
            AbstractC9979u.m20294g(callback, "callback");
            this.callback = callback;
        }

        public final InterfaceC9544p getCallback() {
            return this.callback;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
        public void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2) {
            this.callback.invoke(pagedList, pagedList2);
        }
    }

    @InterfaceC10770a
    public interface PagedListListener<T> {
        void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2);
    }

    @InterfaceC10770a
    public AsyncPagedListDiffer(RecyclerView.Adapter<?> adapter, DiffUtil.ItemCallback<T> diffCallback) {
        AbstractC9979u.m20294g(adapter, "adapter");
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9979u.m20293f(mainThreadExecutor, "getMainThreadExecutor(...)");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type, LoadState state) {
                AbstractC9979u.m20294g(type, "type");
                AbstractC9979u.m20294g(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime().iterator();
                while (it.hasNext()) {
                    ((InterfaceC9544p) it.next()).invoke(type, state);
                }
            }
        };
        this.loadStateManager = loadStateManager;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(loadStateManager);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new PagedList.Callback(this) { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.Callback
            public void onChanged(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime().onChanged(i10, i11, null);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime().onInserted(i10, i11);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime().onRemoved(i10, i11);
            }
        };
        setUpdateCallback$paging_runtime(new AdapterListUpdateCallback(adapter));
        AsyncDifferConfig<T> asyncDifferConfigBuild = new AsyncDifferConfig.Builder(diffCallback).build();
        AbstractC9979u.m20293f(asyncDifferConfigBuild, "build(...)");
        this.config = asyncDifferConfigBuild;
    }

    public static /* synthetic */ void getConfig$paging_runtime$annotations() {
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListeners$paging_runtime$annotations() {
    }

    private static /* synthetic */ void getLoadStateManager$annotations() {
    }

    public static /* synthetic */ void getMaxScheduledGeneration$paging_runtime$annotations() {
    }

    private static /* synthetic */ void getPagedList$annotations() {
    }

    private static /* synthetic */ void getPagedListCallback$annotations() {
    }

    private static /* synthetic */ void getSnapshot$annotations() {
    }

    private final void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2, Runnable runnable) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((PagedListListener) it.next()).onCurrentListChanged(pagedList, pagedList2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removePagedListListener$lambda$0(InterfaceC9544p interfaceC9544p, PagedListListener pagedListListener) {
        return (pagedListListener instanceof OnCurrentListChangedWrapper) && ((OnCurrentListChangedWrapper) pagedListListener).getCallback() == interfaceC9544p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$1(final PagedList pagedList, final PagedList pagedList2, final AsyncPagedListDiffer asyncPagedListDiffer, final int i10, final PagedList pagedList3, final RecordingCallback recordingCallback, final Runnable runnable) {
        PlaceholderPaddedList<T> placeholderPaddedList = pagedList.getPlaceholderPaddedList();
        PlaceholderPaddedList<T> placeholderPaddedList2 = pagedList2.getPlaceholderPaddedList();
        DiffUtil.ItemCallback<T> diffCallback = asyncPagedListDiffer.config.getDiffCallback();
        AbstractC9979u.m20293f(diffCallback, "getDiffCallback(...)");
        final PlaceholderPaddedDiffResult placeholderPaddedDiffResultComputeDiff = PlaceholderPaddedListDiffHelperKt.computeDiff(placeholderPaddedList, placeholderPaddedList2, diffCallback);
        asyncPagedListDiffer.mainThreadExecutor.execute(new Runnable() { // from class: androidx.paging.c
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.submitList$lambda$1$0(this.f1895c, i10, pagedList3, pagedList2, placeholderPaddedDiffResultComputeDiff, recordingCallback, pagedList, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$1$0(AsyncPagedListDiffer asyncPagedListDiffer, int i10, PagedList pagedList, PagedList pagedList2, PlaceholderPaddedDiffResult placeholderPaddedDiffResult, RecordingCallback recordingCallback, PagedList pagedList3, Runnable runnable) {
        if (asyncPagedListDiffer.maxScheduledGeneration == i10) {
            asyncPagedListDiffer.latchPagedList$paging_runtime(pagedList, pagedList2, placeholderPaddedDiffResult, recordingCallback, pagedList3.lastLoad(), runnable);
        }
    }

    public void addLoadStateListener(InterfaceC9544p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.addWeakLoadStateListener(listener);
        } else {
            this.loadStateManager.dispatchCurrentLoadState(listener);
        }
        this.loadStateListeners.add(listener);
    }

    public void addPagedListListener(PagedListListener<T> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.listeners.add(listener);
    }

    public final AsyncDifferConfig<T> getConfig$paging_runtime() {
        return this.config;
    }

    public PagedList<T> getCurrentList() {
        PagedList<T> pagedList = this.snapshot;
        return pagedList == null ? this.pagedList : pagedList;
    }

    public T getItem(int i10) {
        PagedList<T> pagedList = this.snapshot;
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList != null) {
            return pagedList.get(i10);
        }
        if (pagedList2 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        pagedList2.loadAround(i10);
        return pagedList2.get(i10);
    }

    public int getItemCount() {
        PagedList<T> currentList = getCurrentList();
        if (currentList != null) {
            return currentList.size();
        }
        return 0;
    }

    public final CopyOnWriteArrayList<PagedListListener<T>> getListeners$paging_runtime() {
        return this.listeners;
    }

    public final List<InterfaceC9544p> getLoadStateListeners$paging_runtime() {
        return this.loadStateListeners;
    }

    public final Executor getMainThreadExecutor$paging_runtime() {
        return this.mainThreadExecutor;
    }

    public final int getMaxScheduledGeneration$paging_runtime() {
        return this.maxScheduledGeneration;
    }

    public final ListUpdateCallback getUpdateCallback$paging_runtime() {
        ListUpdateCallback listUpdateCallback = this.updateCallback;
        if (listUpdateCallback != null) {
            return listUpdateCallback;
        }
        AbstractC9979u.m20312y("updateCallback");
        return null;
    }

    public final void latchPagedList$paging_runtime(PagedList<T> newList, PagedList<T> diffSnapshot, PlaceholderPaddedDiffResult diffResult, RecordingCallback recordingCallback, int i10, Runnable runnable) {
        AbstractC9979u.m20294g(newList, "newList");
        AbstractC9979u.m20294g(diffSnapshot, "diffSnapshot");
        AbstractC9979u.m20294g(diffResult, "diffResult");
        AbstractC9979u.m20294g(recordingCallback, "recordingCallback");
        PagedList<T> pagedList = this.snapshot;
        if (pagedList == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.pagedList = newList;
        newList.addWeakLoadStateListener((InterfaceC9544p) this.loadStateListener);
        this.snapshot = null;
        PlaceholderPaddedListDiffHelperKt.dispatchDiff(pagedList.getPlaceholderPaddedList(), getUpdateCallback$paging_runtime(), diffSnapshot.getPlaceholderPaddedList(), diffResult);
        recordingCallback.dispatchRecordingTo(this.pagedListCallback);
        newList.addWeakCallback(this.pagedListCallback);
        if (!newList.isEmpty()) {
            newList.loadAround(AbstractC10410o.m21761n(PlaceholderPaddedListDiffHelperKt.transformAnchorIndex(pagedList.getPlaceholderPaddedList(), diffResult, diffSnapshot.getPlaceholderPaddedList(), i10), 0, newList.size() - 1));
        }
        onCurrentListChanged(pagedList, this.pagedList, runnable);
    }

    public void removeLoadStateListener(InterfaceC9544p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.loadStateListeners.remove(listener);
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.removeWeakLoadStateListener(listener);
        }
    }

    public void removePagedListListener(PagedListListener<T> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void setMainThreadExecutor$paging_runtime(Executor executor) {
        AbstractC9979u.m20294g(executor, "<set-?>");
        this.mainThreadExecutor = executor;
    }

    public final void setMaxScheduledGeneration$paging_runtime(int i10) {
        this.maxScheduledGeneration = i10;
    }

    public final void setUpdateCallback$paging_runtime(ListUpdateCallback listUpdateCallback) {
        AbstractC9979u.m20294g(listUpdateCallback, "<set-?>");
        this.updateCallback = listUpdateCallback;
    }

    public void submitList(PagedList<T> pagedList) {
        submitList(pagedList, null);
    }

    public final void addPagedListListener(InterfaceC9544p callback) {
        AbstractC9979u.m20294g(callback, "callback");
        this.listeners.add(new OnCurrentListChangedWrapper(callback));
    }

    public final void removePagedListListener(final InterfaceC9544p callback) {
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC10937b0.m23867L(this.listeners, new InterfaceC9540l() { // from class: androidx.paging.b
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AsyncPagedListDiffer.removePagedListListener$lambda$0(callback, (AsyncPagedListDiffer.PagedListListener) obj));
            }
        });
    }

    public void submitList(final PagedList<T> pagedList, final Runnable runnable) {
        final int i10 = this.maxScheduledGeneration + 1;
        this.maxScheduledGeneration = i10;
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList == pagedList2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (pagedList2 != null && (pagedList instanceof InitialPagedList)) {
            pagedList2.removeWeakCallback(this.pagedListCallback);
            pagedList2.removeWeakLoadStateListener((InterfaceC9544p) this.loadStateListener);
            this.loadStateManager.setState(LoadType.REFRESH, LoadState.Loading.INSTANCE);
            this.loadStateManager.setState(LoadType.PREPEND, new LoadState.NotLoading(false));
            this.loadStateManager.setState(LoadType.APPEND, new LoadState.NotLoading(false));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        PagedList<T> currentList = getCurrentList();
        if (pagedList == null) {
            int itemCount = getItemCount();
            if (pagedList2 != null) {
                pagedList2.removeWeakCallback(this.pagedListCallback);
                pagedList2.removeWeakLoadStateListener((InterfaceC9544p) this.loadStateListener);
                this.pagedList = null;
            } else if (this.snapshot != null) {
                this.snapshot = null;
            }
            getUpdateCallback$paging_runtime().onRemoved(0, itemCount);
            onCurrentListChanged(currentList, null, runnable);
            return;
        }
        if (getCurrentList() == null) {
            this.pagedList = pagedList;
            pagedList.addWeakLoadStateListener((InterfaceC9544p) this.loadStateListener);
            pagedList.addWeakCallback(this.pagedListCallback);
            getUpdateCallback$paging_runtime().onInserted(0, pagedList.size());
            onCurrentListChanged(null, pagedList, runnable);
            return;
        }
        PagedList<T> pagedList3 = this.pagedList;
        if (pagedList3 != null) {
            pagedList3.removeWeakCallback(this.pagedListCallback);
            pagedList3.removeWeakLoadStateListener((InterfaceC9544p) this.loadStateListener);
            List<T> listSnapshot = pagedList3.snapshot();
            AbstractC9979u.m20292e(listSnapshot, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
            this.snapshot = (PagedList) listSnapshot;
            this.pagedList = null;
        }
        final PagedList<T> pagedList4 = this.snapshot;
        if (pagedList4 == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        List<T> listSnapshot2 = pagedList.snapshot();
        AbstractC9979u.m20292e(listSnapshot2, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
        final PagedList pagedList5 = (PagedList) listSnapshot2;
        final RecordingCallback recordingCallback = new RecordingCallback();
        pagedList.addWeakCallback(recordingCallback);
        this.config.getBackgroundThreadExecutor().execute(new Runnable() { // from class: androidx.paging.d
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.submitList$lambda$1(pagedList4, pagedList5, this, i10, pagedList, recordingCallback, runnable);
            }
        });
    }

    @InterfaceC10770a
    public AsyncPagedListDiffer(ListUpdateCallback listUpdateCallback, AsyncDifferConfig<T> config) {
        AbstractC9979u.m20294g(listUpdateCallback, "listUpdateCallback");
        AbstractC9979u.m20294g(config, "config");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9979u.m20293f(mainThreadExecutor, "getMainThreadExecutor(...)");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type, LoadState state) {
                AbstractC9979u.m20294g(type, "type");
                AbstractC9979u.m20294g(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime().iterator();
                while (it.hasNext()) {
                    ((InterfaceC9544p) it.next()).invoke(type, state);
                }
            }
        };
        this.loadStateManager = loadStateManager;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(loadStateManager);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new PagedList.Callback(this) { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.Callback
            public void onChanged(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime().onChanged(i10, i11, null);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime().onInserted(i10, i11);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime().onRemoved(i10, i11);
            }
        };
        setUpdateCallback$paging_runtime(listUpdateCallback);
        this.config = config;
    }
}
