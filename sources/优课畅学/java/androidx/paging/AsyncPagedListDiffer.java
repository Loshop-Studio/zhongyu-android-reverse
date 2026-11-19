package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ArchTaskExecutor;
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
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p089e8.InterfaceC8379g;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8768a0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC8721a
/* loaded from: classes3.dex */
public class AsyncPagedListDiffer<T> {
    private final AsyncDifferConfig<T> config;
    private final CopyOnWriteArrayList<PagedListListener<T>> listeners;
    private final InterfaceC8379g loadStateListener;
    private final List<InterfaceC10574p> loadStateListeners;
    private final PagedList.LoadStateManager loadStateManager;
    private Executor mainThreadExecutor;
    private int maxScheduledGeneration;
    private PagedList<T> pagedList;
    private final PagedList.Callback pagedListCallback;
    private PagedList<T> snapshot;
    public ListUpdateCallback updateCallback;

    public static final class OnCurrentListChangedWrapper<T> implements PagedListListener<T> {
        private final InterfaceC10574p callback;

        public OnCurrentListChangedWrapper(InterfaceC10574p callback) {
            AbstractC9133u.m16133g(callback, "callback");
            this.callback = callback;
        }

        public final InterfaceC10574p getCallback() {
            return this.callback;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
        public void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2) {
            this.callback.invoke(pagedList, pagedList2);
        }
    }

    @InterfaceC8721a
    public interface PagedListListener<T> {
        void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2);
    }

    @InterfaceC8721a
    public AsyncPagedListDiffer(RecyclerView.Adapter<?> adapter, DiffUtil.ItemCallback<T> diffCallback) {
        AbstractC9133u.m16133g(adapter, "adapter");
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9133u.m16132f(mainThreadExecutor, "getMainThreadExecutor()");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type, LoadState state) {
                AbstractC9133u.m16133g(type, "type");
                AbstractC9133u.m16133g(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime_release().iterator();
                while (it.hasNext()) {
                    ((InterfaceC10574p) it.next()).invoke(type, state);
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
                this.this$0.getUpdateCallback$paging_runtime_release().onChanged(i10, i11, null);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime_release().onInserted(i10, i11);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime_release().onRemoved(i10, i11);
            }
        };
        setUpdateCallback$paging_runtime_release(new AdapterListUpdateCallback(adapter));
        AsyncDifferConfig<T> asyncDifferConfigBuild = new AsyncDifferConfig.Builder(diffCallback).build();
        AbstractC9133u.m16132f(asyncDifferConfigBuild, "Builder(diffCallback).build()");
        this.config = asyncDifferConfigBuild;
    }

    public static /* synthetic */ void getConfig$paging_runtime_release$annotations() {
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListeners$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getLoadStateManager$annotations() {
    }

    public static /* synthetic */ void getMaxScheduledGeneration$paging_runtime_release$annotations() {
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
    public static final void submitList$lambda$2(final PagedList pagedList, final PagedList newSnapshot, final AsyncPagedListDiffer this$0, final int i10, final PagedList pagedList2, final RecordingCallback recordingCallback, final Runnable runnable) {
        AbstractC9133u.m16133g(newSnapshot, "$newSnapshot");
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(recordingCallback, "$recordingCallback");
        PlaceholderPaddedList<T> placeholderPaddedList = pagedList.getPlaceholderPaddedList();
        PlaceholderPaddedList<T> placeholderPaddedList2 = newSnapshot.getPlaceholderPaddedList();
        DiffUtil.ItemCallback<T> diffCallback = this$0.config.getDiffCallback();
        AbstractC9133u.m16132f(diffCallback, "config.diffCallback");
        final PlaceholderPaddedDiffResult placeholderPaddedDiffResultComputeDiff = PlaceholderPaddedListDiffHelperKt.computeDiff(placeholderPaddedList, placeholderPaddedList2, diffCallback);
        this$0.mainThreadExecutor.execute(new Runnable() { // from class: androidx.paging.a
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.submitList$lambda$2$lambda$1(this.f1829a, i10, pagedList2, newSnapshot, placeholderPaddedDiffResultComputeDiff, recordingCallback, pagedList, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$2$lambda$1(AsyncPagedListDiffer this$0, int i10, PagedList pagedList, PagedList newSnapshot, PlaceholderPaddedDiffResult result, RecordingCallback recordingCallback, PagedList pagedList2, Runnable runnable) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(newSnapshot, "$newSnapshot");
        AbstractC9133u.m16133g(result, "$result");
        AbstractC9133u.m16133g(recordingCallback, "$recordingCallback");
        if (this$0.maxScheduledGeneration == i10) {
            this$0.latchPagedList$paging_runtime_release(pagedList, newSnapshot, result, recordingCallback, pagedList2.lastLoad(), runnable);
        }
    }

    public void addLoadStateListener(InterfaceC10574p listener) {
        AbstractC9133u.m16133g(listener, "listener");
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.addWeakLoadStateListener(listener);
        } else {
            this.loadStateManager.dispatchCurrentLoadState(listener);
        }
        this.loadStateListeners.add(listener);
    }

    public void addPagedListListener(PagedListListener<T> listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listeners.add(listener);
    }

    public final AsyncDifferConfig<T> getConfig$paging_runtime_release() {
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

    public final CopyOnWriteArrayList<PagedListListener<T>> getListeners$paging_runtime_release() {
        return this.listeners;
    }

    public final List<InterfaceC10574p> getLoadStateListeners$paging_runtime_release() {
        return this.loadStateListeners;
    }

    public final Executor getMainThreadExecutor$paging_runtime_release() {
        return this.mainThreadExecutor;
    }

    public final int getMaxScheduledGeneration$paging_runtime_release() {
        return this.maxScheduledGeneration;
    }

    public final ListUpdateCallback getUpdateCallback$paging_runtime_release() {
        ListUpdateCallback listUpdateCallback = this.updateCallback;
        if (listUpdateCallback != null) {
            return listUpdateCallback;
        }
        AbstractC9133u.m16151y("updateCallback");
        return null;
    }

    public final void latchPagedList$paging_runtime_release(PagedList<T> newList, PagedList<T> diffSnapshot, PlaceholderPaddedDiffResult diffResult, RecordingCallback recordingCallback, int i10, Runnable runnable) {
        AbstractC9133u.m16133g(newList, "newList");
        AbstractC9133u.m16133g(diffSnapshot, "diffSnapshot");
        AbstractC9133u.m16133g(diffResult, "diffResult");
        AbstractC9133u.m16133g(recordingCallback, "recordingCallback");
        PagedList<T> pagedList = this.snapshot;
        if (pagedList == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.pagedList = newList;
        newList.addWeakLoadStateListener((InterfaceC10574p) this.loadStateListener);
        this.snapshot = null;
        PlaceholderPaddedListDiffHelperKt.dispatchDiff(pagedList.getPlaceholderPaddedList(), getUpdateCallback$paging_runtime_release(), diffSnapshot.getPlaceholderPaddedList(), diffResult);
        recordingCallback.dispatchRecordingTo(this.pagedListCallback);
        newList.addWeakCallback(this.pagedListCallback);
        if (!newList.isEmpty()) {
            newList.loadAround(AbstractC8323h.m13518m(PlaceholderPaddedListDiffHelperKt.transformAnchorIndex(pagedList.getPlaceholderPaddedList(), diffResult, diffSnapshot.getPlaceholderPaddedList(), i10), 0, newList.size() - 1));
        }
        onCurrentListChanged(pagedList, this.pagedList, runnable);
    }

    public void removeLoadStateListener(InterfaceC10574p listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.loadStateListeners.remove(listener);
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.removeWeakLoadStateListener(listener);
        }
    }

    public void removePagedListListener(PagedListListener<T> listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void setMainThreadExecutor$paging_runtime_release(Executor executor) {
        AbstractC9133u.m16133g(executor, "<set-?>");
        this.mainThreadExecutor = executor;
    }

    public final void setMaxScheduledGeneration$paging_runtime_release(int i10) {
        this.maxScheduledGeneration = i10;
    }

    public final void setUpdateCallback$paging_runtime_release(ListUpdateCallback listUpdateCallback) {
        AbstractC9133u.m16133g(listUpdateCallback, "<set-?>");
        this.updateCallback = listUpdateCallback;
    }

    public void submitList(PagedList<T> pagedList) {
        submitList(pagedList, null);
    }

    public final void addPagedListListener(InterfaceC10574p callback) {
        AbstractC9133u.m16133g(callback, "callback");
        this.listeners.add(new OnCurrentListChangedWrapper(callback));
    }

    public final void removePagedListListener(final InterfaceC10574p callback) {
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC8768a0.m14490L(this.listeners, new InterfaceC10570l() { // from class: androidx.paging.AsyncPagedListDiffer.removePagedListListener.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(PagedListListener<T> pagedListListener) {
                return Boolean.valueOf((pagedListListener instanceof OnCurrentListChangedWrapper) && ((OnCurrentListChangedWrapper) pagedListListener).getCallback() == callback);
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
            pagedList2.removeWeakLoadStateListener((InterfaceC10574p) this.loadStateListener);
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
                pagedList2.removeWeakLoadStateListener((InterfaceC10574p) this.loadStateListener);
                this.pagedList = null;
            } else if (this.snapshot != null) {
                this.snapshot = null;
            }
            getUpdateCallback$paging_runtime_release().onRemoved(0, itemCount);
            onCurrentListChanged(currentList, null, runnable);
            return;
        }
        if (getCurrentList() == null) {
            this.pagedList = pagedList;
            pagedList.addWeakLoadStateListener((InterfaceC10574p) this.loadStateListener);
            pagedList.addWeakCallback(this.pagedListCallback);
            getUpdateCallback$paging_runtime_release().onInserted(0, pagedList.size());
            onCurrentListChanged(null, pagedList, runnable);
            return;
        }
        PagedList<T> pagedList3 = this.pagedList;
        if (pagedList3 != null) {
            pagedList3.removeWeakCallback(this.pagedListCallback);
            pagedList3.removeWeakLoadStateListener((InterfaceC10574p) this.loadStateListener);
            List<T> listSnapshot = pagedList3.snapshot();
            AbstractC9133u.m16131e(listSnapshot, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda$0>");
            this.snapshot = (PagedList) listSnapshot;
            this.pagedList = null;
        }
        final PagedList<T> pagedList4 = this.snapshot;
        if (pagedList4 == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        List<T> listSnapshot2 = pagedList.snapshot();
        AbstractC9133u.m16131e(listSnapshot2, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
        final PagedList pagedList5 = (PagedList) listSnapshot2;
        final RecordingCallback recordingCallback = new RecordingCallback();
        pagedList.addWeakCallback(recordingCallback);
        this.config.getBackgroundThreadExecutor().execute(new Runnable() { // from class: androidx.paging.b
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.submitList$lambda$2(pagedList4, pagedList5, this, i10, pagedList, recordingCallback, runnable);
            }
        });
    }

    @InterfaceC8721a
    public AsyncPagedListDiffer(ListUpdateCallback listUpdateCallback, AsyncDifferConfig<T> config) {
        AbstractC9133u.m16133g(listUpdateCallback, "listUpdateCallback");
        AbstractC9133u.m16133g(config, "config");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9133u.m16132f(mainThreadExecutor, "getMainThreadExecutor()");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type, LoadState state) {
                AbstractC9133u.m16133g(type, "type");
                AbstractC9133u.m16133g(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime_release().iterator();
                while (it.hasNext()) {
                    ((InterfaceC10574p) it.next()).invoke(type, state);
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
                this.this$0.getUpdateCallback$paging_runtime_release().onChanged(i10, i11, null);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime_release().onInserted(i10, i11);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int i10, int i11) {
                this.this$0.getUpdateCallback$paging_runtime_release().onRemoved(i10, i11);
            }
        };
        setUpdateCallback$paging_runtime_release(listUpdateCallback);
        this.config = config;
    }
}
