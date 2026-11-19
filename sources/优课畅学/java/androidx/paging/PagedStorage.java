package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class PagedStorage<T> extends AbstractList<T> implements LegacyPageFetcher.KeyProvider<Object>, PlaceholderPaddedList<T> {
    private boolean counted;
    private int dataCount;
    private int lastLoadAroundLocalIndex;
    private final List<PagingSource.LoadResult.Page<?, T>> pages;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private int positionOffset;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public interface Callback {
        void onInitialized(int i10);

        void onPageAppended(int i10, int i11, int i12);

        void onPagePrepended(int i10, int i11, int i12);

        void onPagesRemoved(int i10, int i11);

        void onPagesSwappedToPlaceholder(int i10, int i11);
    }

    public PagedStorage() {
        this.pages = new ArrayList();
        this.counted = true;
    }

    public static /* synthetic */ void appendPage$paging_common_release$default(PagedStorage pagedStorage, PagingSource.LoadResult.Page page, Callback callback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            callback = null;
        }
        pagedStorage.appendPage$paging_common_release(page, callback);
    }

    private final void init(int i10, PagingSource.LoadResult.Page<?, T> page, int i11, int i12, boolean z10) {
        this.placeholdersBefore = i10;
        this.pages.clear();
        this.pages.add(page);
        this.placeholdersAfter = i11;
        this.positionOffset = i12;
        this.dataCount = page.getData().size();
        this.counted = z10;
        this.lastLoadAroundLocalIndex = page.getData().size() / 2;
    }

    public static /* synthetic */ void init$default(PagedStorage pagedStorage, int i10, PagingSource.LoadResult.Page page, int i11, int i12, Callback callback, boolean z10, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        pagedStorage.init(i10, page, i11, i12, callback, z10);
    }

    private final boolean needsTrim(int i10, int i11, int i12) {
        return getDataCount() > i10 && this.pages.size() > 2 && getDataCount() - this.pages.get(i12).getData().size() >= i11;
    }

    public static /* synthetic */ void prependPage$paging_common_release$default(PagedStorage pagedStorage, PagingSource.LoadResult.Page page, Callback callback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            callback = null;
        }
        pagedStorage.prependPage$paging_common_release(page, callback);
    }

    private final <V> V traversePages(int i10, InterfaceC10574p interfaceC10574p) {
        int size = this.pages.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.pages.get(i11).getData().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return (V) interfaceC10574p.invoke(this.pages.get(i11), Integer.valueOf(i10));
    }

    public final void appendPage$paging_common_release(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        AbstractC9133u.m16133g(page, "page");
        int size = page.getData().size();
        if (size == 0) {
            return;
        }
        this.pages.add(page);
        this.dataCount = getDataCount() + size;
        int iMin = Math.min(getPlaceholdersAfter(), size);
        int i10 = size - iMin;
        if (iMin != 0) {
            this.placeholdersAfter = getPlaceholdersAfter() - iMin;
        }
        if (callback != null) {
            callback.onPageAppended((getPlaceholdersBefore() + getDataCount()) - size, iMin, i10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        int placeholdersBefore = i10 - getPlaceholdersBefore();
        if (i10 >= 0 && i10 < size()) {
            if (placeholdersBefore < 0 || placeholdersBefore >= getDataCount()) {
                return null;
            }
            return getItem(placeholdersBefore);
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + size());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getDataCount() {
        return this.dataCount;
    }

    public final T getFirstLoadedItem$paging_common_release() {
        return (T) AbstractC8778f0.m14566l0(((PagingSource.LoadResult.Page) AbstractC8778f0.m14566l0(this.pages)).getData());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public T getItem(int i10) {
        int size = this.pages.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.pages.get(i11).getData().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return this.pages.get(i11).getData().get(i10);
    }

    public final int getLastLoadAroundIndex() {
        return getPlaceholdersBefore() + this.lastLoadAroundLocalIndex;
    }

    public final T getLastLoadedItem$paging_common_release() {
        return (T) AbstractC8778f0.m14578x0(((PagingSource.LoadResult.Page) AbstractC8778f0.m14578x0(this.pages)).getData());
    }

    public final int getMiddleOfLoadedRange() {
        return getPlaceholdersBefore() + (getDataCount() / 2);
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public Object getNextKey() {
        if (!this.counted || getPlaceholdersAfter() > 0) {
            return ((PagingSource.LoadResult.Page) AbstractC8778f0.m14578x0(this.pages)).getNextKey();
        }
        return null;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public final int getPositionOffset() {
        return this.positionOffset;
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public Object getPrevKey() {
        if (!this.counted || getPlaceholdersBefore() + this.positionOffset > 0) {
            return ((PagingSource.LoadResult.Page) AbstractC8778f0.m14566l0(this.pages)).getPrevKey();
        }
        return null;
    }

    public final PagingState<?, T> getRefreshKeyInfo(PagedList.Config config) {
        AbstractC9133u.m16133g(config, "config");
        if (this.pages.isEmpty()) {
            return null;
        }
        List listM14544U0 = AbstractC8778f0.m14544U0(this.pages);
        AbstractC9133u.m16131e(listM14544U0, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
        return new PagingState<>(listM14544U0, Integer.valueOf(getLastLoadAroundIndex()), new PagingConfig(config.pageSize, config.prefetchDistance, config.enablePlaceholders, config.initialLoadSizeHint, config.maxSize, 0, 32, null), getPlaceholdersBefore());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getSize() {
        return getPlaceholdersBefore() + getDataCount() + getPlaceholdersAfter();
    }

    public final boolean needsTrimFromEnd(int i10, int i11) {
        return needsTrim(i10, i11, this.pages.size() - 1);
    }

    public final boolean needsTrimFromFront(int i10, int i11) {
        return needsTrim(i10, i11, 0);
    }

    public final void prependPage$paging_common_release(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        AbstractC9133u.m16133g(page, "page");
        int size = page.getData().size();
        if (size == 0) {
            return;
        }
        this.pages.add(0, page);
        this.dataCount = getDataCount() + size;
        int iMin = Math.min(getPlaceholdersBefore(), size);
        int i10 = size - iMin;
        if (iMin != 0) {
            this.placeholdersBefore = getPlaceholdersBefore() - iMin;
        }
        this.positionOffset -= i10;
        if (callback != null) {
            callback.onPagePrepended(getPlaceholdersBefore(), iMin, i10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) removeAt(i10);
    }

    public /* bridge */ Object removeAt(int i10) {
        return super.remove(i10);
    }

    public final void setLastLoadAroundIndex(int i10) {
        this.lastLoadAroundLocalIndex = AbstractC8323h.m13518m(i10 - getPlaceholdersBefore(), 0, getDataCount() - 1);
    }

    public final boolean shouldPreTrimNewPage(int i10, int i11, int i12) {
        return getDataCount() + i12 > i10 && this.pages.size() > 1 && getDataCount() >= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final PagedStorage<T> snapshot() {
        return new PagedStorage<>(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "leading " + getPlaceholdersBefore() + ", dataCount " + getDataCount() + ", trailing " + getPlaceholdersAfter() + ' ' + AbstractC8778f0.m14576v0(this.pages, " ", null, null, 0, null, null, 62, null);
    }

    public final boolean trimFromEnd$paging_common_release(boolean z10, int i10, int i11, Callback callback) {
        AbstractC9133u.m16133g(callback, "callback");
        int i12 = 0;
        while (needsTrimFromEnd(i10, i11)) {
            List<PagingSource.LoadResult.Page<?, T>> list = this.pages;
            int size = list.remove(list.size() - 1).getData().size();
            i12 += size;
            this.dataCount = getDataCount() - size;
        }
        this.lastLoadAroundLocalIndex = AbstractC8323h.m13513h(this.lastLoadAroundLocalIndex, getDataCount() - 1);
        if (i12 > 0) {
            int placeholdersBefore = getPlaceholdersBefore() + getDataCount();
            if (z10) {
                this.placeholdersAfter = getPlaceholdersAfter() + i12;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i12);
            } else {
                callback.onPagesRemoved(placeholdersBefore, i12);
            }
        }
        return i12 > 0;
    }

    public final boolean trimFromFront$paging_common_release(boolean z10, int i10, int i11, Callback callback) {
        AbstractC9133u.m16133g(callback, "callback");
        int i12 = 0;
        while (needsTrimFromFront(i10, i11)) {
            int size = this.pages.remove(0).getData().size();
            i12 += size;
            this.dataCount = getDataCount() - size;
        }
        this.lastLoadAroundLocalIndex = AbstractC8323h.m13510e(this.lastLoadAroundLocalIndex - i12, 0);
        if (i12 > 0) {
            if (z10) {
                int placeholdersBefore = getPlaceholdersBefore();
                this.placeholdersBefore = getPlaceholdersBefore() + i12;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i12);
            } else {
                this.positionOffset += i12;
                callback.onPagesRemoved(getPlaceholdersBefore(), i12);
            }
        }
        return i12 > 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagedStorage(int i10, PagingSource.LoadResult.Page<?, T> page, int i11) {
        this();
        AbstractC9133u.m16133g(page, "page");
        init(i10, page, i11, 0, true);
    }

    private PagedStorage(PagedStorage<T> pagedStorage) {
        ArrayList arrayList = new ArrayList();
        this.pages = arrayList;
        this.counted = true;
        arrayList.addAll(pagedStorage.pages);
        this.placeholdersBefore = pagedStorage.getPlaceholdersBefore();
        this.placeholdersAfter = pagedStorage.getPlaceholdersAfter();
        this.positionOffset = pagedStorage.positionOffset;
        this.counted = pagedStorage.counted;
        this.dataCount = pagedStorage.getDataCount();
        this.lastLoadAroundLocalIndex = pagedStorage.lastLoadAroundLocalIndex;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void init(int i10, PagingSource.LoadResult.Page<?, T> page, int i11, int i12, Callback callback, boolean z10) {
        AbstractC9133u.m16133g(page, "page");
        AbstractC9133u.m16133g(callback, "callback");
        init(i10, page, i11, i12, z10);
        callback.onInitialized(size());
    }
}
