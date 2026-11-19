package androidx.paging;

import androidx.annotation.CheckResult;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PagingSource;
import androidx.paging.ViewportHint;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshotState<Key, Value> {
    private final List<PagingSource.LoadResult.Page<Key, Value>> _pages;
    private int _placeholdersAfter;
    private int _placeholdersBefore;
    private int appendGenerationId;
    private final InterfaceC10000a appendGenerationIdCh;
    private final PagingConfig config;
    private final Map<LoadType, ViewportHint> failedHintsByLoadType;
    private int initialPageIndex;
    private final Map<Integer, Key> pageKeys;
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;
    private int prependGenerationId;
    private final InterfaceC10000a prependGenerationIdCh;
    private MutableLoadStateCollection sourceLoadStates;

    public static final class Holder<Key, Value> {
        private final PagingConfig config;
        private final InterfaceC5189a lock;
        private final PageFetcherSnapshotState<Key, Value> state;

        public Holder(PagingConfig config) {
            AbstractC9979u.m20294g(config, "config");
            this.config = config;
            this.lock = AbstractC5194f.m2745b(false, 1, null);
            this.state = new PageFetcherSnapshotState<>(config, null);
        }

        private final <T> Object withLock$$forInline(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super T> interfaceC11588c) {
            InterfaceC5189a interfaceC5189a = this.lock;
            AbstractC9977s.m20287c(0);
            interfaceC5189a.lock(null, interfaceC11588c);
            AbstractC9977s.m20287c(1);
            try {
                return interfaceC9540l.invoke(this.state);
            } finally {
                AbstractC9977s.m20286b(1);
                interfaceC5189a.unlock(null);
                AbstractC9977s.m20285a(1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object withLock(p181hd.InterfaceC9540l r6, vc.InterfaceC11588c<? super T> r7) throws java.lang.Throwable {
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
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r6 = r0.L$1
                be.a r6 = (be.InterfaceC5189a) r6
                java.lang.Object r0 = r0.L$0
                hd.l r0 = (p181hd.InterfaceC9540l) r0
                kotlin.AbstractC9924b.m20071b(r7)
                r7 = r6
                r6 = r0
                goto L50
            L34:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.AbstractC9924b.m20071b(r7)
                be.a r7 = access$getLock$p(r5)
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r3
                java.lang.Object r0 = r7.lock(r4, r0)
                if (r0 != r1) goto L50
                return r1
            L50:
                androidx.paging.PageFetcherSnapshotState r0 = access$getState$p(r5)     // Catch: java.lang.Throwable -> L62
                java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L62
                kotlin.jvm.internal.AbstractC9977s.m20286b(r3)
                r7.unlock(r4)
                kotlin.jvm.internal.AbstractC9977s.m20285a(r3)
                return r6
            L62:
                r6 = move-exception
                kotlin.jvm.internal.AbstractC9977s.m20286b(r3)
                r7.unlock(r4)
                kotlin.jvm.internal.AbstractC9977s.m20285a(r3)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshotState.Holder.withLock(hd.l, vc.c):java.lang.Object");
        }
    }

    public static final /* synthetic */ class WhenMappings {
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

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", m26211f = "PageFetcherSnapshotState.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 */
    public static final class C42601 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ PageFetcherSnapshotState<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42601(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, InterfaceC11588c<? super C42601> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = pageFetcherSnapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42601(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            ((PageFetcherSnapshotState) this.this$0).appendGenerationIdCh.mo33808trySendJP2dKIU(AbstractC11826a.m26208c(((PageFetcherSnapshotState) this.this$0).appendGenerationId));
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42601) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", m26211f = "PageFetcherSnapshotState.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1 */
    public static final class C42611 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ PageFetcherSnapshotState<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42611(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, InterfaceC11588c<? super C42611> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = pageFetcherSnapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42611(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            ((PageFetcherSnapshotState) this.this$0).prependGenerationIdCh.mo33808trySendJP2dKIU(AbstractC11826a.m26208c(((PageFetcherSnapshotState) this.this$0).prependGenerationId));
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42611) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public /* synthetic */ PageFetcherSnapshotState(PagingConfig pagingConfig, AbstractC9972n abstractC9972n) {
        this(pagingConfig);
    }

    public final InterfaceC11594c consumeAppendGenerationIdAsFlow() {
        return AbstractC11596e.m25541L(AbstractC11596e.m25562l(this.appendGenerationIdCh), new C42601(this, null));
    }

    public final InterfaceC11594c consumePrependGenerationIdAsFlow() {
        return AbstractC11596e.m25541L(AbstractC11596e.m25562l(this.prependGenerationIdCh), new C42611(this, null));
    }

    public final PagingState<Key, Value> currentPagingState$paging_common(ViewportHint.Access access) {
        Integer numValueOf;
        List listM23922X0 = AbstractC10947g0.m23922X0(this.pages);
        if (access != null) {
            int placeholdersBefore$paging_common = getPlaceholdersBefore$paging_common();
            int i10 = -this.initialPageIndex;
            int iM24138p = AbstractC10978w.m24138p(this.pages) - this.initialPageIndex;
            int pageOffset = access.getPageOffset();
            int i11 = i10;
            while (i11 < pageOffset) {
                placeholdersBefore$paging_common += i11 > iM24138p ? this.config.pageSize : this.pages.get(this.initialPageIndex + i11).getData().size();
                i11++;
            }
            int size = placeholdersBefore$paging_common + (access.getPresentedItemsAfter() < 0 ? (this.pages.get(access.getPageOffset() + this.initialPageIndex).getData().size() - 1) + Math.abs(access.getPresentedItemsAfter()) : access.getPresentedItemsBefore() < 0 ? access.getPresentedItemsBefore() : access.getIndexInPage());
            if (access.getPageOffset() < i10) {
                size -= this.config.pageSize;
            }
            numValueOf = Integer.valueOf(size);
        } else {
            numValueOf = null;
        }
        return new PagingState<>(listM23922X0, numValueOf, this.config, getPlaceholdersBefore$paging_common());
    }

    public final void drop(PageEvent.Drop<Value> event) {
        AbstractC9979u.m20294g(event, "event");
        if (event.getPageCount() > this.pages.size()) {
            throw new IllegalStateException(("invalid drop count. have " + this.pages.size() + " but wanted to drop " + event.getPageCount()).toString());
        }
        this.failedHintsByLoadType.remove(event.getLoadType());
        this.sourceLoadStates.set(event.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common());
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.getLoadType().ordinal()];
        if (i10 == 2) {
            int pageCount = event.getPageCount();
            for (int i11 = 0; i11 < pageCount; i11++) {
                this.pageKeys.remove(Integer.valueOf(this._pages.remove(0).hashCode()));
            }
            this.initialPageIndex -= event.getPageCount();
            setPlaceholdersBefore$paging_common(event.getPlaceholdersRemaining());
            int i12 = this.prependGenerationId + 1;
            this.prependGenerationId = i12;
            this.prependGenerationIdCh.mo33808trySendJP2dKIU(Integer.valueOf(i12));
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("cannot drop " + event.getLoadType());
        }
        int pageCount2 = event.getPageCount();
        for (int i13 = 0; i13 < pageCount2; i13++) {
            this.pageKeys.remove(Integer.valueOf(this._pages.remove(this.pages.size() - 1).hashCode()));
        }
        setPlaceholdersAfter$paging_common(event.getPlaceholdersRemaining());
        int i14 = this.appendGenerationId + 1;
        this.appendGenerationId = i14;
        this.appendGenerationIdCh.mo33808trySendJP2dKIU(Integer.valueOf(i14));
    }

    public final PageEvent.Drop<Value> dropEventOrNull(LoadType loadType, ViewportHint hint) {
        int size;
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(hint, "hint");
        if (this.config.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || getStorageCount$paging_common() <= this.config.maxSize) {
            return null;
        }
        if (loadType == LoadType.REFRESH) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int placeholdersBefore$paging_common = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.pages.size() && getStorageCount$paging_common() - i11 > this.config.maxSize) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[loadType.ordinal()] == 2) {
                size = this.pages.get(i10).getData().size();
            } else {
                List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
                size = list.get(AbstractC10978w.m24138p(list) - i10).getData().size();
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
        int iM24138p = iArr2[loadType.ordinal()] == 2 ? -this.initialPageIndex : (AbstractC10978w.m24138p(this.pages) - this.initialPageIndex) - (i10 - 1);
        int iM24138p2 = iArr2[loadType.ordinal()] == 2 ? (i10 - 1) - this.initialPageIndex : AbstractC10978w.m24138p(this.pages) - this.initialPageIndex;
        if (this.config.enablePlaceholders) {
            placeholdersBefore$paging_common = (loadType == LoadType.PREPEND ? getPlaceholdersBefore$paging_common() : getPlaceholdersAfter$paging_common()) + i11;
        }
        return new PageEvent.Drop<>(loadType, iM24138p, iM24138p2, placeholdersBefore$paging_common);
    }

    public final int generationId$paging_common(LoadType loadType) {
        AbstractC9979u.m20294g(loadType, "loadType");
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

    public final Map<LoadType, ViewportHint> getFailedHintsByLoadType$paging_common() {
        return this.failedHintsByLoadType;
    }

    public final int getInitialPageIndex$paging_common() {
        return this.initialPageIndex;
    }

    public final Key getLoadKey(PagingSource.LoadResult.Page<Key, Value> page) {
        AbstractC9979u.m20294g(page, "page");
        int iHashCode = page.hashCode();
        if (this.pageKeys.containsKey(Integer.valueOf(iHashCode))) {
            return this.pageKeys.get(Integer.valueOf(iHashCode));
        }
        throw new IllegalArgumentException("Load key not found for Page " + page + ". This likely indicates an error in the library. Please file a bug in the Buganizer.");
    }

    public final List<PagingSource.LoadResult.Page<Key, Value>> getPages$paging_common() {
        return this.pages;
    }

    public final int getPlaceholdersAfter$paging_common() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersAfter;
        }
        return 0;
    }

    public final int getPlaceholdersBefore$paging_common() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersBefore;
        }
        return 0;
    }

    public final MutableLoadStateCollection getSourceLoadStates$paging_common() {
        return this.sourceLoadStates;
    }

    public final int getStorageCount$paging_common() {
        Iterator<T> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((PagingSource.LoadResult.Page) it.next()).getData().size();
        }
        return size;
    }

    @CheckResult
    public final boolean insert(int i10, LoadType loadType, PagingSource.LoadResult.Page<Key, Value> page, Key key) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(page, "page");
        int i11 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.pages.isEmpty()) {
                    throw new IllegalStateException("should've received an init before append");
                }
                if (i10 != this.appendGenerationId) {
                    return false;
                }
                this._pages.add(page);
                this.pageKeys.put(Integer.valueOf(page.hashCode()), key);
                setPlaceholdersAfter$paging_common(page.getItemsAfter() == Integer.MIN_VALUE ? AbstractC10410o.m21752e(getPlaceholdersAfter$paging_common() - page.getData().size(), 0) : page.getItemsAfter());
                this.failedHintsByLoadType.remove(LoadType.APPEND);
            } else {
                if (this.pages.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i10 != this.prependGenerationId) {
                    return false;
                }
                this._pages.add(0, page);
                this.pageKeys.put(Integer.valueOf(page.hashCode()), key);
                this.initialPageIndex++;
                setPlaceholdersBefore$paging_common(page.getItemsBefore() == Integer.MIN_VALUE ? AbstractC10410o.m21752e(getPlaceholdersBefore$paging_common() - page.getData().size(), 0) : page.getItemsBefore());
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
            this.pageKeys.put(Integer.valueOf(page.hashCode()), key);
            this.initialPageIndex = 0;
            setPlaceholdersAfter$paging_common(page.getItemsAfter());
            setPlaceholdersBefore$paging_common(page.getItemsBefore());
            C10786q c10786q = C10786q.f26013a;
        }
        return true;
    }

    public final void setPlaceholdersAfter$paging_common(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this._placeholdersAfter = i10;
    }

    public final void setPlaceholdersBefore$paging_common(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this._placeholdersBefore = i10;
    }

    public final PageEvent<Value> toPageEvent$paging_common(PagingSource.LoadResult.Page<Key, Value> page, LoadType loadType) {
        AbstractC9979u.m20294g(page, "<this>");
        AbstractC9979u.m20294g(loadType, "loadType");
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
        List listM24126e = AbstractC10976v.m24126e(new TransformablePage(size, page.getData()));
        int i11 = iArr[loadType.ordinal()];
        if (i11 == 1) {
            return PageEvent.Insert.Companion.Refresh(listM24126e, getPlaceholdersBefore$paging_common(), getPlaceholdersAfter$paging_common(), this.sourceLoadStates.snapshot(), null);
        }
        if (i11 == 2) {
            return PageEvent.Insert.Companion.Prepend(listM24126e, getPlaceholdersBefore$paging_common(), this.sourceLoadStates.snapshot(), null);
        }
        if (i11 == 3) {
            return PageEvent.Insert.Companion.Append(listM24126e, getPlaceholdersAfter$paging_common(), this.sourceLoadStates.snapshot(), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private PageFetcherSnapshotState(PagingConfig pagingConfig) {
        this.config = pagingConfig;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.pageKeys = new LinkedHashMap();
        this.prependGenerationIdCh = AbstractC10001b.m20722b(-1, null, null, 6, null);
        this.appendGenerationIdCh = AbstractC10001b.m20722b(-1, null, null, 6, null);
        this.failedHintsByLoadType = new LinkedHashMap();
        MutableLoadStateCollection mutableLoadStateCollection = new MutableLoadStateCollection();
        mutableLoadStateCollection.set(LoadType.REFRESH, LoadState.Loading.INSTANCE);
        this.sourceLoadStates = mutableLoadStateCollection;
    }
}
