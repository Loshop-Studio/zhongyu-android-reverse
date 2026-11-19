package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PageEvent;
import com.taobao.sophix.PatchStatus;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(m13412d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001OB!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001f\u0010+\u001a\u00020\n2\u0017\u0010,\u001a\u0013\u0012\t\u0012\u00070\u0019¢\u0006\u0002\b.\u0012\u0004\u0012\u00020\n0-J\u0014\u0010/\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\"J!\u00100\u001a\u00070\n¢\u0006\u0002\b.2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0002\u00102J\u001a\u00103\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u00104\u001a\u00020\u0015H\u0087\u0002¢\u0006\u0002\u00105J\u0019\u00106\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u00104\u001a\u00020\u0015H\u0007¢\u0006\u0002\u00105JV\u00107\u001a\u00020\n2\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:092\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010A\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010BJ!\u0010C\u001a\u00070\n¢\u0006\u0002\b.2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000EH¦@¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020\nJ\u001f\u0010H\u001a\u00020\n2\u0017\u0010,\u001a\u0013\u0012\t\u0012\u00070\u0019¢\u0006\u0002\b.\u0012\u0004\u0012\u00020\n0-J\u0014\u0010I\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\"J\u0006\u0010J\u001a\u00020\nJ\u0010\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020*H\u0002J\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000NR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\"0!j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\"`#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, m13413d2 = {"Landroidx/paging/PagingDataPresenter;", ExifInterface.GPS_DIRECTION_TRUE, "", "mainContext", "Lkotlin/coroutines/CoroutineContext;", "cachedPagingData", "Landroidx/paging/PagingData;", "(Lkotlin/coroutines/CoroutineContext;Landroidx/paging/PagingData;)V", "_onPagesUpdatedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "collectFromRunner", "Landroidx/paging/SingleRunner;", "combinedLoadStatesCollection", "Landroidx/paging/MutableCombinedLoadStateCollection;", "hintReceiver", "Landroidx/paging/HintReceiver;", "inGetItem", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "lastAccessedIndex", "", "lastAccessedIndexUnfulfilled", "loadStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/CombinedLoadStates;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "onPagesUpdatedFlow", "Lkotlinx/coroutines/flow/Flow;", "getOnPagesUpdatedFlow", "()Lkotlinx/coroutines/flow/Flow;", "onPagesUpdatedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "Landroidx/paging/internal/CopyOnWriteArrayList;", "pageStore", "Landroidx/paging/PageStore;", "size", "getSize", "()I", "uiReceiver", "Landroidx/paging/UiReceiver;", "addLoadStateListener", "listener", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "addOnPagesUpdatedListener", "collectFrom", "pagingData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "index", "(I)Ljava/lang/Object;", "peek", "presentNewList", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersBefore", "placeholdersAfter", "dispatchLoadStates", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "newHintReceiver", "(Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentPagingDataEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/paging/PagingDataEvent;", "(Landroidx/paging/PagingDataEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "removeLoadStateListener", "removeOnPagesUpdatedListener", "retry", "setUiReceiver", "receiver", "snapshot", "Landroidx/paging/ItemSnapshotList;", "InitialUiReceiver", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagingDataPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n+ 5 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,553:1\n1#2:554\n230#3,5:555\n230#3,5:570\n32#4,10:560\n32#4,10:575\n32#4,10:585\n32#4,8:595\n41#4:608\n27#5,5:603\n*S KotlinDebug\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter\n*L\n272#1:555,5\n278#1:570,5\n276#1:560,10\n311#1:575,10\n332#1:585,10\n484#1:595,8\n484#1:608\n485#1:603,5\n*E\n"})
/* loaded from: classes3.dex */
public abstract class PagingDataPresenter<T> {
    private final MutableSharedFlow<Unit> _onPagesUpdatedFlow;
    private final SingleRunner collectFromRunner;
    private final MutableCombinedLoadStateCollection combinedLoadStatesCollection;
    private HintReceiver hintReceiver;
    private final MutableStateFlow<Boolean> inGetItem;
    private volatile int lastAccessedIndex;
    private volatile boolean lastAccessedIndexUnfulfilled;
    private final StateFlow<CombinedLoadStates> loadStateFlow;
    private final CoroutineContext mainContext;
    private final CopyOnWriteArrayList<Function0<Unit>> onPagesUpdatedListeners;
    private PageStore<T> pageStore;
    private UiReceiver uiReceiver;

    @Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\fH\u0016J\b\u0010\t\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, m13413d2 = {"Landroidx/paging/PagingDataPresenter$InitialUiReceiver;", "Landroidx/paging/UiReceiver;", "()V", "refresh", "", "getRefresh", "()Z", "setRefresh", "(Z)V", "retry", "getRetry", "setRetry", "", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class InitialUiReceiver implements UiReceiver {
        private boolean refresh;
        private boolean retry;

        public final boolean getRefresh() {
            return this.refresh;
        }

        public final boolean getRetry() {
            return this.retry;
        }

        @Override // androidx.paging.UiReceiver
        public void refresh() {
            this.refresh = true;
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
            this.retry = true;
        }

        public final void setRefresh(boolean z9) {
            this.refresh = z9;
        }

        public final void setRetry(boolean z9) {
            this.retry = z9;
        }
    }

    @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, ""}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.PagingDataPresenter$collectFrom$2", m13451f = "PagingDataPresenter.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_RES_INJECT_PATH}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2 */
    public static final class C44202 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PagingData<T> $pagingData;
        int label;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44202(PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, Continuation<? super C44202> continuation) {
            super(1, continuation);
            this.this$0 = pagingDataPresenter;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C44202(this.this$0, this.$pagingData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setUiReceiver(this.$pagingData.getUiReceiver());
                Flow<PageEvent<T>> flow$paging_common_release = this.$pagingData.getFlow$paging_common_release();
                final PagingDataPresenter<T> pagingDataPresenter = this.this$0;
                final PagingData<T> pagingData = this.$pagingData;
                FlowCollector<? super PageEvent<T>> flowCollector = new FlowCollector() { // from class: androidx.paging.PagingDataPresenter.collectFrom.2.1

                    @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                    @DebugMetadata(m13450c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", m13451f = "PagingDataPresenter.kt", m13452i = {}, m13453l = {141, 158, 170, 173, 225, 228}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
                    @SourceDebugExtension({"SMAP\nPagingDataPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,553:1\n1726#2,3:554\n1855#2,2:557\n*S KotlinDebug\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1$2\n*L\n201#1:554,3\n254#1:557,2\n*E\n"})
                    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ PageEvent<T> $event;
                        final /* synthetic */ PagingData<T> $pagingData;
                        int label;
                        final /* synthetic */ PagingDataPresenter<T> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(PageEvent<T> pageEvent, PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$event = pageEvent;
                            this.this$0 = pagingDataPresenter;
                            this.$pagingData = pagingData;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$event, this.this$0, this.$pagingData, continuation);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
                        
                            if (r14 == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
                        
                            if (r1.presentNewList(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L40;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:90:0x0241, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L92;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:102:0x028c  */
                        /* JADX WARN: Removed duplicated region for block: B:105:0x029c A[LOOP:0: B:103:0x0296->B:105:0x029c, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x00f7 A[PHI: r9
                          0x00f7: PHI (r9v4 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v5 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:33:0x00ea, B:35:0x00f3, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x022e A[PHI: r9
                          0x022e: PHI (r9v8 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v9 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:85:0x0222, B:87:0x022b, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                            /*
                                Method dump skipped, instructions count: 700
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.C44202.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PageEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PageEvent<T> pageEvent, Continuation<? super Unit> continuation) {
                        PagingLogger pagingLogger = PagingLogger.INSTANCE;
                        if (pagingLogger.isLoggable(2)) {
                            pagingLogger.log(2, "Collected " + pageEvent, null);
                        }
                        Object objWithContext = BuildersKt.withContext(((PagingDataPresenter) pagingDataPresenter).mainContext, new AnonymousClass2(pageEvent, pagingDataPresenter, pagingData, null), continuation);
                        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow$paging_common_release.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C44202) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.PagingDataPresenter", m13451f = "PagingDataPresenter.kt", m13452i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m13453l = {478}, m13454m = "presentNewList", m13455n = {"this", "pages", "sourceLoadStates", "mediatorLoadStates", "newHintReceiver", "newPageStore", "placeholdersBefore", "placeholdersAfter", "dispatchLoadStates"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "Z$0"})
    /* renamed from: androidx.paging.PagingDataPresenter$presentNewList$1 */
    public static final class C44211 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44211(PagingDataPresenter<T> pagingDataPresenter, Continuation<? super C44211> continuation) {
            super(continuation);
            this.this$0 = pagingDataPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.presentNewList(null, 0, 0, false, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagingDataPresenter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object presentNewList(java.util.List<androidx.paging.TransformablePage<T>> r8, int r9, int r10, boolean r11, androidx.paging.LoadStates r12, androidx.paging.LoadStates r13, androidx.paging.HintReceiver r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.presentNewList(java.util.List, int, int, boolean, androidx.paging.LoadStates, androidx.paging.LoadStates, androidx.paging.HintReceiver, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUiReceiver(UiReceiver receiver) {
        UiReceiver uiReceiver = this.uiReceiver;
        this.uiReceiver = receiver;
        if (uiReceiver instanceof InitialUiReceiver) {
            InitialUiReceiver initialUiReceiver = (InitialUiReceiver) uiReceiver;
            if (initialUiReceiver.getRetry()) {
                receiver.retry();
            }
            if (initialUiReceiver.getRefresh()) {
                receiver.refresh();
            }
        }
    }

    public final void addLoadStateListener(Function1<CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.combinedLoadStatesCollection.addListener(listener);
    }

    public final void addOnPagesUpdatedListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPagesUpdatedListeners.add(listener);
    }

    public final Object collectFrom(PagingData<T> pagingData, Continuation<Unit> continuation) {
        Object objRunInIsolation$default = SingleRunner.runInIsolation$default(this.collectFromRunner, 0, new C44202(this, pagingData, null), continuation, 1, null);
        return objRunInIsolation$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunInIsolation$default : Unit.INSTANCE;
    }

    @MainThread
    public final T get(@IntRange(from = 0) int index) {
        Boolean value;
        Boolean value2;
        MutableStateFlow<Boolean> mutableStateFlow = this.inGetItem;
        do {
            value = mutableStateFlow.getValue();
            value.getClass();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = index;
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            pagingLogger.log(2, "Accessing item index[" + index + ']', null);
        }
        HintReceiver hintReceiver = this.hintReceiver;
        if (hintReceiver != null) {
            hintReceiver.accessHint(this.pageStore.accessHintForPresenterIndex(index));
        }
        T t9 = this.pageStore.get(index);
        MutableStateFlow<Boolean> mutableStateFlow2 = this.inGetItem;
        do {
            value2 = mutableStateFlow2.getValue();
            value2.getClass();
        } while (!mutableStateFlow2.compareAndSet(value2, Boolean.FALSE));
        return t9;
    }

    public final StateFlow<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final Flow<Unit> getOnPagesUpdatedFlow() {
        return FlowKt.asSharedFlow(this._onPagesUpdatedFlow);
    }

    public final int getSize() {
        return this.pageStore.getSize();
    }

    @MainThread
    public final T peek(@IntRange(from = 0) int index) {
        return this.pageStore.get(index);
    }

    public abstract Object presentPagingDataEvent(PagingDataEvent<T> pagingDataEvent, Continuation<Unit> continuation);

    public final void refresh() {
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Refresh signal received", null);
        }
        this.uiReceiver.refresh();
    }

    public final void removeLoadStateListener(Function1<CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.combinedLoadStatesCollection.removeListener(listener);
    }

    public final void removeOnPagesUpdatedListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPagesUpdatedListeners.remove(listener);
    }

    public final void retry() {
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Retry signal received", null);
        }
        this.uiReceiver.retry();
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.pageStore.snapshot();
    }

    public PagingDataPresenter(CoroutineContext mainContext, PagingData<T> pagingData) {
        PageEvent.Insert<T> insertCachedEvent$paging_common_release;
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.mainContext = mainContext;
        this.uiReceiver = new InitialUiReceiver();
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.pageStore = PageStore.INSTANCE.initial$paging_common_release(pagingData != null ? pagingData.cachedEvent$paging_common_release() : null);
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        if (pagingData != null && (insertCachedEvent$paging_common_release = pagingData.cachedEvent$paging_common_release()) != null) {
            mutableCombinedLoadStateCollection.set(insertCachedEvent$paging_common_release.getSourceLoadStates(), insertCachedEvent$paging_common_release.getMediatorLoadStates());
        }
        this.combinedLoadStatesCollection = mutableCombinedLoadStateCollection;
        this.onPagesUpdatedListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new SingleRunner(false, 1, defaultConstructorMarker);
        this.inGetItem = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.loadStateFlow = mutableCombinedLoadStateCollection.getStateFlow();
        this._onPagesUpdatedFlow = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        addOnPagesUpdatedListener(new Function0<Unit>(this) { // from class: androidx.paging.PagingDataPresenter.1
            final /* synthetic */ PagingDataPresenter<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((PagingDataPresenter) this.this$0)._onPagesUpdatedFlow.tryEmit(Unit.INSTANCE);
            }
        });
    }

    public /* synthetic */ PagingDataPresenter(CoroutineContext coroutineContext, PagingData pagingData, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? Dispatchers.getMain() : coroutineContext, (i9 & 2) != 0 ? null : pagingData);
    }
}
