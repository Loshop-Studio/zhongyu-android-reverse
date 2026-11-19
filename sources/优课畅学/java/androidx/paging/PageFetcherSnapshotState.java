package androidx.paging;

import androidx.annotation.CheckResult;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PagingSource;
import androidx.paging.ViewportHint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshotState<Key, Value> {
    private final List<PagingSource.LoadResult.Page<Key, Value>> _pages;
    private int _placeholdersAfter;
    private int _placeholdersBefore;
    private int appendGenerationId;
    private final InterfaceC9158a appendGenerationIdCh;
    private final PagingConfig config;
    private final Map<LoadType, ViewportHint> failedHintsByLoadType;
    private int initialPageIndex;
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;
    private int prependGenerationId;
    private final InterfaceC9158a prependGenerationIdCh;
    private MutableLoadStateCollection sourceLoadStates;

    public static final class Holder<Key, Value> {
        private final PagingConfig config;
        private final InterfaceC9942a lock;
        private final PageFetcherSnapshotState<Key, Value> state;

        public Holder(PagingConfig config) {
            AbstractC9133u.m16133g(config, "config");
            this.config = config;
            this.lock = AbstractC9943b.m18571b(false, 1, null);
            this.state = new PageFetcherSnapshotState<>(config, null);
        }

        private final <T> Object withLock$$forInline(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super T> interfaceC9324c) {
            InterfaceC9942a interfaceC9942a = this.lock;
            AbstractC9131s.m16126c(0);
            interfaceC9942a.lock(null, interfaceC9324c);
            AbstractC9131s.m16126c(1);
            try {
                return interfaceC10570l.invoke(this.state);
            } finally {
                AbstractC9131s.m16125b(1);
                interfaceC9942a.unlock(null);
                AbstractC9131s.m16124a(1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object withLock(p300x7.InterfaceC10570l r6, p179m7.InterfaceC9324c<? super T> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.PageFetcherSnapshotState$Holder$withLock$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.PageFetcherSnapshotState$Holder$withLock$1 r0 = (androidx.paging.PageFetcherSnapshotState$Holder$withLock$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PageFetcherSnapshotState$Holder$withLock$1 r0 = new androidx.paging.PageFetcherSnapshotState$Holder$withLock$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L40
                if (r2 != r3) goto L38
                java.lang.Object r6 = r0.L$2
                r8.a r6 = (p235r8.InterfaceC9942a) r6
                java.lang.Object r1 = r0.L$1
                x7.l r1 = (p300x7.InterfaceC10570l) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.PageFetcherSnapshotState$Holder r0 = (androidx.paging.PageFetcherSnapshotState.Holder) r0
                kotlin.AbstractC9079b.m15926b(r7)
                r7 = r6
                r6 = r1
                goto L57
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L40:
                kotlin.AbstractC9079b.m15926b(r7)
                r8.a r7 = access$getLock$p(r5)
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r0 = r7.lock(r4, r0)
                if (r0 != r1) goto L56
                return r1
            L56:
                r0 = r5
            L57:
                androidx.paging.PageFetcherSnapshotState r0 = access$getState$p(r0)     // Catch: java.lang.Throwable -> L69
                java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L69
                kotlin.jvm.internal.AbstractC9131s.m16125b(r3)
                r7.unlock(r4)
                kotlin.jvm.internal.AbstractC9131s.m16124a(r3)
                return r6
            L69:
                r6 = move-exception
                kotlin.jvm.internal.AbstractC9131s.m16125b(r3)
                r7.unlock(r4)
                kotlin.jvm.internal.AbstractC9131s.m16124a(r3)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshotState.Holder.withLock(x7.l, m7.c):java.lang.Object");
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

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", m17801f = "PageFetcherSnapshotState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 */
    public static final class C43411 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ PageFetcherSnapshotState<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43411(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, InterfaceC9324c<? super C43411> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = pageFetcherSnapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43411(this.this$0, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ((PageFetcherSnapshotState) this.this$0).appendGenerationIdCh.mo27213trySendJP2dKIU(AbstractC9536a.m17798c(((PageFetcherSnapshotState) this.this$0).appendGenerationId));
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43411) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", m17801f = "PageFetcherSnapshotState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1 */
    public static final class C43421 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ PageFetcherSnapshotState<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43421(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, InterfaceC9324c<? super C43421> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = pageFetcherSnapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43421(this.this$0, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ((PageFetcherSnapshotState) this.this$0).prependGenerationIdCh.mo27213trySendJP2dKIU(AbstractC9536a.m17798c(((PageFetcherSnapshotState) this.this$0).prependGenerationId));
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43421) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public /* synthetic */ PageFetcherSnapshotState(PagingConfig pagingConfig, AbstractC9126n abstractC9126n) {
        this(pagingConfig);
    }

    public final InterfaceC9266c consumeAppendGenerationIdAsFlow() {
        return AbstractC9268e.m17001M(AbstractC9268e.m17023m(this.appendGenerationIdCh), new C43411(this, null));
    }

    public final InterfaceC9266c consumePrependGenerationIdAsFlow() {
        return AbstractC9268e.m17001M(AbstractC9268e.m17023m(this.prependGenerationIdCh), new C43421(this, null));
    }

    public final PagingState<Key, Value> currentPagingState$paging_common_release(ViewportHint.Access access) {
        Integer numValueOf;
        List listM14544U0 = AbstractC8778f0.m14544U0(this.pages);
        if (access != null) {
            int placeholdersBefore$paging_common_release = getPlaceholdersBefore$paging_common_release();
            int i10 = -this.initialPageIndex;
            int iM14773p = AbstractC8809v.m14773p(this.pages) - this.initialPageIndex;
            int pageOffset = access.getPageOffset();
            int i11 = i10;
            while (i11 < pageOffset) {
                placeholdersBefore$paging_common_release += i11 > iM14773p ? this.config.pageSize : this.pages.get(this.initialPageIndex + i11).getData().size();
                i11++;
            }
            int indexInPage = placeholdersBefore$paging_common_release + access.getIndexInPage();
            if (access.getPageOffset() < i10) {
                indexInPage -= this.config.pageSize;
            }
            numValueOf = Integer.valueOf(indexInPage);
        } else {
            numValueOf = null;
        }
        return new PagingState<>(listM14544U0, numValueOf, this.config, getPlaceholdersBefore$paging_common_release());
    }

    public final void drop(PageEvent.Drop<Value> event) {
        AbstractC9133u.m16133g(event, "event");
        if (event.getPageCount() > this.pages.size()) {
            throw new IllegalStateException(("invalid drop count. have " + this.pages.size() + " but wanted to drop " + event.getPageCount()).toString());
        }
        this.failedHintsByLoadType.remove(event.getLoadType());
        this.sourceLoadStates.set(event.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common_release());
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.getLoadType().ordinal()];
        if (i10 == 2) {
            int pageCount = event.getPageCount();
            for (int i11 = 0; i11 < pageCount; i11++) {
                this._pages.remove(0);
            }
            this.initialPageIndex -= event.getPageCount();
            setPlaceholdersBefore$paging_common_release(event.getPlaceholdersRemaining());
            int i12 = this.prependGenerationId + 1;
            this.prependGenerationId = i12;
            this.prependGenerationIdCh.mo27213trySendJP2dKIU(Integer.valueOf(i12));
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("cannot drop " + event.getLoadType());
        }
        int pageCount2 = event.getPageCount();
        for (int i13 = 0; i13 < pageCount2; i13++) {
            this._pages.remove(this.pages.size() - 1);
        }
        setPlaceholdersAfter$paging_common_release(event.getPlaceholdersRemaining());
        int i14 = this.appendGenerationId + 1;
        this.appendGenerationId = i14;
        this.appendGenerationIdCh.mo27213trySendJP2dKIU(Integer.valueOf(i14));
    }

    public final PageEvent.Drop<Value> dropEventOrNull(LoadType loadType, ViewportHint hint) {
        int size;
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC9133u.m16133g(hint, "hint");
        if (this.config.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || getStorageCount$paging_common_release() <= this.config.maxSize) {
            return null;
        }
        if (loadType == LoadType.REFRESH) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int placeholdersBefore$paging_common_release = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.pages.size() && getStorageCount$paging_common_release() - i11 > this.config.maxSize) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[loadType.ordinal()] == 2) {
                size = this.pages.get(i10).getData().size();
            } else {
                List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
                size = list.get(AbstractC8809v.m14773p(list) - i10).getData().size();
            }
            if (((iArr[loadType.ordinal()] == 2 ? hint.getPresentedItemsBefore() : hint.getPresentedItemsAfter()) - i11) - size < this.config.prefetchDistance) {
                break;
            }
            i11 += size;
            i10++;
        }
        if (i10 == 0) {
            return null;
        }
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        int iM14773p = iArr2[loadType.ordinal()] == 2 ? -this.initialPageIndex : (AbstractC8809v.m14773p(this.pages) - this.initialPageIndex) - (i10 - 1);
        int iM14773p2 = iArr2[loadType.ordinal()] == 2 ? (i10 - 1) - this.initialPageIndex : AbstractC8809v.m14773p(this.pages) - this.initialPageIndex;
        if (this.config.enablePlaceholders) {
            placeholdersBefore$paging_common_release = (loadType == LoadType.PREPEND ? getPlaceholdersBefore$paging_common_release() : getPlaceholdersAfter$paging_common_release()) + i11;
        }
        return new PageEvent.Drop<>(loadType, iM14773p, iM14773p2, placeholdersBefore$paging_common_release);
    }

    public final int generationId$paging_common_release(LoadType loadType) {
        AbstractC9133u.m16133g(loadType, "loadType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i10 == 2) {
            return this.prependGenerationId;
        }
        if (i10 == 3) {
            return this.appendGenerationId;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Map<LoadType, ViewportHint> getFailedHintsByLoadType$paging_common_release() {
        return this.failedHintsByLoadType;
    }

    public final int getInitialPageIndex$paging_common_release() {
        return this.initialPageIndex;
    }

    public final List<PagingSource.LoadResult.Page<Key, Value>> getPages$paging_common_release() {
        return this.pages;
    }

    public final int getPlaceholdersAfter$paging_common_release() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersAfter;
        }
        return 0;
    }

    public final int getPlaceholdersBefore$paging_common_release() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersBefore;
        }
        return 0;
    }

    public final MutableLoadStateCollection getSourceLoadStates$paging_common_release() {
        return this.sourceLoadStates;
    }

    public final int getStorageCount$paging_common_release() {
        Iterator<T> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((PagingSource.LoadResult.Page) it.next()).getData().size();
        }
        return size;
    }

    @CheckResult
    public final boolean insert(int i10, LoadType loadType, PagingSource.LoadResult.Page<Key, Value> page) {
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC9133u.m16133g(page, "page");
        int i11 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if (this.pages.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    }
                    if (i10 != this.appendGenerationId) {
                        return false;
                    }
                    this._pages.add(page);
                    setPlaceholdersAfter$paging_common_release(page.getItemsAfter() == Integer.MIN_VALUE ? AbstractC8323h.m13510e(getPlaceholdersAfter$paging_common_release() - page.getData().size(), 0) : page.getItemsAfter());
                    this.failedHintsByLoadType.remove(LoadType.APPEND);
                }
            } else {
                if (this.pages.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i10 != this.prependGenerationId) {
                    return false;
                }
                this._pages.add(0, page);
                this.initialPageIndex++;
                setPlaceholdersBefore$paging_common_release(page.getItemsBefore() == Integer.MIN_VALUE ? AbstractC8323h.m13510e(getPlaceholdersBefore$paging_common_release() - page.getData().size(), 0) : page.getItemsBefore());
                this.failedHintsByLoadType.remove(LoadType.PREPEND);
            }
        } else {
            if (!this.pages.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i10 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this._pages.add(page);
            this.initialPageIndex = 0;
            setPlaceholdersAfter$paging_common_release(page.getItemsAfter());
            setPlaceholdersBefore$paging_common_release(page.getItemsBefore());
        }
        return true;
    }

    public final void setPlaceholdersAfter$paging_common_release(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this._placeholdersAfter = i10;
    }

    public final void setPlaceholdersBefore$paging_common_release(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this._placeholdersBefore = i10;
    }

    public final PageEvent<Value> toPageEvent$paging_common_release(PagingSource.LoadResult.Page<Key, Value> page, LoadType loadType) {
        AbstractC9133u.m16133g(page, "<this>");
        AbstractC9133u.m16133g(loadType, "loadType");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[loadType.ordinal()];
        int size = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                size = 0 - this.initialPageIndex;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = (this.pages.size() - this.initialPageIndex) - 1;
            }
        }
        List listM14755e = AbstractC8807u.m14755e(new TransformablePage(size, page.getData()));
        int i11 = iArr[loadType.ordinal()];
        if (i11 == 1) {
            return PageEvent.Insert.Companion.Refresh(listM14755e, getPlaceholdersBefore$paging_common_release(), getPlaceholdersAfter$paging_common_release(), this.sourceLoadStates.snapshot(), null);
        }
        if (i11 == 2) {
            return PageEvent.Insert.Companion.Prepend(listM14755e, getPlaceholdersBefore$paging_common_release(), this.sourceLoadStates.snapshot(), null);
        }
        if (i11 == 3) {
            return PageEvent.Insert.Companion.Append(listM14755e, getPlaceholdersAfter$paging_common_release(), this.sourceLoadStates.snapshot(), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private PageFetcherSnapshotState(PagingConfig pagingConfig) {
        this.config = pagingConfig;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.prependGenerationIdCh = AbstractC9159b.m16529b(-1, null, null, 6, null);
        this.appendGenerationIdCh = AbstractC9159b.m16529b(-1, null, null, 6, null);
        this.failedHintsByLoadType = new LinkedHashMap();
        MutableLoadStateCollection mutableLoadStateCollection = new MutableLoadStateCollection();
        mutableLoadStateCollection.set(LoadType.REFRESH, LoadState.Loading.INSTANCE);
        this.sourceLoadStates = mutableLoadStateCollection;
    }
}
