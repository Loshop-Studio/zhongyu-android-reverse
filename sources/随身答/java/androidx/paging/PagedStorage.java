package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u0001YB\u0007\b\u0016¢\u0006\u0002\u0010\u0006B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fB\u0015\b\u0012\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0002\u0010\u000eJ+\u00100\u001a\u0002012\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0002\b4J\u0018\u00105\u001a\u0004\u0018\u00018\u00002\u0006\u00106\u001a\u00020\bH\u0096\u0002¢\u0006\u0002\u00107J\u0015\u00108\u001a\u00028\u00002\u0006\u00106\u001a\u00020\bH\u0016¢\u0006\u0002\u00107J\u001a\u00109\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010:2\u0006\u0010;\u001a\u00020<JD\u0010=\u001a\u0002012\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u00102\u001a\u0002032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J:\u0010=\u001a\u0002012\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bH\u0002J\u0016\u0010B\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bJ\u0016\u0010C\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bJ+\u0010D\u001a\u0002012\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0002\bEJ\u001e\u0010F\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bJ\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010I\u001a\u00020JH\u0016J`\u0010K\u001a\u0002HL\"\u0004\b\u0001\u0010L2\u0006\u0010M\u001a\u00020\b2B\b\u0004\u0010N\u001a<\u0012\u001d\u0012\u001b\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\b¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(R\u0012\u0004\u0012\u0002HL0OH\u0082\b¢\u0006\u0002\u0010SJ-\u0010T\u001a\u00020\u00102\u0006\u0010U\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\bVJ-\u0010W\u001a\u00020\u00102\u0006\u0010U\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\bXR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0014R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u001e\u0010$\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0014R\u001e\u0010(\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u001e\u0010*\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0014R\u0016\u0010,\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\u0014\u0010.\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0014¨\u0006Z"}, m13413d2 = {"Landroidx/paging/PagedStorage;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Landroidx/paging/PlaceholderPaddedList;", "()V", "leadingNulls", "", "page", "Landroidx/paging/PagingSource$LoadResult$Page;", "trailingNulls", "(ILandroidx/paging/PagingSource$LoadResult$Page;I)V", "other", "(Landroidx/paging/PagedStorage;)V", "counted", "", "<set-?>", "dataCount", "getDataCount", "()I", "firstLoadedItem", "getFirstLoadedItem$paging_common_release", "()Ljava/lang/Object;", "value", "lastLoadAroundIndex", "getLastLoadAroundIndex", "setLastLoadAroundIndex", "(I)V", "lastLoadAroundLocalIndex", "lastLoadedItem", "getLastLoadedItem$paging_common_release", "middleOfLoadedRange", "getMiddleOfLoadedRange", "nextKey", "getNextKey", "pages", "", "placeholdersAfter", "getPlaceholdersAfter", "placeholdersBefore", "getPlaceholdersBefore", "positionOffset", "getPositionOffset", "prevKey", "getPrevKey", "size", "getSize", "appendPage", "", "callback", "Landroidx/paging/PagedStorage$Callback;", "appendPage$paging_common_release", "get", "index", "(I)Ljava/lang/Object;", "getItem", "getRefreshKeyInfo", "Landroidx/paging/PagingState;", "config", "Landroidx/paging/PagedList$Config;", "init", "needsTrim", "maxSize", "requiredRemaining", "localPageIndex", "needsTrimFromEnd", "needsTrimFromFront", "prependPage", "prependPage$paging_common_release", "shouldPreTrimNewPage", "countToBeAdded", "snapshot", "toString", "", "traversePages", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "localIndex", "onLastPage", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "pageInternalIndex", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "trimFromEnd", "insertNulls", "trimFromEnd$paging_common_release", "trimFromFront", "trimFromFront$paging_common_release", "Callback", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagedStorage.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagedStorage.jvm.kt\nandroidx/paging/PagedStorage\n*L\n1#1,354:1\n149#1,15:355\n*S KotlinDebug\n*F\n+ 1 PagedStorage.jvm.kt\nandroidx/paging/PagedStorage\n*L\n170#1:355,15\n*E\n"})
/* loaded from: classes3.dex */
public final class PagedStorage<T> extends AbstractList<T> implements LegacyPageFetcher.KeyProvider<Object>, PlaceholderPaddedList<T> {
    private boolean counted;
    private int dataCount;
    private int lastLoadAroundLocalIndex;
    private final List<PagingSource.LoadResult.Page<?, T>> pages;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private int positionOffset;

    @Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m13413d2 = {"Landroidx/paging/PagedStorage$Callback;", "", "onInitialized", "", "count", "", "onPageAppended", "endPosition", "changed", "added", "onPagePrepended", "leadingNulls", "onPagesRemoved", "startOfDrops", "onPagesSwappedToPlaceholder", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public interface Callback {
        void onInitialized(int count);

        void onPageAppended(int endPosition, int changed, int added);

        void onPagePrepended(int leadingNulls, int changed, int added);

        void onPagesRemoved(int startOfDrops, int count);

        void onPagesSwappedToPlaceholder(int startOfDrops, int count);
    }

    public PagedStorage() {
        this.pages = new ArrayList();
        this.counted = true;
    }

    public static /* synthetic */ void appendPage$paging_common_release$default(PagedStorage pagedStorage, PagingSource.LoadResult.Page page, Callback callback, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            callback = null;
        }
        pagedStorage.appendPage$paging_common_release(page, callback);
    }

    private final void init(int leadingNulls, PagingSource.LoadResult.Page<?, T> page, int trailingNulls, int positionOffset, boolean counted) {
        this.placeholdersBefore = leadingNulls;
        this.pages.clear();
        this.pages.add(page);
        this.placeholdersAfter = trailingNulls;
        this.positionOffset = positionOffset;
        this.dataCount = page.getData().size();
        this.counted = counted;
        this.lastLoadAroundLocalIndex = page.getData().size() / 2;
    }

    public static /* synthetic */ void init$default(PagedStorage pagedStorage, int i9, PagingSource.LoadResult.Page page, int i10, int i11, Callback callback, boolean z9, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z9 = true;
        }
        pagedStorage.init(i9, page, i10, i11, callback, z9);
    }

    private final boolean needsTrim(int maxSize, int requiredRemaining, int localPageIndex) {
        return getDataCount() > maxSize && this.pages.size() > 2 && getDataCount() - this.pages.get(localPageIndex).getData().size() >= requiredRemaining;
    }

    public static /* synthetic */ void prependPage$paging_common_release$default(PagedStorage pagedStorage, PagingSource.LoadResult.Page page, Callback callback, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            callback = null;
        }
        pagedStorage.prependPage$paging_common_release(page, callback);
    }

    private final <V> V traversePages(int localIndex, Function2<? super PagingSource.LoadResult.Page<?, T>, ? super Integer, ? extends V> onLastPage) {
        int size = this.pages.size();
        int i9 = 0;
        while (i9 < size) {
            int size2 = this.pages.get(i9).getData().size();
            if (size2 > localIndex) {
                break;
            }
            localIndex -= size2;
            i9++;
        }
        return onLastPage.invoke(this.pages.get(i9), Integer.valueOf(localIndex));
    }

    public final void appendPage$paging_common_release(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.getData().size();
        if (size == 0) {
            return;
        }
        this.pages.add(page);
        this.dataCount = getDataCount() + size;
        int iMin = Math.min(getPlaceholdersAfter(), size);
        int i9 = size - iMin;
        if (iMin != 0) {
            this.placeholdersAfter = getPlaceholdersAfter() - iMin;
        }
        if (callback != null) {
            callback.onPageAppended((getPlaceholdersBefore() + getDataCount()) - size, iMin, i9);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        int placeholdersBefore = index - getPlaceholdersBefore();
        if (index >= 0 && index < size()) {
            if (placeholdersBefore < 0 || placeholdersBefore >= getDataCount()) {
                return null;
            }
            return getItem(placeholdersBefore);
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getDataCount() {
        return this.dataCount;
    }

    public final T getFirstLoadedItem$paging_common_release() {
        return (T) CollectionsKt.first(((PagingSource.LoadResult.Page) CollectionsKt.first((List) this.pages)).getData());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public T getItem(int index) {
        int size = this.pages.size();
        int i9 = 0;
        while (i9 < size) {
            int size2 = this.pages.get(i9).getData().size();
            if (size2 > index) {
                break;
            }
            index -= size2;
            i9++;
        }
        return this.pages.get(i9).getData().get(index);
    }

    public final int getLastLoadAroundIndex() {
        return getPlaceholdersBefore() + this.lastLoadAroundLocalIndex;
    }

    public final T getLastLoadedItem$paging_common_release() {
        return (T) CollectionsKt.last(((PagingSource.LoadResult.Page) CollectionsKt.last((List) this.pages)).getData());
    }

    public final int getMiddleOfLoadedRange() {
        return getPlaceholdersBefore() + (getDataCount() / 2);
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public Object getNextKey() {
        if (!this.counted || getPlaceholdersAfter() > 0) {
            return ((PagingSource.LoadResult.Page) CollectionsKt.last((List) this.pages)).getNextKey();
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
            return ((PagingSource.LoadResult.Page) CollectionsKt.first((List) this.pages)).getPrevKey();
        }
        return null;
    }

    public final PagingState<?, T> getRefreshKeyInfo(PagedList.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.pages.isEmpty()) {
            return null;
        }
        List list = CollectionsKt.toList(this.pages);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
        return new PagingState<>(list, Integer.valueOf(getLastLoadAroundIndex()), new PagingConfig(config.pageSize, config.prefetchDistance, config.enablePlaceholders, config.initialLoadSizeHint, config.maxSize, 0, 32, null), getPlaceholdersBefore());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getSize() {
        return getPlaceholdersBefore() + getDataCount() + getPlaceholdersAfter();
    }

    public final boolean needsTrimFromEnd(int maxSize, int requiredRemaining) {
        return needsTrim(maxSize, requiredRemaining, this.pages.size() - 1);
    }

    public final boolean needsTrimFromFront(int maxSize, int requiredRemaining) {
        return needsTrim(maxSize, requiredRemaining, 0);
    }

    public final void prependPage$paging_common_release(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.getData().size();
        if (size == 0) {
            return;
        }
        this.pages.add(0, page);
        this.dataCount = getDataCount() + size;
        int iMin = Math.min(getPlaceholdersBefore(), size);
        int i9 = size - iMin;
        if (iMin != 0) {
            this.placeholdersBefore = getPlaceholdersBefore() - iMin;
        }
        this.positionOffset -= i9;
        if (callback != null) {
            callback.onPagePrepended(getPlaceholdersBefore(), iMin, i9);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i9) {
        return (T) removeAt(i9);
    }

    public /* bridge */ Object removeAt(int i9) {
        return super.remove(i9);
    }

    public final void setLastLoadAroundIndex(int i9) {
        this.lastLoadAroundLocalIndex = RangesKt.coerceIn(i9 - getPlaceholdersBefore(), 0, getDataCount() - 1);
    }

    public final boolean shouldPreTrimNewPage(int maxSize, int requiredRemaining, int countToBeAdded) {
        return getDataCount() + countToBeAdded > maxSize && this.pages.size() > 1 && getDataCount() >= requiredRemaining;
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
        return "leading " + getPlaceholdersBefore() + ", dataCount " + getDataCount() + ", trailing " + getPlaceholdersAfter() + ' ' + CollectionsKt.joinToString$default(this.pages, " ", null, null, 0, null, null, 62, null);
    }

    public final boolean trimFromEnd$paging_common_release(boolean insertNulls, int maxSize, int requiredRemaining, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i9 = 0;
        while (needsTrimFromEnd(maxSize, requiredRemaining)) {
            List<PagingSource.LoadResult.Page<?, T>> list = this.pages;
            int size = list.remove(list.size() - 1).getData().size();
            i9 += size;
            this.dataCount = getDataCount() - size;
        }
        this.lastLoadAroundLocalIndex = RangesKt.coerceAtMost(this.lastLoadAroundLocalIndex, getDataCount() - 1);
        if (i9 > 0) {
            int placeholdersBefore = getPlaceholdersBefore() + getDataCount();
            if (insertNulls) {
                this.placeholdersAfter = getPlaceholdersAfter() + i9;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i9);
            } else {
                callback.onPagesRemoved(placeholdersBefore, i9);
            }
        }
        return i9 > 0;
    }

    public final boolean trimFromFront$paging_common_release(boolean insertNulls, int maxSize, int requiredRemaining, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i9 = 0;
        while (needsTrimFromFront(maxSize, requiredRemaining)) {
            int size = this.pages.remove(0).getData().size();
            i9 += size;
            this.dataCount = getDataCount() - size;
        }
        this.lastLoadAroundLocalIndex = RangesKt.coerceAtLeast(this.lastLoadAroundLocalIndex - i9, 0);
        if (i9 > 0) {
            if (insertNulls) {
                int placeholdersBefore = getPlaceholdersBefore();
                this.placeholdersBefore = getPlaceholdersBefore() + i9;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i9);
            } else {
                this.positionOffset += i9;
                callback.onPagesRemoved(getPlaceholdersBefore(), i9);
            }
        }
        return i9 > 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagedStorage(int i9, PagingSource.LoadResult.Page<?, T> page, int i10) {
        this();
        Intrinsics.checkNotNullParameter(page, "page");
        init(i9, page, i10, 0, true);
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
    public final void init(int leadingNulls, PagingSource.LoadResult.Page<?, T> page, int trailingNulls, int positionOffset, Callback callback, boolean counted) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(callback, "callback");
        init(leadingNulls, page, trailingNulls, positionOffset, counted);
        callback.onInitialized(size());
    }
}
