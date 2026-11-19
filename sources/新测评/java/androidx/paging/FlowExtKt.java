package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m13557d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032?\b\u0004\u0010\b\u001a9\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0080H¢\u0006\u0002\u0010\u000f\u001ae\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u000329\b\u0004\u0010\b\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0080\b¢\u0006\u0002\u0010\u0014\u001a_\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u000323\b\u0004\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0080\b¢\u0006\u0002\u0010\u0014\u001ak\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0003\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00032F\u0010\u0017\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0000¢\u0006\u0002\u0010\u001a\u001ay\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u00032\u0006\u0010\u001c\u001a\u0002H\u00042F\u0010\u0017\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0000¢\u0006\u0002\u0010\u001d\u001am\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u00032B\u0010\b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u001f\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0002\b!H\u0000¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m13558d2 = {"NULL", "", "combineWithoutBatching", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "otherFlow", "transform", "Lkotlin/Function4;", "Landroidx/paging/CombineSource;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "updateFrom", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "simpleFlatMapLatest", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "value", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "simpleMapLatest", "simpleRunningReduce", "operation", "Lkotlin/Function3;", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleScan", "initial", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleTransformLatest", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "paging-common_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class FlowExtKt {
    private static final Object NULL = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "T1", "T2", "R", "Landroidx/paging/SimpleProducerScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 176)
    @DebugMetadata(m13595c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", m13596f = "FlowExt.kt", m13597i = {}, m13598l = {161}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13644#2,3:225\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n*L\n144#1:225,3\n*E\n"})
    /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2 */
    public static final class C42132<R> extends SuspendLambda implements Function2<SimpleProducerScope<R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T2> $otherFlow;
        final /* synthetic */ Flow<T1> $this_combineWithoutBatching;
        final /* synthetic */ Function4<T1, T2, CombineSource, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, m13558d2 = {"<anonymous>", "", "T1", "T2", "R", "invoke"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 176)
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$2\n*L\n1#1,224:1\n*E\n"})
        /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
            final /* synthetic */ CompletableJob $parentJob;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CompletableJob completableJob) {
                super(0);
                this.$parentJob = completableJob;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Job.DefaultImpls.cancel$default((Job) this.$parentJob, (CancellationException) null, 1, (Object) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42132(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super R>, ? extends Object> function4, Continuation<? super C42132> continuation) {
            super(2, continuation);
            this.$this_combineWithoutBatching = flow;
            this.$otherFlow = flow2;
            this.$transform = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C42132 c42132 = new C42132(this.$this_combineWithoutBatching, this.$otherFlow, this.$transform, continuation);
            c42132.L$0 = obj;
            return c42132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SimpleProducerScope<R> simpleProducerScope, Continuation<? super Unit> continuation) {
            return ((C42132) create(simpleProducerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
                CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
                int i11 = 0;
                Flow[] flowArr = {this.$this_combineWithoutBatching, this.$otherFlow};
                int i12 = 0;
                while (i12 < 2) {
                    SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                    simpleProducerScope = simpleProducerScope2;
                    BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, completableJobJob$default, null, new FlowExtKt$combineWithoutBatching$2$1$1(flowArr[i12], atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, i11, null), 2, null);
                    i12++;
                    atomicInteger = atomicInteger;
                    i11++;
                    unbatchedFlowCombiner = unbatchedFlowCombiner;
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(completableJobJob$default);
                this.label = 1;
                if (simpleProducerScope.awaitClose(anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Flow[] flowArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i10 = 0;
            int i11 = 0;
            while (i11 < 2) {
                int i12 = i10;
                Flow flow = flowArr[i11];
                int i13 = i12 + 1;
                int iIntValue = Integer.valueOf(i12).intValue();
                SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                simpleProducerScope = simpleProducerScope2;
                AtomicInteger atomicInteger2 = atomicInteger;
                BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, completableJobJob$default, null, new FlowExtKt$combineWithoutBatching$2$1$1(flow, atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, iIntValue, null), 2, null);
                Unit unit = Unit.INSTANCE;
                i11++;
                atomicInteger = atomicInteger2;
                i10 = i13;
                unbatchedFlowCombiner = unbatchedFlowCombiner;
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(completableJobJob$default);
            InlineMarker.mark(0);
            simpleProducerScope.awaitClose(anonymousClass2, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 176)
    @DebugMetadata(m13595c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", m13596f = "FlowExt.kt", m13597i = {}, m13598l = {98, 98}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleFlatMapLatest$1\n*L\n1#1,224:1\n*E\n"})
    /* renamed from: androidx.paging.FlowExtKt$simpleFlatMapLatest$1 */
    public static final class C42151<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super Flow<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42151(Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2, Continuation<? super C42151> continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke((FlowCollector) obj, (FlowCollector<? super R>) obj2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r6)
                goto L39
            L22:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r5.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L46
            L39:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.emitAll(r1, r6, r5)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42151.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = (Flow) this.$transform.invoke(this.L$1, this);
            InlineMarker.mark(0);
            FlowKt.emitAll(flowCollector, flow, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        public final Object invoke(FlowCollector<? super R> flowCollector, T t10, Continuation<? super Unit> continuation) {
            C42151 c42151 = new C42151(this.$transform, continuation);
            c42151.L$0 = flowCollector;
            c42151.L$1 = t10;
            return c42151.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 176)
    @DebugMetadata(m13595c = "androidx.paging.FlowExtKt$simpleMapLatest$1", m13596f = "FlowExt.kt", m13597i = {}, m13598l = {105, 105}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleMapLatest$1\n*L\n1#1,224:1\n*E\n"})
    /* renamed from: androidx.paging.FlowExtKt$simpleMapLatest$1 */
    public static final class C42161<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42161(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C42161> continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke((FlowCollector) obj, (FlowCollector<? super R>) obj2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r6)
                goto L39
            L22:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r5.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42161.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Object objInvoke = this.$transform.invoke(this.L$1, this);
            InlineMarker.mark(0);
            flowCollector.emit(objInvoke, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        public final Object invoke(FlowCollector<? super R> flowCollector, T t10, Continuation<? super Unit> continuation) {
            C42161 c42161 = new C42161(this.$transform, continuation);
            c42161.L$0 = flowCollector;
            c42161.L$1 = t10;
            return c42161.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", m13596f = "FlowExt.kt", m13597i = {}, m13598l = {68}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1 */
    public static final class C42171<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> $operation;
        final /* synthetic */ Flow<T> $this_simpleRunningReduce;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
        /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<T> $$this$flow;
            final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
            final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> $operation;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, FlowCollector<? super T> flowCollector) {
                this.$accumulator = objectRef;
                this.$operation = function3;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
            
                if (r8.emit(r9, r0) != r1) goto L27;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L7f
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                    java.lang.Object r2 = r0.L$0
                    androidx.paging.FlowExtKt$simpleRunningReduce$1$1 r2 = (androidx.paging.FlowExtKt.C42171.AnonymousClass1) r2
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L66
                L40:
                    kotlin.ResultKt.throwOnFailure(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.$accumulator
                    T r2 = r9.element
                    java.lang.Object r5 = androidx.paging.FlowExtKt.access$getNULL$p()
                    if (r2 != r5) goto L4f
                    r2 = r7
                    goto L69
                L4f:
                    kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r2 = r7.$operation
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r5 = r7.$accumulator
                    T r5 = r5.element
                    r0.L$0 = r7
                    r0.L$1 = r9
                    r0.label = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L62
                    goto L7e
                L62:
                    r2 = r9
                    r9 = r8
                    r8 = r2
                    r2 = r7
                L66:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L69:
                    r9.element = r8
                    kotlinx.coroutines.flow.FlowCollector<T> r8 = r2.$$this$flow
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.$accumulator
                    T r9 = r9.element
                    r2 = 0
                    r0.L$0 = r2
                    r0.L$1 = r2
                    r0.label = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L7f
                L7e:
                    return r1
                L7f:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42171.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42171(Flow<? extends T> flow, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, Continuation<? super C42171> continuation) {
            super(2, continuation);
            this.$this_simpleRunningReduce = flow;
            this.$operation = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C42171 c42171 = new C42171(this.$this_simpleRunningReduce, this.$operation, continuation);
            c42171.L$0 = obj;
            return c42171;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) FlowExtKt.NULL;
                Flow<T> flow = this.$this_simpleRunningReduce;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, this.$operation, flowCollector);
                this.label = 1;
                if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C42171) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.FlowExtKt$simpleScan$1", m13596f = "FlowExt.kt", m13597i = {0, 0}, m13598l = {54, 55}, m13599m = "invokeSuspend", m13600n = {"$this$flow", "accumulator"}, m13601s = {"L$0", "L$1"})
    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1 */
    public static final class C42181<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ R $initial;
        final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
        final /* synthetic */ Flow<T> $this_simpleScan;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
        /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ Ref.ObjectRef<R> $accumulator;
            final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
                this.$accumulator = objectRef;
                this.$operation = function3;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$simpleScan$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L70
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                    java.lang.Object r2 = r0.L$0
                    androidx.paging.FlowExtKt$simpleScan$1$1 r2 = (androidx.paging.FlowExtKt.C42181.AnonymousClass1) r2
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L5a
                L40:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.$accumulator
                    kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r6.$operation
                    T r5 = r8.element
                    r0.L$0 = r6
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r5, r7, r0)
                    if (r7 != r1) goto L56
                    goto L6f
                L56:
                    r2 = r8
                    r8 = r7
                    r7 = r2
                    r2 = r6
                L5a:
                    r7.element = r8
                    kotlinx.coroutines.flow.FlowCollector<R> r7 = r2.$$this$flow
                    kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r2.$accumulator
                    T r8 = r8.element
                    r2 = 0
                    r0.L$0 = r2
                    r0.L$1 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L70
                L6f:
                    return r1
                L70:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42181.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42181(R r10, Flow<? extends T> flow, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super C42181> continuation) {
            super(2, continuation);
            this.$initial = r10;
            this.$this_simpleScan = flow;
            this.$operation = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C42181 c42181 = new C42181(this.$initial, this.$this_simpleScan, this.$operation, continuation);
            c42181.L$0 = obj;
            return c42181;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        
            if (r7.collect(r4, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L5b
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                kotlin.ResultKt.throwOnFailure(r7)
                goto L44
            L26:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                R r4 = r6.$initial
                r1.element = r4
                r6.L$0 = r7
                r6.L$1 = r1
                r6.label = r3
                java.lang.Object r3 = r7.emit(r4, r6)
                if (r3 != r0) goto L43
                goto L5a
            L43:
                r3 = r7
            L44:
                kotlinx.coroutines.flow.Flow<T> r7 = r6.$this_simpleScan
                androidx.paging.FlowExtKt$simpleScan$1$1 r4 = new androidx.paging.FlowExtKt$simpleScan$1$1
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r6.$operation
                r4.<init>(r1, r5, r3)
                r1 = 0
                r6.L$0 = r1
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r7 = r7.collect(r4, r6)
                if (r7 != r0) goto L5b
            L5a:
                return r0
            L5b:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42181.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
            return ((C42181) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Landroidx/paging/SimpleProducerScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", m13596f = "FlowExt.kt", m13597i = {}, m13598l = {88}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1 */
    public static final class C42191<R> extends SuspendLambda implements Function2<SimpleProducerScope<R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_simpleTransformLatest;
        final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", m13596f = "FlowExt.kt", m13597i = {}, m13598l = {89}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
            final /* synthetic */ ChannelFlowCollector<R> $collector;
            final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, ChannelFlowCollector<R> channelFlowCollector, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$transform = function3;
                this.$collector = channelFlowCollector;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, this.$collector, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return invoke2((AnonymousClass1<T>) obj, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = this.L$0;
                    Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> function3 = this.$transform;
                    ChannelFlowCollector<R> channelFlowCollector = this.$collector;
                    this.label = 1;
                    if (function3.invoke(channelFlowCollector, obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(T t10, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(t10, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42191(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C42191> continuation) {
            super(2, continuation);
            this.$this_simpleTransformLatest = flow;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C42191 c42191 = new C42191(this.$this_simpleTransformLatest, this.$transform, continuation);
            c42191.L$0 = obj;
            return c42191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SimpleProducerScope<R> simpleProducerScope, Continuation<? super Unit> continuation) {
            return ((C42191) create(simpleProducerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                Flow<T> flow = this.$this_simpleTransformLatest;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, new ChannelFlowCollector(simpleProducerScope), null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T1, T2, R> Object combineWithoutBatching(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super R>, ? extends Object> function4, Continuation<? super Flow<? extends R>> continuation) {
        return SimpleChannelFlowKt.simpleChannelFlow(new C42132(flow, flow2, function4, null));
    }

    public static final <T, R> Flow<R> simpleFlatMapLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return simpleTransformLatest(flow, new C42151(transform, null));
    }

    public static final <T, R> Flow<R> simpleMapLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super R>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return simpleTransformLatest(flow, new C42161(transform, null));
    }

    public static final <T> Flow<T> simpleRunningReduce(Flow<? extends T> flow, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return FlowKt.flow(new C42171(flow, operation, null));
    }

    public static final <T, R> Flow<R> simpleScan(Flow<? extends T> flow, R r10, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return FlowKt.flow(new C42181(r10, flow, operation, null));
    }

    public static final <T, R> Flow<R> simpleTransformLatest(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SimpleChannelFlowKt.simpleChannelFlow(new C42191(flow, transform, null));
    }
}
