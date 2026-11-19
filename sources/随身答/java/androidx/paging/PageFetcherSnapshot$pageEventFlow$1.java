package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [Value] */
@Metadata(m13412d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, m13413d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", m13451f = "PageFetcherSnapshot.kt", m13452i = {0, 0, 0, 0, 1, 2, 2, 2}, m13453l = {646, 168, 657}, m13454m = "invokeSuspend", m13455n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock_u24default$iv$iv"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n390#2:651\n391#2:660\n120#3,8:641\n129#3:650\n120#3,8:652\n129#3:661\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1\n*L\n161#1:640\n161#1:649\n171#1:651\n171#1:660\n161#1:641,8\n161#1:650\n171#1:652,8\n171#1:661\n*E\n"})
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1<Value> extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Value>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    @Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13413d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", m13451f = "PageFetcherSnapshot.kt", m13452i = {}, m13453l = {91}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 */
    public static final class C43962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43962(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, SimpleProducerScope<PageEvent<Value>> simpleProducerScope, Continuation<? super C43962> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
            this.$$this$cancelableChannelFlow = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C43962(this.this$0, this.$$this$cancelableChannelFlow, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(((PageFetcherSnapshot) this.this$0).pageEventCh);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$cancelableChannelFlow);
                this.label = 1;
                if (flowConsumeAsFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C43962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Metadata(m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m13413d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/PageEvent;", "emit", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;

            public AnonymousClass1(SimpleProducerScope<PageEvent<Value>> simpleProducerScope) {
                this.$$this$cancelableChannelFlow = simpleProducerScope;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(androidx.paging.PageEvent<Value> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    goto L3f
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.ResultKt.throwOnFailure(r6)
                    androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> r6 = r4.$$this$cancelableChannelFlow     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    java.lang.Object r5 = r6.send(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    if (r5 != r1) goto L3f
                    return r1
                L3f:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C43962.AnonymousClass1.emit(androidx.paging.PageEvent, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((PageEvent) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    @Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13413d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", m13451f = "PageFetcherSnapshot.kt", m13452i = {}, m13453l = {105}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 */
    public static final class C43973 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $retryChannel;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43973(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Channel<Unit> channel, Continuation<? super C43973> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
            this.$retryChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C43973(this.this$0, this.$retryChannel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = ((PageFetcherSnapshot) this.this$0).retryFlow;
                final Channel<Unit> channel = this.$retryChannel;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.paging.PageFetcherSnapshot.pageEventFlow.1.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Unit) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        channel.mo24505trySendJP2dKIU(unit);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C43973) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13413d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", m13451f = "PageFetcherSnapshot.kt", m13452i = {}, m13453l = {110}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 */
    public static final class C43984 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m13413d2 = {"<anonymous>", "", "Key", "", "Value", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 LoadStates.kt\nandroidx/paging/LoadStates\n*L\n1#1,639:1\n390#2:640\n391#2:649\n390#2:652\n391#2:661\n390#2:663\n391#2:672\n390#2:674\n391#2:683\n390#2:686\n391#2:695\n390#2:697\n391#2:706\n390#2:708\n391#2:717\n390#2:720\n391#2:729\n390#2:731\n391#2:740\n390#2:742\n391#2:751\n120#3,8:641\n129#3:650\n120#3,8:653\n129#3:662\n120#3,8:664\n129#3:673\n120#3,8:675\n129#3:684\n120#3,8:687\n129#3:696\n120#3,8:698\n129#3:707\n120#3,8:709\n129#3:718\n120#3,8:721\n129#3:730\n120#3,8:732\n129#3:741\n120#3,8:743\n129#3:752\n36#4:651\n37#4:685\n38#4:719\n39#4:753\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1\n*L\n111#1:640\n111#1:649\n125#1:652\n125#1:661\n133#1:663\n133#1:672\n142#1:674\n142#1:683\n125#1:686\n125#1:695\n133#1:697\n133#1:706\n142#1:708\n142#1:717\n125#1:720\n125#1:729\n133#1:731\n133#1:740\n142#1:742\n142#1:751\n111#1:641,8\n111#1:650\n125#1:653,8\n125#1:662\n133#1:664,8\n133#1:673\n142#1:675,8\n142#1:684\n125#1:687,8\n125#1:696\n133#1:698,8\n133#1:707\n142#1:709,8\n142#1:718\n125#1:721,8\n125#1:730\n133#1:732,8\n133#1:741\n142#1:743,8\n142#1:752\n120#1:651\n120#1:685\n120#1:719\n120#1:753\n*E\n"})
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[LoadType.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public AnonymousClass1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, CoroutineScope coroutineScope) {
                this.this$0 = pageFetcherSnapshot;
                this.$$this$launch = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Unit) obj, (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:121:0x040a, code lost:
            
                if (r1.lock(null, r13) == r0) goto L168;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x02f6, code lost:
            
                if (r1.lock(null, r13) == r0) goto L168;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:107:0x038d  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0391  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x03e8  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x03f0  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0434 A[PHI: r1 r4 r14
              0x0434: PHI (r1v53 androidx.paging.LoadStates) = (r1v28 androidx.paging.LoadStates), (r1v60 androidx.paging.LoadStates) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]
              0x0434: PHI (r4v52 kotlinx.coroutines.CoroutineScope) = (r4v26 kotlinx.coroutines.CoroutineScope), (r4v55 kotlinx.coroutines.CoroutineScope) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]
              0x0434: PHI (r14v51 androidx.paging.PageFetcherSnapshot) = (r14v28 androidx.paging.PageFetcherSnapshot), (r14v52 androidx.paging.PageFetcherSnapshot) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:136:0x043e  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x047c  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x047e  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x049a  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x049e  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x04f1  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x04f6  */
            /* JADX WARN: Removed duplicated region for block: B:173:0x0529  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x025b  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x026e  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x027c  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0280  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x02d5  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x02dd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x032a  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x036d  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x036f  */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v14, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v39, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v68, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v86 */
            /* JADX WARN: Type inference failed for: r1v87 */
            /* JADX WARN: Type inference failed for: r1v89 */
            /* JADX WARN: Type inference failed for: r1v90 */
            /* JADX WARN: Type inference failed for: r1v92 */
            /* JADX WARN: Type inference failed for: r1v93 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(kotlin.Unit r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                /*
                    Method dump skipped, instructions count: 1382
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C43984.AnonymousClass1.emit(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43984(Channel<Unit> channel, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C43984> continuation) {
            super(2, continuation);
            this.$retryChannel = channel;
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C43984 c43984 = new C43984(this.$retryChannel, this.this$0, continuation);
            c43984.L$0 = obj;
            return c43984;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.$retryChannel);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope);
                this.label = 1;
                if (flowConsumeAsFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C43984) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super PageFetcherSnapshot$pageEventFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, continuation);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(simpleProducerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
