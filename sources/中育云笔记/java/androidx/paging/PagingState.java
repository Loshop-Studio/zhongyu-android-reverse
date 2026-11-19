package androidx.paging;

import androidx.annotation.IntRange;
import androidx.paging.PagingSource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class PagingState<Key, Value> {
    private final Integer anchorPosition;
    private final PagingConfig config;
    private final int leadingPlaceholderCount;
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;

    public PagingState(List<PagingSource.LoadResult.Page<Key, Value>> pages, Integer num, PagingConfig config, @IntRange(from = 0) int i10) {
        AbstractC9979u.m20294g(pages, "pages");
        AbstractC9979u.m20294g(config, "config");
        this.pages = pages;
        this.anchorPosition = num;
        this.config = config;
        this.leadingPlaceholderCount = i10;
    }

    public final <T> T anchorPositionToPagedIndices$paging_common(int i10, InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        int size = i10 - this.leadingPlaceholderCount;
        int i11 = 0;
        while (i11 < AbstractC10978w.m24138p(getPages()) && size > AbstractC10978w.m24138p(getPages().get(i11).getData())) {
            size -= getPages().get(i11).getData().size();
            i11++;
        }
        return (T) block.invoke(Integer.valueOf(i11), Integer.valueOf(size));
    }

    public final Value closestItemAroundPosition(int i10, InterfaceC9540l predicate) {
        int i11;
        int iNextIndex;
        PagingSource.LoadResult.Page<Key, Value> page;
        PagingSource.LoadResult.Page<Key, Value> page2;
        int i12;
        boolean z10;
        boolean z11;
        AbstractC9979u.m20294g(predicate, "predicate");
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                    int iM24138p = i10 - this.leadingPlaceholderCount;
                    int i13 = 0;
                    while (i13 < AbstractC10978w.m24138p(getPages()) && iM24138p > AbstractC10978w.m24138p(getPages().get(i13).getData())) {
                        iM24138p -= getPages().get(i13).getData().size();
                        i13++;
                    }
                    Iterator<PagingSource.LoadResult.Page<Key, Value>> it2 = this.pages.iterator();
                    int i14 = 0;
                    while (true) {
                        i11 = -1;
                        if (!it2.hasNext()) {
                            i14 = -1;
                            break;
                        }
                        if (!it2.next().getData().isEmpty()) {
                            break;
                        }
                        i14++;
                    }
                    List<PagingSource.LoadResult.Page<Key, Value>> list2 = this.pages;
                    ListIterator<PagingSource.LoadResult.Page<Key, Value>> listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if (!listIterator.previous().getData().isEmpty()) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (iM24138p < 0) {
                        z11 = false;
                        page = null;
                        i12 = i14;
                        z10 = true;
                        i13 = -1;
                        page2 = this.pages.get(i14);
                        i11 = 0;
                        iM24138p = -1;
                    } else if (i13 != AbstractC10978w.m24138p(this.pages) || iM24138p <= AbstractC10978w.m24138p(((PagingSource.LoadResult.Page) AbstractC10947g0.m23956y0(this.pages)).getData())) {
                        page = this.pages.get(i13);
                        page2 = this.pages.get(i13);
                        i11 = iM24138p;
                        i12 = i13;
                        z10 = false;
                        z11 = false;
                    } else {
                        PagingSource.LoadResult.Page<Key, Value> page3 = this.pages.get(iNextIndex);
                        int i15 = iNextIndex;
                        page = page3;
                        iM24138p = AbstractC10978w.m24138p(page3.getData());
                        i13 = i15;
                        z10 = false;
                        page2 = null;
                        z11 = true;
                        i12 = -1;
                    }
                    while (true) {
                        if (z10 && z11) {
                            return null;
                        }
                        if (!z10) {
                            while (iM24138p < 0) {
                                i13--;
                                if (i13 < 0) {
                                    break;
                                }
                                page = this.pages.get(i13);
                                iM24138p = AbstractC10978w.m24138p(page.getData());
                            }
                            if (i13 < 0) {
                                z10 = true;
                            } else {
                                AbstractC9979u.m20291d(page);
                                Value value = page.getData().get(iM24138p);
                                if (((Boolean) predicate.invoke(value)).booleanValue()) {
                                    return value;
                                }
                                iM24138p--;
                            }
                        }
                        if (!z11) {
                            while (true) {
                                AbstractC9979u.m20291d(page2);
                                if (i11 <= AbstractC10978w.m24138p(page2.getData()) || (i12 = i12 + 1) > AbstractC10978w.m24138p(this.pages)) {
                                    break;
                                }
                                page2 = this.pages.get(i12);
                                i11 = page2.getData().isEmpty() ? Integer.MAX_VALUE : 0;
                            }
                            if (i12 > AbstractC10978w.m24138p(this.pages)) {
                                z11 = true;
                            } else {
                                Value value2 = page2.getData().get(i11);
                                if (((Boolean) predicate.invoke(value2)).booleanValue()) {
                                    return value2;
                                }
                                i11++;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final Value closestItemToPosition(int i10) {
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                int size = i10 - this.leadingPlaceholderCount;
                int i11 = 0;
                while (i11 < AbstractC10978w.m24138p(getPages()) && size > AbstractC10978w.m24138p(getPages().get(i11).getData())) {
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
                                return size < 0 ? (Value) AbstractC10947g0.m23944m0(page.getData()) : (i11 != AbstractC10978w.m24138p(this.pages) || size <= AbstractC10978w.m24138p(((PagingSource.LoadResult.Page) AbstractC10947g0.m23956y0(this.pages)).getData())) ? this.pages.get(i11).getData().get(size) : (Value) AbstractC10947g0.m23956y0(pagePrevious.getData());
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
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                int size = i10 - this.leadingPlaceholderCount;
                int i11 = 0;
                while (i11 < AbstractC10978w.m24138p(getPages()) && size > AbstractC10978w.m24138p(getPages().get(i11).getData())) {
                    size -= getPages().get(i11).getData().size();
                    i11++;
                }
                return size < 0 ? (PagingSource.LoadResult.Page) AbstractC10947g0.m23944m0(this.pages) : this.pages.get(i11);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) obj;
        return AbstractC9979u.m20289b(this.pages, pagingState.pages) && AbstractC9979u.m20289b(this.anchorPosition, pagingState.anchorPosition) && AbstractC9979u.m20289b(this.config, pagingState.config) && this.leadingPlaceholderCount == pagingState.leadingPlaceholderCount;
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
        return (Value) AbstractC10947g0.m23946o0(data);
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
        if ((list instanceof Collection) && list.isEmpty()) {
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
        return (Value) AbstractC10947g0.m23957z0(data);
    }

    public String toString() {
        return "PagingState(pages=" + this.pages + ", anchorPosition=" + this.anchorPosition + ", config=" + this.config + ", leadingPlaceholderCount=" + this.leadingPlaceholderCount + ')';
    }
}
