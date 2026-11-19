package androidx.paging;

import androidx.annotation.IntRange;
import androidx.paging.PagingSource;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class PagingState<Key, Value> {
    private final Integer anchorPosition;
    private final PagingConfig config;
    private final int leadingPlaceholderCount;
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;

    public PagingState(List<PagingSource.LoadResult.Page<Key, Value>> pages, Integer num, PagingConfig config, @IntRange(from = 0) int i10) {
        AbstractC9133u.m16133g(pages, "pages");
        AbstractC9133u.m16133g(config, "config");
        this.pages = pages;
        this.anchorPosition = num;
        this.config = config;
        this.leadingPlaceholderCount = i10;
    }

    public final <T> T anchorPositionToPagedIndices$paging_common_release(int i10, InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        int size = i10 - this.leadingPlaceholderCount;
        int i11 = 0;
        while (i11 < AbstractC8809v.m14773p(getPages()) && size > AbstractC8809v.m14773p(getPages().get(i11).getData())) {
            size -= getPages().get(i11).getData().size();
            i11++;
        }
        return (T) block.invoke(Integer.valueOf(i11), Integer.valueOf(size));
    }

    public final Value closestItemToPosition(int i10) {
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        if (list != null && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                int size = i10 - this.leadingPlaceholderCount;
                int i11 = 0;
                while (i11 < AbstractC8809v.m14773p(getPages()) && size > AbstractC8809v.m14773p(getPages().get(i11).getData())) {
                    size -= getPages().get(i11).getData().size();
                    i11++;
                }
                Iterator<T> it2 = this.pages.iterator();
                while (it2.hasNext()) {
                    PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) it2.next();
                    if (!page.getData().isEmpty()) {
                        List<PagingSource.LoadResult.Page<Key, Value>> list2 = this.pages;
                        ListIterator<PagingSource.LoadResult.Page<Key, Value>> listIterator = list2.listIterator(list2.size());
                        while (listIterator.hasPrevious()) {
                            PagingSource.LoadResult.Page<Key, Value> pagePrevious = listIterator.previous();
                            if (!pagePrevious.getData().isEmpty()) {
                                return size < 0 ? (Value) AbstractC8778f0.m14566l0(page.getData()) : (i11 != AbstractC8809v.m14773p(this.pages) || size <= AbstractC8809v.m14773p(((PagingSource.LoadResult.Page) AbstractC8778f0.m14578x0(this.pages)).getData())) ? this.pages.get(i11).getData().get(size) : (Value) AbstractC8778f0.m14578x0(pagePrevious.getData());
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return null;
    }

    public final PagingSource.LoadResult.Page<Key, Value> closestPageToPosition(int i10) {
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        if (list != null && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                int size = i10 - this.leadingPlaceholderCount;
                int i11 = 0;
                while (i11 < AbstractC8809v.m14773p(getPages()) && size > AbstractC8809v.m14773p(getPages().get(i11).getData())) {
                    size -= getPages().get(i11).getData().size();
                    i11++;
                }
                return size < 0 ? (PagingSource.LoadResult.Page) AbstractC8778f0.m14566l0(this.pages) : this.pages.get(i11);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) obj;
        return AbstractC9133u.m16128b(this.pages, pagingState.pages) && AbstractC9133u.m16128b(this.anchorPosition, pagingState.anchorPosition) && AbstractC9133u.m16128b(this.config, pagingState.config) && this.leadingPlaceholderCount == pagingState.leadingPlaceholderCount;
    }

    public final Value firstItemOrNull() {
        Object next;
        List<Value> data;
        Iterator<T> it = this.pages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((PagingSource.LoadResult.Page) next).getData().isEmpty()) {
                break;
            }
        }
        PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) next;
        if (page == null || (data = page.getData()) == null) {
            return null;
        }
        return (Value) AbstractC8778f0.m14568n0(data);
    }

    public final Integer getAnchorPosition() {
        return this.anchorPosition;
    }

    public final PagingConfig getConfig() {
        return this.config;
    }

    public final List<PagingSource.LoadResult.Page<Key, Value>> getPages() {
        return this.pages;
    }

    public int hashCode() {
        int iHashCode = this.pages.hashCode();
        Integer num = this.anchorPosition;
        return iHashCode + (num != null ? num.hashCode() : 0) + this.config.hashCode() + Integer.hashCode(this.leadingPlaceholderCount);
    }

    public final boolean isEmpty() {
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final Value lastItemOrNull() {
        PagingSource.LoadResult.Page<Key, Value> pagePrevious;
        List<Value> data;
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        ListIterator<PagingSource.LoadResult.Page<Key, Value>> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pagePrevious = null;
                break;
            }
            pagePrevious = listIterator.previous();
            if (!pagePrevious.getData().isEmpty()) {
                break;
            }
        }
        PagingSource.LoadResult.Page<Key, Value> page = pagePrevious;
        if (page == null || (data = page.getData()) == null) {
            return null;
        }
        return (Value) AbstractC8778f0.m14579y0(data);
    }

    public String toString() {
        return "PagingState(pages=" + this.pages + ", anchorPosition=" + this.anchorPosition + ", config=" + this.config + ", leadingPlaceholderCount=" + this.leadingPlaceholderCount + ')';
    }
}
