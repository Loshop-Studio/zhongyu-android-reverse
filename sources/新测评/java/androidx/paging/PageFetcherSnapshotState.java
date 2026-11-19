package androidx.paging;

import androidx.annotation.CheckResult;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PagingSource;
import androidx.paging.ViewportHint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(m13557d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001FB\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0/J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0/J#\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0000¢\u0006\u0002\b5J\u0014\u00106\u001a\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000109J\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001092\u0006\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0013J\u0015\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0002\b>J,\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0007J+\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00010D*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0002\bER \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\"R$\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020(@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u0006G"}, m13558d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "Key", "", "Value", "config", "Landroidx/paging/PagingConfig;", "(Landroidx/paging/PagingConfig;)V", "_pages", "", "Landroidx/paging/PagingSource$LoadResult$Page;", "_placeholdersAfter", "", "_placeholdersBefore", "appendGenerationId", "appendGenerationIdCh", "Lkotlinx/coroutines/channels/Channel;", "failedHintsByLoadType", "", "Landroidx/paging/LoadType;", "Landroidx/paging/ViewportHint;", "getFailedHintsByLoadType$paging_common_release", "()Ljava/util/Map;", "<set-?>", "initialPageIndex", "getInitialPageIndex$paging_common_release", "()I", "pages", "", "getPages$paging_common_release", "()Ljava/util/List;", "value", "placeholdersAfter", "getPlaceholdersAfter$paging_common_release", "setPlaceholdersAfter$paging_common_release", "(I)V", "placeholdersBefore", "getPlaceholdersBefore$paging_common_release", "setPlaceholdersBefore$paging_common_release", "prependGenerationId", "prependGenerationIdCh", "Landroidx/paging/MutableLoadStateCollection;", "sourceLoadStates", "getSourceLoadStates$paging_common_release", "()Landroidx/paging/MutableLoadStateCollection;", "storageCount", "getStorageCount$paging_common_release", "consumeAppendGenerationIdAsFlow", "Lkotlinx/coroutines/flow/Flow;", "consumePrependGenerationIdAsFlow", "currentPagingState", "Landroidx/paging/PagingState;", "viewportHint", "Landroidx/paging/ViewportHint$Access;", "currentPagingState$paging_common_release", "drop", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/paging/PageEvent$Drop;", "dropEventOrNull", "loadType", "hint", "generationId", "generationId$paging_common_release", "insert", "", "loadId", "page", "toPageEvent", "Landroidx/paging/PageEvent;", "toPageEvent$paging_common_release", "Holder", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
/* loaded from: classes3.dex */
public final class PageFetcherSnapshotState<Key, Value> {
    private final List<PagingSource.LoadResult.Page<Key, Value>> _pages;
    private int _placeholdersAfter;
    private int _placeholdersBefore;
    private int appendGenerationId;
    private final Channel<Integer> appendGenerationIdCh;
    private final PagingConfig config;
    private final Map<LoadType, ViewportHint> failedHintsByLoadType;
    private int initialPageIndex;
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;
    private int prependGenerationId;
    private final Channel<Integer> prependGenerationIdCh;
    private MutableLoadStateCollection sourceLoadStates;

    @Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JC\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0004\u0010\f2-\u0010\r\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t\u0012\u0004\u0012\u0002H\f0\u000eH\u0086H¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m13558d2 = {"Landroidx/paging/PageFetcherSnapshotState$Holder;", "Key", "", "Value", "config", "Landroidx/paging/PagingConfig;", "(Landroidx/paging/PagingConfig;)V", "lock", "Lkotlinx/coroutines/sync/Mutex;", "state", "Landroidx/paging/PageFetcherSnapshotState;", "withLock", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,396:1\n120#2,10:397\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n*L\n390#1:397,10\n*E\n"})
    public static final class Holder<Key, Value> {
        private final PagingConfig config;
        private final Mutex lock;
        private final PageFetcherSnapshotState<Key, Value> state;

        public Holder(PagingConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
            this.lock = MutexKt.Mutex$default(false, 1, null);
            this.state = new PageFetcherSnapshotState<>(config, null);
        }

        private final <T> Object withLock$$forInline(Function1<? super PageFetcherSnapshotState<Key, Value>, ? extends T> function1, Continuation<? super T> continuation) {
            Mutex mutex = this.lock;
            InlineMarker.mark(0);
            mutex.lock(null, continuation);
            InlineMarker.mark(1);
            try {
                return function1.invoke(this.state);
            } finally {
                InlineMarker.finallyStart(1);
                mutex.unlock(null);
                InlineMarker.finallyEnd(1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object withLock(kotlin.jvm.functions.Function1<? super androidx.paging.PageFetcherSnapshotState<Key, Value>, ? extends T> r6, kotlin.coroutines.Continuation<? super T> r7) {
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
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L40
                if (r2 != r3) goto L38
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
                java.lang.Object r1 = r0.L$1
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.PageFetcherSnapshotState$Holder r0 = (androidx.paging.PageFetcherSnapshotState.Holder) r0
                kotlin.ResultKt.throwOnFailure(r7)
                r7 = r6
                r6 = r1
                goto L57
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L40:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.sync.Mutex r7 = access$getLock$p(r5)
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
                kotlin.jvm.internal.InlineMarker.finallyStart(r3)
                r7.unlock(r4)
                kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
                return r6
            L69:
                r6 = move-exception
                kotlin.jvm.internal.InlineMarker.finallyStart(r3)
                r7.unlock(r4)
                kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshotState.Holder.withLock(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
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

    @Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", m13596f = "PageFetcherSnapshotState.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 */
    public static final class C42551 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PageFetcherSnapshotState<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42551(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, Continuation<? super C42551> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C42551(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((PageFetcherSnapshotState) this.this$0).appendGenerationIdCh.mo24070trySendJP2dKIU(Boxing.boxInt(((PageFetcherSnapshotState) this.this$0).appendGenerationId));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((C42551) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", m13596f = "PageFetcherSnapshotState.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1 */
    public static final class C42561 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PageFetcherSnapshotState<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42561(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, Continuation<? super C42561> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C42561(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((PageFetcherSnapshotState) this.this$0).prependGenerationIdCh.mo24070trySendJP2dKIU(Boxing.boxInt(((PageFetcherSnapshotState) this.this$0).prependGenerationId));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((C42561) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ PageFetcherSnapshotState(PagingConfig pagingConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(pagingConfig);
    }

    public final Flow<Integer> consumeAppendGenerationIdAsFlow() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.appendGenerationIdCh), new C42551(this, null));
    }

    public final Flow<Integer> consumePrependGenerationIdAsFlow() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.prependGenerationIdCh), new C42561(this, null));
    }

    public final PagingState<Key, Value> currentPagingState$paging_common_release(ViewportHint.Access viewportHint) {
        Integer numValueOf;
        List list = CollectionsKt.toList(this.pages);
        if (viewportHint != null) {
            int placeholdersBefore$paging_common_release = getPlaceholdersBefore$paging_common_release();
            int i10 = -this.initialPageIndex;
            int lastIndex = CollectionsKt.getLastIndex(this.pages) - this.initialPageIndex;
            int pageOffset = viewportHint.getPageOffset();
            int i11 = i10;
            while (i11 < pageOffset) {
                placeholdersBefore$paging_common_release += i11 > lastIndex ? this.config.pageSize : this.pages.get(this.initialPageIndex + i11).getData().size();
                i11++;
            }
            int indexInPage = placeholdersBefore$paging_common_release + viewportHint.getIndexInPage();
            if (viewportHint.getPageOffset() < i10) {
                indexInPage -= this.config.pageSize;
            }
            numValueOf = Integer.valueOf(indexInPage);
        } else {
            numValueOf = null;
        }
        return new PagingState<>(list, numValueOf, this.config, getPlaceholdersBefore$paging_common_release());
    }

    public final void drop(PageEvent.Drop<Value> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPageCount() > this.pages.size()) {
            throw new IllegalStateException(("invalid drop count. have " + this.pages.size() + " but wanted to drop " + event.getPageCount()).toString());
        }
        this.failedHintsByLoadType.remove(event.getLoadType());
        this.sourceLoadStates.set(event.getLoadType(), LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
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
            this.prependGenerationIdCh.mo24070trySendJP2dKIU(Integer.valueOf(i12));
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
        this.appendGenerationIdCh.mo24070trySendJP2dKIU(Integer.valueOf(i14));
    }

    public final PageEvent.Drop<Value> dropEventOrNull(LoadType loadType, ViewportHint hint) {
        int size;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(hint, "hint");
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
                size = list.get(CollectionsKt.getLastIndex(list) - i10).getData().size();
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
        int lastIndex = iArr2[loadType.ordinal()] == 2 ? -this.initialPageIndex : (CollectionsKt.getLastIndex(this.pages) - this.initialPageIndex) - (i10 - 1);
        int lastIndex2 = iArr2[loadType.ordinal()] == 2 ? (i10 - 1) - this.initialPageIndex : CollectionsKt.getLastIndex(this.pages) - this.initialPageIndex;
        if (this.config.enablePlaceholders) {
            placeholdersBefore$paging_common_release = (loadType == LoadType.PREPEND ? getPlaceholdersBefore$paging_common_release() : getPlaceholdersAfter$paging_common_release()) + i11;
        }
        return new PageEvent.Drop<>(loadType, lastIndex, lastIndex2, placeholdersBefore$paging_common_release);
    }

    public final int generationId$paging_common_release(LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
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

    /* renamed from: getInitialPageIndex$paging_common_release, reason: from getter */
    public final int getInitialPageIndex() {
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

    /* renamed from: getSourceLoadStates$paging_common_release, reason: from getter */
    public final MutableLoadStateCollection getSourceLoadStates() {
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
    public final boolean insert(int loadId, LoadType loadType, PagingSource.LoadResult.Page<Key, Value> page) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(page, "page");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.pages.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    }
                    if (loadId != this.appendGenerationId) {
                        return false;
                    }
                    this._pages.add(page);
                    setPlaceholdersAfter$paging_common_release(page.getItemsAfter() == Integer.MIN_VALUE ? RangesKt.coerceAtLeast(getPlaceholdersAfter$paging_common_release() - page.getData().size(), 0) : page.getItemsAfter());
                    this.failedHintsByLoadType.remove(LoadType.APPEND);
                }
            } else {
                if (this.pages.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (loadId != this.prependGenerationId) {
                    return false;
                }
                this._pages.add(0, page);
                this.initialPageIndex++;
                setPlaceholdersBefore$paging_common_release(page.getItemsBefore() == Integer.MIN_VALUE ? RangesKt.coerceAtLeast(getPlaceholdersBefore$paging_common_release() - page.getData().size(), 0) : page.getItemsBefore());
                this.failedHintsByLoadType.remove(LoadType.PREPEND);
            }
        } else {
            if (!this.pages.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (loadId != 0) {
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
        Intrinsics.checkNotNullParameter(page, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
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
        List listListOf = CollectionsKt.listOf(new TransformablePage(size, page.getData()));
        int i11 = iArr[loadType.ordinal()];
        if (i11 == 1) {
            return PageEvent.Insert.INSTANCE.Refresh(listListOf, getPlaceholdersBefore$paging_common_release(), getPlaceholdersAfter$paging_common_release(), this.sourceLoadStates.snapshot(), null);
        }
        if (i11 == 2) {
            return PageEvent.Insert.INSTANCE.Prepend(listListOf, getPlaceholdersBefore$paging_common_release(), this.sourceLoadStates.snapshot(), null);
        }
        if (i11 == 3) {
            return PageEvent.Insert.INSTANCE.Append(listListOf, getPlaceholdersAfter$paging_common_release(), this.sourceLoadStates.snapshot(), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private PageFetcherSnapshotState(PagingConfig pagingConfig) {
        this.config = pagingConfig;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.prependGenerationIdCh = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.appendGenerationIdCh = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.failedHintsByLoadType = new LinkedHashMap();
        MutableLoadStateCollection mutableLoadStateCollection = new MutableLoadStateCollection();
        mutableLoadStateCollection.set(LoadType.REFRESH, LoadState.Loading.INSTANCE);
        this.sourceLoadStates = mutableLoadStateCollection;
    }
}
