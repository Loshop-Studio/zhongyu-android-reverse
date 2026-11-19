package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", m13451f = "AsyncPagingDataDiffer.kt", m13452i = {}, m13453l = {40}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$special$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super CombinedLoadStates>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AsyncPagingDataDiffer this$0;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n*L\n1#1,222:1\n508#2,8:223\n*E\n"})
    /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1 */
    public static final class C43431<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<CombinedLoadStates> $$this$flow;
        final /* synthetic */ AsyncPagingDataDiffer this$0;

        @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", m13451f = "AsyncPagingDataDiffer.kt", m13452i = {0, 0, 0, 1, 1}, m13453l = {224, 225, 229}, m13454m = "emit", m13455n = {"this", "it", "$this$loadStateFlow_u24lambda_u242", "it", "$this$loadStateFlow_u24lambda_u242"}, m13456s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C43431.this.emit(null, this);
            }
        }

        public C43431(FlowCollector flowCollector, AsyncPagingDataDiffer asyncPagingDataDiffer) {
            this.this$0 = asyncPagingDataDiffer;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.firstOrNull(r9, r5, r0) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        
            if (r9.emit(r8, r0) != r1) goto L31;
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
                boolean r0 = r9 instanceof androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C43431.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C43431.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L55
                if (r2 == r5) goto L45
                if (r2 == r4) goto L39
                if (r2 != r3) goto L31
                kotlin.ResultKt.throwOnFailure(r9)
                goto La9
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                java.lang.Object r2 = r0.L$0
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                kotlin.ResultKt.throwOnFailure(r9)
                goto L9a
            L45:
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                java.lang.Object r2 = r0.L$1
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                java.lang.Object r5 = r0.L$0
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1 r5 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C43431) r5
                kotlin.ResultKt.throwOnFailure(r9)
                goto L80
            L55:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlinx.coroutines.flow.FlowCollector<androidx.paging.CombinedLoadStates> r9 = r7.$$this$flow
                androidx.paging.CombinedLoadStates r8 = (androidx.paging.CombinedLoadStates) r8
                androidx.paging.AsyncPagingDataDiffer r2 = r7.this$0
                kotlinx.coroutines.flow.MutableStateFlow r2 = r2.getInGetItem$paging_runtime_release()
                java.lang.Object r2 = r2.getValue()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L9c
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r5
                java.lang.Object r2 = kotlinx.coroutines.YieldKt.yield(r0)
                if (r2 != r1) goto L7d
                goto La8
            L7d:
                r5 = r7
                r2 = r8
                r8 = r9
            L80:
                androidx.paging.AsyncPagingDataDiffer r9 = r5.this$0
                kotlinx.coroutines.flow.MutableStateFlow r9 = r9.getInGetItem$paging_runtime_release()
                androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1 r5 = new androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1
                r5.<init>(r6)
                r0.L$0 = r2
                r0.L$1 = r8
                r0.L$2 = r6
                r0.label = r4
                java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r9, r5, r0)
                if (r9 != r1) goto L9a
                goto La8
            L9a:
                r9 = r8
                r8 = r2
            L9c:
                r0.L$0 = r6
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto La9
            La8:
                return r1
            La9:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C43431.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$special$$inlined$transform$1(Flow flow, Continuation continuation, AsyncPagingDataDiffer asyncPagingDataDiffer) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = asyncPagingDataDiffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsyncPagingDataDiffer$special$$inlined$transform$1 asyncPagingDataDiffer$special$$inlined$transform$1 = new AsyncPagingDataDiffer$special$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        asyncPagingDataDiffer$special$$inlined$transform$1.L$0 = obj;
        return asyncPagingDataDiffer$special$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            C43431 c43431 = new C43431(flowCollector, this.this$0);
            this.label = 1;
            if (flow.collect(c43431, this) == coroutine_suspended) {
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
    public final Object invoke(FlowCollector<? super CombinedLoadStates> flowCollector, Continuation<? super Unit> continuation) {
        return ((AsyncPagingDataDiffer$special$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
