package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.PagingDataEvent;
import androidx.paging.ViewportHint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class PageStore<T> implements PlaceholderPaddedList<T> {
    public static final Companion Companion = new Companion(null);
    private static final PageStore<Object> INITIAL = new PageStore<>(PageEvent.Insert.Companion.getEMPTY_REFRESH_LOCAL());
    private int dataCount;
    private final List<TransformablePage<T>> pages;
    private int placeholdersAfter;
    private int placeholdersBefore;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final <T> PageStore<T> initial$paging_common_release(PageEvent.Insert<T> insert) {
            if (insert != null) {
                return new PageStore<>(insert);
            }
            PageStore<T> pageStore = PageStore.INITIAL;
            AbstractC9133u.m16131e(pageStore, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
            return pageStore;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PageStore(List<TransformablePage<T>> pages, int i10, int i11) {
        AbstractC9133u.m16133g(pages, "pages");
        this.pages = AbstractC8778f0.m14547X0(pages);
        this.dataCount = fullCount(pages);
        this.placeholdersBefore = i10;
        this.placeholdersAfter = i11;
    }

    private final void checkIndex(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + getSize());
        }
    }

    private final PagingDataEvent<T> dropPages(PageEvent.Drop<T> drop) {
        int iDropPagesWithOffsets = dropPagesWithOffsets(new C8321f(drop.getMinPageOffset(), drop.getMaxPageOffset()));
        this.dataCount = getDataCount() - iDropPagesWithOffsets;
        if (drop.getLoadType() == LoadType.PREPEND) {
            int placeholdersBefore = getPlaceholdersBefore();
            this.placeholdersBefore = drop.getPlaceholdersRemaining();
            return new PagingDataEvent.DropPrepend(iDropPagesWithOffsets, getPlaceholdersBefore(), placeholdersBefore);
        }
        int placeholdersAfter = getPlaceholdersAfter();
        this.placeholdersAfter = drop.getPlaceholdersRemaining();
        return new PagingDataEvent.DropAppend(getPlaceholdersBefore() + getDataCount(), iDropPagesWithOffsets, drop.getPlaceholdersRemaining(), placeholdersAfter);
    }

    private final int dropPagesWithOffsets(C8321f c8321f) {
        Iterator<TransformablePage<T>> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            TransformablePage<T> next = it.next();
            int[] originalPageOffsets = next.getOriginalPageOffsets();
            int length = originalPageOffsets.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (c8321f.m13502g(originalPageOffsets[i10])) {
                    size += next.getData().size();
                    it.remove();
                    break;
                }
                i10++;
            }
        }
        return size;
    }

    private final int fullCount(List<TransformablePage<T>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((TransformablePage) it.next()).getData().size();
        }
        return size;
    }

    private final int getOriginalPageOffsetFirst() {
        Integer numM14694W0 = AbstractC8801r.m14694W0(((TransformablePage) AbstractC8778f0.m14566l0(this.pages)).getOriginalPageOffsets());
        AbstractC9133u.m16130d(numM14694W0);
        return numM14694W0.intValue();
    }

    private final int getOriginalPageOffsetLast() {
        Integer numM14691T0 = AbstractC8801r.m14691T0(((TransformablePage) AbstractC8778f0.m14578x0(this.pages)).getOriginalPageOffsets());
        AbstractC9133u.m16130d(numM14691T0);
        return numM14691T0.intValue();
    }

    private final PagingDataEvent<T> insertPage(PageEvent.Insert<T> insert) {
        int iFullCount = fullCount(insert.getPages());
        int i10 = WhenMappings.$EnumSwitchMapping$0[insert.getLoadType().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i10 == 2) {
            int placeholdersBefore = getPlaceholdersBefore();
            this.pages.addAll(0, insert.getPages());
            this.dataCount = getDataCount() + iFullCount;
            this.placeholdersBefore = insert.getPlaceholdersBefore();
            List<TransformablePage<T>> pages = insert.getPages();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                AbstractC8768a0.m14481C(arrayList, ((TransformablePage) it.next()).getData());
            }
            return new PagingDataEvent.Prepend(arrayList, getPlaceholdersBefore(), placeholdersBefore);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int placeholdersAfter = getPlaceholdersAfter();
        int dataCount = getDataCount();
        List<TransformablePage<T>> list = this.pages;
        list.addAll(list.size(), insert.getPages());
        this.dataCount = getDataCount() + iFullCount;
        this.placeholdersAfter = insert.getPlaceholdersAfter();
        int placeholdersBefore2 = getPlaceholdersBefore() + dataCount;
        List<TransformablePage<T>> pages2 = insert.getPages();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = pages2.iterator();
        while (it2.hasNext()) {
            AbstractC8768a0.m14481C(arrayList2, ((TransformablePage) it2.next()).getData());
        }
        return new PagingDataEvent.Append(placeholdersBefore2, arrayList2, getPlaceholdersAfter(), placeholdersAfter);
    }

    public final ViewportHint.Access accessHintForPresenterIndex(int i10) {
        int i11 = 0;
        int placeholdersBefore = i10 - getPlaceholdersBefore();
        while (placeholdersBefore >= this.pages.get(i11).getData().size() && i11 < AbstractC8809v.m14773p(this.pages)) {
            placeholdersBefore -= this.pages.get(i11).getData().size();
            i11++;
        }
        return this.pages.get(i11).viewportHintFor(placeholdersBefore, i10 - getPlaceholdersBefore(), ((getSize() - i10) - getPlaceholdersAfter()) - 1, getOriginalPageOffsetFirst(), getOriginalPageOffsetLast());
    }

    public final T get(int i10) {
        checkIndex(i10);
        int placeholdersBefore = i10 - getPlaceholdersBefore();
        if (placeholdersBefore < 0 || placeholdersBefore >= getDataCount()) {
            return null;
        }
        return getItem(placeholdersBefore);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getDataCount() {
        return this.dataCount;
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

    @Override // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getSize() {
        return getPlaceholdersBefore() + getDataCount() + getPlaceholdersAfter();
    }

    public final ViewportHint.Initial initializeHint() {
        int dataCount = getDataCount() / 2;
        return new ViewportHint.Initial(dataCount, dataCount, getOriginalPageOffsetFirst(), getOriginalPageOffsetLast());
    }

    public final PagingDataEvent<T> processEvent(PageEvent<T> pageEvent) {
        AbstractC9133u.m16133g(pageEvent, "pageEvent");
        if (pageEvent instanceof PageEvent.Insert) {
            return insertPage((PageEvent.Insert) pageEvent);
        }
        if (pageEvent instanceof PageEvent.Drop) {
            return dropPages((PageEvent.Drop) pageEvent);
        }
        throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final ItemSnapshotList<T> snapshot() {
        int placeholdersBefore = getPlaceholdersBefore();
        int placeholdersAfter = getPlaceholdersAfter();
        List<TransformablePage<T>> list = this.pages;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC8768a0.m14481C(arrayList, ((TransformablePage) it.next()).getData());
        }
        return new ItemSnapshotList<>(placeholdersBefore, placeholdersAfter, arrayList);
    }

    public String toString() {
        int dataCount = getDataCount();
        ArrayList arrayList = new ArrayList(dataCount);
        for (int i10 = 0; i10 < dataCount; i10++) {
            arrayList.add(getItem(i10));
        }
        return "[(" + getPlaceholdersBefore() + " placeholders), " + AbstractC8778f0.m14576v0(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + getPlaceholdersAfter() + " placeholders)]";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageStore(PageEvent.Insert<T> insertEvent) {
        this(insertEvent.getPages(), insertEvent.getPlaceholdersBefore(), insertEvent.getPlaceholdersAfter());
        AbstractC9133u.m16133g(insertEvent, "insertEvent");
    }
}
